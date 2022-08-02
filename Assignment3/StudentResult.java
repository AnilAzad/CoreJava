
public class StudentResult {

    public String calulate(float per, Boolean p) {
        if (p) {
            return "Fail";
        } else if (per >= 70 && per <= 100) {
            return "Distinction";
        } else if (per >= 70 && per <= 100) {
            return "FirstClass";
        } else if (per >= 70 && per <= 100) {
            return "Second Class";
        } else if (per >= 70 && per <= 100) {
            return "ThirdClass";
        } else {
            return "Fail";
        }
    }
}
