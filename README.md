


# Project2Rummy-master 
Rummy is a group of matching-card games notable for similar gameplay based on matching cards of the same rank or sequence and same suit. The basic goal in any form of rummy is to build melds which can be either sets (three or four of a kind of the same rank) or runs (three or more sequential cards of the same suit). The program can be run with 2 arguments the first one is the number of AI controlled players. The second argument is -h if you want to activate the logger.



<div id="top"></div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project
This project is an interactive version of the Rummy card game. Provided some basic UI code and some random files, the student should construct the game from scratch and structure it using his/her knowledge on Design Patterns and Java programming.
Rummy is a group of matching-card games notable for similar gameplay based on matching cards of the same rank or sequence and same suit. The basic goal in any form of rummy is to build melds which can be either sets (three or four of a kind of the same rank) or runs (three or more sequential cards of the same suit). 
See repository [here](https://github.com/VctorAHernndez/Rummy).
<p align="right">(<a href="#top">back to top</a>)</p>



## Preparation

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
   #### Setup Crontab: 
   javac.exe ./proj2.proj2.java
   [Set crontab timer](#set-crontab-timer)
   ```
4 To run:  
   ```
   java.exe ./proj2.proj2.java
   ```
  
 <!-- USAGE EXAMPLES -->
## Usage

The program can be run with 2 arguments the first one is the number of AI controlled players. The second argument is -h if you want to activate the logger.  

General Usage:
 ```
   java.exe ./proj2.proj2.java [Number of Non-AI players, (0,2) ] [Logging Services, -h ]
 ```

Examples:
 ```
   java.exe ./proj2.proj2.java 2 -h # 2 Players (no AI) with the logging service
 ```
 ```
   java.exe ./proj2.proj2.java 0  # 0 Players (All AI) with no logging service
 ```
Quick Note:  
Logs are stored in log.txt on the project directory
  
![Quicklook](https://drive.google.com/file/d/1CCm9HCLQqsMpquj2dCyKOEIyNfjJ2zk6/view?usp=sharing)  
  
  #### Setup Crontab: 
   Refer to the set crontab timer section:
   [Set crontab timer](#set-crontab-timer)
   

   ![GitHub Logo](https://i2.wp.com/www.adminschoice.com/wp-content/uploads/2009/12/crontab-layout.png?resize=768%2C341&ssl=1)
  
    
<!-- CONTACT -->
## Rummy Rules
1. Each player is dealt 9 cards from the stock pile (i.e. Deck)
2. The next card from the Deck is turned face-up and placed in the discard pile (i.e. Stack).
3. In each turn, a player:
   1. Draws from the Deck or Stack
   2. Does some optional actions:
      - Lay a Set on the table
      - Lay a Run on the table
      - Lay cards that fit in Sets or Runs already on the table
   3. Discards to the Stack
      - (~~Though, if a player is able to lay all remaining cards on the table at the end of a turn, the discard is optional~~)?
4. The game is over when either:
   - One player is out of cards
     - In which case, said player is crowned winner
   - The cards from the stock pile are exhausted
     - If the cards from the Deck are exhausted, all players count the points remaining in their hands, and the lowest value hand wins (ties are possible!)



<!-- ROADMAP -->
## Taking a Quick look





<!-- CONTRIBUTING -->
## Contributing

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
## License

Distributed under the MIT License. See `LICENSE.txt` for more information.

<p align="right">(<a href="#top">back to top</a>)</p>





<!-- ACKNOWLEDGMENTS -->
## Acknowledgments

Use this space to list resources you find helpful and would like to give credit to. I've included a few of my favorites to kick things off!

* [Choose an Open Source License](https://choosealicense.com)
* [GitHub Emoji Cheat Sheet](https://www.webpagefx.com/tools/emoji-cheat-sheet)
* [Malven's Flexbox Cheatsheet](https://flexbox.malven.co/)
* [Malven's Grid Cheatsheet](https://grid.malven.co/)
* [Img Shields](https://shields.io)
* [GitHub Pages](https://pages.github.com)
* [Font Awesome](https://fontawesome.com)
* [React Icons](https://react-icons.github.io/react-icons/search)

<p align="right">(<a href="#top">back to top</a>)</p>


