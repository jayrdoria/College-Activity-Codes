import java.util.*;
    public class jayrdoria {
    public static void main(String[] args) {
    int sn = 10;
        System.out.println("This is a program that will allow you to Add or deduct number.");
        System.out.println("Press 1 if you want to deduct \nPress 2 if you want to add"+"\nStarting number  = 10");
        Scanner jay = new Scanner (System.in); 
    for (int i=0;;i++) {
        System.out.print("\nEnter your Choice: ");
        int choice = jay.nextInt();
        System.out.print("Enter your number: ");
        int num = jay.nextInt();   
        if (choice == 1){
        sn = sn - num;
        }
        if (choice == 2){
        sn = sn + num;
        }
        if (sn < 1 || sn >99){
            System.out.println("Thank you! Exiting program..... ");
            break;
        }
        System.out.println("Current Number: "+sn);
    }
    }
}