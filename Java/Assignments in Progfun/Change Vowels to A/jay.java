import java.util.*;
public class jay {
    public static void main(String[] args) {
    Scanner jay = new Scanner(System.in);
        System.out.print("Enter your Word: ");
        String word = jay.nextLine();
        System.out.println("Before: "+word);
        String cword = word.replaceAll("e","a").replace("i","a").replace("o","a")
                    .replace("u","a").replaceAll("E","a").replace("I","a").replace("O","a").replace("U","a");
        System.out.println("After: "+cword.toLowerCase());
    }
}