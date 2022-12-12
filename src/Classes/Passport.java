package Classes;


import Enums.Country;
import Enums.Gender;

import java.time.LocalDate;

public class Passport {
    private long id;
    private String name;
    private int age;
    private String lastname;
    private String  gender;
    private String country;

    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", Lastname='" + lastname + '\'' +
                ", gender=" + gender +
                ", country=" + country +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String  gender) {
        this.gender = gender;
    }

    public String  getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Passport(long id, String name, String age, String lastname, Gender gender, Country country, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.lastname = String.valueOf(lastname);
        this.gender = String.valueOf(gender);
        this.country = String.valueOf(country);
    }
}
