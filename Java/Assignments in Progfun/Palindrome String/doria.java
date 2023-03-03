import java.util.*;
public class doria{
    public static void main(String[] args) {
    Scanner jay = new Scanner(System.in);
        String nword = "";
        System.out.println("This program will determine if the word you enter is a Palindrome!");
        System.out.print("Enter your Word: ");
        String word = jay.nextLine();
        word = word.toLowerCase();
        int a = word.length()-1;
        for (int b = a; b>=0; b--){
            nword = nword + word.charAt(b);
        }     
        if (word.equals(nword))
                System.out.println("Its a Palindrome!");
        else
            System.out.println("Its not a Palindrome");            
        }
        
    }
