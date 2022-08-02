
public class GenerateBranch {

    public String generate(String brCode) {
        return switch (brCode) {
            case "01":
                yield "CIVIL";
            case "02":
                yield "MECH";
            case "03":
                yield "EEE";
            case "04":
                yield "ECE";
            case "05":
                yield "CSE";
            default:
                yield null;

        };
    }

}
