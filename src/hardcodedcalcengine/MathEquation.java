package hardcodedcalcengine;

public class MathEquation {
    public double val1, val2;
    public char opCode;
    public double result;
    
    public void execute(){
        switch (opCode) {
            case 'a':
                result = val1 + val2;
                break;
            case 's':
                result = val1 - val2;
                break;
            case 'd':
                result = val2 != 0.0d ? val1 / val2 : 0.0d;
                break;
            case 'm':
                result = val1 * val2;
                break;
            default:
                System.out.print("Invalid opCode");
                break;
        }
    }
}
