package test;

public class Employee extends Object {
    public String id, name, desg;
    public int bSal;
    public float totSal;

    public Employee(String id, String name, String desg, int bSal, float totSal) {
        this.id = id;
        this.name = name;
        this.desg = desg;
        this.bSal = bSal;
        this.totSal = totSal;
    }

    public String toString() {
        return id + "\t" + name + "\t" + desg + "\t" + bSal + "\t" + totSal;
    }
}
