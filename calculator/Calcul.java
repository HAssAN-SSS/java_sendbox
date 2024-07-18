/**
 * Calcul
 */
public class Calcul {
    double operand1 , operand2;
    String operator;
    public Calcul(double opt1 , double opt2){
        operand1 = opt1;
        operand2 = opt2;


    }

    public void cuul(String optor) {
        switch (optor) {
            case "-":
                System.err.println(this.operand1 - this.operand2);
                break;

            case "*":
                System.err.println(this.operand1 * this.operand2);
            
                break;

            case "/":
                System.err.println(this.operand1 / this.operand2);
                
                break;
                
            case "+":
                System.err.println(this.operand1 + this.operand2);
                
                break;    
            default:
                break;
        }
    }

    public static void main(String[] args) {
        Calcul testi = new Calcul(1, 2);
        testi.cuul("-");
    }
}