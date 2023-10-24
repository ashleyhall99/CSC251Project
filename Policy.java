/**
 * This will model an insurance policy for one person
 * @author deare
 */
public class Policy {
    
    private int policyNumber;
    private String providerName;
   
    
    
   /**
    * no-arg constructor - sets default values
    */
   public Policy(){
       
       policyNumber = 0;
       providerName = null;
       firstName = null;
       lastName = null;
       age = 0;
       smokingStatus = null;
       height = 0;
       weight = 0; 
   }
   /**
    * constructor that sets values from user
    * @param pN policyNumber
    * @param p providerName 
    * @param fN firstName
    * @param ln lastName
    * @param a age
    * @param sS smokingStatus
    * @param h height
    * @param w weight
    */

   public Policy(int pN, String p, String fN, String ln, int a, String sS, 
           double h, double w){
       policyNumber = pN;
       providerName = p;
       firstName = fN;
       lastName = ln;
       age = a;
       smokingStatus = sS;
       height = h;
       weight = w;   
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
     * Sets the first name of the user
     * @param fN - first name
     */
        /**
       * A method to get BMI for policyholder
       * @return - BMI for user
       */
     public double getBMI(){
       
        return (weight * 703)/(height * height);
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
         
         if (age > MAX_AGE) //if they are over 50
         {
             price  += FEE_AGE; 
         }
         if (smokingStatus.equalsIgnoreCase("smoker"))
         {
             price += FEE_SMOKING;
         }
         if (getBMI() > MAX_BMI)
         {
             price += (getBMI() - MAX_BMI) *  FEE_BMI; 
         }
         
         return price;
     }
    
}
