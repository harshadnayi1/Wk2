import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class EligibleVotingAge {
    public static void main (String[] args) {
        int age = 17; //Eligable if 18 is over
           if (age>= 18 & age<=120)// age is 18 or over and 120 or under
        {
            System.out.println("Congratulation! Your are " + (age) + " Years old and you are eligible for Vote");
        }
        else if (age<=0 | age>=121) //0 or less or 120 or more
        {
            System.out.println("Please enter valid AGE!");
        }

        else {
        System.out.println("Sorry! Your are " + (age) + " Years old and you are NOT eligible for Vote");

        }

    }
}