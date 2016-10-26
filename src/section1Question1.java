import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by May Zhang on 10/26/2016.
 */


public class section1Question1 {
    public static void main(String[] args) {
        section1Question1 section1Question1 = new section1Question1();
        ArrayList<String> line1 = new ArrayList<String>();
        line1.add("Punishment");
        line1.add("The Morse code");
        line1.add("Snooze alarms");
        line1.add("Halley's Comet");
        line1.add("One good turn deserves another.");

        ArrayList<String> line2 = new ArrayList<String>();
        line2.add("Nine Thumps");
        line2.add("Here come dots");
        line2.add(" Alas! No more Zs");
        line2.add("Shall yet come");
        line2.add("Do rogues endorse that? No, never!");

        for (int i = 0; i < line1.size(); i++) {
            System.out.println(line1.get(i).toString() +
                    "->"
                    + line2.get(i).toString() +
                    "=>>"
                    +
                    section1Question1.isAnagram(line1.get(i).toString(), line2.get(i).toString()));
        }
    }


    public boolean isAnagram(String str1, String str2) {
        char[] c1 = str1.replaceAll("[^\\dA-Za-z ]", "").replaceAll("\\s+", "").toLowerCase().toCharArray();
        char[] c2 = str2.replaceAll("[^\\dA-Za-z ]", "").replaceAll("\\s+", "").toLowerCase().toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
//        System.out.println(c1);
//        System.out.println(c2);
        return Arrays.equals(c1, c2);

    }


}

