public class progfun1 {
    public static void main(String[] args) {
   int number = 5214;
    int thousands, hundreds, tens, ones;
        System.out.println("Total Number: "+number);
    thousands = number / 1000;
    number = number % 1000;
    System.out.println("\nThousands: "+thousands+"\tValue after denomination: "+number);
    hundreds = number / 100;
    number = number % 100;
    System.out.println("Hundreds: "+hundreds+"\tValue after denomination: "+number);
    tens = number / 10;
    number = number % 10;
    System.out.println("Tens: "+tens+"\t\tValue after denomination: "+number);
    ones = number / 1;
    number = number % 1;
    System.out.println("Ones: "+ones+"\t\tValue after denomination: "+number);    
    String th1 = "One Thousand ", th2 = "Two Thousand ", th3 = "Three Thousand ", th4 = "Four Thousand ";
    String th5 = "Five Thousand ",th6 = "Six Thousand ", th7 = "Seven Thousand ", th8 = "Eigth Thousand ";
    String th9 = "Nine Thousand ";    
     if (thousands == 1)
            System.out.print("\n"+th1);
     else if (thousands == 2)
            System.out.print("\n"+th2);
     else if (thousands == 3)
            System.out.print("\n"+th3);
     else if (thousands == 4)
            System.out.print("\n"+th4);
     else if (thousands == 5)
            System.out.print("\n"+th5);
     else if (thousands == 6)
            System.out.print("\n"+th6);
     else if (thousands == 7)
            System.out.print("\n"+th7);
     else if (thousands == 8)
            System.out.print("\n"+th8);
     else if (thousands == 9)
            System.out.print("\n"+th9);
     else
            System.out.print("\n");     
     String h1 = "One Hundred ", h2 = "Two Hundred ", h3 = "Three Hundred ", h4 = "Four Hundred ";
     String h5 = "Five Hundred ", h6 = "Six Hundred ", h7 = "Seven Hundred ", h8 = "Eight Hundred ";
     String h9 = "Nine Hundred  ";     
    if (hundreds == 1)
            System.out.print(h1);
    if (hundreds == 2)
            System.out.print(h2);
    if (hundreds == 3)
            System.out.print(h3);
    if (hundreds == 4)
            System.out.print(h4);
    if (hundreds == 5)
            System.out.print(h5);
    if (hundreds == 6)
            System.out.print(h6);
    if (hundreds == 7)
            System.out.print(h7);
    if (hundreds == 8)
            System.out.print(h8);
    if (hundreds == 9)
            System.out.print(h9);
    else
            System.out.print(" ");     
    String n1 = "\bEleven",n2 = "\bTwelve",n3 = "\bThirteen",n4 = "\bFourteen", n5 = "\bFifteen";
    String n6 = "\bSixteen", n7 = "\bSeventeen", n8 = "\bEighteen", n9 = "\bNineteen", n0 = "\bTen";    
    if (tens == 1 && ones == 0)
            System.out.print(n0);
    else if (tens == 1 && ones == 1)
            System.out.print(n1);
    else if (tens == 1 && ones == 2)
            System.out.print(n2);
    else if (tens == 1 && ones == 3)
            System.out.print(n3);
    else if (tens == 1 && ones == 4)
            System.out.print(n4);
    else if (tens == 1 && ones == 5)
            System.out.print(n5);
    else if (tens == 1 && ones == 6)
            System.out.print(n6);
    else if (tens == 1 && ones == 7)
            System.out.print(n7);
    else if (tens == 1 && ones == 8)
            System.out.print(n8);
    else if (tens == 1 && ones == 9)
            System.out.print(n9);   
    String t2 = "\bTwenty ", t3 = "\bThirty ", t4 = "\bForty ", t5 = "\bFifty ", t6 = "\bSixty ";
    String t7 = "\bSeventy ", t8 = "\bEighty ", t9 = "\bNinety "; 
    String o1 = "One", o2 = "Two", o3 = "Three", o4 = "Four", o5 = "Five";
    String o6 = "Six", o7 = "Seven", o8 = "Eight", o9 = "Nine";   
    if (tens == 2)
            System.out.print(t2+"  ");
    else if (tens == 3)
            System.out.print(t3+"  ");
    else if (tens == 4)
            System.out.print(t4+"  ");
    else if (tens == 5)
            System.out.print(t5+"  ");
    else if (tens == 6)
            System.out.print(t6+"  ");
    else if (tens == 7)
            System.out.print(t7+"  ");
    else if (tens == 8)
            System.out.print(t8+"  ");
    else if (tens == 9)
            System.out.print(t9+"  ");
    else
            System.out.print(" ");           
    if (tens != 1 && ones ==1)
            System.out.print("\b\b"+o1);
    else if (tens != 1 && ones ==2)
            System.out.print("\b\b"+o2);
    else if (tens != 1 && ones ==3)
            System.out.print("\b\b"+o3);
    else if (tens != 1 && ones ==4)
            System.out.print("\b\b"+o4);
    else if (tens != 1 && ones ==5)
            System.out.print("\b\b"+o5);
    else if (tens != 1 && ones ==6)
            System.out.print("\b\b"+o6);
    else if (tens != 1 && ones ==7)
            System.out.print("\b\b"+o7);
    else if (tens != 1 && ones ==8)
            System.out.print("\b\b"+o8);
    else if (tens != 1 && ones ==9)
            System.out.print("\b\b"+o9);
    else if (thousands == 0 && hundreds == 0 && tens == 0 && ones == 0)
            System.out.print("\b\b\bZero");              
}
}