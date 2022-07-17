public class DemoMethods3 {
    int add(int a, int b){
        int c=a+b;
        return c;
    }
    float avg(int a, int b){
        float z=(float)(a+b)/2;
        return z;
    }
    public static void main(String[] args) {
        int x=9;
        int y=2;
        DemoMethods3 ob=new DemoMethods3();
        int r1=ob.add(x, y);
        float r2=ob.avg(x, y);
        System.out.println("Sum : "+r1);
        System.out.println("Avg : "+r2);
    }
}
