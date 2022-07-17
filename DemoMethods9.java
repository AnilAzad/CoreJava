import java.util.Scanner;

class Greatest {
    int greatest(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

}

class Smallest {
    int smallest(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }
}

public class DemoMethods9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value 1 : ");
        int v1 = s.nextInt();
        System.out.print("Enter the value 2 : ");
        int v2 = s.nextInt();
        System.out.print("Enter the value 3 : ");
        int v3 = s.nextInt();
        System.out.println("=========Choices==========");
        System.out.println("1.For Gretest Number\n2.For Smallest Number ");
        System.out.println("Enter the Choice");
        int choice = s.nextInt();
        switch (choice) {
            case 1:
                Greatest g = new Greatest();
                int r1 = g.greatest(v1, v2, v3);
                System.out.println("Gretest number is : " + r1);
                break;
            case 2:
                Smallest sc = new Smallest();
                int r2 = sc.smallest(v1, v2, v3);
                System.out.println("Smallest number is : " + r2);
                break;
            default:
                System.out.println("Invalid Choice...");
                break;
        }
    }
}
