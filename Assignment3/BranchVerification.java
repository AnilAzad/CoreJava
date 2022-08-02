
public class BranchVerification {

    public boolean verify(String br) {
        return switch (br) {
            case "CIVIL":
                yield true;
            case "MECh":
                yield true;
            case "EEE":
                yield true;
            case "ECE":
                yield true;
            case "CSE":
                yield true;
            default:
                yield false;

        };
    }

}
