package hardcodedcalcengine;

public class HardCodedCalcEngine {

    public static void main(String[] args) {
        double[] val1 = {5.0d, 10.0d, 15.0d, 20.0d};
        double[] val2 = {1.0d, 2.0d, 3.0d, 4.0d};
        char[] opCode = {'a', 's', 'd', 'm'};
        double[] result = new double [opCode.length];
        
        for(int i=0; i<opCode.length; i++){
            switch(opCode[i]){
                case 'a':
                    result[i] = val1[i] + val2[i];
                    break;
                case 's' :
                    result[i] = val1[i] - val2[i];
                    break;
                case 'd':
                    result[i] = val2[i] != 0.0d ? val1[i] / val2[i] : 0.0d; 
                    break;
                case 'm' :
                    result[i] = val1[i] * val2[i];
                    break;
                default :
                System.out.print("Invalid opCode");
                break;
            }
            
        }
        for(double theResult : result){
        System.out.print("result = ");
        System.out.println(theResult);
        }
    }
    
}
