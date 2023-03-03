import java.util.*;
public class doria{
    public static void main(String[] args) {
    Scanner jay = new Scanner(System.in);
    int num[]= new int[5];
        System.out.println("Enter you numbers: ");
    for (int a = 0;;a++){
    for (int b = 0;b<5;b++){
        num[b] = jay.nextInt();
    }
        System.out.print("\nPress 1 if ODD\nPress 0 if EVEN\n\nEnter your Choice: ");
        int choice = jay.nextInt();
        if (choice == 0){
            System.out.print("EVEN numbers: ");
            if (num[0]%2==0)
                System.out.print(num[0]+" ");
            if (num[1]%2==0)
                System.out.print(num[1]+" ");
            if (num[2]%2==0)
                System.out.print(num[2]+" ");
            if (num[3]%2==0)
                System.out.print(num[3]+" ");
            if (num[4]%2==0)
                System.out.print(num[4]+" ");
            else 
                System.out.println("There are no EVEN numbers");
        }
        if (choice == 1){
             System.out.print("ODD numbers: ");
            if (num[0]%2!=0)
                System.out.print(num[0]+" ");
            if (num[1]%2!=0)
                System.out.print(num[1]+" ");
            if (num[2]%2!=0)
                System.out.print(num[2]+" ");
            if (num[3]%2!=0)
                System.out.print(num[3]+" ");
            if (num[4]%2!=0)
                System.out.print(num[4]+" ");
        else
                System.out.println("\nThere are no ODD numbers");
        }
        if (choice > 1 || choice < 0){
                System.out.println("Check your inputs!");
        }
                System.out.println("\n\nPress 1 if YES\nPress 0 if NO\n\nDo you want to continue?");
                int c2 = jay.nextInt();
                if (c2 == 1)
                    System.out.println("Enter you next numbers: ");
                if (c2 == 0)
                    break;
        }
                                               
}
}

