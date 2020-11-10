package BankApp;

public class BankApp {//class name
String name;//variables, fields all same
int age;
String taxDetails;
double amount;
/**constructor same name as that of the class
 * it is a special method which is called at the very first time 
 * when object is created from the class
 */
public BankApp(String name)// access modifier Constructor Name 
{
	this.name=name;//this refers to the instance variables
System.out.println ("constructor called");//when you create a object constructor is called only once
}
	//ask user for age
public void accAge(int age) {
	this.age=age;//if you do not want to use the same name as the instance variables choose your age
     
}
public void accTax(String taxDetails) {
	this.taxDetails=taxDetails;
	
}
public void depositAmount(double amount) {
	this.amount=amount;
}
public void getUserInfo() {
	System.out.println("name of the user:"+this.name);
	System.out.println("name of the balance is:"+this.amount);
}
	}


