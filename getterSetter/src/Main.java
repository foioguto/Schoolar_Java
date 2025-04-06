public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account();

        bobsAccount.setNumber(876391);
        bobsAccount.setBalance(250.88);
        bobsAccount.setCustomerName("Bob Dylan");
        bobsAccount.setEmail("email@gmail.com");
        bobsAccount.setPhoneNumber("+55(11)94029800 ");

        bobsAccount.withdrawFunds(100);
        bobsAccount.depositFunds(2000);
    }
}
