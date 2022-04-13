public class CheckEvenOddNumber {
    public static void main (String []args){
        int i = 4;
        if ( i % 2 ==0) // If a number which is divisible by 2 and generates a remainder of 0 is called an even number
                        // % Modulus: divides left hand operand and returns remainder
            {
            System.out.println ( (i) + " is Even number");
        }
        else {
            System.out.println ( (i) + " is Odd number");
        }

    }
}
