public class PolicyHolder {

    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;
    
 //no arg constructor   
 public PolicyHolder()
 {
       firstName = null;
       lastName = null;
       age = 0;
       smokingStatus = null;
       height = 0;
       weight = 0; 
 
 }   
 
 /**
    * constructor that sets values from user
    * @param fN firstName
    * @param ln lastName
    * @param a age
    * @param sS smokingStatus
    * @param h height
    * @param w weight
    */

   public PolicyHolder(String fN, String ln, int a, String sS, 
           double h, double w)
   {
 
       firstName = fN;
       lastName = ln;
       age = a;
       smokingStatus = sS;
       height = h;
       weight = w;   
   }  
   
   //copy constructor for creation of new object
   public PolicyHolder(PolicyHolder object2)
   {
   firstName = object2.firstName;
   lastName = object2.lastName;
   age = object2.age;
   smokingStatus = object2.smokingStatus;
   height = object2.height;
   weight = object2.weight;
   
   } 


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
   //toString for policy holder
   public String toString()
   {
    return String.format("\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nAge: " + age + 
    "\nSmoking Status: " + smokingStatus + "\nHeight: " + height + " inches" + "\nWeight: " + weight + " pounds");
     
    
   }

}