package BankApp;

public class Bank_User {
	

		public static void main(String[] args) {
			BankApp John=new BankApp("john doe");
	John.accAge(45);
	John.depositAmount(100000);
	John.getUserInfo();
	BankApp Rocky=new BankApp("rocky balboa");
	Rocky.accAge(45);
	Rocky.depositAmount(500000);
	Rocky.getUserInfo();

	John.depositAmount(500);
	Rocky.depositAmount(46);
	John.getUserInfo();
	Rocky.getUserInfo();
		

	

//inheritance starts here:
SBI_User Ram=new SBI_User("ram");
	Ram.depositAmount(333.3);	
Ram.accTax("TAXnOTpAID");
	Ram.getUserInfo();
		}
}

