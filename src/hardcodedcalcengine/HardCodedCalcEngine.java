package hardcodedcalcengine;

public class HardCodedCalcEngine {

    public static void main(String[] args) {
        
        // creates MathEquation instance 
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 100.0d, 200.0d);
        equations[1] = new MathEquation('a', 200.0d, 150.0d);
        equations[2] = new MathEquation('s', 300.0d, 100.0d);
        equations[3] = new MathEquation('m', 400.0d, 50.0d);
        
        // loops through all MathEquations and executes them, then displays the result
        for(MathEquation equation : equations){
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }
    }
    
    
    
}
