/**
 * This will model an insurance policy for one person
 * @author deare
 */
public class Policy {
    
    private int policyNumber;
    private String providerName;
    private PolicyHolder policyUser; 
    static int count = 0;
    
    
   /**
    * no-arg constructor - sets default values
    */
   public Policy(){
       
       policyNumber = 0;
       providerName = null;
       policyUser = new PolicyHolder();
       count += 1;
   }
   /**
    * constructor that sets values from user
    * @param pN policyNumber
    * @param p providerName
    */

   public Policy(int pN, String p, PolicyHolder pU){
       policyNumber = pN;
       providerName = p;  
       policyUser = new PolicyHolder(pU);
       count += 1;
       
   } 
   
   public int getCount()
   {
   return count;
   }
   //sets the policy holder object
   public void setPolicyHolder(PolicyHolder pU)
   {
   policyUser = new PolicyHolder(pU);
   }
   
   //gets the policy holder object
   public PolicyHolder getPolicyHolder()
   {
   return new PolicyHolder(policyUser);
   }
   
   /**
    * Sets the policy number 
    * @param pN - policy number
    */
   public void setpolicyNumber(int pN){
        policyNumber = pN;
    }
    /**
     * accessor method for policyNumber
     * @return int policy Number
     */
      public int getpolicyNumber(){
        return policyNumber;
    }
   /**
    * Sets the name of the provider
    * @param p - name of provider
    */
   public void setproviderName(String p){
        providerName = p;
    }
    /**
     * accessor method for providorName
     * @return providerName
     */
      public String getproviderName(){
        return providerName;
    }

     /**
      * A method that returns the price of a insurance policy
      * @return the insurance fee
      */
     public double getInsuranceFee(){
         
         final double BASE_INSURANCE = 600;
         final double FEE_AGE = 75;
         final double FEE_SMOKING = 100;
         final double FEE_BMI = 20;
         
         final int MAX_AGE = 50;
         final int MAX_BMI = 35;
         
         double price = BASE_INSURANCE;
         
         if (policyUser.getAge() > MAX_AGE) //if they are over 50
         {
             price  += FEE_AGE; 
         }
         if (policyUser.getsmokingStatus().equalsIgnoreCase("smoker"))
         {
             price += FEE_SMOKING;
         }
         if (policyUser.getBMI() > MAX_BMI)
         {
             price += (policyUser.getBMI() - MAX_BMI) *  FEE_BMI; 
         }
         
         return price;
     }
     
     //to string method for policy
     public String toString() 
     {
      return "Policy Number: " + policyNumber 
      + "\nProvider Name: " + providerName +  policyUser; 
     
     }
    
}
