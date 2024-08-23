
<div id="top"></div>

<!-- TABLE OF CONTENTS -->
# Table of Contents

<ul>
  <li><a href="#about-the-project">About The Project</a></li>
  <li><a href="#preparation">Preparation</a></li>
  <li>
    <a href="#usage">Usage</a>
    <ul>
      <li><a href="#quick-view">Quick View</a></li>
    </ul>
  </li>
  <li>
    <a href="#rummy-rules">Rummy Rules</a>
    <ul>
      <li><a href="#user-interface">User Interface</a></li>
    </ul>
  </li>
  <li><a href="#contributing">Contributing</a></li>
  <li><a href="#license">License</a></li>
  <li><a href="#acknowledgments">Acknowledgments</a></li>
</ul>

<!-- ABOUT THE PROJECT -->
# About The Project

Rummy is a popular card game where the goal is to be the first to get rid of all your cards by forming melds. Melds can be either sets (three or four cards of the same rank) or runs (three or more cards of the same suit in sequence). The game can be played by two, three, or four players. In this implementation, each player receives 9 cards if there are two players, and 7 cards if there are three or four players.

This project is an interactive Rummy game. While the basic UI implementation was provided, I was fully responsible for the project's overall implementation.

See the project instructions [here](https://github.com/Jeann-Carlos/Project2Rummy-master.git).  
See the project skeleton [here](https://piazza.com/class_profile/get_resource/kk4xy8jrsjxcb/kn4wcrcjvqd52y).

<p align="right">(<a href="#top">back to top</a>)</p>

# Preparation

1. **Clone the repository**  
   ```
   git clone https://github.com/Jeann-Carlos/cslabproject.git
   ```
2. **Navigate to the project directory**  
   ```
   cd ./Project2Rummy-master
   ```
3. **Compile the source files**  
   ```
   javac.exe ./proj2/proj2.java
   ```
4. **Run the application**  
   ```
   java.exe ./proj2/proj2.java
   ```

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- USAGE EXAMPLES -->

# Usage

The program accepts two inputs: the first is the number of AI-controlled participants, and the second (optional) is `-h` to enable logging.

### General Usage
```
java.exe ./proj2/proj2.java [Number of Non-AI players (0-2)] [-h]  # Logs are stored in log.txt in the project directory
```

### Examples
```
java.exe ./proj2/proj2.java 2 -h  # 2 Players (no AI) with logging enabled
```
```
java.exe ./proj2/proj2.java 0  # 0 Players (All AI) with no logging
```

## Quick View

![Screenshot 2022-06-10 235238](https://user-images.githubusercontent.com/56929989/173177253-f7f50ebf-3290-48f4-b73d-25db44d42a0c.png)  
![Screenshot 2022-06-10 2365238](https://user-images.githubusercontent.com/56929989/173255419-1daef927-e04e-4750-9cd9-537eef54b4a9.png)

<p align="right">(<a href="#top">back to top</a>)</p>

# Rummy Rules

1. Each player is dealt 9 cards, and the 19th card is placed face-up in the discard pile.
2. On each turn, a player must:
   - Draw a card from the deck or discard pile.
   - Optionally perform tasks:
     - Place a Set on the table.
     - Place a Run on the table.
     - Add cards to existing Sets or Runs.
   - Discard one card to the discard pile to end their turn.
3. The game can end in the following ways:
   - A player runs out of cards, becoming the winner.
   - The stock pile is depleted.
   - If the deck is depleted, players calculate the points left in their hands, and the lowest value hand wins (ties are allowed).

### User Interface

![Screenshot 2022-06-11 001238](https://user-images.githubusercontent.com/56929989/173178011-737930a0-4934-4fe4-b538-779123722368.png)

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- CONTRIBUTING -->

# Contributing

Contributions make the open-source community an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have suggestions that would improve this project, please fork the repository and create a pull request. You can also open an issue with the tag "enhancement." Don't forget to give the project a star! Thanks again!

1. Fork the project.
2. Create your feature branch (`git checkout -b feature/AmazingFeature`).
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`).
4. Push to the branch (`git push origin feature/AmazingFeature`).
5. Open a Pull Request.

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- LICENSE -->

# License

Distributed under the MIT License. See `LICENSE.txt` for more information.

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- ACKNOWLEDGMENTS -->

# Acknowledgments

The following resources were instrumental in creating this project:

1. [Oracle's Official Java Tutorials and Documentation](https://docs.oracle.com)
2. [Stack Overflow](https://stackoverflow.com)
3. [Rummy Card Game Rules](https://cardgames.io/rummy)

<p align="right">(<a href="#top">back to top</a>)</p>
