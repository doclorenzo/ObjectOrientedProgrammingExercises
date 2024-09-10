package esercizi_oop.phonebook;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PhoneBookArray implements PhoneBook{

    final Person[] phoneBook;
    int curr_pos;

    public PhoneBookArray(){
        phoneBook=new Person[MAX_PERSONS];
        curr_pos=0;
    }

    @Override
    public boolean addPerson(Person person) {
        try{
            phoneBook[curr_pos]=person;
            curr_pos++;
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    @Override
    public boolean removePerson(Person person) {
        try{
            for(int i=0; i<curr_pos; i++){
                if(person.equals(phoneBook[i])){
                    for(int j=i+1;j<curr_pos;j++){
                        phoneBook[j-1]=phoneBook[j];
                    }
                    break;
                }
            }
            phoneBook[curr_pos]=new Person("","","");
            curr_pos--;
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        Set<Person> tmp=new HashSet<Person>(Arrays.stream(phoneBook).toList());

        tmp.removeIf(p -> !p.getLastname().equals(lastname));

        Person[] ret=new Person[MAX_PERSONS];
        int i=0;
        for(Person p : tmp){
            if(i==MAX_PERSONS) break;
            ret[i]=p;
            i++;
        }
        return ret;
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        Set<Person> tmp=new HashSet<Person>(Arrays.stream(phoneBook).toList());

        tmp.removeIf(p -> !(p.getLastname().equals(lastname) && p.getName().equals(name)));

        Person[] ret=new Person[MAX_PERSONS];
        int i=0;
        for(Person p : tmp){
            if(i==MAX_PERSONS) break;
            ret[i]=p;
            i++;
        }
        return ret;
    }
}
