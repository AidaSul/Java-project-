import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        //Hash maps maps a key to a value
        HashMap<Integer, String> currencyCode = new HashMap<Integer, String>();
        // this hashmap out key is an int and that value is a string
        // we are going to map certain numbers to strings that will be our  codes

        //Add currency code
        currencyCode.put(1, "BIR"); //If we pass in a key on 1 we will get a string back which is BIR
        currencyCode.put(2, "CAD");
        currencyCode.put(3, "Leon");
        currencyCode.put(4, "USD");
        currencyCode.put(5, "Euro");
        currencyCode.put(6, "Pound");

        String fromCode, toCode;
        double amount;

        Scanner sc = new Scanner(System.in); // To get the content from user

        System.out.println("Welcome to the currency converter"); 

          





    }
}
