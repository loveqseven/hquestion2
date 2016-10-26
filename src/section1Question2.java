/**
 * Question 2: Whats wrong with the given code below:
 */
public class section1Question2 {
    public static void main(String[] args) {
        System.out.println(fixSpelling("hostleworld"));
    }

    public static String fixSpelling(String name) {
        //String wordToCheck = new String(name);
        // TODO:This line created a different object, should should return false when using ==　because they are different objectｓ
        String wordToCheck = name;
        if (wordToCheck == "hostleworld") {
            name = "hostelworld";
        } else {
            fixSpelling(name);
        }
        return name;
    }
}


