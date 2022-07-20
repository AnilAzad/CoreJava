class CTest2{
    int y=20;
    static{
        System.out.println("=====StaticBlocks======");
    }
    {
        System.out.println("=====InstanceBlocks======");
    }
    CTest2(){
        System.out.println("======Constructor========");
    }
}
public class DemoCons2 {
    public static void main(String[] args) {
        CTest2 ob=new CTest2();
        
    }
}
