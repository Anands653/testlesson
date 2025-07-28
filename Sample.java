package anand;

import java.util.Scanner;

public class Sample {
    public static void main(String [] args){
    // If salary > 75000, pay bonus 6000.5
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        
        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        
        System.out.println("Enter Your Salary");
        float salary = sc.nextFloat();

        System.out.println("Welcome Mr/Miss:"+name);
        System.out.println("Your given age is:"+age);
        System.out.println("Your given salary is:"+salary);
        
        if (salary > 75000)
        {
            float bonus = 6000.5f;
            System.out.println("You Bonus is : "+bonus);

            float total_salary = salary + bonus;
            System.out.println("Your Total Salary :"+total_salary);
        }
     }
     }
    
