import java.util.*;
public class jay{
    static Scanner jay = new Scanner(System.in);
    static int choice =0;
    static String [] name = new String[5];
    static int [] age = new int [5];
    static int [] grade = new int [5];
    static int [] b = {1,2,3,4,5};
    static int age2,grade2;
    static String name2;
    static int loop = 0;
    static void question(){   
        System.out.println("\nEnter 1 to ADD, Enter 2 to UPDATE, Enter 3 to DELETE, Enter 4 to DISPLAY, Enter 5 to STOP");
        System.out.print("Enter your choice: ");
        choice = jay.nextInt(); 
        }
    static void add(){                                   
        for (int a = 0;;a++){
        System.out.println("Add a new student");   
        System.out.print("Name: ");   
        name[loop] = jay.next();
        System.out.print("Age: ");
        age[loop] = jay.nextInt();
        System.out.print("Grade: ");
        grade[loop]=jay.nextInt();  
        loop++;
        break;
    }
    }
    static void update(){
        System.out.println("The number of students you entered is/are: "+loop
                            +"\nWhat number of the student name do you want to UPDATE?");
        for (int d = 0;;d++){
        for (int c = 0;c<loop;c++){
            System.out.println(b[c]+": "+"Name of the student: "+name[c]);          
        }     
        for (int a = 0;;a++){ 
            System.out.println("Enter your choice: ");
            int choice2 = jay.nextInt();
            if (choice2 == 1){
                System.out.println("What column do you want to update?"
                        + "\nEnter 1 for name, Enter 2 for Age, Enter 3 for Grade"); 
                int choice3 = jay.nextInt();
            if (choice3 == 1){
                    System.out.println("Enter the new NAME of the student#"+loop);
                    name2 = jay.next();   
                    name[0] = name2;
                    System.out.println(b[0]+": "+"Name: "+name[0]+" "+"Age: "+age[0]+" "+"Grade: "+grade[0]);
                    return;
                }
                if (choice3 == 2){
                    System.out.println("Enter the new AGE of the student#"+loop);
                    age2 = jay.nextInt();
                    age[0] = age2; 
                    System.out.println(b[0]+": "+"Name: "+name[0]+" "+"Age: "+age[0]+" "+"Grade: "+grade[0]); 
                    return;
                }
                if (choice3 == 3)
                    System.out.println("Enter the new GRADE of the student#"+loop);
                    grade2 = jay.nextInt();
                    grade[0] = grade2;
                    System.out.println(b[0]+": "+"Name: "+name[0]+" "+"Age: "+age[0]+" "+"Grade: "+grade[0]); 
                    return;
                }    
            if (choice2 == 2){
                System.out.println("What column do you want to update?"
                        + "\nEnter 1 for name, Enter 2 for Age, Enter 3 for Grade"); 
                int choice3 = jay.nextInt();
                if (choice3 == 1){
                    System.out.println("Enter the new NAME of the student#"+loop);
                    name2 = jay.next();   
                    name[1] = name2;
                    System.out.println(b[1]+": "+"Name: "+name[1]+" "+"Age: "+age[1]+" "+"Grade: "+grade[1]);
                    return;
                }
                if (choice3 == 2){
                    System.out.println("Enter the new AGE of the student#"+loop);
                    age2 = jay.nextInt();
                    age[1] = age2; 
                    System.out.println(b[1]+": "+"Name: "+name[1]+" "+"Age: "+age[1]+" "+"Grade: "+grade[1]); 
                    return;
                }
                if (choice3 == 3)
                    System.out.println("Enter the new GRADE of the student#"+loop);
                    grade2 = jay.nextInt();
                    grade[1] = grade2;
                    System.out.println(b[1]+": "+"Name: "+name[1]+" "+"Age: "+age[1]+" "+"Grade: "+grade[1]); 
                    return;
                }    
            if (choice2 == 3){
                System.out.println("What column do you want to update?"
                        + "\nEnter 1 for name, Enter 2 for Age, Enter 3 for Grade"); 
                int choice3 = jay.nextInt();
                if (choice3 == 1){
                    System.out.println("Enter the new NAME of the student#"+loop);
                    name2 = jay.next();   
                    name[2] = name2;
                    System.out.println(b[2]+": "+"Name: "+name[2]+" "+"Age: "+age[2]+" "+"Grade: "+grade[2]);
                    return;
                }
                if (choice3 == 2){
                    System.out.println("Enter the new AGE of the student#"+loop);
                    age2 = jay.nextInt();
                    age[2] = age2; 
                    System.out.println(b[2]+": "+"Name: "+name[2]+" "+"Age: "+age[2]+" "+"Grade: "+grade[2]); 
                    return;
                }
                if (choice3 == 3)
                    System.out.println("Enter the new GRADE of the student#"+loop);
                    grade2 = jay.nextInt();
                    grade[2] = grade2;
                    System.out.println(b[2]+": "+"Name: "+name[2]+" "+"Age: "+age[2]+" "+"Grade: "+grade[2]); 
                    return;
                }    
            if (choice2 == 4){
                System.out.println("What column do you want to update?"
                        + "\nEnter 1 for name, Enter 2 for Age, Enter 3 for Grade"); 
                int choice3 = jay.nextInt();
                if (choice3 == 1){
                    System.out.println("Enter the new NAME of the student#"+loop);
                    name2 = jay.next();   
                    name[3] = name2;
                    System.out.println(b[3]+": "+"Name: "+name[3]+" "+"Age: "+age[3]+" "+"Grade: "+grade[3]);
                    return;
                }
                if (choice3 == 2){
                    System.out.println("Enter the new AGE of the student#"+loop);
                    age2 = jay.nextInt();
                    age[3] = age2; 
                    System.out.println(b[3]+": "+"Name: "+name[3]+" "+"Age: "+age[3]+" "+"Grade: "+grade[3]); 
                    return;
                }
                if (choice3 == 3)
                    System.out.println("Enter the new GRADE of the student#"+loop);
                    grade2 = jay.nextInt();
                    grade[3] = grade2;
                    System.out.println(b[3]+": "+"Name: "+name[3]+" "+"Age: "+age[3]+" "+"Grade: "+grade[3]); 
                    return;
                }    
            if (choice2 == 5){
                System.out.println("What column do you want to update?"
                        + "\nEnter 1 for name, Enter 2 for Age, Enter 3 for Grade"); 
                int choice3 = jay.nextInt();
                if (choice3 == 1){
                    System.out.println("Enter the new NAME of the student#"+loop);
                    name2 = jay.next();   
                    name[4] = name2;
                    System.out.println(b[4]+": "+"Name: "+name[4]+" "+"Age: "+age[4]+" "+"Grade: "+grade[4]);
                    return;
                }
                if (choice3 == 2){
                    System.out.println("Enter the new AGE of the student#"+loop);
                    age2 = jay.nextInt();
                    age[4] = age2; 
                    System.out.println(b[4]+": "+"Name: "+name[4]+" "+"Age: "+age[4]+" "+"Grade: "+grade[4]); 
                    return;
                }
                if (choice3 == 3)
                    System.out.println("Enter the new GRADE of the student#"+loop);
                    grade2 = jay.nextInt();
                    grade[4] = grade2;
                    System.out.println(b[4]+": "+"Name: "+name[4]+" "+"Age: "+age[4]+" "+"Grade: "+grade[4]); 
                    return;
                }    
        }
    }
    }
    static void delete(){
    System.out.println("The number of students you entered is/are: "+loop
                            +"\nWhat number of the student name do you want to DELETE?");
        for (int d = 0;;d++){
        for (int c = 0;c<loop;c++){
            System.out.println(b[c]+": "+"Name of the student: "+name[c]);          
        }     
        for (int a = 0;;a++){ 
            System.out.println("Enter your choice: ");
            int choice2 = jay.nextInt();
            if (choice2 == 1){
                name[0] = null;
                age[0] = 0;
                grade[0] = 0;
                System.out.println("Data of Student#1 deleted successfully!");
                return;
            }
            if (choice2 == 2){
                name[1] = null;
                age[1] = 0;
                grade[1] = 0;
                System.out.println("Data of Student#2 deleted successfully!");
                return;
            }
            if (choice2 == 3){
                name[2] = null;
                age[2] = 0;
                grade[2] = 0;
                System.out.println("Data of Student#3 deleted successfully!");
                return;
            }
            if (choice2 == 4){
                name[3] = null;
                age[3] = 0;
                grade[3] = 0;
                System.out.println("Data of Student#4 deleted successfully!");
                return;
            }
            if (choice2 == 5){
                name[4] = null;
                age[4] = 0;
                grade[4] = 0;
                System.out.println("Data of Student#5 deleted successfully!");
                return;
    }
        }
    }
    }
    static void display(){               
        for (int a = 0;a<loop;a++)
        System.out.println(b[a]+": "+"Name: "+name[a]+" "+"Age: "+age[a]+" "+"Grade: "+grade[a]);      
    }   
    public static void main(String[] args) {       
        System.out.println("This is a Student Management Program\nNOTES:\nPlease enter your FIRST NAME ONLY and WITHOUT SPACE when adding a student name\nDELETE will only delete a specific student data");
        System.out.println("\nDESCRIPTION:\nADD will add a student data\nUPDATE will update a student data\nDELETE will delete a student data"
                + "\nDISPLAY will display a student data\nSTOP will end the program");
        for (int a =0;;a++){
            question();
        if (choice == 1){
            add();
        }
        if (choice == 2){
            update();
        }
        if (choice == 3){     
            delete();
        }
        if (choice == 4){
            display();  
        } 
        if (choice == 5){
            System.out.println("Exiting program......");
            break;
        }       
        if (choice > 5 || choice <1)
                System.out.println("READ THE INSTRUCTIONS\nCHECK YOUR INPUTS!");
        }
    }
    } 
