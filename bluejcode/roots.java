import java.util.Scanner;
public class roots
{ public static void main (String[] args)
    {   Scanner input = new Scanner(System.in);
        System.out.println("Let's Solve ax^2+bx+c... sounds fun");
        System.out.println("Put your variables in start with A");
        double a = input.nextDouble();
        System.out.println("Now B");
        double b = input.nextDouble();
        System.out.println("Now C");
        double c = input.nextDouble();
        if (b*b-4*a*c<0){
        System.out.println("This is like a dead tree :( no roots");}
        if (b*b-4*a*c==0){
        double negb = b*-1;
            double Answer = negb/2*a;
        System.out.println("you'r a half dead tree with a root of");
        System.out.println(Answer);
    }
        if (b*b-4*a*c>0){
        double quad = (b*b)-(4*a*c);
            double Answer1 = (-b+(Math.sqrt(quad)))/(2*a);
        double Answer2 = (-b-(Math.sqrt(quad)))/(2*a);
        System.out.println("you'r a glorious tree with roots of");
        System.out.println(Answer1);
        System.out.println(Answer2);
    }
    }// end of main method

}// end of my class