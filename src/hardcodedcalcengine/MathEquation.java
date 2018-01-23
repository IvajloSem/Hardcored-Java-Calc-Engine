package hardcodedcalcengine;

public class MathEquation {
    //operation fields
    private double val1, val2;
    private char opCode;
    private double result;
    
    public double getVal1(){return val1;}
    public void setVal1(double val1) {this.val1 = val1;}
    
    public double getVal2(){return val2;}
    public void setVal2(double val2) {this.val2 = val2;}
    
    public char getOpCode(){return opCode;}
    public void setOpCode(char opCode) {this.opCode = opCode ;}

    public double getResult(){return result;}
    
    public MathEquation()
    {
        //constructor thats needs to exist here, because the 
        //default one wont work
    }
    
    public MathEquation(char opCode){
        this.opCode = opCode;
    }
    
    public MathEquation(char opCode, double val1, double val2){
        this(opCode);
        this.val1 = val1;
        this.val2 = val2;
        
    }
    
    public void execute(double val1, double val2)
    {
        this.val1 = val2;
        this.val2 = val2;
        execute();
    }
    
    public void execute(int val1, int val2)
    {
        this.val1 = val1;
        this.val2 = val2;
        execute();
        result = (int)result;
    }
    
    public void execute(){
        // all calculations are done here !
        switch (opCode) {
            case 'a':
                result = val1 + val2;
                break;
            case 's':
                result = val1 - val2;
                break;
            case 'd':   
                result = val2 != 0.0d ? val1 / val2 : 0.0d;
                // ? means "then" : means "if" ? not reallu sure 
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
