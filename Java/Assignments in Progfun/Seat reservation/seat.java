import java.util.*;
public class seat {
    public static void main(String[] args) {
        Scanner jay = new Scanner (System.in); 
        String[] lines = {"-","-","-","\n-","-","-","\n-","-","-"};
        String[] lines2 = {"*","*","*","\n*","*","*","\n*","*","*"};
        System.out.println("Welcome to Seat reservation:"+"\nEnter 1-3 for Rows = X "+"\nEnter 1-3 for Column = Y");
        System.out.println("'*' Demonstrates that the Seat is already reserved"+"\n'-' Shows that the Seat is accessible for reservation");
        for (int a = 0;;a++){ 
            for (int b = 0;;b++){   
            System.out.println("\nThese are the available seats:");
            Arrays.stream(lines).forEach(System.out::print);
            System.out.print("\nEnter value of X: ");
            int x = jay.nextInt();
            System.out.print("\nEnter value of Y: ");
            int y = jay.nextInt();
            if (x < 1 || x>3 || y<1 || y>3)
                    System.out.print("Your input is invalid, Try again\n");
            if (x == 1 && y == 1)
                lines[0] = lines2[0];
            if (x == 1 && y == 2)
                lines[1] = lines2[1];
            if (x == 1 && y == 3)
                lines[2] = lines2[2];
            if (x == 2 && y == 1)
                lines[3] = lines2[3];
            if (x == 2 && y == 2)
                lines[4] = lines2[4];
            if (x == 2 && y == 3)
                lines[5] = lines2[5];
            if (x == 3 && y == 1)
                lines[6] = lines2[6];
            if (x == 3 && y == 2)
                lines[7] = lines2[7];
            if (x == 3 && y == 3)
                lines[8] = lines2[8];
            if (lines[0] == lines2[0] && lines[1]== lines2[1] && lines[2]== lines2[2] && lines[3]== lines2[3] && 
                   lines[4]== lines2[4] && lines[5]== lines2[5] && lines[6]== lines2[6] && lines[7]== lines2[7]&& 
                   lines[8]== lines2[8]){
                System.out.println("All seats are reserved, Thank you!");
                Arrays.stream(lines).forEach(System.out::print);
                break;}            
}
            break;
}
    }
    }



