import java.util.Scanner;
public class Order2
{   public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Chuck in some numbers baby ;)");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
       

        if (num1>num2){
        System.out.println(num1+""+num2);
    }
    if (num2>num1){
        System.out.println(num2+"    "+num1);
    }
    System.out.println("we have brought order to the galaxy");
}
}