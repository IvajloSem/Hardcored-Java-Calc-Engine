package hardcodedcalcengine;

public class HardCodedCalcEngine {

    public static void main(String[] args) {
        
        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100.0d, 200.0d, 'd');
        equations[1] = create(200.0d, 150.0d, 'a');
        equations[2] = create(300.0d, 100.0d, 's');
        equations[3] = create(400.0d, 50.0d, 'm');
        
       
        for(MathEquation equation : equations){
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.result);
        }
    }
    
    public static MathEquation create (double val1, double val2, char opCode){
        MathEquation equation = new MathEquation();
        equation.val1 = val1;
        equation.val2 = val2;
        equation.opCode = opCode;
        
        return equation;
    }
    
}
