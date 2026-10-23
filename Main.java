package fantasybattle;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Main {
	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	        	GameGUI gui = new GameGUI();
	            gui.setVisible(true);
	        });
	    }
	}