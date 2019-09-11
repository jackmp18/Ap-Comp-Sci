import java.util.Scanner;
import java.util.concurrent.TimeUnit;



public class WannaPlayAGame
{ public static void main (String[] args)
    { Scanner input = new Scanner (System.in);
      System.out.println("Oh no im so not sorry but you have walked in to my trap");
      System.out.println("*Que boss music*");
      
      Integer[] sleeptimes = {5000, 500, 1000, 500, 500, 500, 2000, 100, 100,};
      for(int i = 0; i < sleeptimes.length; i++) {
      System.out.println("Dun");
      try{Thread.sleep(sleeptimes[i]);}catch(InterruptedException ie){}
      }
      System.out.println("Now it's time for some... math games");
      System.out.println("some might say... cool math games");
      System.out.println("Any who lets begin");
      System.out.println("to start with here are you to add");
      int num1 = (int)(Math.random()*21);
      int num2 = (int)(Math.random()*21);
      System.out.print(num1+ "+" +num2);
      int ui = input.nextInt();
     if(num1 + num2 == ui ){
     System.out.println("ok now i don't get to kill you");
     System.out.println("what a shame :(");}
     if(num1 + num2 != ui ) {
      System.out.println("Yes I have finally found an idiot");
      System.out.println(" ");
      System.out.println(" ");
      System.out.println(" ");
      System.out.println(" ");
      System.out.println("You have died");}
      
      
      


    }// end of main method

}// end of my class