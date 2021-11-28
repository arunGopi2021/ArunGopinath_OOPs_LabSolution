package AppMain;

import java.util.Scanner;

import Service.CredentialService;
import model.Employee;



public class Driver {

    public static void main(String[] args){
        
        // Display the menu 
        // and get the first name, last name, department from user

        Scanner sOb = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String fn = sOb.next();
        System.out.println("Enter Last Name: ");
        String ln = sOb.next();
        System.out.println("Choose department below: ");     
        System.out.println("1. Technical");  
        System.out.println("2. Administration");  
        System.out.println("3. Human resources");  
        System.out.println("4. Legal");   
        int choice = sOb.nextInt();
        sOb.close();
        
        String dep = "test";
        switch(choice){
            case 1:{
                dep = "Technical";
                break;
            }
            case 2:{
                dep = "Administration";
                break;
            }
            case 3:{
                dep = "Human Resources";
                break;
            }
            case 4:{
                dep = "Legal";
                break;
            }
        }

       

        
        
        


        // Create the Employee object and Create the CredentialService object
        // Run the service methods.

        Employee empObj = new Employee(fn,ln,dep);
        CredentialService serObj = new CredentialService();

        System.out.println("\n\nDear Mr. "+empObj.getFirstName()+" your credentials are displayed below:\n");
        System.out.println("Email: "+serObj.genEmail(empObj)+"\n");
        System.out.println("Password: "+serObj.genPw()+"\n");






    }
    
}
