package BankApp;
/**Demo SINGLE Inheritance
 * in order to inherit the methods and variables of bank app class
 * to Sbi User class use keyword "extends"
 * but you have compulsory to create new constructor or use the existing constructor
 * to use the existing constructor use "super"
 * if i have to extend the variables and methods in bank app to sbi user some 
 * method is required
 * super is the keyword is a way to point out variables and methods in BankApp class
 *  
 * @author s
 *
 */
public class SBI_User extends BankApp {
	public SBI_User(String name) { //constructor
super(name);
	
System.out.println("Iam a new constructor from new class");
	}
	@Override
	public void getUserInfo() {
		super.getUserInfo();
		System.out.println("Name of Tax info is:"+taxDetails);
	}
	}


