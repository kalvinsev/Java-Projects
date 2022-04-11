// Kalvin Sevillano
// CS55
// Project_4

import java.util.*;
public class Project_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int choice = 0;
        int iD, x, y;
        System.out.print("\nMAIN MENU\n" + "0) Quit\n" + "1) Simulate login\n" + "2) Simulate logoff\n" + "3) Search\n");
        choice = input.nextInt();
        //matrix initialization
        int[][] computerLab = new int [4][];
        computerLab[0] =  new int[5];
        computerLab[1] =  new int[6];
        computerLab[2] =  new int[4];
        computerLab[3] =  new int[3];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < computerLab[i].length; j++){
                computerLab[i][j] = 0;
            }
        }
        while(choice != 0){
           
            switch(choice){

                case 0: 
                    System.out.println("Program ended. ");
                    break;
                
                case 1: 
                    
                    System.out.println("Enter the 5 digit ID number of the user logging in:");
                    iD = input.nextInt();
                    System.out.println("Enter the lab number the user is logging in from (1-4):");
                    x = input.nextInt();
                    System.out.println("Enter computer station number the user is logging in to (1-" + computerLab[x-1].length + ')');
                    y = input.nextInt();
                    computerLab[x-1][y-1] = iD;
                    System.out.println();
                    print(computerLab);
                    break;

                case 2: 

                    System.out.println("Enter the 5 digit ID number of the user to find:");
                    int key = input.nextInt();
                    System.out.println("User " + key + " is logged off.");
                    for(int i  = 0; i < 4; i++){
                        for(int j = 0; j < computerLab[i].length; j++){
                            if(key == computerLab[i][j]){
                                computerLab[i][j] = 0;
                            }
                        }
                    }
                    System.out.println();
                    print(computerLab);
                    break;

                case 3:
                    int searchID = input.nextInt();
                    boolean found = false;
                    for(int i  = 0; i < 4; i++){
                        for(int j = 0; j < computerLab[i].length; j++){
                            if(searchID == computerLab[i][j]){
                                System.out.println("Lab number: " + (i+1) + " Station: " + (j+1));
                                found = true;
                                break;
                            }
                        }
                    }
                    if(found == false)
                        System.out.println("None\n");


                
                default:
            }
            System.out.print("MAIN MENU\n" + "0) Quit\n" + "1) Simulate login\n" + "2) Simulate logoff\n" + "3) Search\n");
            choice = input.nextInt();
        }
        


    }
    


    public static void print(int [][] computerLab){
        System.out.println("LAB STATUS\nLab # Computer Stations");
        for(int i = 0; i < 4; i++){
            System.out.print(i+1 + " ");
            for(int j = 0; j < computerLab[i].length; j++)
            {
                if(computerLab[i][j]>0){
                    System.out.print(j+1 + ": " + computerLab[i][j] + " ");
                }
                else{
                    System.out.print(j+1 + ": " + "empty" + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
        
}