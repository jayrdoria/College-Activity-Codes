import java.util.*;
public class doria {
    public static void main(String[] args) {
    int highnum = 0, lownum = 0;
    Scanner user = new Scanner (System.in);
    System.out.println("Enter your number: ");
    highnum = lownum = user.nextInt();
    for (int i=0;i<9;i++){
        int num = user.nextInt();
        if (num>highnum)
            highnum = num;
        if (num<lownum)
            lownum = num;
    }     
        System.out.println("The highest number is: "+highnum+"\nThe lowest number is: "+lownum);   
}
}