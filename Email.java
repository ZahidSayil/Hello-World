import java.util.Scanner;

public class Email {
	private  String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength=8;
	private String department;
	private int mailBoxCapacity = 10;
	private String email;
	private String companyServer = "int.com";
	private String altEmail;
	private String changePassword;
	
	
	//Constructor for first and last name.
	
	public Email(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		
		
		//call the setDepartment method.
		
		this.department = setDepartment();
		//call the random password method.
		
		this.password =randomPassword(defaultPasswordLength);
		System.out.println("Your default password is:  "+ this.password);
		
		//create an email 
		
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department +"."+companyServer;
	}
	
	//Generate a random password.
	private String randomPassword( int length) {
		String passwordSet = "TheQuickFoxJumpsOvertheLazyDog123456789!@#$%&";
		char [] password = new char[length];
		
		for(int i = 0; i<length; i++) {
			int rand= (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		
		return new String(password);
	}

	
	//Ask the user for department 
	private String setDepartment() {
		System.out.println("New Employee is "+ firstName + "\nDEPARTMENT CODE");
		System.out.print(" \n1 for Sales \n2 for Developement \n3 for Accounting \n4 for none  \nEnter the Department:");
		Scanner sc = new Scanner(System.in);
	int depChoice=sc.nextInt();
	
	if(depChoice==1) {
		return "Sales";}
	else if (depChoice==2) {
		return "Dev";}
	else if (depChoice==3) {
		return "Acct";}
	else 
		return "intern";
	
	
	}

//Set the mailboxCapicity

	public void setMailBoxCapacity(int mailBoxCapacity) {
		this.mailBoxCapacity = mailBoxCapacity;
}


//Set the alter email
	public void setAltEmail(String altEmail) {
		this.altEmail = altEmail;
}



//change the password
	public void ChangePassword(String password) {
		this.changePassword = password;
 
		
}

	public String getChangePassword() {
		return changePassword;
	}

	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}

	public String getAltEmail() {
		return altEmail;
	}
	
	public String displayInfo() {
		
		return "Display Name is: "  +firstName+ " " +lastName +
				"\nCompany Email is: "+ email + 
				"\nmailBox Capacity is:  " +mailBoxCapacity +"GB";
	}

	
	} 











