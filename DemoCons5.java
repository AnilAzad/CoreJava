import java.util.Scanner;

// Loading data to object using "Object Refrence Varialble"
class BookDetails{

    String bCode,bName,bAuthor;
    float bPrice;
    int bQty;
}
public class DemoCons5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        BookDetails b=new BookDetails();
        System.out.print("Enter BookCode : ");
        b.bCode=s.nextLine();
        System.out.print("Enter BookName : ");
        b.bName=s.nextLine();
        System.out.print("Enter BookAuthor : ");
        b.bAuthor=s.nextLine();
        System.out.print("Enter BookPrice : ");
        b.bPrice=s.nextFloat();
        System.out.print("Enter BookQty : ");
        b.bQty=s.nextInt();
        s.close();
        System.out.println("======BookDetials========");
        System.out.println("BookCode : "+b.bCode);
        System.out.println("BookName : "+b.bName);
        System.out.println("BookAuthor : "+b.bAuthor);
        System.out.println("BookPrice : "+b.bPrice);
        System.out.println("BookQty : "+b.bQty);
    }
}
