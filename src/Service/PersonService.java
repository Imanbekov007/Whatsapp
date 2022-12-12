package Service;

import Classes.Passport;
import Enums.Country;

import java.util.List;

public interface PersonService {
    List<Passport> getAllPassports();
    List<Passport> getPassportByFirstName();
    String createPassport();
    List<Country> getAllCountries();
}
