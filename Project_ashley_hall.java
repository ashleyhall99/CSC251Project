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
       PolicyHolder pH;
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
           
          //creates policy holder object that will be sent to the policy object as a field
           pH = new PolicyHolder(fName, lName, pAge, smokerInput, pHeight,
           pWeight);
           
           //creation of policy object that with use policyholder as a field
           user = new Policy(pNumber, pName, pH);
           
           insuranceUser.add(user);
           
           if(input.hasNext()) //will continue reading if there is another line to read
               line = input.nextLine();  
       }
            //for loop for reading through the arraylist
            for(int i = 0; i < insuranceUser.size(); i++)
            {
             System.out.println(insuranceUser.get(i).toString());
             System.out.printf("Policyholder's BMI: %.2f \n", insuranceUser.get(i).getPolicyHolder().getBMI());
             System.out.printf("Policy Price: $%.2f \n", insuranceUser.get(i).getInsuranceFee());
             System.out.println();
             
             }
             
             //calculating the number of smokers/nonsmokers
             for(int i = 0; i < insuranceUser.size(); i++)
             {
             
              if (insuranceUser.get(i).getPolicyHolder().getsmokingStatus().equalsIgnoreCase("smoker"))
               numberSmoker += 1;
              else
               numberNSmoker += 1;
             }
             System.out.println("There were " + insuranceUser.get(0).getCount() + " objects created.");
             System.out.println("The number of smokers is: " + numberSmoker);
             System.out.println("The number of smokers is: " + numberNSmoker);
            
        }
        catch(IOException error)
        {
            System.out.println("There has been an error: " + error.getMessage());
        }
 
        
    }
    
}
