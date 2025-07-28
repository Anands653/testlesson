// Display employee details like name, exp and salary
// if exp is > 6 yrs and salary > 4500 give bonus 500 
// if exp is <= 6 yrs and salary <= 4500 give bonus of 800 
// if exp is >= 9 yrs and alary >= 8000n give bonus 1200

import java.util.Scanner;

public class Sample1
{
 public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

 System.out.println("Enter Name");
 String name = sc.nextLine();

 System.out.println("Enter Exp");
 float exp =sc.nextFloat();

 System.out.println("Enter Salary");
 float salary = sc.nextFloat();


 if(((exp > 6)&&(exp < 9)) && ((salary > 4500)&&(salary < 8000)))

   {
    System.out.println("Your Bonus is 500");
    System.out.println("Total salary = "+(salary+500));
   }

   if ((exp <= 6) && (salary <= 4500))
   {
      System.out.println("Your Bonus is 800");
      System.out.println("Total salary = "+(salary+800));
    }
      if ((exp >= 9) &&(salary >= 8000))
      {
      System.out.println("Your Bonus is 1200");
      System.out.println("Total salary = "+(salary+1200));
      }
   }
}

