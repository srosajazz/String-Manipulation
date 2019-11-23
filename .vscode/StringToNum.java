
class Main {
    public static void main(String[] args) {
        System.out.println(StringToNum("123"));
    }

    static int StringToNum(String s) {
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            System.out.println("s.charAt(" + i + ") = " + s.charAt(i));

            int num = s.charAt(i) - '0';
            System.out.println("num = + num");

            n = n * 10 + num;

            System.out.println("n=" + n);
            System.out.println();
        }
        return n;
    }

}