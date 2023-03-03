import java.util.*;
public class jayr{//Jay-R Doria and Juniel Cabo
    static Scanner jay = new Scanner(System.in);
    static String[] menu = {"Sisig","Adobo","Pakbet","Chicken Fillet","Bicol Express"};
    static String[] drinks = {"Sprite","Mountain Dew","Coke","Royal"};
    static int[] cost = {90,80,60,80,90};
    static int choice = 0, choice2 = 0,price = 0,money = 0,change = 0;
    static void question(){
        System.out.print("Enter 1 for MENU WITH or WITHOUT DRINKS\nEnter 2 for ONLY DRINKS\nEnter 0 for STOP\nEnter your choice: ");
        choice = jay.nextInt();
    }
    static void menu(){   
            System.out.println("Here are the list of the food: "+"\n1: "+menu[0]+"\n2: "+menu[1]+"\n3: "+menu[2]+"\n4: "+menu[3]+"\n5: "+menu[4]); 
            System.out.print("Enter the number of your desired food: ");
            int a = jay.nextInt();
        if (a == 1){
                System.out.println(menu[0]+" is "+cost[0]+" Pesos");
                System.out.print("Do you want to buy some drinks?\nEnter 1 for YES\nEnter 0 for NO\nEnter your choice: ");
                choice2 = jay.nextInt();
                if (choice2 == 1){
                    drinks();
                    System.out.print("How much is your Money? ");
                    money = jay.nextInt();
                    if ((cost[0]+15)>money){
                        System.out.println("Your money is not enough to buy "+menu[0]+" with drinks, Sorry.");
                    return;
                    }
                    System.out.println("Price: "+(cost[0]+15));
                    System.out.println("Change: "+(money-(cost[0]+15)));
                    System.out.println("Thank you!");
                    return;
                }
                if (choice2 == 0){
                    System.out.print("How much is your Money? ");
                    money = jay.nextInt();
                    if (cost[0]>money){
                        System.out.println("Your money is not enough to buy "+menu[0]+" with drinks, Sorry.");
                    return;
                    }
                    System.out.println("Price: "+cost[0]);
                    System.out.println("Change: "+(money-cost[0]));
                    System.out.println("Thank you!");
                    return;
                }  
            }
        if (a == 2){
                System.out.println(menu[1]+" is "+cost[1]+" Pesos");
                System.out.print("Do you want to buy some drinks?\nEnter 1 for YES\nEnter 0 for NO\nEnter your choice: ");
                choice2 = jay.nextInt();
                if (choice2 == 1){
                    drinks();
                    System.out.print("How much is your Money? ");
                    money = jay.nextInt();
                    if ((cost[1]+15)>money){
                        System.out.println("Your money is not enough to buy "+menu[1]+" with drinks, Sorry.");
                    return;
                    }
                    System.out.println("Price: "+(cost[1]+15));
                    System.out.println("Change: "+(money-(cost[1]+15)));
                    System.out.println("Thank you!");
                    return;
                }
                if (choice2 == 0){
                    System.out.print("How much is your Money? ");
                    money = jay.nextInt();
                    if (cost[1]>money){
                        System.out.println("Your money is not enough to buy "+menu[1]+" with drinks, Sorry.");
                    return;
                    }
                    System.out.println("Price: "+cost[1]);
                    System.out.println("Change: "+(money-cost[1]));
                    System.out.println("Thank you!");
                    return;
                }  
            }    
        if (a == 3){
                System.out.println(menu[2]+" is "+cost[2]+" Pesos");
                System.out.print("Do you want to buy some drinks?\nEnter 1 for YES\nEnter 0 for NO\nEnter your choice: ");
                choice2 = jay.nextInt();
                if (choice2 == 1){
                    drinks();
                    System.out.print("How much is your Money? ");
                    money = jay.nextInt();
                    if ((cost[2]+15)>money){
                        System.out.println("Your money is not enough to buy "+menu[0]+" with drinks, Sorry.");
                    return;
                    }
                    System.out.println("Price: "+(cost[2]+15));
                    System.out.println("Change: "+(money-(cost[2]+15)));
                    System.out.println("Thank you!");
                    return;
                }
                if (choice2 == 0){
                    System.out.print("How much is your Money? ");
                    money = jay.nextInt();
                    if (cost[2]>money){
                        System.out.println("Your money is not enough to buy "+menu[2]+" with drinks, Sorry.");
                    return;
                    }
                    System.out.println("Price: "+cost[2]);
                    System.out.println("Change: "+(money-cost[2]));
                    System.out.println("Thank you!");
                    return;
                }  
            }
        if (a == 4){
                System.out.println(menu[3]+" is "+cost[3]+" Pesos");
                System.out.print("Do you want to buy some drinks?\nEnter 1 for YES\nEnter 0 for NO\nEnter your choice: ");
                choice2 = jay.nextInt();
                if (choice2 == 1){
                    drinks();
                    System.out.print("How much is your Money? ");
                    money = jay.nextInt();
                    if ((cost[3]+15)>money){
                        System.out.println("Your money is not enough to buy "+menu[3]+" with drinks, Sorry.");
                    return;
                    }
                    System.out.println("Price: "+(cost[3]+15));
                    System.out.println("Change: "+(money-(cost[3]+15)));
                    System.out.println("Thank you!");
                    return;
                }
                if (choice2 == 0){
                    System.out.print("How much is your Money? ");
                    money = jay.nextInt();
                    if (cost[3]>money){
                        System.out.println("Your money is not enough to buy "+menu[3]+" with drinks, Sorry.");
                    return;
                    }
                    System.out.println("Price: "+cost[3]);
                    System.out.println("Change: "+(money-cost[3]));
                    System.out.println("Thank you!");
                    return;
                }  
            }
        if (a == 5){
                System.out.println(menu[4]+" is "+cost[4]+" Pesos");
                System.out.print("Do you want to buy some drinks?\nEnter 1 for YES\nEnter 0 for NO\nEnter your choice: ");
                choice2 = jay.nextInt();
                if (choice2 == 1){
                    drinks();
                    System.out.print("How much is your Money? ");
                    money = jay.nextInt();
                    if ((cost[4]+15)>money){
                        System.out.println("Your money is not enough to buy "+menu[0]+" with drinks, Sorry.");
                    return;
                    }
                    System.out.println("Price: "+(cost[4]+15));
                    System.out.println("Change: "+(money-(cost[4]+15)));
                    System.out.println("Thank you!");
                    return;
                }
                if (choice2 == 0){
                    System.out.print("How much is your Money? ");
                    money = jay.nextInt();
                    if (cost[4]>money){
                        System.out.println("Your money is not enough to buy "+menu[0]+" with drinks, Sorry.");
                    return;
                    }
                    System.out.println("Price: "+cost[4]);
                    System.out.println("Change: "+(money-cost[4]));
                    System.out.println("Thank you!");
                    return;
                }  
            }
        }       
    static void drinks(){
        System.out.print("Here are the list of the drinks: "+"\n1: "+drinks[0]+"\n2: "+drinks[1]+"\n3: "+drinks[2]+"\n4: "+drinks[3]
                +"\nEnter your choice: ");
        int a = jay.nextInt();
        if (a == 1)
            System.out.println("You choose "+drinks[0]+" as your drink that cost 15 pesos");   
        if (a == 2)
            System.out.println("You choose "+drinks[1]+" as your drink that cost 15 pesos");  
        if (a == 3)
            System.out.println("You choose "+drinks[2]+" as your drink that cost 15 pesos"); 
        if (a == 4)
            System.out.println("You choose "+drinks[3]+" as your drink that cost 15 pesos");    
    }  
    static void drinks2(){
        System.out.print("Here are the list of the drinks: "+"\n1: "+drinks[0]+"\n2: "+drinks[1]+"\n3: "+drinks[2]+"\n4: "+drinks[3]
                +"\nEnter your choice: ");
        int a = jay.nextInt();
    if (a == 1){
            System.out.println("You choose "+drinks[0]+" as your drink that cost 15 pesos");  
            System.out.print("How much is your Money? ");
            money = jay.nextInt();
            if (money < 15){
                System.out.println("Your money is not enough to buy "+drinks[0]+ ", Sorry.");
                return;
            }
            System.out.println("Price: 15");
                    System.out.println("Change: "+(money-15));
                    System.out.println("Thank you!");
                    return; 
        }
    if (a == 2){
         System.out.println("You choose "+drinks[1]+" as your drink that cost 15 pesos");  
         System.out.print("How much is your Money? ");
            money = jay.nextInt();
            if (money < 15){
                System.out.println("Your money is not enough to buy "+drinks[1]+ ", Sorry.");
                return;
            }
            System.out.println("Price: 15");
                    System.out.println("Change: "+(money-15));
                    System.out.println("Thank you!");
                    return; 
        }
    if (a == 3){
            System.out.println("You choose "+drinks[2]+" as your drink that cost 15 pesos");   
            System.out.print("How much is your Money? ");
            money = jay.nextInt();
            if (money < 15){
                System.out.println("Your money is not enough to buy "+drinks[2]+ ", Sorry.");
                return;
            }
            System.out.println("Price: 15");
                    System.out.println("Change: "+(money-15));
                    System.out.println("Thank you!");
                    return; 
        }
    if (a == 4){
            System.out.println("You choose "+drinks[3]+" as your drink that cost 15 pesos");  
            System.out.print("How much is your Money? ");
            money = jay.nextInt();
            if (money < 15){
                System.out.println("Your money is not enough to buy "+drinks[3]+ ", Sorry.");
                return;
            }
            System.out.println("Price: 15");
                    System.out.println("Change: "+(money-15));
                    System.out.println("Thank you!");
                    return; 
    }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to JC Canteen!\nAll of the food in the menu are unli rice and all of the drinks here are 15 Pesos only!");
        for (int a = 0;;a++){
            question();
            if (choice == 1){
                menu();
            }
            if (choice == 2){
                drinks2();
            }
            if (choice > 2 || choice <0){
                System.out.println("Check your Inputs!");
            }
            if (choice == 0){
                System.out.println("Exiting Program.........");
                break;
            }
    }
}
}