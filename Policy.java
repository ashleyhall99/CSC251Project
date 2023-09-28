/**
 * This will model an insurance policy for one person
 * @author deare
 */
public class Policy {
    
    private int policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;
    private double insurance = 600;
    
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
   public void setfirstName(String fN){
        firstName = fN;
    }
    /**
     * accessor method for firstName
     * @return firstName
     */
      public String getfirstName(){
        return firstName;
    }
    /**
     * sets the last name of the user
     * @param lN - last name
     */
   public void setlastName(String lN){
        lastName = lN;
    }
    /**
     * accessor method for lastName
     * @return lastName
     */
      public String getlastName(){
        return lastName;
    }
   /**
    * sets the age of the user
    * @param a - age
    */
   public void setAge(int a){
        age = a;
    }
    /**
     * accessor method for age
     * @return users age
     */
      public int getAge(){
        return age;
    }
   /**
    * sets the smoking status of the user
    * @param sS - smoking status
    */
   public void setsmokingStatus(String sS){
        smokingStatus = sS;
    }
    /**
     * accessor method for smokingStatus
     * @return smoking status 
     */
      public String getsmokingStatus(){
        return smokingStatus;
    }
   /**
    * sets the height for the user
    * @param h - height
    */
   public void setHeight(double h){
        height = h;
    }
    /**
     * accessor method for height
     * @return users height
     */
      public double getHeight(){
        return height;
    }
   /**
    * sets the weight for the user
    * @param w - weight
    */
   public void setWeight(double w){
        weight = w;
    }
    /**
     * accessor method for weight
     * @return users weight
     */
      public double getWeight(){
        return weight;
    }
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
         if (age > 50)
         {
             insurance += 75; 
         }
         if (smokingStatus.equals("smoker"))
         {
             insurance += 100;
         }
         if (getBMI() > 35)
         {
             insurance += (getBMI() - 35) *  20; 
         }
         
         return insurance;
     }
    
}
