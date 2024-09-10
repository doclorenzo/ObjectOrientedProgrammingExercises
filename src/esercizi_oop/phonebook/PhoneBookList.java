package esercizi_oop.phonebook;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PhoneBookList implements PhoneBook{

    final ArrayList<Person> phoneBook;

    public PhoneBookList() {
        phoneBook=new ArrayList<Person>();
    }

    @Override
    public boolean addPerson(Person person) {

        try{
            phoneBook.add(person);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean removePerson(Person person) {
        try{
            phoneBook.remove(person);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    @Override
    public Person[] searchByLastname(String lastname) {

        Set<Person> tmp=new HashSet<Person>();
        Person[] ret=new Person[MAX_PERSONS];
        for(Person p: phoneBook){
            if(p.getLastname().equals(lastname)){
                tmp.add(p);
            }
        }
        int i=0;
        for(Person p: tmp){
            if(i==MAX_PERSONS) break;
            ret[i]=p;
            i++;
        }
        return ret;
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        Set<Person> tmp=new HashSet<Person>();
        Person[] ret=new Person[MAX_PERSONS];
        for(Person p: phoneBook){
            if(p.getLastname().equals(lastname) && p.getName().equals(name)){
                tmp.add(p);
            }
        }
        int i=0;
        for(Person p: tmp){
            if(i==MAX_PERSONS) break;
            ret[i]=p;
            i++;
        }
        return ret;
    }
}
