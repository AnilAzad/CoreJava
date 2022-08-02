import java.util.Scanner;

public class DemoString7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the RollNo : ");
        String rollNo = s.nextLine();
        if (rollNo.length() == 10) {
            System.out.println("Enter the Name :");
            String name = s.nextLine();
            System.out.println("Enter the Branch : ");
            System.out.println("(CIVIL or MECH or EEE or ECE or CSE)");
            String branch = s.nextLine().toUpperCase();
            BranchVerification bv = new BranchVerification();
            boolean k = bv.verify(branch);
            if (k) {
                GenerateBranch gb = new GenerateBranch();
                String br = gb.generate(rollNo.substring(6, 8));
                if (br == null) {
                    System.out.println("Invalid brCode in rollNo..");
                } else {
                    if (branch.equals(br)) {
                        int i = 1, totMarks = 0;
                        Boolean p = false;
                        System.out.println("****Enter 6 Sub Marks");
                        while (i <= 6) {
                            System.out.println("Enter Marks of Sub " + i);
                            int sub = s.nextInt();
                            if (sub < 0 || sub > 100) {
                                System.out.println("Invalid Marks..");
                                continue;
                            }
                            if (sub >= 0 && sub <= 34) {
                                p = true;
                            }
                            totMarks = totMarks + sub;
                            i++;
                        }
                        System.out.println("=====StudentDetails=====");
                        System.out.println("RollNo : " + rollNo);
                        System.out.println("Name : " + name);
                        System.out.println("Branch : " + branch);
                        System.out.println("TotMarks : " + totMarks);
                        float per = (float) totMarks / 6;
                        System.out.println("Per : " + per);
                        StudentResult sr = new StudentResult();
                        String result = sr.calulate(per, p);
                        System.out.println("Result : " + result);
                    } else {
                        System.out.println("RollNo Not Matched with branch..");
                    }
                }
            } else {
                System.out.println("Invalid Branch...");
            }
        } else {
            System.out.println("invalid RollNo..");
        }
        s.close();
    }
}
