import java.util.Scanner;

// using sub class
class StudentResult {
    String result(float per) {
        if (per >= 70) {
            return "Distinction";
        } else if (per >= 60 && per < 70) {
            return "FirstClass";
        } else if (per >= 50 && per < 60) {
            return "SecondClass";
        } else if (per >= 35 && per < 50) {
            return "ThirdClass";
        } else {
            return "Better luck! Try Again";
        }
    }

}

public class DemoMethods7 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the Subject 1 :");
            int s1 = s.nextInt();
            System.out.print("Enter the Subject 2 :");
            int s2 = s.nextInt();
            System.out.print("Enter the Subject 3 :");
            int s3 = s.nextInt();
            System.out.print("Enter the Subject 4 :");
            int s4 = s.nextInt();
            System.out.print("Enter the Subject 5 :");
            int s5 = s.nextInt();
            System.out.print("Enter the Subject 6 :");
            int s6 = s.nextInt();
            System.out.println("============================");
            System.out.println("SubjectMark's 1 : " + s1);
            System.out.println("SubjectMark's 2 : " + s2);
            System.out.println("SubjectMark's 3 : " + s3);
            System.out.println("SubjectMark's 4 : " + s4);
            System.out.println("SubjectMark's 5 : " + s5);
            System.out.println("SubjectMark's 6 : " + s6);
            if ((s1 >= 0 && s2 >= 0 && s3 >= 0 && s4 >= 0 && s5 >= 0 && s6 >= 0)
                    && (s1 <= 100 && s2 <= 100 && s3 <= 100 && s4 <= 100 && s5 <= 100 && s6 <= 100)) {
                if (s1 > 34 && s2 > 34 && s3 > 34 && s4 > 34 && s5 > 34 && s6 > 34) {
                    int totMarks = s1 + s2 + s3 + s4 + s5 + s6;
                    System.out.println("TotalMarks : " + totMarks);
                    float p = (float) (s1 + s2 + s3 + s4 + s5 + s6) / 6;
                    System.out.println("Percentage : " + p);
                    System.out.println("============================");
                    StudentResult ob = new StudentResult();
                    String result = ob.result(p);
                    System.out.println("Result : " + result);
                } else {

                    int totMarks = s1 + s2 + s3 + s4 + s5 + s6;
                    System.out.println("TotalMarks : " + totMarks);
                    System.out.println("Result : Fail!");
                }

            } else {
                System.out.println("Invalid Input......");
            }

        }
    }
}
