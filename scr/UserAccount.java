import static java.lang.System.out;

public class UseAccount {
    public static void main(String[] args) {
        Account myAccount = new Account();
        Account yourAccount = new Account();
        myAccount.setName("Барри");
        myAccount.setAddress("222 Inner Lane");
        myAccount.setBalance(22.02);
        yourAccount.setName("Джейн");
        yourAccount.setAddress("121 Outer Street");
        yourAccount.setBalance(55.63);
        myAccount.display();
        System.out.print("плюс $ ");

        System.out.print(myAccount.getInterest(5.00));

        System.out.println(" дохода ");
        System.out.println("-----------------");
        yourAccount.display();
        double yourInterestRate = 7.00;
        System.out.print("плюс $ ");

        double yourInterestAmount = yourAccount.getInterest(yourInterestRate);

        System.out.print(yourInterestAmount);
        System.out.print(" дохода ");
    }
}