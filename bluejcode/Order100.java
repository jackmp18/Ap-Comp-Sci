import java.util.Scanner;
public class Order100
{   public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Chuck in some numbers baby ;)");
        int[] array = new int[100];
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*100);
        }
        for(int i = 0; i < array.length - 1; i++){
            if(array[i] > array[i+ 1]){
                int temp = array[i];
                array[i] = array[i + 1];
                array[i = 1
            }
        }
    }
}