package gettestie.src.main.java.rocks.zipcode;


import rocks.zipcode.Address;

public class Person implements Comparable<Person>{
    private String name;
    private int yearOfBirth;
    private Address address;

    /**
     * Create a person with given name and age.
     */
    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    /**
     * Set a new name for this person.
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * Return the name of this person.
     */
    public String getName() {
        return name;
    }

    /**
     * Set a new birth year for this person.
     */
    public void setYearOfBirth(int newYearOfBirth) {
        yearOfBirth = newYearOfBirth;
    }

    /**
     * Return the birth year of this person.
     */
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    /**
     * Set a new address for this person.
     */
    public void setAddress(String street, String town, String postCode) {
        address = new Address(street, town, postCode);
    }

    /**
     * Return the address of this person.
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Return a string representation of this object.
     */
    public String toString() // redefined from "Object"
    {
        return "Name: " + name + "\n" + "Year of birth: " + yearOfBirth + "\n";
    }


    @Override
    public int compareTo(Person o) {
        if(yearOfBirth == o.yearOfBirth) {
            return 0;
        } else if(yearOfBirth > o.yearOfBirth) {
            return 1;
        } else {
            return -1;
        }
    }
}
