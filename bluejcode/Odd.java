import java.util.Scanner;
public class Odd
{   public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
         System.out.println("Enter a number");
          int userinput = input.nextInt();
           if (userinput%2==0)
            System.out.println("Even");
            
          else if(userinput%2==1)
               System.out.println("Odd");
    }//end of main method 
}//end of  class