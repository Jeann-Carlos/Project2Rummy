package proj2;

import proj2.src.Game_Logic;
import proj2.src.Table;

public class proj2 {
    //The main
    //options 1,2 or 0 (required first)
    // for logging use -h after the ai selection.
    //AI can only play when its their turn. So dont try to click the button when its not their turn as it will do nothing.
    //The button only appears if needed.
    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("You need at least the player amount as an argument. (1 or 2), -h for logging a log.txt file");
            System.exit(1);
        }
        Table t = new Table(args);
        Game_Logic.SetInstance(t);
        t.setVisible(true);
    }
}
