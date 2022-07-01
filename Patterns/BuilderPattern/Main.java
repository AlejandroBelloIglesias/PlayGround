
public class Main {
    public static void main(String[] args) {

        /*
        Address address = new Address("123 Main St", "Anytown", "CA", "90210");
        Account account = new Account(1, "xcalexxc@gmail.com", "Xavier Calle", address);
        */

        Address address = new Address.Builder()
                .street("123 Main St")
                .city("Anytown")
                .state("CA")
                .zip("90210")
                .build();

        Account account = new Account.Builder()
                .id(1)
                .email("test@gmail.com")
                .name("Xavier Calle")
                .address(address)
                .build();
        

        System.out.println(account.getAddress().getStreet());
    }
}