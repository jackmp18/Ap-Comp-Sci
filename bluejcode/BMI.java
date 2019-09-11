import java.util.Scanner;
public class BMI
{ public static void main (String[] args)
    { Scanner input = new Scanner(System.in);
      System.out.println("Were going to see just how thicc you are UwU");
      System.out.println("Please enter your vertical thiccness");
      double VTI = input.nextDouble();
      System.out.println("Now Your horazontal thiccness");
      double HTP = input.nextDouble();
      double VTM = VTI*0.0254;
      double HTKG = HTP*0.45359237;
      double BMI = VTM%(HTKG*HTKG);
      System.out.println("Look at just how thicc you are ;) call me");
      System.out.print(BMI);

    }// end of main method

}// end of my class