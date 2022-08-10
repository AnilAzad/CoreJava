public class DemoWrapperClass2 {
    public static void main(String[] args) {
        // Boxing
        Integer ob1=new Integer(12);
        Integer ob2=new Integer("31");
        Float ob3=new Float(56.45F);
        Float ob4=new Float("564.45F");
        Float ob5=new Float(556.45123);
        Character ob6=new Character('A');
        Boolean ob7=new Boolean(true);
        Boolean ob8=new Boolean("true");
        // UnBoxing
        int i1=ob1.intValue();
        int i2=Integer.parseInt(ob2.toString());
        float f1=ob3.floatValue();
        float f2=Float.parseFloat(ob4.toString());
        double d1=ob5.doubleValue();
        char ch=ob6.charValue();
        boolean b1=ob7.booleanValue();
        boolean b2=Boolean.parseBoolean(ob8.toString());
        System.out.println("Display Primitive Datatypes");
        System.out.println("i1 : "+i1);
        System.out.println("i2 : "+i2);
        System.out.println("f1 : "+f1);
        System.out.println("f2 : "+f2);
        System.out.println("d1 : "+d1);
        System.out.println("ch : "+ch);
        System.out.println("b1 : "+b1);
        System.out.println("b2 : "+b2);
    }
}
