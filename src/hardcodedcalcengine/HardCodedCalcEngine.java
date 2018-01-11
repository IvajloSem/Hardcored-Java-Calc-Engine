package hardcodedcalcengine;

public class HardCodedCalcEngine {

    public static void main(String[] args) {
        
        // creates MathEquation instance 
        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100.0d, 200.0d, 'd');
        equations[1] = create(200.0d, 150.0d, 'a');
        equations[2] = create(300.0d, 100.0d, 's');
        equations[3] = create(400.0d, 50.0d, 'm');
        
        // loops through all MathEquations and executes them, then displays the result
        for(MathEquation equation : equations){
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }
    }
    
    public static MathEquation create (double val1, double val2, char opCode){
        MathEquation equation = new MathEquation();
        equation.setVal1 (val1);
        equation.setVal2 (val2);
        equation.setOpCode (opCode);
        
        return equation;
    }
    
}
