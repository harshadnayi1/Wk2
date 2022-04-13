public class CheckPositiveNegative {
    public static void main (String[] args){
        int i = -200; //int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        if (i>0){
            System.out.println( (i)+ " is positive number");
        }
        else if (i<0){
            System.out.println( (i)+ " is Negative number");
        }
        else {
            System.out.println( (i) + " is number 0");
        }
    }
}
