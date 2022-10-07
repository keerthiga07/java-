/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package details;

import java.util.Scanner;

/**
 *
 * @author keert
 */
public class Details {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String name, address;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your fullname:)");

        
        name = sc.nextLine();

        System.out.println("\nEnter your address with number and letters");
        
        address = sc.nextLine();

        String frist = "";
      
        char c = name.charAt(0);
        frist += c;
        for (int i = 0; i < name.length(); i++)
        {
            char letter = name.charAt(i);
            
            if (letter == ' ')
            {
               frist += name.charAt(i + 1);
            }

        }
        String addressNo = "";
        
        boolean last= false;
        for (int i = 0; i < address.length(); i++) {
            if (!last) {
                char num = address.charAt(i);
                if (num != ' ') {
                    
                    addressNo += num;
                } else 
                {
                    last = true;
                }
            } else 
            {
                break;
            }
        }
        
        System.out.println(last + addressNo);

    }   
    }
   
