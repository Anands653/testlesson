import java.util.Scanner;

public class ATM 
{
    public static void main(String[] args) 
    {
   
        int pin_number = 1234;
        float balance = 2000.00f;

        Scanner sc = new Scanner(System.in);

         System.out.println("Enter pin number");
         int given_pin_number = sc.nextInt();
    

             if(given_pin_number == pin_number) //if ATM pin is correct
            {

                System.out.println("Welcome to My ATM");
                System.out.println("1. Balance Check");
                System.out.println("2. Withdrawal");
                System.out.println("Please select 1 option");
                int given_option = sc.nextInt();
                
                if(given_option == 1)// if option 1 is selected
                {

                System.out.println("Your current balance is = "+balance);
                }

               else if (given_option == 2) // of option 2 is selected
                {
                    System.out.println("Enter Amount to Withdraw :");
                    int given_amount = sc.nextInt();
            
        {
                  if(given_amount <= 300) // Validate max limit <=300 is true
                    {
                                    
                 if(given_amount%10 == 0) // Must be multiples of 10 is true
                    {
                    }

                     if(given_amount <= balance)// check availability of fund
                    {
                        balance = balance - given_amount;
                        System.out.println("Amount withdraw is :"+given_amount);
                        System.out.println("Available Balance is : " +balance);

                    }
                         else
                            {
                            System.out.println("No Sufficient fund Available");
                            }
                        }
                           else
                            {
                            System.out.println("Please enter in Multiples of 10");
                            }
                        
                                                    
                             // Validate max limit > 300 is false
                    
                            {
                            System.out.println("Invalid option selected");
                        }
                    }                   
                             // if pin is wrong
                   //else       
                               { 
                                System.out.println("Wrong pin number");
                                  }
                
                                 System.out.println("Thanks fr using ATM");
                                }
                            
            
        }
    }
}