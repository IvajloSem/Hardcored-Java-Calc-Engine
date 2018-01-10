package hardcodedcalcengine;

public class HardCodedCalcEngine {

    public static void main(String[] args) {
        double val1 = 100, val2 = 23, result = 0;
        char opCode = 'a';
        
        if(opCode == 'a')
            result = val1+val2;
            else if(opCode == 's')
                result = val1-val2;
            else if(opCode == 'd') //if val2 is different from 0, then divide, otherwise return 0
                result = val2 != 0 ? val1 / val2 : 0.0d;
            else if(opCode == 'm')
                result = val1*val2;
            else{
            System.out.println("Invalid opCode");
        }
        
        System.out.println(result);
    }
    
}
