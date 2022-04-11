// Kalvin Sevillano
// CS55
// Project_3

import java.util.*;

public class Project3 {
    public static void main(String[] args) {
        int day = 0;
        boolean found = false;
        String monthInput = "";
        Scanner input = new Scanner(System.in);
        String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November" , "December"};
        
        System.out.print("Enter the month and day: ");
        monthInput  = input.next();
        day = input.nextInt();
        String tempStr = (monthInput + " " + day);
        
        
        for(int i = 0; i < months.length; i++){
            if(monthInput.equals(months[i])){
                found = true;
            }
        }
    
        if(!found){
            System.out.println("Invalid.");
        }
            
        for(int i = 0; i < months.length; i++)
        {
            if(monthInput.equals(months[i]))
            {
                //Winter
                if(monthInput.equals(months[0]) || monthInput.equals(months[1]) || monthInput.equals(months[2]) || monthInput.equals(months[11]))
                {
                    if(!tempStr.equals("December 20") && !tempStr.equals("March 20"))
                    {
                        System.out.println("It is the Winter.");
                    }  
                    break;  
                }
                //Spring
                if(monthInput.equals(months[2]) || monthInput.equals(months[3]) || monthInput.equals(months[4]) || monthInput.equals(months[5]))
                {
                    if(!tempStr.equals("March 19") && !tempStr.equals("June 21"))
                    {
                        System.out.println("It is the Spring.");
                    } 
                    break; 
                }
                //Summer
                if(monthInput.equals(months[5]) || monthInput.equals(months[6]) || monthInput.equals(months[7]) || monthInput.equals(months[8]))
                {
                    if(!tempStr.equals("June 20") && !tempStr.equals("September 22"))
                    {
                        System.out.println("It is the Summer.");
                    }  
                    break;
                }
                //Autumn
                if(monthInput.equals(months[8]) || monthInput.equals(months[9]) || monthInput.equals(months[10]) || monthInput.equals(months[11]))
                {
                    if(!tempStr.equals("September 21") && !tempStr.equals("December 21"))
                    {
                        System.out.println("It is the Autumn.");
                    }
                    break;  
                }
                
            }
                
        }
            
        input.close();
    }
        
}