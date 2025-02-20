package br.edu.ifpb.autenticador.autenticador.domain;

public class AddressBuilder implements Builder{

    private Long id;
    private String street;
    private String neighborhood;
    private String number;
    private City city;

    public AddressBuilder() {
        this.city = new City();
    }

    public static Builder Build(){
        return new AddressBuilder();
    }

    @Override
    public Builder setStreet(String street) {
        this.street = street;
        return this;
    }

    @Override
    public Builder setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
        return this;
    }

    @Override
    public Builder setNumber(String number) {
        this.number = number;
        return this;
    }

    @Override
    public Builder setCity(String pais, String estado, String cidade) {
        Country country = new Country();
        country.setName(pais);
        State state = new State();
        state.setName(estado);
        state.setCountry(country);
        City city = new City();
        city.setName(cidade);
        city.setState(state);
        this.city = city;
        return this;
    }

    public Address getResult() {
        return new Address(this.street, this.neighborhood, this.number, this.city);
    }
}
