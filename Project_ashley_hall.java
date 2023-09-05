import java.util.*;

public class Project_ashley_hall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //fields for user input
       int pNumber, pAge;
       double pHeight, pWeight;
       String pName, fName, lName, smokerInput;
     
                
        //provide scanner for user
        Scanner keyboard = new Scanner(System.in);
        
        //ask user for policy number
        System.out.println("Please enter the Policy Number: ");
        pNumber = keyboard.nextInt();
        
        keyboard.nextLine();
        
        //ask user for provider name
        System.out.println("Please enter the Provider Name: ");
        pName = keyboard.nextLine();
        
        //ask user for their first Name
        System.out.println("Please enter the PolicyHolder's First Name: ");
        fName = keyboard.nextLine();
                
        //ask user for their last name
        System.out.println("Please enter the PolicyHolder's Last Name: ");
        lName = keyboard.nextLine();
        
        //ask the user for their age
        System.out.println("What is the Policyholders Age: ");
        pAge = keyboard.nextInt();
        
        keyboard.nextLine();
        
        //ask the user if they are a smoker
        System.out.println("Please enter the Policyholder's Smoking Status(smoker/non-smoker): ");
        smokerInput = keyboard.nextLine();
  
         //ask the user for their height
         System.out.println("Please enter the Policyholder's Height(in inches): ");
         pHeight = keyboard.nextDouble();
         
         //ask the user for their weight
         System.out.println("Please enter the Policyholder's weight(in pounds): ");
         pWeight = keyboard.nextDouble();
         
         Policy user1 = new Policy(pNumber, pName, fName, lName, pAge, smokerInput, pHeight, pWeight);
         
        System.out.println("Policy Number: " + user1.getpolicyNumber());
        System.out.println("Provider Name: " + user1.getproviderName());
        System.out.println("Policy Holder's First Name: " + user1.getfirstName());
        System.out.println("Policy Holder's Lase Name: " + user1.getlastName());
        System.out.println("Policy Holder's Age: " + user1.getAge());
        System.out.println("Policy Holder's SmokerStatus: " + user1.getsmokingStatus());
        System.out.printf("Policy Holder's Height: %.1f inches\n",  user1.getHeight());
        System.out.printf("Policy Holder's Weight: %.1f pounds\n", user1.getWeight());
        System.out.printf("Policyholder's BMI: %.2f \n", user1.getBMI());
        System.out.printf("Policy Price: $%.2f \n", user1.getInsuranceFee());
        
        
        
    }
    
}
