class HelloWorld {

    // toString for every object
    // refereced data Type
    // immutable

    // for Recursive reverse
    public static String reverseString(String test) {
        if (test.length() < 2) {
            return test;
        }
        return reverseString(test.substring(1)) + test.charAt(0);
        // elloh
        // "ello" + 'h'
        // "llo" + 'e' + 'h'
        // "lo" + 'l' + 'e' + 'h'
    }

    public static void main(String[] args) {

        // Literal --> String pool (Heap -- permanetly space)
        String s = "Hello World";

        // New operator --> Heap
        String t = new String("Hello World");

        // Making a string
        // ------------------
        // Concatenate
        String h = "Hello";
        String w = "World";
        System.out.println(h.concat(w));
        System.out.println(h + w + "s");

        // Formating
        String d = String.format("Sergio has %d Bass", 2);
        // %d --> integer
        // %s --> String
        // %f --> float

        System.out.println(d);

        // Substrings
        System.out.println(h = d.substring(5));

        // Strings instance methods
        // Length
        String hiThere = "Hi There";
        System.out.println(hiThere.length());

        // charAt
        System.out.println(hiThere.charAt(3));

        // indexOf
        System.out.println(hiThere.indexOf('e'));
        System.out.println(hiThere.indexOf('e', 6));
        System.out.println(hiThere.lastIndexOf('e'));

        // How to reversr String
        String reverse = "hello";

        // 1. Library Method
        StringBuilder sB = new StringBuilder(reverse).reverse();
        System.out.println(sB);

        String test = "hello";

        // 2.Interative
        String re = "";
        for (int i = test.length() - 1; i >= 0; i--) {
            re = re + test.charAt(i);
            // ""+ o
            // "o"+ l
            // "ol"+ l
            // ... "olleh"
        }
        System.out.println(re);

        // 3. Recursion
        System.out.println(reverseString(test));

    }
}