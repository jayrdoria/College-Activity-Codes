import java.util.*;
public class doria {
    public static void main(String[] args) {
        Scanner Jay = new Scanner(System.in);
        System.out.println("First Choice: \n1 = Fruit\n2 = Vegetables"+"\n\nSecond Choice: \n1 = Apple\n2 = Banana\n3 = Potato");
        System.out.println("\nEnter your First Choice: ");
        int c1 = Jay.nextInt();
        System.out.println("Enter your Second Choice: ");
        int c2 = Jay.nextInt();
        if ( c1 == 1 && c2 == 1 )
            System.out.println("Apple is a fruit");
        else if ( c1 == 1 && c2 == 2)
            System.out.println("Banana is a fruit");
        else if ( c1 == 1 && c2 == 3)
            System.out.println("Potato is not a fruit");
        else if ( c1 == 2 && c2 == 1 )
            System.out.println("Apple is not a vegetable");
        else if ( c1 == 2 && c2 == 2)
            System.out.println("Banana is not a vegetable");
        else if ( c1 == 2 && c2 == 3)
            System.out.println("Potato is a vegetable");   
	else
            System.out.println("The user input an invalid number.");
    }
}