import java.util.*;
public class TicTacToe{
    static Scanner user = new Scanner (System.in);
    static String game1array[] = {"-","-","-","-","-","-","-","-","-"};
    static String game2array[] = {"-","-","-","-","-","-","-","-","-"};
    static String game3array[] = {"-","-","-","-","-","-","-","-","-"};
    static int p1score = 0;
    static int p2score = 0;
static void game1(){
    System.out.println("HELLO THIS IS ROUND 1! GOODLUCK");
for (int a = 0;;a++){
   for (int b = 0;;b++){
       System.out.println("Here is the game box as of now! ?"
               + "\n"+game1array[0]+" "+game1array[1]+" "+game1array[2]
                +"\n"+game1array[3]+" "+game1array[4]+" "+game1array[5]
                +"\n"+game1array[6]+" "+game1array[7]+" "+game1array[8]);
       System.out.print("PLAYER 1 ITS YOUR TURN!\nEnter ROW number here: ");
       int p1row = user.nextInt();
       if (p1row <1 || p1row > 3){
       System.out.println("CHECK INPUT!!!!!");
       break;
       }
       System.out.print("Enter COLUMN number here: ");
       int p1column = user.nextInt();
       if (p1column <1 || p1column > 3){
       System.out.println("CHECK INPUT!!!!!");
       break;
       }
        if (p1row == 1 && p1column == 1){
           if (game1array[0] == "O"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 2! CHOOSE AGAIN!? ? ? ");
           break;}
           if (game1array[0] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           break;}
           }
        if (p1row == 1 && p1column == 2){
           if (game1array[1] == "O"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 2! CHOOSE AGAIN!? ? ? ");
           break;}
           if (game1array[1] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           break;}
           }
        if (p1row == 1 && p1column == 3){
           if (game1array[2] == "O"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 2! CHOOSE AGAIN!? ? ? ");
           break;}
           if (game1array[2] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           break;}
           }
        if (p1row == 2 && p1column == 1){
           if (game1array[3] == "O"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 2! CHOOSE AGAIN!? ? ? ");
           break;}
           if (game1array[3] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           break;}
           }
        if (p1row == 2 && p1column == 2){
           if (game1array[4] == "O"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 2! CHOOSE AGAIN!? ? ? ");
           break;
           }
           if (game1array[4] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           break;}
           }
        if (p1row == 2 && p1column == 3){
           if (game1array[5] == "O"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 2! CHOOSE AGAIN!? ? ? ");
           break;}
           if (game1array[5] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           break;}
           }
        if (p1row == 3 && p1column == 1){
           if (game1array[6] == "O"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 2! CHOOSE AGAIN!? ? ? ");
           break;}
           if (game1array[6] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           break;}
           }
        if (p1row == 3 && p1column == 2){
           if (game1array[7] == "O"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 2! CHOOSE AGAIN!? ? ? ");
           break;}
           if (game1array[7] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           break;}
           }
        if (p1row == 3 && p1column == 3){
           if (game1array[8] == "O"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 2! CHOOSE AGAIN!? ? ? ");
           break;}
           if (game1array[8] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN? ? ? ");
           break;}
           }
       if (p1row ==1 && p1column == 1){
        game1array[0] = "X";
       }
       if(p1row == 1 && p1column == 2){
        game1array[1] = "X";
       }
       if(p1row == 1 && p1column == 3){
        game1array[2] = "X";
       }
       if(p1row == 2 && p1column == 1){
        game1array[3] = "X";
       }
       if(p1row == 2 && p1column == 2){
        game1array[4] = "X";
       }
       if(p1row == 2 && p1column == 3){
        game1array[5] = "X";
       }
       if(p1row == 3 && p1column == 1){
        game1array[6] = "X";
       }
       if(p1row == 3 && p1column == 2){
        game1array[7] = "X";
       }
       if(p1row == 3 && p1column == 3){
        game1array[8] = "X";
       }
       if (game1array[0] == "X" && game1array[1] == "X" && game1array[2] == "X"){
        p1score++;
        System.out.println("PLAYER 1 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game1array[0]+" "+game1array[1]+" "+game1array[2]+"\n"
        +game1array[3]+" "+game1array[4]+" "+game1array[5]+"\n"
        +game1array[6]+" "+game1array[7]+" "+game1array[8]);
        return;
       }
       if (game1array[3] == "X" && game1array[4] == "X" && game1array[5] == "X"){
        p1score++;
        System.out.println("PLAYER 1 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game1array[0]+" "+game1array[1]+" "+game1array[2]+"\n"
        +game1array[3]+" "+game1array[4]+" "+game1array[5]+"\n"
        +game1array[6]+" "+game1array[7]+" "+game1array[8]);
        return;
       }
       if (game1array[6] == "X" && game1array[7] == "X" && game1array[8] == "X"){
        p1score++;
        System.out.println("PLAYER 1 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game1array[0]+" "+game1array[1]+" "+game1array[2]+"\n"
        +game1array[3]+" "+game1array[4]+" "+game1array[5]+"\n"
        +game1array[6]+" "+game1array[7]+" "+game1array[8]);
        return;
       }
       if (game1array[0] == "X" && game1array[3] == "X" && game1array[6] == "X"){
        p1score++;
        System.out.println("PLAYER 1 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game1array[0]+" "+game1array[1]+" "+game1array[2]+"\n"
        +game1array[3]+" "+game1array[4]+" "+game1array[5]+"\n"
        +game1array[6]+" "+game1array[7]+" "+game1array[8]);
        return;
       }
       if (game1array[1] == "X" && game1array[4] == "X" && game1array[7] == "X"){
        p1score++;
        System.out.println("PLAYER 1 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game1array[0]+" "+game1array[1]+" "+game1array[2]+"\n"
        +game1array[3]+" "+game1array[4]+" "+game1array[5]+"\n"
        +game1array[6]+" "+game1array[7]+" "+game1array[8]);
        return;
       }
       if (game1array[2] == "X" && game1array[5] == "X" && game1array[8] == "X"){
        p1score++;
        System.out.println("PLAYER 1 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game1array[0]+" "+game1array[1]+" "+game1array[2]+"\n"
        +game1array[3]+" "+game1array[4]+" "+game1array[5]+"\n"
        +game1array[6]+" "+game1array[7]+" "+game1array[8]);
        return;
       }
       if (game1array[0] == "X" && game1array[4] == "X" && game1array[8] == "X"){
        p1score++;
        System.out.println("PLAYER 1 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game1array[0]+" "+game1array[1]+" "+game1array[2]+"\n"
        +game1array[3]+" "+game1array[4]+" "+game1array[5]+"\n"
        +game1array[6]+" "+game1array[7]+" "+game1array[8]);
        return;
       }
       if (game1array[2] == "X" && game1array[4] == "X" && game1array[6] == "X"){
        p1score++;
        System.out.println("PLAYER 1 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game1array[0]+" "+game1array[1]+" "+game1array[2]+"\n"
        +game1array[3]+" "+game1array[4]+" "+game1array[5]+"\n"
        +game1array[6]+" "+game1array[7]+" "+game1array[8]);
        return;
       }
       for (int c = 0 ;; c++){
           System.out.println("Here is the game box as of now! ?"
               + "\n"+game1array[0]+" "+game1array[1]+" "+game1array[2]
                +"\n"+game1array[3]+" "+game1array[4]+" "+game1array[5]
                +"\n"+game1array[6]+" "+game1array[7]+" "+game1array[8]);
       System.out.print("PLAYER 2 ITS YOUR TURN!\nEnter ROW number here: ");
       int p2row = user.nextInt();
       if (p2row <1 || p2row > 3){
       System.out.println("CHECK INPUT!!!!!!!");
       }
       System.out.print("Enter COLUMN number here: ");
       int p2column = user.nextInt();
       if (p2column <1 || p2column > 3){
       System.out.println("CHECK INPUT");
       }
         if (p2row == 1 && p2column == 1){
           if (game1array[0] == "X"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 1! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           else if (game1array[0] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           }
        if (p2row == 1 && p2column == 2){
           if (game1array[1] == "X"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 1! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           else if (game1array[1] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           }
        if (p2row == 1 && p2column == 3){
           if (game1array[2] == "X"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 1! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           else if (game1array[2] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           }
        if (p2row == 2 && p2column == 1){
           if (game1array[3] == "X"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 1! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           else if (game1array[3] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           }
        if (p2row == 2 && p2column == 2){
           if (game1array[4] == "X"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 1! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           else if (game1array[4] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           continue;    
           }
           }
        if (p2row == 2 && p2column == 3){
           if (game1array[5] == "X"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 1! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           else if (game1array[5] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           }
        if (p2row == 3 && p2column == 1){
           if (game1array[6] == "X"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 1! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           else if (game1array[6] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           }
        if (p2row == 3 && p2column == 2){
           if (game1array[7] == "X"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 1! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           else if (game1array[7] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           }
        if (p2row == 3 && p2column == 3){
           if (game1array[8] == "X"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 1! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           else if (game1array[8] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN? ? ? ");
           continue;
           }
           }
       if (p2row ==1 && p2column == 1){
        game1array[0] = "O";
        break;
       }
       if(p2row == 1 && p2column == 2){
        game1array[1] = "O";
        break;
       }
       if(p2row == 1 && p2column == 3){
        game1array[2] = "O";
        break;
       }
       if(p2row == 2 && p2column == 1){
        game1array[3] = "O";
        break;
       }
       if(p2row == 2 && p2column == 2){
        game1array[4] = "O";
        break;
       }
       if(p2row == 2 && p2column == 3){
        game1array[5] = "O";
        break;
       }
       if(p2row == 3 && p2column == 1){
        game1array[6] = "O";
        break;
       }
       if(p2row == 3 && p2column == 2){
        game1array[7] = "O";
        break;
       }
       if(p2row == 3 && p2column == 3){
        game1array[8] = "O";
        break;
       }
       }
       if (game1array[0] == "O" && game1array[1] == "O" && game1array[2] == "O"){
        p2score++;
        System.out.println("PLAYER 2 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game1array[0]+" "+game1array[1]+" "+game1array[2]+"\n"
        +game1array[3]+" "+game1array[4]+" "+game1array[5]+"\n"
        +game1array[6]+" "+game1array[7]+" "+game1array[8]);
        return;
       }
       if (game1array[3] == "O" && game1array[4] == "O" && game1array[5] == "O"){
        p2score++;
        System.out.println("PLAYER 2 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game1array[0]+" "+game1array[1]+" "+game1array[2]+"\n"
        +game1array[3]+" "+game1array[4]+" "+game1array[5]+"\n"
        +game1array[6]+" "+game1array[7]+" "+game1array[8]);
        return;
       }
       if (game1array[6] == "O" && game1array[7] == "O" && game1array[8] == "O"){
        p2score++;
        System.out.println("PLAYER 2 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game1array[0]+" "+game1array[1]+" "+game1array[2]+"\n"
        +game1array[3]+" "+game1array[4]+" "+game1array[5]+"\n"
        +game1array[6]+" "+game1array[7]+" "+game1array[8]);
        return;
       }
       if (game1array[0] == "O" && game1array[3] == "O" && game1array[6] == "O"){
        p2score++;
        System.out.println("PLAYER 2 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game1array[0]+" "+game1array[1]+" "+game1array[2]+"\n"
        +game1array[3]+" "+game1array[4]+" "+game1array[5]+"\n"
        +game1array[6]+" "+game1array[7]+" "+game1array[8]);
        return;
       }
       if (game1array[1] == "O" && game1array[4] == "O" && game1array[7] == "O"){
        p2score++;
        System.out.println("PLAYER 2 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game1array[0]+" "+game1array[1]+" "+game1array[2]+"\n"
        +game1array[3]+" "+game1array[4]+" "+game1array[5]+"\n"
        +game1array[6]+" "+game1array[7]+" "+game1array[8]);
        return;
       }
       if (game1array[2] == "O" && game1array[5] == "O" && game1array[8] == "O"){
        p2score++;
        System.out.println("PLAYER 2 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game1array[0]+" "+game1array[1]+" "+game1array[2]+"\n"
        +game1array[3]+" "+game1array[4]+" "+game1array[5]+"\n"
        +game1array[6]+" "+game1array[7]+" "+game1array[8]);
        return;
       }
       if (game1array[0] == "O" && game1array[4] == "O" && game1array[8] == "O"){
        p2score++;
        System.out.println("PLAYER 2 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game1array[0]+" "+game1array[1]+" "+game1array[2]+"\n"
        +game1array[3]+" "+game1array[4]+" "+game1array[5]+"\n"
        +game1array[6]+" "+game1array[7]+" "+game1array[8]);
        return;
       }
       if (game1array[2] == "O" && game1array[4] == "O" && game1array[6] == "O"){
        p2score++;
        System.out.println("PLAYER 2 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game1array[0]+" "+game1array[1]+" "+game1array[2]+"\n"
        +game1array[3]+" "+game1array[4]+" "+game1array[5]+"\n"
        +game1array[6]+" "+game1array[7]+" "+game1array[8]);
        return;
       }
   }
   }
}
static void game2(){
    System.out.println("HELLO THIS IS ROUND 2! GOODLUCK");
for (int a = 0;;a++){
   for (int b = 0;;b++){
       System.out.println("Here is the game box as of now! ?"
               + "\n"+game2array[0]+" "+game2array[1]+" "+game2array[2]
                +"\n"+game2array[3]+" "+game2array[4]+" "+game2array[5]
                +"\n"+game2array[6]+" "+game2array[7]+" "+game2array[8]);
       System.out.print("PLAYER 1 ITS YOUR TURN!\nEnter ROW number here: ");
       int p1row = user.nextInt();
       if (p1row <1 || p1row > 3){
       System.out.println("CHECK INPUT");
       break;
       }
       System.out.print("Enter COLUMN number here: ");
       int p1column = user.nextInt();
       if (p1column <1 || p1column > 3){
       System.out.println("CHECK INPUT");
       break;
       }
        if (p1row == 1 && p1column == 1){
           if (game2array[0] == "O"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 2! CHOOSE AGAIN!? ? ? ");
           break;}
           if (game2array[0] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           break;}
           }
        if (p1row == 1 && p1column == 2){
           if (game2array[1] == "O"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 2! CHOOSE AGAIN!? ? ? ");
           break;}
           if (game2array[1] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           break;}
           }
        if (p1row == 1 && p1column == 3){
           if (game2array[2] == "O"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 2! CHOOSE AGAIN!? ? ? ");
           break;}
           if (game2array[2] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           break;}
           }
        if (p1row == 2 && p1column == 1){
           if (game2array[3] == "O"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 2! CHOOSE AGAIN!? ? ? ");
           break;}
           if (game2array[3] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           break;}
           }
        if (p1row == 2 && p1column == 2){
           if (game2array[4] == "O"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 2! CHOOSE AGAIN!? ? ? ");
           break;
           }
           if (game2array[4] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           break;}
           }
        if (p1row == 2 && p1column == 3){
           if (game2array[5] == "O"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 2! CHOOSE AGAIN!? ? ? ");
           break;}
           if (game2array[5] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           break;}
           }
        if (p1row == 3 && p1column == 1){
           if (game2array[6] == "O"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 2! CHOOSE AGAIN!? ? ? ");
           break;}
           if (game2array[6] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           break;}
           }
        if (p1row == 3 && p1column == 2){
           if (game2array[7] == "O"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 2! CHOOSE AGAIN!? ? ? ");
           break;}
           if (game2array[7] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           break;}
           }
        if (p1row == 3 && p1column == 3){
           if (game2array[8] == "O"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 2! CHOOSE AGAIN!? ? ? ");
           break;}
           if (game2array[8] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN? ? ? ");
           break;}
           }
       if (p1row ==1 && p1column == 1){
        game2array[0] = "X";
       }
       if(p1row == 1 && p1column == 2){
        game2array[1] = "X";
       }
       if(p1row == 1 && p1column == 3){
        game2array[2] = "X";
       }
       if(p1row == 2 && p1column == 1){
        game2array[3] = "X";
       }
       if(p1row == 2 && p1column == 2){
        game2array[4] = "X";
       }
       if(p1row == 2 && p1column == 3){
        game2array[5] = "X";
       }
       if(p1row == 3 && p1column == 1){
        game2array[6] = "X";
       }
       if(p1row == 3 && p1column == 2){
        game2array[7] = "X";
       }
       if(p1row == 3 && p1column == 3){
        game2array[8] = "X";
       }
       if (game2array[0] == "X" && game2array[1] == "X" && game2array[2] == "X"){
        p1score++;
        System.out.println("PLAYER 1 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game2array[0]+" "+game2array[1]+" "+game2array[2]+"\n"
        +game2array[3]+" "+game2array[4]+" "+game2array[5]+"\n"
        +game2array[6]+" "+game2array[7]+" "+game2array[8]);
        return;
       }
       if (game2array[3] == "X" && game2array[4] == "X" && game2array[5] == "X"){
        p1score++;
        System.out.println("PLAYER 1 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game2array[0]+" "+game2array[1]+" "+game2array[2]+"\n"
        +game2array[3]+" "+game2array[4]+" "+game2array[5]+"\n"
        +game2array[6]+" "+game2array[7]+" "+game2array[8]);
        return;
       }
       if (game2array[6] == "X" && game2array[7] == "X" && game2array[8] == "X"){
        p1score++;
        System.out.println("PLAYER 1 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game2array[0]+" "+game2array[1]+" "+game2array[2]+"\n"
        +game2array[3]+" "+game2array[4]+" "+game2array[5]+"\n"
        +game2array[6]+" "+game2array[7]+" "+game2array[8]);
        return;
       }
       if (game2array[0] == "X" && game2array[3] == "X" && game2array[6] == "X"){
        p1score++;
        System.out.println("PLAYER 1 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game2array[0]+" "+game2array[1]+" "+game2array[2]+"\n"
        +game2array[3]+" "+game2array[4]+" "+game2array[5]+"\n"
        +game2array[6]+" "+game2array[7]+" "+game2array[8]);
        return;
       }
       if (game2array[1] == "X" && game2array[4] == "X" && game2array[7] == "X"){
        p1score++;
        System.out.println("PLAYER 1 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game2array[0]+" "+game2array[1]+" "+game2array[2]+"\n"
        +game2array[3]+" "+game2array[4]+" "+game2array[5]+"\n"
        +game2array[6]+" "+game2array[7]+" "+game2array[8]);
        return;
       }
       if (game2array[2] == "X" && game2array[5] == "X" && game2array[8] == "X"){
        p1score++;
        System.out.println("PLAYER 1 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game2array[0]+" "+game2array[1]+" "+game2array[2]+"\n"
        +game2array[3]+" "+game2array[4]+" "+game2array[5]+"\n"
        +game2array[6]+" "+game2array[7]+" "+game2array[8]);
        return;
       }
       if (game2array[0] == "X" && game2array[4] == "X" && game2array[8] == "X"){
        p1score++;
        System.out.println("PLAYER 1 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game2array[0]+" "+game2array[1]+" "+game2array[2]+"\n"
        +game2array[3]+" "+game2array[4]+" "+game2array[5]+"\n"
        +game2array[6]+" "+game2array[7]+" "+game2array[8]);
        return;
       }
       if (game2array[2] == "X" && game2array[4] == "X" && game2array[6] == "X"){
        p1score++;
        System.out.println("PLAYER 1 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game2array[0]+" "+game2array[1]+" "+game2array[2]+"\n"
        +game2array[3]+" "+game2array[4]+" "+game2array[5]+"\n"
        +game2array[6]+" "+game2array[7]+" "+game2array[8]);
        return;
       }
       for (int c = 0 ;; c++){
           System.out.println("Here is the game box as of now! ?"
               + "\n"+game2array[0]+" "+game2array[1]+" "+game2array[2]
                +"\n"+game2array[3]+" "+game2array[4]+" "+game2array[5]
                +"\n"+game2array[6]+" "+game2array[7]+" "+game2array[8]);
       System.out.print("PLAYER 2 ITS YOUR TURN!\nEnter ROW number here: ");
       int p2row = user.nextInt();
       if (p2row <1 || p2row > 3){
       System.out.println("CHECK INPUT");
       }
       System.out.print("Enter COLUMN number here: ");
       int p2column = user.nextInt();
       if (p2column <1 || p2column > 3){
       System.out.println("CHECK INPUT");
       }
         if (p2row == 1 && p2column == 1){
           if (game2array[0] == "X"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 1! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           else if (game2array[0] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           }
        if (p2row == 1 && p2column == 2){
           if (game2array[1] == "X"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 1! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           else if (game2array[1] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           }
        if (p2row == 1 && p2column == 3){
           if (game2array[2] == "X"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 1! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           else if (game2array[2] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           }
        if (p2row == 2 && p2column == 1){
           if (game2array[3] == "X"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 1! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           else if (game2array[3] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           }
        if (p2row == 2 && p2column == 2){
           if (game2array[4] == "X"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 1! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           else if (game2array[4] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           continue;    
           }
           }
        if (p2row == 2 && p2column == 3){
           if (game2array[5] == "X"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 1! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           else if (game2array[5] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           }
        if (p2row == 3 && p2column == 1){
           if (game2array[6] == "X"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 1! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           else if (game2array[6] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           }
        if (p2row == 3 && p2column == 2){
           if (game2array[7] == "X"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 1! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           else if (game2array[7] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           }
        if (p2row == 3 && p2column == 3){
           if (game2array[8] == "X"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 1! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           else if (game2array[8] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN? ? ? ");
           continue;
           }
           }
       if (p2row ==1 && p2column == 1){
        game2array[0] = "O";
        break;
       }
       if(p2row == 1 && p2column == 2){
        game2array[1] = "O";
        break;
       }
       if(p2row == 1 && p2column == 3){
        game2array[2] = "O";
        break;
       }
       if(p2row == 2 && p2column == 1){
        game2array[3] = "O";
        break;
       }
       if(p2row == 2 && p2column == 2){
        game2array[4] = "O";
        break;
       }
       if(p2row == 2 && p2column == 3){
        game2array[5] = "O";
        break;
       }
       if(p2row == 3 && p2column == 1){
        game2array[6] = "O";
        break;
       }
       if(p2row == 3 && p2column == 2){
        game2array[7] = "O";
        break;
       }
       if(p2row == 3 && p2column == 3){
        game2array[8] = "O";
        break;
       }
       }
       if (game2array[0] == "O" && game2array[1] == "O" && game2array[2] == "O"){
        p2score++;
        System.out.println("PLAYER 2 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game2array[0]+" "+game2array[1]+" "+game2array[2]+"\n"
        +game2array[3]+" "+game2array[4]+" "+game2array[5]+"\n"
        +game2array[6]+" "+game2array[7]+" "+game2array[8]);
        return;
       }
       if (game2array[3] == "O" && game2array[4] == "O" && game2array[5] == "O"){
        p2score++;
        System.out.println("PLAYER 2 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game2array[0]+" "+game2array[1]+" "+game2array[2]+"\n"
        +game2array[3]+" "+game2array[4]+" "+game2array[5]+"\n"
        +game2array[6]+" "+game2array[7]+" "+game2array[8]);
        return;
       }
       if (game2array[6] == "O" && game2array[7] == "O" && game2array[8] == "O"){
        p2score++;
        System.out.println("PLAYER 2 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game2array[0]+" "+game2array[1]+" "+game2array[2]+"\n"
        +game2array[3]+" "+game2array[4]+" "+game2array[5]+"\n"
        +game2array[6]+" "+game2array[7]+" "+game2array[8]);
        return;
       }
       if (game2array[0] == "O" && game2array[3] == "O" && game2array[6] == "O"){
        p2score++;
        System.out.println("PLAYER 2 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game2array[0]+" "+game2array[1]+" "+game2array[2]+"\n"
        +game2array[3]+" "+game2array[4]+" "+game2array[5]+"\n"
        +game2array[6]+" "+game2array[7]+" "+game2array[8]);
        return;
       }
       if (game2array[1] == "O" && game2array[4] == "O" && game2array[7] == "O"){
        p2score++;
        System.out.println("PLAYER 2 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game2array[0]+" "+game2array[1]+" "+game2array[2]+"\n"
        +game2array[3]+" "+game2array[4]+" "+game2array[5]+"\n"
        +game2array[6]+" "+game2array[7]+" "+game2array[8]);
        return;
       }
       if (game2array[2] == "O" && game2array[5] == "O" && game2array[8] == "O"){
        p2score++;
        System.out.println("PLAYER 2 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game2array[0]+" "+game2array[1]+" "+game2array[2]+"\n"
        +game2array[3]+" "+game2array[4]+" "+game2array[5]+"\n"
        +game2array[6]+" "+game2array[7]+" "+game2array[8]);
        return;
       }
       if (game2array[0] == "O" && game2array[4] == "O" && game2array[8] == "O"){
        p2score++;
        System.out.println("PLAYER 2 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game2array[0]+" "+game2array[1]+" "+game2array[2]+"\n"
        +game2array[3]+" "+game2array[4]+" "+game2array[5]+"\n"
        +game2array[6]+" "+game2array[7]+" "+game2array[8]);
        return;
       }
       if (game2array[2] == "O" && game2array[4] == "O" && game2array[6] == "O"){
        p2score++;
        System.out.println("PLAYER 2 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game2array[0]+" "+game2array[1]+" "+game2array[2]+"\n"
        +game2array[3]+" "+game2array[4]+" "+game2array[5]+"\n"
        +game2array[6]+" "+game2array[7]+" "+game2array[8]);
        return;
       }
   }
}
}
static void game3(){
    System.out.println("HELLO THIS IS THE FINAL ROUND!!!!!! GOODLUCK");
for (int a = 0;;a++){
   for (int b = 0;;b++){
       System.out.println("Here is the game box as of now! ?"
               + "\n"+game3array[0]+" "+game3array[1]+" "+game3array[2]
                +"\n"+game3array[3]+" "+game3array[4]+" "+game3array[5]
                +"\n"+game3array[6]+" "+game3array[7]+" "+game3array[8]);
       System.out.print("PLAYER 1 ITS YOUR TURN!\nEnter ROW number here: ");
       int p1row = user.nextInt();
       if (p1row <1 || p1row > 3){
       System.out.println("CHECK INPUT");
       break;
       }
       System.out.print("Enter COLUMN number here: ");
       int p1column = user.nextInt();
       if (p1column <1 || p1column> 3){
       System.out.println("CHECK INPUT");
       break;
       }
        if (p1row == 1 && p1column == 1){
           if (game3array[0] == "O"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 2! CHOOSE AGAIN!? ? ? ");
           break;}
           if (game3array[0] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           break;}
           }
        if (p1row == 1 && p1column == 2){
           if (game3array[1] == "O"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 2! CHOOSE AGAIN!? ? ? ");
           break;}
           if (game3array[1] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           break;}
           }
        if (p1row == 1 && p1column == 3){
           if (game3array[2] == "O"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 2! CHOOSE AGAIN!? ? ? ");
           break;}
           if (game3array[2] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           break;}
           }
        if (p1row == 2 && p1column == 1){
           if (game3array[3] == "O"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 2! CHOOSE AGAIN!? ? ? ");
           break;}
           if (game3array[3] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           break;}
           }
        if (p1row == 2 && p1column == 2){
           if (game3array[4] == "O"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 2! CHOOSE AGAIN!? ? ? ");
           break;
           }
           if (game3array[4] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           break;}
           }
        if (p1row == 2 && p1column == 3){
           if (game3array[5] == "O"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 2! CHOOSE AGAIN!? ? ? ");
           break;}
           if (game3array[5] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           break;}
           }
        if (p1row == 3 && p1column == 1){
           if (game3array[6] == "O"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 2! CHOOSE AGAIN!? ? ? ");
           break;}
           if (game3array[6] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           break;}
           }
        if (p1row == 3 && p1column == 2){
           if (game3array[7] == "O"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 2! CHOOSE AGAIN!? ? ? ");
           break;}
           if (game3array[7] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           break;}
           }
        if (p1row == 3 && p1column == 3){
           if (game3array[8] == "O"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 2! CHOOSE AGAIN!? ? ? ");
           break;}
           if (game3array[8] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN? ? ? ");
           break;}
           }
       if (p1row ==1 && p1column == 1){
        game3array[0] = "X";
       }
       if(p1row == 1 && p1column == 2){
        game3array[1] = "X";
       }
       if(p1row == 1 && p1column == 3){
        game3array[2] = "X";
       }
       if(p1row == 2 && p1column == 1){
        game3array[3] = "X";
       }
       if(p1row == 2 && p1column == 2){
        game3array[4] = "X";
       }
       if(p1row == 2 && p1column == 3){
        game3array[5] = "X";
       }
       if(p1row == 3 && p1column == 1){
        game3array[6] = "X";
       }
       if(p1row == 3 && p1column == 2){
        game3array[7] = "X";
       }
       if(p1row == 3 && p1column == 3){
        game3array[8] = "X";
       }
       if (game3array[0] == "X" && game3array[1] == "X" && game3array[2] == "X"){
        p1score++;
        System.out.println("PLAYER 1 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game3array[0]+" "+game3array[1]+" "+game3array[2]+"\n"
        +game3array[3]+" "+game3array[4]+" "+game3array[5]+"\n"
        +game3array[6]+" "+game3array[7]+" "+game3array[8]);
        return;
       }
       if (game3array[3] == "X" && game3array[4] == "X" && game3array[5] == "X"){
        p1score++;
        System.out.println("PLAYER 1 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game3array[0]+" "+game3array[1]+" "+game3array[2]+"\n"
        +game3array[3]+" "+game3array[4]+" "+game3array[5]+"\n"
        +game3array[6]+" "+game3array[7]+" "+game3array[8]);
        return;
       }
       if (game3array[6] == "X" && game3array[7] == "X" && game3array[8] == "X"){
        p1score++;
        System.out.println("PLAYER 1 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game3array[0]+" "+game3array[1]+" "+game3array[2]+"\n"
        +game3array[3]+" "+game3array[4]+" "+game3array[5]+"\n"
        +game3array[6]+" "+game3array[7]+" "+game3array[8]);
        return;
       }
       if (game3array[0] == "X" && game3array[3] == "X" && game3array[6] == "X"){
        p1score++;
        System.out.println("PLAYER 1 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game3array[0]+" "+game3array[1]+" "+game3array[2]+"\n"
        +game3array[3]+" "+game3array[4]+" "+game3array[5]+"\n"
        +game3array[6]+" "+game3array[7]+" "+game3array[8]);
        return;
       }
       if (game3array[1] == "X" && game3array[4] == "X" && game3array[7] == "X"){
        p1score++;
        System.out.println("PLAYER 1 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game3array[0]+" "+game3array[1]+" "+game3array[2]+"\n"
        +game3array[3]+" "+game3array[4]+" "+game3array[5]+"\n"
        +game3array[6]+" "+game3array[7]+" "+game3array[8]);
        return;
       }
       if (game3array[2] == "X" && game3array[5] == "X" && game3array[8] == "X"){
        p1score++;
        System.out.println("PLAYER 1 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game3array[0]+" "+game3array[1]+" "+game3array[2]+"\n"
        +game3array[3]+" "+game3array[4]+" "+game3array[5]+"\n"
        +game3array[6]+" "+game3array[7]+" "+game3array[8]);
        return;
       }
       if (game3array[0] == "X" && game3array[4] == "X" && game3array[8] == "X"){
        p1score++;
        System.out.println("PLAYER 1 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game3array[0]+" "+game3array[1]+" "+game3array[2]+"\n"
        +game3array[3]+" "+game3array[4]+" "+game3array[5]+"\n"
        +game3array[6]+" "+game3array[7]+" "+game3array[8]);
        return;
       }
       if (game3array[2] == "X" && game3array[4] == "X" && game3array[6] == "X"){
        p1score++;
        System.out.println("PLAYER 1 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game3array[0]+" "+game3array[1]+" "+game3array[2]+"\n"
        +game3array[3]+" "+game3array[4]+" "+game3array[5]+"\n"
        +game3array[6]+" "+game3array[7]+" "+game3array[8]);
        return;
       }
       for (int c = 0 ;; c++){
           System.out.println("Here is the game box as of now! ?"
               + "\n"+game3array[0]+" "+game3array[1]+" "+game3array[2]
                +"\n"+game3array[3]+" "+game3array[4]+" "+game3array[5]
                +"\n"+game3array[6]+" "+game3array[7]+" "+game3array[8]);
       System.out.print("PLAYER 2 ITS YOUR TURN!\nEnter ROW number here: ");
       int p2row = user.nextInt();
       if (p2row <1 || p2row > 3){
       System.out.println("CHECK INPUT");
       }
       System.out.print("Enter COLUMN number here: ");
       int p2column = user.nextInt();
       if (p2column <1 || p2column > 3){
       System.out.println("CHECK INPUT");
       }
         if (p2row == 1 && p2column == 1){
           if (game3array[0] == "X"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 1! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           else if (game3array[0] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           }
        if (p2row == 1 && p2column == 2){
           if (game3array[1] == "X"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 1! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           else if (game3array[1] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           }
        if (p2row == 1 && p2column == 3){
           if (game3array[2] == "X"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 1! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           else if (game3array[2] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           }
        if (p2row == 2 && p2column == 1){
           if (game3array[3] == "X"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 1! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           else if (game3array[3] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           }
        if (p2row == 2 && p2column == 2){
           if (game3array[4] == "X"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 1! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           else if (game3array[4] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           continue;    
           }
           }
        if (p2row == 2 && p2column == 3){
           if (game3array[5] == "X"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 1! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           else if (game3array[5] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           }
        if (p2row == 3 && p2column == 1){
           if (game3array[6] == "X"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 1! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           else if (game3array[6] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           }
        if (p2row == 3 && p2column == 2){
           if (game3array[7] == "X"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 1! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           else if (game3array[7] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           }
        if (p2row == 3 && p2column == 3){
           if (game3array[8] == "X"){
           System.out.println("? ? ? ERROR: THE SPOT IS ALREADY TAKEN BY PLAYER 1! CHOOSE AGAIN!? ? ? ");
           continue;
           }
           else if (game3array[8] != "-")
           {
               System.out.println("? ? ? ERROR: YOU ALREADY CHOSE THIS SPOT! CHOOSE AGAIN? ? ? ");
           continue;
           }
           }
       if (p2row ==1 && p2column == 1){
        game3array[0] = "O";
        break;
       }
       if(p2row == 1 && p2column == 2){
        game3array[1] = "O";
        break;
       }
       if(p2row == 1 && p2column == 3){
        game3array[2] = "O";
        break;
       }
       if(p2row == 2 && p2column == 1){
        game3array[3] = "O";
        break;
       }
       if(p2row == 2 && p2column == 2){
        game3array[4] = "O";
        break;
       }
       if(p2row == 2 && p2column == 3){
        game3array[5] = "O";
        break;
       }
       if(p2row == 3 && p2column == 1){
        game3array[6] = "O";
        break;
       }
       if(p2row == 3 && p2column == 2){
        game3array[7] = "O";
        break;
       }
       if(p2row == 3 && p2column == 3){
        game3array[8] = "O";
        break;
       }
       }
       if (game3array[0] == "O" && game3array[1] == "O" && game3array[2] == "O"){
        p2score++;
        System.out.println("PLAYER 2 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game3array[0]+" "+game3array[1]+" "+game3array[2]+"\n"
        +game3array[3]+" "+game3array[4]+" "+game3array[5]+"\n"
        +game3array[6]+" "+game3array[7]+" "+game3array[8]);
        return;
       }
       if (game3array[3] == "O" && game3array[4] == "O" && game3array[5] == "O"){
        p2score++;
        System.out.println("PLAYER 2 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game3array[0]+" "+game3array[1]+" "+game3array[2]+"\n"
        +game3array[3]+" "+game3array[4]+" "+game3array[5]+"\n"
        +game3array[6]+" "+game3array[7]+" "+game3array[8]);
        return;
       }
       if (game3array[6] == "O" && game3array[7] == "O" && game3array[8] == "O"){
        p2score++;
        System.out.println("PLAYER 2 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game3array[0]+" "+game3array[1]+" "+game3array[2]+"\n"
        +game3array[3]+" "+game3array[4]+" "+game3array[5]+"\n"
        +game3array[6]+" "+game3array[7]+" "+game3array[8]);
        return;
       }
       if (game3array[0] == "O" && game3array[3] == "O" && game3array[6] == "O"){
        p2score++;
        System.out.println("PLAYER 2 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game3array[0]+" "+game3array[1]+" "+game3array[2]+"\n"
        +game3array[3]+" "+game3array[4]+" "+game3array[5]+"\n"
        +game3array[6]+" "+game3array[7]+" "+game3array[8]);
        return;
       }
       if (game3array[1] == "O" && game3array[4] == "O" && game3array[7] == "O"){
        p2score++;
        System.out.println("PLAYER 2 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game3array[0]+" "+game3array[1]+" "+game3array[2]+"\n"
        +game3array[3]+" "+game3array[4]+" "+game3array[5]+"\n"
        +game3array[6]+" "+game3array[7]+" "+game3array[8]);
        return;
       }
       if (game3array[2] == "O" && game3array[5] == "O" && game3array[8] == "O"){
        p2score++;
        System.out.println("PLAYER 2 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game3array[0]+" "+game3array[1]+" "+game3array[2]+"\n"
        +game3array[3]+" "+game3array[4]+" "+game3array[5]+"\n"
        +game3array[6]+" "+game3array[7]+" "+game3array[8]);
        return;
       }
       if (game3array[0] == "O" && game3array[4] == "O" && game3array[8] == "O"){
        p2score++;
        System.out.println("PLAYER 2 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game3array[0]+" "+game3array[1]+" "+game3array[2]+"\n"
        +game3array[3]+" "+game3array[4]+" "+game3array[5]+"\n"
        +game3array[6]+" "+game3array[7]+" "+game3array[8]);
        return;
       }
       if (game3array[2] == "O" && game3array[4] == "O" && game3array[6] == "O"){
        p2score++;
        System.out.println("PLAYER 2 WON THIS ROUND!\nSCORE AS OF NOW PLAYER 1: "+p1score+"\n                PLAYER 2: "+p2score+"\nHere is the Game Box as of now:\n"
        +game3array[0]+" "+game3array[1]+" "+game3array[2]+"\n"
        +game3array[3]+" "+game3array[4]+" "+game3array[5]+"\n"
        +game3array[6]+" "+game3array[7]+" "+game3array[8]);
        return;
       }
   }
}
}
    public static void main(String[] args) {
        game1();
        game2();
        if (p1score == 2){
            System.out.println("THE PLAYER 1 WON! CONGRATS FINAL SCORE PLAYER 1: "+p1score+" ?"
                    +"\n                                       PLAYER 2: "+p2score+" ?");
            System.out.print("HERE ARE THE GAME BOXES:\n"+
                              "ROUND 1  ?     ROUND 2  ?     ROUND 3  ?\n"
            +" "+game1array[0]+" "+game1array[1]+" "+game1array[2]+"          "+game2array[0]+" "+game2array[1]+" "+game2array[2]+"          "+game3array[0]+" "+game3array[1]+" "+game3array[2]+"\n"
            +" "+game1array[3]+" "+game1array[4]+" "+game1array[5]+"          "+game2array[3]+" "+game2array[4]+" "+game2array[5]+"          "+game3array[3]+" "+game3array[4]+" "+game3array[5]+"\n"
            +" "+game1array[6]+" "+game1array[7]+" "+game1array[8]+"          "+game2array[6]+" "+game2array[7]+" "+game2array[8]+"          "+game3array[6]+" "+game3array[7]+" "+game3array[8]);
            return;
        }
        if (p2score == 2){
            System.out.println("THE PLAYER 2 WON! CONGRATS FINAL SCORE PLAYER 1: "+p1score+" ?"
                    +"\n                                       PLAYER 2: "+p2score+" ?");
            System.out.print("HERE ARE THE GAME BOXES:\n"+
                              "ROUND 1  ?     ROUND 2  ?     ROUND 3  ?\n"
            +" "+game1array[0]+" "+game1array[1]+" "+game1array[2]+"          "+game2array[0]+" "+game2array[1]+" "+game2array[2]+"          "+game3array[0]+" "+game3array[1]+" "+game3array[2]+"\n"
            +" "+game1array[3]+" "+game1array[4]+" "+game1array[5]+"          "+game2array[3]+" "+game2array[4]+" "+game2array[5]+"          "+game3array[3]+" "+game3array[4]+" "+game3array[5]+"\n"
            +" "+game1array[6]+" "+game1array[7]+" "+game1array[8]+"          "+game2array[6]+" "+game2array[7]+" "+game2array[8]+"          "+game3array[6]+" "+game3array[7]+" "+game3array[8]);
            return;
        }
        game3();
        if (p1score == 2){
            System.out.println("THE PLAYER 1 WON! CONGRATS FINAL SCORE PLAYER 1: "+p1score+" ?"
                    +"\n                                       PLAYER 2: "+p2score+" ?");
            System.out.print("HERE ARE THE GAME BOXES:\n"+
                              "ROUND 1  ?     ROUND 2  ?     ROUND 3  ?\n"
            +" "+game1array[0]+" "+game1array[1]+" "+game1array[2]+"          "+game2array[0]+" "+game2array[1]+" "+game2array[2]+"          "+game3array[0]+" "+game3array[1]+" "+game3array[2]+"\n"
            +" "+game1array[3]+" "+game1array[4]+" "+game1array[5]+"          "+game2array[3]+" "+game2array[4]+" "+game2array[5]+"          "+game3array[3]+" "+game3array[4]+" "+game3array[5]+"\n"
            +" "+game1array[6]+" "+game1array[7]+" "+game1array[8]+"          "+game2array[6]+" "+game2array[7]+" "+game2array[8]+"          "+game3array[6]+" "+game3array[7]+" "+game3array[8]);
            return;
        }
        if (p2score == 2){
            System.out.println("THE PLAYER 2 WON! CONGRATS FINAL SCORE PLAYER 1: "+p1score+" ?"
                    +"\n                                       PLAYER 2: "+p2score+" ?");
            System.out.print("HERE ARE THE GAME BOXES:\n"+
                              "ROUND 1  ?     ROUND 2  ?     ROUND 3  ?\n"
            +" "+game1array[0]+" "+game1array[1]+" "+game1array[2]+"          "+game2array[0]+" "+game2array[1]+" "+game2array[2]+"          "+game3array[0]+" "+game3array[1]+" "+game3array[2]+"\n"
            +" "+game1array[3]+" "+game1array[4]+" "+game1array[5]+"          "+game2array[3]+" "+game2array[4]+" "+game2array[5]+"          "+game3array[3]+" "+game3array[4]+" "+game3array[5]+"\n"
            +" "+game1array[6]+" "+game1array[7]+" "+game1array[8]+"          "+game2array[6]+" "+game2array[7]+" "+game2array[8]+"          "+game3array[6]+" "+game3array[7]+" "+game3array[8]+"\n");
            return;    
        }
        //fix the winning statement if box is full nothing happens
    }
}     
