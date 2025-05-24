import java.util.Scanner;

public class DentalClinicDriver 
{

	public static void main(String[] args) 
	{//start of main 
		//Declare the Scanner 
		Scanner input = new Scanner (System.in);
		//Display a welcome message to the user 
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+ Welcome to the Simple Mobile Dental Clinic Management System (SMDCMS) +");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		//Display the Menu Code 
		System.out.println("\nCode ->  Description");
		System.out.println("++++++++++++++++++++");
		System.out.println(" 1001 -> Define Office/Clinic ");
		System.out.println(" 1002 -> Add Dentist to Office/Clinic ");
		System.out.println(" 1003 -> Add Dental Assistants (Hygienists/Clerks) to Office/Clinic");
		System.out.println(" 1004 -> Register Patient(s) to Office/Clinic");
		System.out.println(" 1005 -> Deregister Dental Assistant(s) to Office/Clinic");
		System.out.println(" 1006 -> Enter/Update Patient(s) Charges ");
		System.out.println(" 1007 -> Display Patients' Statistics ");
		System.out.println(" 1008 -> Display office/Clinic Statistics ");
		System.out.println(" 1009 -> Display Chargesheet");
		System.out.println(" 1010 -> Exit ");
		//Prompt the user to enter a code from the displayed Menu Code 
		System.out.print("\nPlease enter a Code, from the aformentioned, that corresponds to your task: ");
		//Read the code entered by the user 
		int code = input.nextInt();
		 
		Clinic cl1 = new Clinic();
		
		while (code >= 1001 && code <=1010) 
		{
			if (code == 1010) 
			{
				//display an exiting message to the user 
				System.out.println("Simple SMDCMS >>> Exiting...\n");
				//breaking from the loop 
				break;
			}
			//Execute the statement that matches the code entered by the user
			switch (code) 
			{
			case 1001:
				
				System.out.println("\n\n...Define Office/Clinic...\n..........................");
				//Prompt the user to enter Office/Clinic information
				System.out.println("Enter Office/Clinic information (ClinicName ClinicCode Term/Permit) as a single line entry:");
				//Read the clinic's name 
				String clinicName = input.next();
				//Read the clinic's code 
				String clinicCode = input.next();
				//Read the clinic's term 
				String clinicTerm = input.next();
				//Set the clinics' information 
				cl1.setClinicName(Individual.upperCamelCase(clinicName));
				cl1.setClinicCode(clinicCode);
				cl1.setClinicTerm(clinicTerm);
				//Prompt the user to enter a code from the displayed Menu Code 
				System.out.print("Successful operation! Kindly continue by entering a Code, from the menu above, that corresponds to your task: ");
				//Read the code 
				code = input.nextInt();
				break;
				
			case 1002:
				
				System.out.println("\n\n...Add Dentist for Office/clinic...\n...................................");
				//Prompt the user to enter dentist's information
				System.out.print("Enter dentists' information (EmployeeID FirstName LastName) as a single-line entry:\n ");
				//Read the dentist's Id
				String entityID = input.next();
				//Read the dentist's first name 
				String firstName = input.next();
				//Read the dentist's last name 
				String lastName = input.next();
				//Create object dentist 
				Individual inDentist = new Individual(entityID, firstName,lastName);
				//set dentist's information 
				cl1.setDentist(inDentist); 
				//Prompt the user to enter a code from the displayed Menu Code 
				System.out.print("Successful operation! Kindly continue by entering a Code, from the menu above, that corresponds to your task: ");
				//Read the code 
				code = input.nextInt();
				break;
				
			case 1003:
				 
				System.out.println("\n\n...Add Dental Assistants (Hygienists/Clerks) to Office/Clinic..\n...............................................................");
				//Prompt the user to enter the dental assistants information
				System.out.println("Enter Dental Assistant(s) information (ID1,FirstName1,LastName1;ID2,FirstName2,LastName2) :");
				 //Read the the string input of dental assistants' information 
				String inStrAsst = input.next();
				//Adding new dental assistants to the array of existing dental assistants and displaying a confirmation message 
				System.out.print(cl1.appendToIndividualArr(Individual.inStrToIndividualArr(inStrAsst), code ));
				//Prompt the user to enter a code from the displayed Menu Code
				System.out.print("Kindly continue by entering a Code, from the menu above, that corresponds to your task: ");
				//Read the code 
				code = input.nextInt();
				break;
				
			case 1004:
				
				System.out.println("\n\n...Register Patient(s) at Office/Clinic...\n..........................................");
				//Prompt the user to enter the patients' information 
				System.out.println("Enter Patient(s) information (ID1,FirstName1,LastName1;ID2,FirstName2,LastName2) :");
				//Read the the string input of patients' information 
				String inStrPatient = input.next();
				//Adding new patients to the array of existing patients and displaying a confirmation message
				System.out.print(cl1.appendToIndividualArr(Individual.inStrToIndividualArr(inStrPatient), code) );
				//Prompt the user to enter a code from the displayed Menu Code 
				System.out.print("Kindly continue by entering a Code, from the menu above, that corresponds to your task: ");
				//Read the code 
				code = input.nextInt();
				break;
				
			case 1005:
				System.out.println("\n\n...DeRegister dental Assistant(s) and/or Patient(s)...\n......................................................");
				//Prompt the user to enter '1003' to deregister Dental Assistant(s) and '1004' to deregister patient(s)
				System.out.println("Enter '1003' to deregister Dental Assiatant(s) and '1004' to deregister patient(s): ");
				//Read the input code 
				code = input.nextInt();
				//Prompt the user to enter the individuals' ID 
				System.out.println("Enter information of entities (ID1;ID2) :");
				//Read the string input of iDs
				String inStrEntityID = input.next();
				//Remove individuals from the array of existing individuals 
				System.out.print(cl1.deleteFromIndividualArr(inStrEntityID, code) );
				//Prompt the user to enter a code from the displayed Menu Code 
				System.out.print("Kindly continue by entering a Code, from the menu above, that corresponds to your task: ");
				//Read the input code 
				code = input.nextInt();
				break;
				
			case 1006:
				System.out.println("\n\n...Enter/Update Patient(s) Charges...\n.....................................");
				//Prompt the user to enter patients' charges 
				System.out.println("Enter Patients' Charges (ID1,Charge1;ID2,Charge2) :");
				//Read input string of IDs and patients' charges 
				String inStrCharge = input.next();
				//Update patients charges and display a confirmation message 
				System.out.print(cl1.updateIndividualCharge(inStrCharge, code));
				//Prompt the user to enter a code from the displayed Menu Code 
				System.out.print("Kindly continue by entering a Code, from the menu above, that corresponds to your task: ");
				//Read the code 
				code = input.nextInt();
				break;
				
			case 1007:
				//Display patients statistics
				System.out.println("\n\n...Display Patient(s) Statistics..\n..................................");
				//Clinic's information 
				System.out.println(cl1.getClinicName().toUpperCase()+" ("+ Individual.upperCase(cl1.getCliniqueCode())+"): "+ Individual.upperCamelCase(cl1.getClinicTerm()));
				//dentist's information 
				System.out.println("dentist: Dr. "+ cl1.getDentist());
				//dental assistants' information 
				System.out.println("Dental Assistants: "+ cl1.getDentalAsstCount()+ " Dental Assistant(s)");
				//the number of patients 
				System.out.println("The number of patients registered with the clinic: "+ cl1.getPatientsCount()+" patients");
				System.out.println("..................................");
				//Get patients' informations 
				cl1.patientsStats();
				System.out.println("..................................");
				//Prompt the user to enter a code from the displayed Menu Code 
				System.out.print("Kindly continue by entering a Code, from the menu above, that corresponds to your task: ");
				//Read the code 
				code = input.nextInt();
				break;
				
			case 1008:
				//Display clinic's statistics 
				System.out.println("\n\n.........................Office/Clinic Statistics..........................");
				System.out.println("...........................................................................");
				//Get the clinic's informations 
				cl1.clinicStats();
				System.out.println("...........................................................................");
				//Prompt the user to enter a code from the displayed Menu Code 
				System.out.print("Kindly continue by entering a Code, from the menu above, that corresponds to your task: ");
				//Read the code 
				code = input.nextInt();
				break;
				
			case 1009:
				//Display clinics chargesheet 
				System.out.println("\n\n.........................Office/Clinic Chargesheet.........................");
				System.out.printf(".%4s.%-12s %-21s %-26s %6s.%n"," P/N"," patient ID"," SURNAME"," First Name","Charge");
				System.out.println("...........................................................................");
				//get the patients informations (ID , Last name ,First name , charges)
				cl1.chargeSheet();
				System.out.println("...........................................................................");
				//Prompt the user to enter a code from the displayed Menu Code 
				System.out.print("Kindly continue by entering a Code, from the menu above, that corresponds to your task: ");
				//Read the code 
				code = input.nextInt();
				break;
			}
		}//end of while loop
		
		System.out.println("\nThank you for fostering our Simple Mobile Dental Clinic Management System (SMDCMS).");
		//Close the scanner 
		input.close();
	}//end of main 

}