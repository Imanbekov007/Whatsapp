package Classes;

import Enums.Country;
import Enums.Gender;

import java.time.LocalDate;

public class Person extends Passport{


    public Person(long id, String name, String age, String lastname, Gender gender, Country country, LocalDate dateOfBirth) {
        super(id, name, age, lastname, gender, country, dateOfBirth);
    }
}

