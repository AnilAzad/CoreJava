import java.util.Scanner;

class DemoString1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P = "";
        System.out.println("Enter the String");
        String str = sc.nextLine();

        for (int i = str.length() - 1; i >= 0; i--) {
            P = P + str.charAt(i);
        }
        if (str.equals(P)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not a Palindrome");
        }
        sc.close();
    }
}