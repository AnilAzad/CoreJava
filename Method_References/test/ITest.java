package test;
public interface ITest {
    public abstract void dis(int x);
    public default void show(int p){
        System.out.println("=========Default Show(p)=========");
        System.out.println("value p : "+p);
    }
}