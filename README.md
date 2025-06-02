# Treasure-Hunt-Adventure-Java-Data-Structures
This project is a treasure-hunting board game developed in Java.
The game uses Linked Lists and Binary Search Trees (BST) as core data structures.
🎯 Game Objective
Explore the map, avoid traps, collect treasures, and accumulate the highest possible score. The game is played in two levels of increasing difficulty.

🕹️ Game Flow
🧭 Level 1
A linear Linked List board with at least 30 spots is generated randomly.

Each spot can contain:

💎 Treasure Chest: +10 points

❌ Trap: -5 points

⚪ Empty: No effect

The player rolls a dice and moves forward accordingly.

At the end of the level, the score is stored in a score.txt file.

🔁 Level 2
Another Linked List board is generated.

Spots can now also instruct the player to:

Move forward again

Move backward

Collect treasures or fall into traps

The game ends upon reaching the last spot.

The score is again saved in score.txt.

📊 Scoreboard System
Selecting "Scoreboard" from the main menu allows players to:

Enter their username

Load all past scores from score.txt

Construct a Binary Search Tree (BST) with:

Score (key)

Username

Level

The system displays:

All scores by the user

Highest and lowest scores

In-order traversal of the BST

🖼️ GUI 
A graphical interface using Java Swing is available as a bonus.

The game board, dice rolls, and movement feedback are visually displayed.

💾 File Operations
All scores are stored in a text file named score.txt in the format:
username, level, score

🧠 Data Structures Used
Singly Linked List for the board representation.

Binary Search Tree (BST) for managing and querying user scores.

🧪 Technologies
Java (JDK 8+)

Swing (for GUI bonus)

File I/O (Text file handling)

Custom data structures (Linked List & BST)

📌 Notes
Developed as a standalone university project.
