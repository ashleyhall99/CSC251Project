public class PolicyHolder {

    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;
    
    
    
    


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


}