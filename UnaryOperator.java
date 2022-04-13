public class UnaryOperator {
    public static void main (String [] args){
        int i = 20;
        boolean b = true;
        System.out.println("i++  = "+ (i++)); //20
        System.out.println("++i  = "+ (++i));//22
        System.out.println("++i  = "+ (++i));//23
        System.out.println("i++  = "+ (i++));//23
        System.out.println("i++  = "+ (i++));//24

        System.out.println("i--  = "+ (i--)); //25
        System.out.println("--i  = "+ (--i)); //23
        System.out.println("--i  = "+ (--i)); //22
        System.out.println("i-- = "+ (i--)); //22
        System.out.println("i--  = "+ (i--)); //21

        System.out.println(!b); //false
        System.out.println(b); //true
    }
}
