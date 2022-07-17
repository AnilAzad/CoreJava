public class DemoMethods2 {

    int a = 10;
    int b = 20;

    int Addition(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        DemoMethods2 ob = new DemoMethods2();

        ob.Addition(ob.a, ob.b);
        System.out.println("The sum of two number is : " + ob.Addition(ob.a, ob.b));

    }
}
