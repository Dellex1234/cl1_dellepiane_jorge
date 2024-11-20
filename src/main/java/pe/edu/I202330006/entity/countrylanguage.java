package pe.edu.I202330006.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "countrylaguage")
public class countrylanguage {

    @Id
    private String CountryCode;
    private String Language;
    private String IsOfficial;
    private Double Percentage;

    @ManyToOne
    private country country;

    public countrylanguage() {
    }

    public countrylanguage(String countryCode, String language) {
        CountryCode = countryCode;
        Language = language;
    }

    public countrylanguage(String countryCode, String language, String isOfficial, Double percentage, pe.edu.I202330006.entity.country country) {
        CountryCode = countryCode;
        Language = language;
        IsOfficial = isOfficial;
        Percentage = percentage;
        this.country = country;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getIsOfficial() {
        return IsOfficial;
    }

    public void setIsOfficial(String isOfficial) {
        IsOfficial = isOfficial;
    }

    public Double getPercentage() {
        return Percentage;
    }

    public void setPercentage(Double percentage) {
        Percentage = percentage;
    }

    public pe.edu.I202330006.entity.country getCountry() {
        return country;
    }

    public void setCountry(pe.edu.I202330006.entity.country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "countrylanguage{" +
                "CountryCode='" + CountryCode + '\'' +
                ", Language='" + Language + '\'' +
                ", IsOfficial='" + IsOfficial + '\'' +
                ", Percentage=" + Percentage +
                '}';
    }
}
