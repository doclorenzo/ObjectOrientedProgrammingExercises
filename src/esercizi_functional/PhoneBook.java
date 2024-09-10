package esercizi_functional;

import java.util.List;
import java.util.Optional;

public class PhoneBook {

    public List<Person> phonebook;

    public PhoneBook(List<Person> phonebook) {
        this.phonebook = phonebook;
    }

    public static class Person {
        String name;
        String lastname;
        String phone;

        public Person(String name, String lastname, String phone) {
            this.name = name;
            this.lastname = lastname;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
    }

    public Optional<Person> searchByLastname(String lastname){

        return this.phonebook.stream()
                .filter(x-> x.getLastname().equals(lastname))
                .findFirst();

    }
    public Optional<Person> searchByNameAndLastname(String name, String lastname){

        return this.phonebook.stream()
                .filter(x-> x.getLastname().equals(lastname) && x.getName().equals(name))
                .findFirst();

    }



}
