import java.util.*;
public class jayr{
    static Scanner jay = new Scanner(System.in);
    static int array [][] = {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
    static int x = 0,y=0,num=0;
    static void input(){
        for (int a = 0;;a++){
        for (int b = 0;;b++){        
        System.out.print("x: ");
        x = jay.nextInt();
        if (x < 1 || x > 5){
        System.out.println("Error!\nInput for X are only 1-5 digits");
        break;
        }   
        System.out.print("y: ");
        y = jay.nextInt();
        if (y < 1 || y > 5){
        System.out.println("Error\nInput for Y are only 1-5");
        break;
        }
        System.out.print("num: ");
        num = jay.nextInt();
        if (num == 100){
            return;
        }
        if (num < 1 || num > 10){
            System.out.println("Error!\nInput for num are only 1-10");    
        break;
        }     
        if (array[x-1][y-1] != 0){
        System.out.println("The spot is already taken.");
        display();
        break;}
        if (array[x-1][y-1] == 0){
        array[x-1][y-1] = num;      
        }       
        checking();
        display();     
    }           
    }
    }
    static void display(){
        System.out.println(array[0][0]+" "+array[0][1]+" "+array[0][2]+" "+array[0][3]+" "+array[0][4]+"\n"
        +array[1][0]+" "+array[1][1]+" "+array[1][2]+" "+array[1][3]+" "+array[1][4]+"\n"
        +array[2][0]+" "+array[2][1]+" "+array[2][2]+" "+array[2][3]+" "+array[2][4]+"\n"
        +array[3][0]+" "+array[3][1]+" "+array[3][2]+" "+array[3][3]+" "+array[3][4]);
    }
    static void checking(){
        if (array[0][0]+array[0][1]+array[0][2]+array[0][3]+array[0][4] > 20){
        System.out.println("Error!The sum of Row 1 will be greater than 20\nTry again.");
        array[x-1][y-1] = 0;
        } 
        if (array[1][0]+array[1][1]+array[1][2]+array[1][3]+array[1][4] > 20){
        System.out.println("Error!The sum of Row 2 will be greater than 20\nTry again.");
        array[x-1][y-1] = 0;
        } 
        if (array[2][0]+array[2][1]+array[2][2]+array[2][3]+array[2][4] > 20){
        System.out.println("Error!The sum of Row 3 will be greater than 20\nTry again.");
        array[x-1][y-1] = 0;
        } 
        if (array[3][0]+array[3][1]+array[3][2]+array[3][3]+array[3][4] > 20){
        System.out.println("Error!The sum of Row 4 will be greater than 20\nTry again.");
        array[x-1][y-1] = 0;
        }    
        if (array[0][0]+array[1][0]+array[2][0]+array[3][0] >20){
        System.out.println("Error!The sum of Column 1 will be greater than 20\nTry again."); 
        array[x-1][y-1] = 0;
        }
        if (array[0][1]+array[1][1]+array[2][1]+array[3][1] >20){
        System.out.println("Error!The sum of Column 1 will be greater than 20\nTry again."); 
        array[x-1][y-1] = 0;
        }
        if (array[0][2]+array[1][2]+array[2][2]+array[3][2] >20){
        System.out.println("Error!The sum of Column 1 will be greater than 20\nTry again."); 
        array[x-1][y-1] = 0;
        }
        if (array[0][3]+array[1][3]+array[2][3]+array[3][3] >20){
        System.out.println("Error!The sum of Column 1 will be greater than 20\nTry again."); 
        array[x-1][y-1] = 0;
        }
        if (array[0][4]+array[1][4]+array[2][4]+array[3][4] >20){
        System.out.println("Error!The sum of Column 1 will be greater than 20\nTry again."); 
        array[x-1][y-1] = 0;
        }
    }
    public static void main(String[] args) {
        for (int a =0;;a++){
            input();      
            break;
            }               
        }
    }