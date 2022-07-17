import java.util.Scanner;
// using sub class
class Per{
    String result(float per){
        if (per>=70) {
            return "Distinction";
        }else if (per>=60&&per<70) {
            return "FirstClass";
        }else if (per>=50&&per<60) {
            return "SecondClass";
        }else if (per>=35&&per<50) {
            return "ThirdClass";
        }else{
            return "Better luck! Try Again";
        }
    }
    
}

public class UpdateExp2 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the Subject 1 :");
            int s1=s.nextInt();
            System.out.print("Enter the Subject 2 :");
            int s2=s.nextInt();
            System.out.print("Enter the Subject 3 :");
            int s3=s.nextInt();
            System.out.print("Enter the Subject 4 :");
            int s4=s.nextInt();
            System.out.print("Enter the Subject 5 :");
            int s5=s.nextInt();
            System.out.print("Enter the Subject 6 :");
            int s6=s.nextInt();
            System.out.println("============================");
            System.out.println("SubjectMark's 1 : "+s1);
            System.out.println("SubjectMark's 2 : "+s2);
            System.out.println("SubjectMark's 3 : "+s3);
            System.out.println("SubjectMark's 4 : "+s4);
            System.out.println("SubjectMark's 5 : "+s5);
            System.out.println("SubjectMark's 6 : "+s6);
            int totMarks=s1+s2+s3+s4+s5+s6;
            System.out.println("TotalMarks : "+totMarks);
            float per=(float)(s1+s2+s3+s4+s5+s6)/6; 
            System.out.println("Percentage : "+per);
            System.out.println("============================");
            Per ob=new Per();
            String result=ob.result(per);
            System.out.println("Result : "+result);

        }
    }
}
