package fantasybattle;
import java.awt.*;
import javax.swing.*;
class GameGUI extends JFrame {
    private final CharacterRoster roster = new CharacterRoster();

    private final JComboBox<String> characterBox =
            new JComboBox<>();

    private final JTextField commandField = new JTextField();

    private final JTextArea outputArea = new JTextArea();

    public GameGUI() {
        setTitle("Fantasy Battle");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(25, 28, 42));
        setLayout(new BorderLayout(10, 10));

        JLabel title = new JLabel(
                "FANTASY BATTLE", SwingConstants.CENTER
        );
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setForeground(new Color(170, 130, 255));
        title.setBorder(BorderFactory.createEmptyBorder(15, 5, 10, 5));
        add(title, BorderLayout.NORTH);

        JPanel center = new JPanel(new GridLayout(0, 1, 8, 8));
        center.setBackground(new Color(35, 39, 56));
        center.setBorder(BorderFactory.createEmptyBorder(15, 20, 15, 20));

        JLabel characterLabel = new JLabel("Select Character:");
        characterLabel.setForeground(Color.WHITE);
        center.add(characterLabel);

        for (int i = 0; i < roster.size(); i++) {
            GameCharacter character = roster.getCharacter(i);
            characterBox.addItem(
                character.getName() + " (" + character.getType() + ")"
            );
        }        center.add(characterBox);

        JLabel commandLabel = new JLabel(
                "Enter command: attack, special, or exit"
        );
        commandLabel.setForeground(Color.WHITE);
        center.add(commandLabel);

        commandField.setFont(new Font("Arial", Font.PLAIN, 16));
        center.add(commandField);

        JButton executeButton = new JButton("Execute Command");
        executeButton.setBackground(new Color(130, 90, 220));
        executeButton.setForeground(Color.WHITE);
        executeButton.setFocusPainted(false);
        center.add(executeButton);

        outputArea.setEditable(false);
        outputArea.setLineWrap(true);
        outputArea.setWrapStyleWord(true);
        outputArea.setBackground(new Color(20, 23, 34));
        outputArea.setForeground(new Color(170, 235, 180));
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        outputArea.setText(
                "Welcome to Fantasy Battle!\n"
                + "Select a character and enter a command.\n"
        );

        JScrollPane scrollPane = new JScrollPane(outputArea);
        scrollPane.setPreferredSize(new Dimension(450, 120));

        add(center, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);

        executeButton.addActionListener(e -> executeCommand());

        commandField.addActionListener(e -> executeCommand());
    }

    private void executeCommand() {
        String command = commandField.getText().trim().toLowerCase();

        if (command.isEmpty()) {
            outputArea.append("\nPlease enter a command.");
            return;
        }

        if (command.equals("exit")) {
            dispose();
            return;
        }

        int selectedIndex = characterBox.getSelectedIndex();
        GameCharacter character = roster.getCharacter(selectedIndex);

        if (character == null) {
            outputArea.append("\nPlease select a character.");
            return;
        }

        switch (command) {
            case "attack":
                outputArea.append("\n" + character.attack());
                break;

            case "special":
                outputArea.append("\n" + character.specialMove());
                break;

            default:
                outputArea.append(
                        "\nUnknown command! Use attack, special, or exit."
                );
        }

        commandField.setText("");
        outputArea.setCaretPosition(
                outputArea.getDocument().getLength()
        );
    }
}