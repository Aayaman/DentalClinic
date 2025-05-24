public class Clinic 
{
	
		//Create the private attributes 
		private String clinicName;// The name of the clinic
		private String clinicCode;// The unique code assigned to the clinic
		private String clinicTerm;// The term or duration of operation for the clinic
		private Individual dentist;// The main dentist working at the clinic
		private Individual[] dentalAsst;// An array of dental assistants working at the clinic
		private Individual[] patient;// An array of patients registered at the clinic
		
		//Define the Accessor/Getter methods (they return the values of the corresponding private attributes above)
		public String getClinicName() 
		{
			return clinicName; // Return the clinic name
		}
		public String getCliniqueCode() 
		{
			return clinicCode;// Return the clinic code
		}
		public String getClinicTerm() 
		{
			return clinicTerm; // Return the clinic term
		}
		public Individual getDentist() 
		{
			return dentist; // Return the main dentist
		}
		public Individual[] getDentalAsst() 
		{
			return dentalAsst; // Return the array of dental assistants
		}
		public Individual[] getPatient() 
		{
			return patient ; // Return the array of patients
		}
		
		//Define the mutator or setter methods (they are responsible for setting the values of the private attributes above) 
		public void setClinicName(String inClinicName) 
		{
			clinicName = inClinicName;// Set the clinic name
		}
		public void setClinicCode(String inClinicCode) 
		{
			clinicCode = inClinicCode;// Set the clinic code
		}
		public void setClinicTerm(String inClinicTerm) 
		{
			clinicTerm = inClinicTerm;// Set the clinic term
		}
		public void setDentist(Individual inDentist) 
		{
			dentist = inDentist;// Set the main dentist
		}
		public void setDentalAsst(Individual[] inClinicAsst) 
		{
			dentalAsst = inClinicAsst;// Set the array of dental assistants
		}
		public void setPatient(Individual[] inPatient) 
		{
			patient = inPatient;// Set the array of patients
		}
		
		//create the Clinic constructor 
		public Clinic () 
		{
			//Initialize the attributes to default values 
			clinicName = "" ;
			clinicCode = "";
			clinicTerm = "" ;
			dentist = null;// Default main dentist (null initially)
			dentalAsst = new Individual[0];// Default empty array for dental assistants
			patient = new Individual[0];Default empty array for patients
		}
		//Create an object of this class and initializes all private variables to the values passed via the constructor’s arguments
		public Clinic (String inClinicName,String inClinicCode,String inClinicTerm,Individual inDentist,Individual[] inDentalAsst,Individual[] inPatient ) 
		{
			clinicName = inClinicName ;
			clinicCode = inClinicCode ;
			clinicTerm = inClinicTerm ;
			dentist = inDentist;
			dentalAsst = inDentalAsst;
			patient = inPatient;
			
		}
		@Override
		//Create the override method toString()
		public String toString() 
		{
			return clinicName +","+clinicCode +","+ clinicTerm +","+ dentist +","+ dentalAsst.length +","+ patient.length;
		}
		// Method to append individuals to an array based on the mode specified.
		// The method takes an array of individuals and a mode as parameters.
		public String appendToIndividualArr(Individual[] chrArr, int mode) 
	    {
	        // Check if the array of individuals is not empty.
	        if (chrArr.length != 0) 
	        {
	        	String note = "";// Initialize a note variable to store messages about additions or duplicates.
	            //Adding dental assistants to the object array of dental assistants 
	            if (mode == 1003)
	            {
	            	int currentSize = 0;// Initialize a variable to track the current size of the array.
	                Individual[] result = new Individual[dentalAsst.length + objectIsUnique(chrArr).length];// Create a new array to store the alredy existing unique dental assistants 
	                Individual[] newAssistants = new Individual [objectIsUnique(chrArr).length];// Create a new array to store unique individuals.
	                Individual[] temp = new Individual[objectIsUnique(chrArr).length];// Create a temporary array.
	                Individual[] asstResult = new Individual[currentSize];// Create an array to hold the final result.
	                // Assign the existing dental assistants to the result array.
	                for (int i = 0; i < dentalAsst.length; i++) 
	                {
	                    result[i] = new Individual(dentalAsst[i]);
	                }
	                // Adding new unique individuals to the result array. 
	                for (int j = 0; j < objectIsUnique(chrArr).length; j++) 
	                {
	                	
	                    temp[j] = new Individual(objectIsUnique(chrArr)[j]);
	                }
					//Chack if the array of exixting dental assistants is not empty 
	                if (result[0]!= null) 
	                {
	                	//check if individual exists more than once in the object array 
		    	        int k = 0;
		    	        for (int i = 0 ; i < temp.length; i++) 
		    	        {
                            //Initialize boolean to track each individual 
		    	        	boolean alreadyExists = false ;
		    	        	//Checking if Individual already exists
		    	            for (int j = 0 ; j < dentalAsst.length ; j++) 
		    	            {
								//Check if individual is equal  to any of the individuals coming before it in the array 
		    	            	if (temp[i].equals(result[j])) 
		    		            {
									//Individual exists twice in the array 
		    		            	alreadyExists = true ;
		    		            	note += "Already Exists: "+ temp[i]+".\n";
		    		            	break;//Break from the for loop 
		    		            }	
		    	            }
							//Check if the individual is unique in the array 
		    	            if (!alreadyExists) 
		    	            {
		    	            	currentSize++;//Track the size of the final array of dental assistants  
		    	            	for (; k< currentSize ; k++) 
		    	            	{
									//Assign the unique individual to the oversized array of dental assistants 
		    	            		newAssistants[k]= temp[i];
		    		        		note += "Successfully Added: "+newAssistants[k] +".\n";
		    	            	}
		    	            }   
		    	        }
						//Initialize the final array of dental assistants with exacte size 
		    	        asstResult  = new Individual[dentalAsst.length + currentSize];
		    	        int m = 0;
						//Assigning the individuals that exist once to the final array 
		    	        for ( ; m < dentalAsst.length ; m++) 
		    	        {
		    	        	asstResult[m]= result [m];
		    	        }
						//Assigning the new individuals that exist once to the final array of individuals 
		    	        for (int j = 0 ; j <  currentSize ; j++) 
		            	{
		            		asstResult[m] = newAssistants[j];
		            		m++;
		            	} 
						//Set the final array of individuals to the array of dental assiatants 
		                setDentalAsst(asstResult);
	                }
					//The array of dental assistants is empty 
	                else 
	                {
	                	int currentSize2 = 0;
	        	    	Individual[] existance = new Individual[currentSize2];//Create an array to each individual only once 
	        	    	Individual[] individualExistsOnce = new Individual[chrArr.length];//Create an array that stores new dental assistants 
	        	    	//check if individual exists more than once in the object array 
	        	        int k = 0;
	        	        for (int i = 0 ; i < chrArr.length; i++) 
	        	        {
							//Initialize boolean to track each individual 
	        	        	boolean alreadyExists = false ;
	        	        	//Checking if Individual object already exists
	        	            for (int j = 0 ; j < i ; j++) 
	        	            {
								//Check if individual is equal to any of the individuals coming before it in the array 
	        	            	if (chrArr[i].equals(chrArr[j])) 
	        		            {
									//Individual exists twice in the array
	        		            	alreadyExists = true ;
	        		            	note += "Already Exists: "+ chrArr[i]+".\n";
	        		            	break;//Break from the for loop
	        		            }	
	        	            }
							//Check if the individual is unique in the array
	        	            if (!alreadyExists) 
	        	            {
	        	            	currentSize2++;//Track the size of the final array of dental assistants
	        	            	for (; k< currentSize2 ; k++) 
	        	            	{
	        	            		individualExistsOnce[k]= chrArr[i];//Assign the unique individual to the oversized array of dental assistants 
	        	            		note+= "Successfully Added: "+ chrArr[i]+".\n";
	        	            	}
	        	            }	
	        	        }
	        	        //Initialize the final array of dental assistants with exacte size (currentsize2)
	        	        existance  = new Individual[currentSize2];
						//Assign each unique individual to an index in the final array 
	                	for (int j = 0 ; j < currentSize2 ; j++) 
	                	{
	                		existance[j] = individualExistsOnce[j];
	                	} 
						//Set the final array of individuals to the array of dental assiatants
	    	        	setDentalAsst(temp);	
	                }
	                
	            }
	           //Adding patients to the object array of patients 
	            if (mode == 1004) 
	            {
	            	//Create an array object of type individual 
	            	int currentSize = 0;
	                Individual[] result = new Individual[patient.length + objectIsUnique(chrArr).length];//Create an array that stores alredy registered unique patients 
	                Individual[] newPatients = new Individual [objectIsUnique(chrArr).length];//Create an array of unique new registered patients 
	                Individual[] temp = new Individual[objectIsUnique(chrArr).length];//Create a temporary array 
	                Individual[] patientResult = new Individual[currentSize];//Create an array of all registered unique patients 
	                //Assign the objects of the last object array to the new object array of dental assistants 
	                for (int i = 0; i < patient.length; i++) 
	                {
	                    result[i] = new Individual(patient[i]);
	                }
	                // Assign the already registered patients to the result array. 
	                for (int j = 0; j < objectIsUnique(chrArr).length; j++) 
	                {
	                    temp[j] = new Individual(objectIsUnique(chrArr)[j]);
	                }
	                //check if result array is empty 
	    	        if (result[0] != null) 
	    	        {
						//check if individual exists more than once in the object array 
	    	        	int k = 0;
	    	        	for (int i = 0 ; i < temp.length; i++) 
		    	        {
							//Initialize boolean to track each individual 
		    	        	boolean alreadyExists = false ;
		    	        	//Checking if Individual object already exists
		    	            for (int j = 0 ; j < patient.length ; j++) 
		    	            {
								////Check if individual is equal  to any of the individuals coming before it in the array 
		    	            	if (temp[i].equals(result[j])) 
		    		            {
									//Individual exists twice in the array
		    		            	alreadyExists = true ;
		    		            	note += "Already Exists: "+ temp[i]+".\n";
		    		            	break;//Break from the for loop
		    		            }	
		    	            }
							//Check if the individual is unique in the array 
		    	            if (!alreadyExists) 
		    	            {
		    	            	currentSize++;//Track the size of the final array of patients
		    	            	for (; k< currentSize ; k++) 
		    	            	{
		    	            		newPatients[k]= temp[i];//Assign the unique individual to the oversized array of patients
		    		        		note += "Successfully Added: "+ newPatients[i]+".\n";
		    	            	}
		    	            }   
		    	        }
						//Initialize the final array of patients with exacte size 
		    	        patientResult  = new Individual[patient.length + currentSize];
		    	        int m = 0;
						//Assigning the individuals that exist once to the final array 
		    	        for ( ; m < patient.length ; m++) 
		    	        {
		    	        	patientResult[m]= result [m];
		    	        }
						//Assigning the new individuals that exist once to the final array of individuals 
		    	        for (int j = 0 ; j <  currentSize ; j++) 
		            	{
		            		patientResult[m] = newPatients[j];
		            		m++;
		            	} 
						//Set the final array of individuals to the array of patients 
		                setPatient(patientResult); 	
	    	        }
					//The array of patients is empty
	    	        else 
	    	        {
	    	        	int currentSize2 = 0;
	        	    	Individual[] existance = new Individual[currentSize2];//Create an array to strore each individual only once
	        	    	Individual[] individualExistsOnce = new Individual[chrArr.length];//Create an array that stores new patients 
	        	    	//check if individual exists more than once in the array 
	        	        int k = 0;
	        	        for (int i = 0 ; i < chrArr.length; i++) 
	        	        {
							//Initialize boolean to track each individual 
	        	        	boolean alreadyExists = false ;
	        	        	//Checking if Individual already exists
	        	            for (int j = 0 ; j < i ; j++) 
	        	            {
								//Check if individual is equal to any of the individuals coming before it in the array 
	        	            	if (chrArr[i].equals(chrArr[j])) 
	        		            {
									//Individual exists twice in the array
	        		            	alreadyExists = true ;
	        		            	note += "Already Exists: "+ chrArr[i]+".\n";
	        		            	break;//Break from the for loop
	        		            }	
	        	            }
							//Check if the individual is unique in the array
	        	            if (!alreadyExists) 
	        	            {
	        	            	currentSize2++;//Track the size of the final array of patients
	        	            	for (; k< currentSize2 ; k++) 
	        	            	{
	        	            		individualExistsOnce[k]= chrArr[i];//Assign the unique individual to the oversized array of patients 
	        	            		note+= "Successfully Added: "+ chrArr[i]+".\n";
	        	            	}
	        	            }	
	        	        }
	        	        //Initialize the final array of patients  with exacte size (currentsize2)
	        	        existance  = new Individual[currentSize2];
						//Assign each unique individual to an index in the final array
	                	for (int j = 0 ; j < currentSize2 ; j++) 
	                	{
	                		existance[j] = individualExistsOnce[j];
	                	} 
						//Set the final array of individuals to the array of patients 
	    	        	setPatient(temp);
	    	        	
	    	        }   
	            }
	            return note ;//return a String 
	        } 
			//The array of individuals is empty.
	        else 
	        {
	        	return "";//return an empty string 
	        }
		}
		// Method to delete individuals from an array based on the mode specified and given identifiers
		// The method takes a string of identifiers and a mode as parameters.
	    public String deleteFromIndividualArr(String inStr,int mode) 
	    {
	    	String[] ids = inStr.split(";");// Split the input string into individual identifiers.
	    	String note  = "";// Initialize a note variable to store messages about deletions.
			// Delete from dental assistants array
	    	if (mode == 1003) 
	        {
				// Check if the dental assistants array is not empty.
	    		if (dentalAsst.length != 0) 
		    	{
	    			int currentSize = dentalAsst.length;// Get the current size of the dental assistants array.
	    			Individual[] result = new Individual[currentSize];// Create a new array to store the updated result.
	    			Individual[] temp = new Individual[currentSize];// Create a temporary array.
		    		for (int i  = 0 ; i < ids.length ;i++ ) 
			    	{
		    			int count  = 0;// Initialize a count variable to track if the entity is found.
		    			int pos = 0;// Initialize a position variable to store the index of the found entity.
			            for (int j = 0; j < currentSize; j++) 
			            {
			            	//If the input Entity doesn't match any dental assistants' entity
			                if (!dentalAsst[j].equals(new Individual(ids[i], null, null, 0.0))) //if they are not equal 
			                {
			                	count ++;// Increment the count.
			                    result[j] = dentalAsst[j];// Copy the non-matching entity to the result array.
			                } 
			                //If the input Entity matches any dental assistants' entity
			                else 
			                {
			                    pos  = j; // Store the position.
								// If the entity to delete is not the last one in the array.
			                    if (pos !=(currentSize-1)) 
				                {
									// Reconstruct the array excluding the deleted entity.
			                    	for (int k = 0 ; k < pos;k++) 
			                    	{
			                    		temp[k] = result[k];
			                    	}
			                    	for (int k = pos ; k < currentSize-1;k++) 
			                    	{
			                    		temp[k] = dentalAsst[k+1];
			                    	}
			                    	currentSize--;// Update the size of the array.
			                    	result = new Individual[currentSize];// Resize the result array.
			                    	for (int k = 0 ; k < currentSize ; k++) 
			                    	{
			                    		result[k] = temp[k];// Copy the updated entities to the result array.
			                    	}
			                    	note  += "Successfully Deleted: " + dentalAsst[j] + ".\n";// Record the deletion.
			                    	break;
				                }
					            else 
					            {
									// If the entity to delete is the last one in the array.
					            	currentSize--;
					            	result = new Individual[currentSize ];
					            	for ( int k = 0 ; k< currentSize ; k++) 
					            	{
					            		result[k] = dentalAsst[k];
					            	}
					            	note  += "Successfully Deleted: " + dentalAsst[j] + ".\n";//Record the deletion 
					            	break;
					            }
			                    
			                }
			            }
						// If the entity is not found in the array
			            if (count == dentalAsst.length) 
			            {
		                    note += "Entity NOT found: "+ ids[i]+".\n";// Record the entity not found.
			            }
						// Update the dental assistants array.
			            setDentalAsst(result);  
			    	}	
		    		
		    	}
				// If the dental assistants array is empty.
	    		else 
	    		{
	    			for (int i = 0 ; i < ids.length; i++) 
	    			{
	    				note += "You cannot delete any entity from an EMPTY array.\n";// Record that array is empty.
		    		}
	    		}
	    	}
			// Delete from patients array.
	    	if (mode == 1004) 
	        {
				// Check if the patients array is not empty.
	    		if (patient.length != 0) 
		    	{
	    			int currentSize = patient.length;// Get the current size of the patients array
	    			Individual[] result = new Individual[currentSize];// Create a new array to store the updated result
	    			Individual[] temp = new Individual[currentSize];// Create a temporary array.
		    		for (int i  = 0 ; i < ids.length ;i++ ) 
			    	{
		    			int count  = 0;// Initialize a count variable to track if the entity is found.
		    			int pos = 0;// Initialize a position variable to store the index of the found entity.
			            for (int j = 0; j < currentSize; j++) 
			            {
			            	// If the input entity doesn't match any patients' entity.
			                if (!patient[j].equals(new Individual(ids[i], null, null, 0.0))) 
			                {
			                	count ++;// Increment the count.
			                    result[j] = patient[j];// Copy the non-matching entity to the result array.
			                } 
			                // If the input entity matches any patients' entity.
			                else 
			                {
			                    pos  = j;// Store the position.
			                    if (pos !=(currentSize-1)) 
				                {
									// Reconstruct the array excluding the deleted entity.
			                    	for (int k = 0 ; k< pos ; k++) 
			                    	{
			                    		temp[k] = result[k];
			                    	}
			                    	for (int k = pos ; k < currentSize-1;k++) 
			                    	{
			                    		temp[k] = patient[k+1];
			                    	}
			                    	currentSize--;// Update the size of the array.
			                    	result = new Individual[currentSize];// Resize the result array.
			                    	for (int k = 0 ; k < currentSize ; k++) 
			                    	{
			                    		result[k] = temp[k];// Copy the updated entities to the result array.
			                    	}
			                    	note  += "Successfully Deleted: " + patient[j] + ".\n";// Record the deletion.
			                    	break;
				                }
					            else 
					            {
									// If the entity to delete is the last one in the array.
					            	currentSize--;
					            	result = new Individual[currentSize ];
					            	for ( int k = 0 ; k< currentSize ; k++) 
					            	{
					            		result[k] = patient[k];
					            	}
					            	note  += "Successfully Deleted: " + patient[j] + ".\n";// Record the deletion.
					            	break;
					            } 
			                }
			            }
						// If the entity is not found in the array.
			            if (count == patient.length) 
			            {
		                    note += "Entity NOT found: "+ ids[i]+".\n";// Record the entity not found.
			            }
			            setPatient(result); // Update the patients array. 	
			    	}	
		    	}
				// If the patients array is empty.
	    		else 
	    		{
	    			for (int i = 0 ; i < ids.length; i++) 
	    			{
	    				note += "You cannot delete any entity from an EMPTY array.\n";// Record that array is empty.
		    		}
	    		}
	    	}
	    	return note;// Return the note containing messages about deletions.
		}
		// Method to update individual charges for patients.
		// The method takes a string of patient IDs and charges along with a mode as parameters.
	    public String updateIndividualCharge(String inStr, int mode) 
	    {
	    	String note = "";// Initialize a note variable to store messages about charge updates.
	    	String[] patientsCharge = inStr.split(";");// Split the input string into individual patient IDs and charges.
	    	// Iterate through each patient ID and charge combination.
	    	for (int i = 0 ; i< patientsCharge.length ; i++)
	    	{
	    		int count = 0 ; // Initialize a count variable to track if the entity is found.
	    		//if the array of patients is not empty 
	    		if (patient.length != 0) 
	    		{
	    			// Split the patient ID and charge.
		    		String [] patientstr = patientsCharge[i].split(",");
		    		String entityID = patientstr[0];// Extract the patient ID.
		    		Double charge = Double.parseDouble(patientstr[1]);// Extract the charge value
		    		// Iterate through each patient object in the patients array.
		    		for ( int j = 0 ; j < patient.length ; j++)
		    		{
		    			// Compare the entity ID of each patient object with the input entity ID.
		    			if (patient[j].equals(new Individual(entityID , null , null , charge)))
			    		{
			    			patient[j].setChargePercent(charge);// Update the charge for the matching patient.
			    			note += "Successfully Added/Updated: Charge for "+ patient[j]+".\n";// Record the update.
			    			break;
			    		}
			    		else 
			    		{
			    			count++;// Increment the count if no match is found.
			    		}
		    		}
		    		//if the input entityID did not match any of the patients' entityID
		    		if (count == patient.length) 
		    		{
		    			note += "Entity not found: "+ entityID+".\n";// Record that the entity was not found.	
		    		}
	    		}
	    		//if the array of patients is empty 
	    		else 
	    		{
	    			note += "You cannot add/update charges to an EMPTY array.\n";// Record that the array is empty.
	    		}
	    	}
	    	return note ;// Return the note containing messages about charge updates.
	    }
	    public void clinicStats()
	    {
			//Display clinic statistics 
	    	System.out.printf(".%-22s:%-50s.%n", " Clinic Name"," "+Individual.upperCase(clinicName));
	    	System.out.printf(".%-22s:%-50s.%n", " Clinic Code"," "+Individual.upperCase(clinicCode));
	    	System.out.printf(".%-22s:%-50s.%n", " Term/Permit"," "+Individual.upperCamelCase(clinicTerm));
	    	System.out.printf(".%-22s:%-50s.%n", " Dentist Name"," DR. "+dentist);
	    	for (int i = 0; i< dentalAsst.length; i++) 
	    	{
	    		System.out.printf(".%-22s:%-50s.%n", " Dental Assistant    "+ (i+1)," "+dentalAsst[i]);
	    	}
	    	System.out.printf(".%-22s:%-50s.%n", " Registered patients"," "+patient.length);
	    	
	    }
		//This method displays the charge sheet 
	    public void  chargeSheet() 
	    {
	    	for (int i = 0 ; i < patient.length ; i++) 
	    	{
	    		System.out.printf(".%4d.%-12s %-21s %-26s %4.2f.%n",(i+1)," "+patient[i].getEntityID()," "+patient[i].getLastName()," "+patient[i].getFirstName(),patient[i].getChargePercent());
	    	}
	    	
	    }	
		//This method displays the patients statistics 
	    public void patientsStats() 
	    {
	    	for (int i = 0 ; i < patient.length ; i++) 
			{
				System.out.printf("%2d.%-30s %n",(i+1),patient[i]);
			}
	    }
		//this method returns the length of the array of patients 
	    public int getPatientsCount() 
	    {
	    	return patient.length;
	    }
		//This method returns the length of the array of dental assistants 
	    public int getDentalAsstCount() 
	    {
	    	return dentalAsst.length;
	    }
		//this method returns an array of individuals each existing only once 
	    public static Individual[] objectIsUnique(Individual[] chArr) 
	    {
	    	int currentSize = 0;
	    	Individual[] existance = new Individual[currentSize];
	    	Individual[] individualExistsOnce = new Individual[chArr.length];
	    	//check if individual exists more than once in the object array 
	        int k = 0;
	        for (int i = 0 ; i < chArr.length; i++) 
	        {
	        	boolean alreadyExists = false ;
	        	//Checking if Individual object already exists
	            for (int j = 0 ; j < i ; j++) 
	            {
	            	if (chArr[i].equals(chArr[j])) 
		            {
		            	alreadyExists = true ;
		            	break;
		            }	
	            }
	            if (!alreadyExists) 
	            {
	            	currentSize++;
	            	for (; k< currentSize ; k++) 
	            	{
	            		individualExistsOnce[k]= chArr[i];
	            	}
	            }	
	        }
	        
	        existance  = new Individual[currentSize];
        	for (int j = 0 ; j < currentSize ; j++) 
        	{
        		existance[j] = individualExistsOnce[j];
        	} 
        	return existance ;
	    }
}
