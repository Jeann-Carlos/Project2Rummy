package proj2.src;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Logs every action partaken in the Table program
 */
public class Log {
    private Boolean log = false;
    public Logger logger;
    FileHandler fh;
    String log_File_Name = "log.txt";

    /**
     * Logger instantiation method
     *
     * @param argument To enable should be equal to "h"
     * @throws SecurityException,
     * @throws IOException,
     */
    public Log(String argument) throws SecurityException, IOException {
        if (argument.equals("-h")) log = true;
        File f = new File((log_File_Name));
        if (f.exists()) f.delete();
        f.createNewFile();
        fh = new FileHandler(log_File_Name, true);
        logger = Logger.getLogger(log_File_Name);
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
    }

    /**
     * Logs whenever a card is pulled from the stockDeck
     *
     * @param card which card is being pulled.
     */
    protected void LOGfromDeck(Card card) {
        if (log) logger.info(card + " has been drawn from the deck");

    }

    /**
     * Logs whenever a card is pulled from the stackDeck
     *
     * @param card which card is being pulled.
     */
    protected void LOGfromStack(Card card) {
        if (log) logger.info(card + " has been drawn from the stack");
    }

    /**
     * Logs whenever a card is being layed by player1
     *
     * @param card which card is being layed.
     */
    protected void LOGp1Lay(Card card) {
        if (log) logger.info(card + " has been layed by player1");
    }

    /**
     * Logs whenever a card is being layed by player2
     *
     * @param card which card is being layed.
     */
    protected void LOGp2Lay(Card card) {
        if (log) logger.info(card + " has been layed by player2");
    }

    /**
     * Logs whenever a card is being discarded by player1
     *
     * @param card which card is being discarded.
     */
    protected void LOGp1onStack(Card card) {
        if (log) logger.info(card + " was layed down by player1 on the stack | " + "It's player 2 turn");
    }

    /**
     * Logs whenever a card is being discarded by player2
     *
     * @param card which card is being discarded.
     */
    protected void LOGp2onStack(Card card) {
        if (log) logger.info(card + " was layed down by player2 on the stack | " + "It's player 1 turn");
    }

}
