Fantasy Battle - Java Game Character System
Project Description

Fantasy Battle is a simple Java application that allows users to control different game characters through keyword-based commands. The application uses Java Swing to provide a graphical user interface (GUI), allowing users to select a character, enter a command, and view the result of the character's action.

This project demonstrates important Java programming concepts, including abstraction, inheritance, polymorphism, Abstract Data Types (ADT), and user input handling.

Added Features
1. Abstract Class and Abstraction

The program uses an abstract class called GameCharacter to define the common structure and behaviors of all game characters.

It contains abstract methods such as:

attack() – Defines the character's normal attack.
specialMove() – Defines the character's special ability.
getType() – Returns the character's class or type.

Each character subclass provides its own implementation of these methods.

2. Multiple Character Types

The program includes three character types with different attacks and special abilities.

Character	Normal Attack	Special Move
Warrior	Swings a mighty sword	Shield Bash
Mage	Casts a fireball	Lightning Storm
Archer	Shoots an arrow	Rain of Arrows

Each character responds differently to the same command because each subclass implements its own behavior.

3. Abstract Data Type (ADT)

The program uses a CharacterRoster class to manage the available game characters.

It uses Java's ArrayList through the List interface to store the characters.

The roster provides methods such as:

getCharacter() – Retrieves a character by its index.
size() – Returns the number of characters in the roster.

This separates character management from the graphical interface.

4. Graphical User Interface (GUI)

The application uses Java Swing to create an interactive interface.

The GUI includes:

A character selection dropdown menu.
A text field for entering commands.
An Execute Command button.
An output area that displays attack results and error messages.
A dark-themed design with colored buttons and panels.
5. Keyword-Based Command System

Instead of creating, updating, or deleting characters, users control the selected character by entering a keyword.

Command	Function
attack	Performs the selected character's normal attack.
special	Performs the selected character's special move.
exit	Closes the application window.

Commands are case-insensitive. For example, ATTACK, Attack, and attack all work.

6. User Input Validation

The program checks user input before executing a command.

Empty commands display a warning.
Unknown commands display an error message.
The program checks whether a character is selected before performing an action.
The command field is cleared after processing an action.
7. Object-Oriented Programming

The project demonstrates three important OOP principles:

Inheritance: Warrior, Mage, and Archer inherit from GameCharacter.
Polymorphism: The same attack() method produces different results depending on the selected character.
Abstraction: The abstract parent class defines the behaviors that each character must implement.
Technologies Used
Programming Language: Java
GUI Framework: Java Swing
Data Structure: ArrayList
Programming Concepts: Abstraction, inheritance, polymorphism, and ADT
Requirements

Before running the application, make sure you have:

Java Development Kit (JDK) 8 or newer.
A Java IDE such as NetBeans, IntelliJ IDEA, Eclipse, or Visual Studio Code with Java support.

No additional libraries are required because Java Swing is included in the standard JDK.

How to Run the Program
Method 1: Using a Java IDE
Open your Java IDE.
Create or open your Java project.
Create a Java file named Main.java.
Paste the complete Fantasy Battle source code into the file.
Make sure the Main class contains the main() method.
Run the Main class.
The Fantasy Battle window will appear.
Method 2: Using the Command Line
Save the source code as Main.java.
Open a terminal or command prompt in the folder containing the file.
Compile the program using:
javac Main.java

Run the program using:
java Main

The graphical interface will open.
How to Use the Application
Launch the program.
Select a character from the dropdown menu.
Type a command into the input field.
Click Execute Command or press Enter.
Read the result in the output area.
Example

Select Brader (Warrior) and enter:

attack


Expected output:

Brader swings a mighty sword!


Enter:

special


Expected output:

Brader uses Shield Bash!


To close the application, enter:

exit

Project Structure

The entire project can be placed in a single Java source file.

FantasyBattle/
├── Main.java
└── README.md


The Main.java file contains these classes:

Class	Purpose
Main	Starts the application.
GameCharacter	Abstract parent class for all characters.
Warrior	Implements warrior attacks and abilities.
Mage	Implements mage attacks and abilities.
Archer	Implements archer attacks and abilities.
CharacterRoster	Stores and retrieves available characters.
GameGUI	Creates the GUI and processes user commands.
Conclusion

Fantasy Battle is a beginner-friendly Java project that combines object-oriented programming with a graphical interface and a keyword-based command system. It demonstrates how abstraction, inheritance, polymorphism, and an ArrayList-based ADT can work together in an interactive application.

The project focuses on selecting characters and performing their attacks rather than implementing CRUD operations.
