

<div id="top"></div>



<!-- TABLE OF CONTENTS -->
# Table of Contents


  <ul>
    <li>
      <a href="#about-the-project">About The Project</a>
    </li>
    <li>
      <a href="#preparation">Preparation</a>
    </li>
    <li><a href="#usage">Usage</a></li>
     <ul>
        <li><a href="#quick-view">Quick View</a></li>
      </ul>
    <li><a href="#rummy-rules">Rummy Rules</a></li>
     <ul>
        <li><a href="#user-interface">User Interface</a></li>
      </ul>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ul>




<!-- ABOUT THE PROJECT -->
# About The Project
Rummy is a popular card game in which the goal is to be the first to get rid of all of your cards by forming melds, which can be sets (three or four cards of the same rank, for example) or runs (three or more cards of the same suit in a sequence, for example). The game may be played with two, three, or four people. Each player receives 10 cards if there are just two players (on our implementation is reduced to 9), and seven cards if there are three or four players.
This project is an interactive rummy game. This is the work of a different project for which they gave some basic UI implementation, I was fully responsible for that project's implementations.


See project instructions [here](https://github.com/Jeann-Carlos/Project2Rummy-master.git).  
See project skeleton [here](https://piazza.com/class_profile/get_resource/kk4xy8jrsjxcb/kn4wcrcjvqd52y).
<p align="right">(<a href="#top">back to top</a>)</p>



# Preparation

1. Clone this repository 
   ```
   git clone https://github.com/Jeann-Carlos/cslabproject.git
   ```
   
2. Change your directory to the project's

   Once you are in, use the terminal to clone the project:
   ```
   cd ./Project2Rummy-master
   ```
3. Compile the sources
   ```
   javac.exe ./proj2.proj2.java
   ```  
4. To run:  
   ```
   java.exe ./proj2.proj2.java
   ```
  <p align="right">(<a href="#top">back to top</a>)</p>
 <!-- USAGE EXAMPLES -->
 
 
# Usage

The program accepts two inputs, the first of which is the number of AI-controlled participants. If you wish to use the logger, the second parameter is -h.

General Usage:
 ```
   java.exe ./proj2.proj2.java [Number of Non-AI players, (0,2) ] [Logging Services, -h ] #Logs are stored in log.txt on the project directory
 ```

Examples:
 ```
   java.exe ./proj2.proj2.java 2 -h # 2 Players (no AI) with the logging service
 ```
 ```
   java.exe ./proj2.proj2.java 0  # 0 Players (All AI) with no logging service
 ```

## Quick View
![Screenshot 2022-06-10 235238](https://user-images.githubusercontent.com/56929989/173177253-f7f50ebf-3290-48f4-b73d-25db44d42a0c.png)  
![Screenshot 2022-06-10 2365238](https://user-images.githubusercontent.com/56929989/173255419-1daef927-e04e-4750-9cd9-537eef54b4a9.png)

  <p align="right">(<a href="#top">back to top</a>)</p>
  
    
<!-- CONTACT -->
# Rummy Rules
1. From the stock pile, each player is given 9 cards while the 19th card is moved facup to the discard pile.
2. Each turn, a player must:
* Take a card from the deck or stack.
* Performs a few optional tasks:
   * Place a Set on the table 
   *  Place a Run on the table 
   *   Place cards that fit into existing Sets or Runs
3. At the end of a turn the player must discard one card to the discard pile.
4. Ways that the game can end.
* If one of the players runs out of cards, that person is declared the winner.
* If the stock pile of cards is depleted 
* If the Deck is depleted, all players calculate the points left in their hands, and the lowest value hand wins (ties are allowed!)

### User Interface

![Screenshot 2022-06-11 001238](https://user-images.githubusercontent.com/56929989/173178011-737930a0-4934-4fe4-b538-779123722368.png)

<p align="right">(<a href="#top">back to top</a>)</p>






<!-- CONTRIBUTING -->
# Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<p align="right">(<a href="#top">back to top</a>)</p>



<!-- LICENSE -->
# License

Distributed under the MIT License. See `LICENSE.txt` for more information.

<p align="right">(<a href="#top">back to top</a>)</p>





<!-- ACKNOWLEDGMENTS -->
# Acknowledgments

The following were the sole sources utilized to create this project:

1. [Oracle's Official Java Tutorials and Documentation](https://docs.oracle.com)
2. [Stack Overflow](https://stackoverflow.com)
3. [Rummy Card Game](https://cardgames.io/rummy)
I received no assistance from other persons or third parties.

As of this writing, I had not assisted anybody else in the group.

<p align="right">(<a href="#top">back to top</a>)</p>


