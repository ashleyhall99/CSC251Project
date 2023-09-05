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
   /*
   mutator method for policyNumber
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
        /*
   mutator method for providorName
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
    /*
   mutator method for firstName
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
            /*
   mutator method for lastName
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
   /*
   *mutator method for age
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
   /*
   mutator method for smokingStatus
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
   /*
   mutator method for height
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
   /*
   mutator method for weight
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
       * @return 
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
