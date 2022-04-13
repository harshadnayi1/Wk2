public class DataTypeArithmetic {
    public static void main (String [] args){
        int A = 10;
        int B  = 20;
        int C  = 5;

        float F = 1.50f;// data type float for multi digit number
        double D = 1.50;

        String s1 = "Float type: ";

        System.out.println("A + B is: " + (A) + " + " + (B)+ " = " + (A+B)); //A + B is: 10 + 20 = 30
        System.out.println("A time B is: " + (A) + " X " + (B)+ " = "+ (A*B)); // A time B is: 10 X 20 = 200
        System.out.println("A Minus B is: " + (A) + " - " + (B)+ " = "+ (A-B)); //A Minus B is: 10 - 20 = -10
        System.out.println("B divide C is: " + (B) + " / " + (C)+ " = "+ (B/C)); //B divide C is: 20 / 5 = 4

        System.out.println("A divide F is: " + (A) + " / " + (F)+ " = "+ (A/F)); //A divide F is: 10 / 1.5 = 6.6666665
        System.out.println((s1) + "A divide D is: " + (A) + " / " + (D)+ " = "+ (A/D)); //Float type: A divide D is: 10 / 1.5 = 6.666666666666667
    }
}
