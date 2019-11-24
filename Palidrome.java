
public class Palidrome {

    public static void main(String[] args) {

        // Create two Strings to check equality
        StringBuffer strBuf1 = new StringBuffer("civic");
        StringBuffer strBuf2 = new StringBuffer("civic");

        // reverse strBuf2
        strBuf2.reverse();

        System.out.println(strBuf2);

        // equals() and “==” operator are used to compare differences between the two:
        System.out.println((strBuf1.toString()).equals(strBuf2.toString()));

        // Check objects to check equality
        if ((strBuf1.toString()).equals(strBuf2.toString())) {
            System.out.println("Palidrome");
        } else
            System.out.println("Not a Palidrome");
    }
}
