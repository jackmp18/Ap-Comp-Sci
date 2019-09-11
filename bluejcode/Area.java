import java.util.Scanner;
public class Area
{   public static void main(String[]args)
{   Scanner input = new Scanner (System.in);
    System.out.println("Enter the width than length");
    double width = input.nextInt();
    double length = input.nextInt();
    double area = width*length;
    
    System.out.println(area);
}
}