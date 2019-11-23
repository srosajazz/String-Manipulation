//Problem 1: Given a positive String => "123"
//Given n = "123", return integer => 1234 Function: StringToNum(String s) 

class Main {
    public static void main(String[] args) {
        System.out.println(StringToNum("123"));
    }

    static int StringToNum(String s) {
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            System.out.println("s.charAt(" + i + ") = " + s.charAt(i));

            int num = s.charAt(i) - '0';
            n = n * 10 + num;
        }
        return n;
    }
}

// =====Output=========
// s.charAt(0) = 1
// s.charAt(1) = 2
// s.charAt(2) = 3
// 123
