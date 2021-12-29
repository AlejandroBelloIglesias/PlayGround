

public class Address {

    private final String street, city, state, zip;

    private Address(Builder builder) {
        this.street = builder.street;
        this.city = builder.city;
        this.state = builder.state;
        this.zip = builder.zip;
    }

    public static class Builder {

        private String street, city, state, zip;

        public Builder street(final String street) {
            this.street = street;
            return this;
        }

        public Builder city(final String city) {
            this.city = city;
            return this;
        }

        public Builder state(final String state) {
            this.state = state;
            return this;
        }

        public Builder zip(final String zip) {
            this.zip = zip;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }
}
