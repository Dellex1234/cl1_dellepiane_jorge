package pe.edu.I202330006.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "city")
public class city {

    @Id
    private int ID;
    private String Name;
    private String CountryCode;
    private String District;
    private int Population;

    @ManyToOne
    private country country;

    public city() {
    }

    public city(int ID) {
        this.ID = ID;
    }

    public city(int ID, String name, String countryCode, String district, int population, pe.edu.I202330006.entity.country country) {
        this.ID = ID;
        Name = name;
        CountryCode = countryCode;
        District = district;
        Population = population;
        this.country = country;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    public pe.edu.I202330006.entity.country getCountry() {
        return country;
    }

    public void setCountry(pe.edu.I202330006.entity.country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "city{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", CountryCode='" + CountryCode + '\'' +
                ", District='" + District + '\'' +
                ", Population=" + Population +
                '}';
    }
}
