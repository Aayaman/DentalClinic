public class Individual 
{
	//Create the private attributes of the class 
		private String entityID;
		private String firstName;
		private String lastName;
		private double chargePercent;
		//Create the accessor/getter method 
		public String getEntityID() 
		{
			return entityID;
		}
		public String getFirstName() 
		{
			return firstName;
		}
		public String getLastName() 
		{
			return lastName;
		}
		public double getChargePercent() 
		{
			return chargePercent;
		}
		
		//Create the mutator/setter 
		public void setEntityID(String inEntityID) 
		{
			this.entityID = inEntityID;
		}
		public void setFirstName(String inFirstName) 
		{
			this.firstName= inFirstName;
		}
		public void setLastName(String inLastName) 
		{
			this.lastName = inLastName ;
		}
		public void setChargePercent(double inChargePercent) 
		{
			this.chargePercent= inChargePercent;
		}
		
		//Create a constructor 
		public Individual() 
		{
			// Initialize attributes to default values
	        this.entityID = "";
	        this.firstName = "";
	        this.lastName = "";
	        this.chargePercent = 0.0;	
	    }
		//Create an object of this class.
		public Individual(String inEntityID, String inFisrtName , String inLastName) 
		{
			//initializes all the class’s private variables to the values passed via the constructor’s arguments
			entityID = inEntityID;
			firstName = inFisrtName;
			lastName = inLastName;
		}
		
		//Create an object of this class.
		public Individual(String inEntityID, String inFisrtName , String inLastName, double inChargePercent) 
		{
			//initializes all the class’s private variables to the values passed via the constructor’s arguments
			entityID = inEntityID;
			firstName = inFisrtName;
			lastName = inLastName;
			chargePercent = inChargePercent;
			
		}
		
		//Copy Constructor 
		public Individual(Individual objectIndividual) 
		{
			this(objectIndividual.getEntityID(), objectIndividual.getFirstName(), objectIndividual.getLastName(), objectIndividual.getChargePercent());
		}
		
		// Overload equals() method
	    public boolean equals(Individual objectIndividual) 
	    {
	        return this.entityID.equals(objectIndividual.entityID);
	    }
	    @Override
	    // Override toString() method
	    public String toString() 
	    {
			//Returns the LAST NAME, First Name (entity ID)of every object of this class 
	        return upperCase(lastName)+ ", " + upperCamelCase(firstName) + " (" + entityID + ")";
	    }
	    
	    // Method to convert a single String to UpperCamelCase
	    public static String upperCamelCase(String inStr) 
	    {
	        String result = "";
	        //Capitalize the first letter of the input string 
	        result += (inStr.substring(0,1).toUpperCase() + inStr.substring(1).toLowerCase());
	        return result.trim();
	    }
	    
	    // Method to convert a sentence to UpperCamelCase
	    public static String multiUpperCamelCase(String inStr) 
	    {
	        // Split the input string by whitespace
	        String[] words = inStr.split("\\s+");
	        String result = "";
	        // Iterate over each word
	        for (String word : words)
	        {
	            // Trim leading and trailing whitespace and capitalize the first letter
	            result += upperCamelCase(word) + "-";
	            
	        }
	        return result.substring(0,result.length() -1).trim();
	    }
	    
	    //Method to convert a string all to upperCase 
	    public static String upperCase(String inStr) 
	    {
	    	return inStr.toUpperCase().trim();
	    }
	    
	    // Method to convert input string to array of Individual objects
	    public static Individual[] inStrToIndividualArr(String inStr) 
	    {
	    	//separating the input String by semicolon
	    	String[] individualsInfo = inStr.split(";");
	    	//Creating an array of object Individuals
	        Individual[] individualsResult = new Individual[individualsInfo.length];
            //For every object Individual
	        for(int i = 0; i < individualsInfo.length; i++) 
	        {
                //An array of an Individial's informations ( ID , First name , last name ) 
	            String[] individualInfo = individualsInfo[i].split(",");
                // object Individual's parameters 
	            String entityID = individualInfo[0];
	            String firstName = individualInfo[1];
	            String lastName = individualInfo[2];
	            //create and initialize an object Individual 
	            Individual individual = new Individual(entityID, firstName, lastName, 0.0);
				//Assigne the object to an index in the array of objects 
	            individualsResult[i]= individual;
	        }
			//Return an array of objects 
        	return individualsResult; 
	    }

}