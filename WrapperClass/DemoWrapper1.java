public class DemoWrapper1{
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
        System.out.println("Display Primitive Datatypes");
        System.out.println("ob1 : "+ob1);
        System.out.println("ob2 : "+ob2);
        System.out.println("ob3 : "+ob3);
        System.out.println("ob4 : "+ob4);
        System.out.println("ob5 : "+ob5);
        System.out.println("ob6 : "+ob6);
        System.out.println("ob7 : "+ob7);
        System.out.println("ob8 : "+ob8);
    }
}