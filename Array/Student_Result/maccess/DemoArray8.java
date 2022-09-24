package maccess;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Spliterator;

import test.BranchVerification;
import test.GenerateBranch;
import test.Student;
import test.StudentResult;

public class DemoArray8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of Student : ");
        int n = Integer.parseInt(s.nextLine());
        Student[] stu = new Student[n];
        System.out.println("Enter " + n + " Student details : ");
        for (int i = 0; i < stu.length; i++) {
            stu[i] = new Student();
            System.out.println("Enter the rollNo : ");
            stu[i].rollNo = s.nextLine();
            if (stu[i].rollNo.length() == 10) {
                System.out.println("Enter the name : ");
                stu[i].name = s.nextLine();
                System.out.println("Enter the Branch : ");
                stu[i].branch = s.nextLine().toUpperCase();
                if (new BranchVerification().verify(stu[i].branch)) {
                    String br = new GenerateBranch().generate(stu[i].rollNo.substring(6, 8));
                    if (stu[i].branch.equals(br)) {
                        int j = 1, totM = 0;
                        Boolean p = false;
                        System.out.println("****Enter 6 Sub Marks");
                        while (j <= 6) {
                            System.out.println("Enter Marks of Sub " + j);
                            int sub = Integer.parseInt(s.nextLine());
                            if (sub < 0 || sub > 100) {
                                System.out.println("Invalid Marks..");
                                continue;
                            }
                            if (sub >= 0 && sub <= 34) {
                                p = true;
                            }
                            totM = totM + sub;
                            j++;
                        }
                        stu[i].totMarks = totM;
                        stu[i].per = (float) stu[i].totMarks / 6;
                        stu[i].result = new StudentResult().calulate(stu[i].per, p);
                    } else {
                        System.out.println("RollNo not matched with Branch..");
                        System.exit(0);
                    }
                } else {
                    System.out.println("Invalid Branch...");
                    System.exit(0);
                }
            } else {
                System.out.println("invalid Rollno...");
                System.exit(0);
            }
        }
        System.out.println("======StudentDetails=====");
        Spliterator<Student> sp = Arrays.spliterator(stu);
        sp.forEachRemaining((k) -> {
            System.out.println(k.toString());
        });
        s.close();
    }
}
