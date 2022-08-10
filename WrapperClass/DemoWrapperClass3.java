public class DemoWrapperClass3 {
    public static void main(String[] args) {
        // AutoBoxing
        Integer ob1 = 12;
        Float ob3 = 56.45F;
        Float ob5 = 556.45123F;
        Boolean ob7 = true;
        // AutoUnBoxing
        int i1 = ob1;
        float f1 = ob3;
        double d1 = ob5;
        boolean b1 = ob7;
        System.out.println("Display Primitive Datatypes");
        System.out.println("i1 : " + i1);
        System.out.println("f1 : " + f1);
        System.out.println("d1 : " + d1);
        System.out.println("b1 : " + b1);
    }
}
