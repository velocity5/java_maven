package tutorial_java.OOP;

public class bankAccount {
	public static void main(String[] args) throws IllegalAccessException {
		myBankAccount myAccount = new myBankAccount();
		myAccount.napTien(-20000);
		myAccount.rutTien(30000);
		System.out.println(myAccount.getSoDu());
		}
	}
