import java.util.Scanner;

/**
 * 
 * Created by Antonio Martinez
 * pyramid- Java School
 * 
 */

public class CurrencyConverter {
    
    //static double rate = 0;
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //Initial message
        System.out.println("*****************************Currency Convertor*****************************" + 
        "\nPlease, select conversion option. [1 or 2]" +
        "\n                              1.   Dollar -> Euro                                 " + 
        "\n                              2.   Euro -> Dollar                               " +
        "\n                              3.   Operation +                               " + 
        "\n                              4.   Operation -                               "
        );
        
        //Ask for one option
        int option = input.nextInt();
        if (option == 1) {

            System.out.println("Please, write the Dollar -> Euro rate. For example: 0,5");
            double rate = input.nextDouble();

            
            System.out.println("Please, write the amount of $ you want to convert.");
            double Ammount = input.nextDouble();


            System.out.println(Ammount + "$ correspond to "+ convertTo(Ammount, rate) + "Eur.");

            }
            else if (option == 2) {

                System.out.println("Please, write the Euro -> Dollar rate. For example: 0,5");
                double rate = input.nextDouble();
    
                
                System.out.println("Please, write the amount of Euros you want to convert.");
                double Ammount = input.nextDouble();
    
    
                System.out.println(Ammount + "Eur. correspond to "+ convertTo(Ammount, rate) + "$");      
            }

            else if (option == 3) {

                System.out.println("Please, write first ammount to be summed");
                double input1 = input.nextDouble();
         
                System.out.println("Please, write second ammount to be summed");
                double input2 = input.nextDouble();

                System.out.println("Total: "+ sum(input1, input2)); 

            }

            else if (option == 4) {

                System.out.println("Please, write first ammount to be substracted");
                double input1 = input.nextDouble();
         
                System.out.println("Please, write second ammount to be substracted");
                double input2 = input.nextDouble();

                System.out.println("Total: "+ rest(input1, input2)); 

            }

            else {
                System.out.println("Wrong option, try again.");
        }
 
    }

    public static double convertTo (double money, double rate) {
        double dolars = money * rate;
        return dolars;
    }


    public static double sum (double input1, double input2) {
        double total = input1 + input2;
        return total;
    }

    public static double rest (double input1, double input2) {
        double total = input1 - input2;
        return total;
    }

}
