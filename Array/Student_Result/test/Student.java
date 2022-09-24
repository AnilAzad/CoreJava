package test;

public class Student extends Object {
    public String rollNo,name,branch,result;
    public int totMarks;
    public float per;
    public String toString(){
        return rollNo+"\t"+name+"\t"+branch+"\t"+totMarks+"\t"+per+"\t"+result;
    }
}
