import java.util.*;
import java.io.*;

public class Project_ashley_hall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        try
        {
            File insuranceFile = new File("PolicyInformation.txt");
            Scanner input = new Scanner(insuranceFile);
            
       int pNumber, pAge;
       double pHeight, pWeight;
       String pName, fName, lName, smokerInput, line;
       Policy user;
       int numberSmoker = 0;
       int numberNSmoker = 0;
       
       //creation of arraylist object
       ArrayList<Policy> insuranceUser = new ArrayList<Policy>(); 
       
       while (input.hasNext())
       {
           pNumber = input.nextInt();
           line = input.nextLine(); //consumes line from int input
           pName = input.nextLine(); 
           fName = input.nextLine(); 
           lName = input.nextLine();
           pAge = input.nextInt();
           line = input.nextLine(); //consumes line from int input
           smokerInput = input.nextLine();
           pHeight = input.nextDouble();
           pWeight = input.nextDouble();
           
           user = new Policy(pNumber, pName, fName, lName, pAge, smokerInput, pHeight,
           pWeight);
           
           insuranceUser.add(user);
           
           if(input.hasNext()) //will continue reading if there is another line to read
               line = input.nextLine();  
       }
            //for loop for reading through the arraylist
            for(int i = 0; i < insuranceUser.size(); i++)
            {
             System.out.println("Policy Number: " + insuranceUser.get(i).getpolicyNumber());
             System.out.println("Provider Name: " + insuranceUser.get(i).getproviderName());
             System.out.println("Policy Holder's First Name: " + insuranceUser.get(i).getfirstName());
             System.out.println("Policy Holder's Lase Name: " + insuranceUser.get(i).getlastName());
             System.out.println("Policy Holder's Age: " + insuranceUser.get(i).getAge());
             System.out.println("Policy Holder's SmokerStatus: " + insuranceUser.get(i).getsmokingStatus());
             System.out.printf("Policy Holder's Height: %.1f inches\n",  insuranceUser.get(i).getHeight());
             System.out.printf("Policy Holder's Weight: %.1f pounds\n", insuranceUser.get(i).getWeight());
             System.out.printf("Policyholder's BMI: %.2f \n", insuranceUser.get(i).getBMI());
             System.out.printf("Policy Price: $%.2f \n", insuranceUser.get(i).getInsuranceFee());
             System.out.println();
             }
             
             //calculating the number of smokers/nonsmokers
             for(int i = 0; i < insuranceUser.size(); i++)
             {
             
              if (insuranceUser.get(i).getsmokingStatus().equalsIgnoreCase("smoker"))
               numberSmoker += 1;
              else
               numberNSmoker += 1;
             }
             
             System.out.println("The number of smokers is: " + numberSmoker);
             System.out.println("The number of smokers is: " + numberNSmoker);
            
        }
        catch(IOException error)
        {
            System.out.println("There has been an error: " + error.getMessage());
        }
 
        
    }
    
}
