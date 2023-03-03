import java.util.*;
public class tsk {
    public static void main(String[] args) {
    Scanner jay = new Scanner(System.in);
        int number[] = new int [10];
        int tempo = 0;
        System.out.println("Enter your number: ");
        for (int a = 0 ; a<10; a++){
            number[a]= jay.nextInt();
        }
        for (int a = 0 ; a<10; a++){
            for ( int b =0;b<10;b++){
                if (number[a] < number[b]){
                tempo = number[a];
                number[a] = number[b];
                number[b] = tempo;
        }
        }
        }
        System.out.println("\nThe ascending number of your numbers are: ");
        for (int a = 0; a<10; a++)
            System.out.print(number[a]+" ");
    }
}