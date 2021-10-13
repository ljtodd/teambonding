
/**
 * @author Jonathan Brennan, LJ Todd, Tyler Madden, Patrick Burroughs
 * Portia Plante's CSCE 247-002
 * Command Design Pattern (team)
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Handles the reading and printing of all the cadences when executed
 */
public class MilitaryCadence {
    public MilitaryCadence() {

    }

    /**
     * Takes idontknow.txt and splits up the lyrics into lines and reads it
     */

    public static void singIDontKnow() {
        ArrayList<String> iDontKnowLyrics = readFile("command/idontknow.txt");
        printCadence(iDontKnowLyrics);
    }

    /**
     * Takes everywhere.txt and splits up the lyrics into lines and reads it
     */
    public static void singEverywhereIGo() {
        ArrayList<String> everywhereIGoLyrics = readFile("command/everywhere.txt");
        printCadence(everywhereIGoLyrics);
    }

    /**
     * Takes inarmy.txt and splits up the lyrics into lines and reads it
     */
    public static void singInArmy() {
        ArrayList<String> inArmyLyrics = readFile("command/inarmy.txt");
        printCadence(inArmyLyrics);
    }

    /**
     * This takes the file and creates an array list of lyrics
     * 
     * @param fileName this is the name of the file that will be split into an array
     *                 list of strings
     * @return this will return the lyrics/lines of the song
     */
    public static ArrayList<String> readFile(String fileName) {
        ArrayList<String> lyrics = new ArrayList<String>();
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lyrics.add(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file" + fileName + "could not be located");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lyrics;
    }

    /**
     * This prints out the lyrics with the pause included
     * 
     * @param song this is the array list of the song itself
     */
    public static void printCadence(ArrayList<String> song) {
        for (String line : song) {
            System.out.println(line);
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\033[H\033[2J");
            System.out.flush();
        }
    }
}
