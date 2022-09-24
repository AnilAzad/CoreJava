package test;

public class Employee {
    public String id, name, desg;
    public Salary sl;// reference variable of type Salary

    public Employee(Salary sl) {
        this.sl = sl;
    }

    public String toString() {
        return id + "\t" + name + "\t" + desg + "\t" + sl.bSal + "\t" + sl.totSal;
    }
}
