import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.FileNotFoundException;
public class MilitaryCadence {
    public MilitaryCadence() {

    }

    public static void singIDontKnow() {
        ArrayList<String> iDontKnowLyrics = readFile("command/idontknow.txt");
        printCadence(iDontKnowLyrics);
    }

    public static void singEverywhereIGo() {
        ArrayList<String> everywhereIGoLyrics = readFile("everywhere.txt");
        printCadence(everywhereIGoLyrics);
    }

    public static void singInArmy() {
        ArrayList<String> inArmyLyrics = readFile("inarmy.txt");
        printCadence(inArmyLyrics);
    }

    public static ArrayList<String> readFile(String fileName) {
        ArrayList<String> lyrics = new ArrayList<String>();
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lyrics.add(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file" +fileName+ "could not be located");
            e.printStackTrace();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return lyrics;
    }
    public static void printCadence(ArrayList<String> song) {
        for(String line : song) {
            System.out.println(line);
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\033[H\033[2J");
            System.out.flush();
        }
    }
}

