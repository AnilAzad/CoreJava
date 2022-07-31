import java.util.Scanner;

public class DemoString2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = s.nextLine();
        int count = 0;
        int conCount = 0;
        int sum=0,numCount=0,spCount=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
                    || str.charAt(i) == 'O'
                    || str.charAt(i) == 'U') {
                count++;
            } else if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                    || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {

                conCount++;
            }
            else if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                
                sum=sum+Integer.parseInt(String.valueOf(str.charAt(i)));
                numCount++;
            }else{
                spCount++;
            }
        }
        System.out.println("Vowels Count : " + count);
        System.out.println("Consonent Count : " + conCount);
        System.out.println("Numbers : "+numCount);
        System.out.println("Numbers Sum : "+sum);
        System.out.println("Other : "+spCount);
        s.close();

    }
}
