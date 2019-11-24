class ReverseString {
    public static void main(String[] args) {

        // initialize the String
        String str = "Hello World";

        String s[] = str.split("");

        for (int i = s.length - 1; i >= 0; i--) {

            if (i != 0) {
                System.out.print(s[i] + "");
            } else {
                System.out.println(s[i]);
            }
        }
    }
}