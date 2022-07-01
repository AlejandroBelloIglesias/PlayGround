

public class Account {
    
    private final int id;
    private final String email;
    private final String name;
    private final Address address;

    private Account(Builder builder) {
        this.id = builder.id;
        this.email = builder.email;
        this.name = builder.name;
        this.address = builder.address;
    }

    public static class Builder {
        private int id;
        private String email;
        private String name;
        private Address address;

        public Builder id(final int id) {
            this.id = id;
            return this;
        }

        public Builder email(final String email) {
            this.email = email;
            return this;
        }

        public Builder name(final String name) {
            this.name = name;
            return this;
        }

        public Builder address(final Address address) {
            this.address = address;
            return this;
        }

        public Account build() {
            return new Account(this);
        }
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the address
     */
    public Address getAddress() {
        return address;
    }
    

}
