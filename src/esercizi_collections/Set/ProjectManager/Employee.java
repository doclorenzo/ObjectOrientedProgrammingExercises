package esercizi_collections.Set.ProjectManager;

import java.util.Objects;

public class Employee {

    String name;
    String lastname;
    String socialSecurityCode;

    public Employee(String name, String lastname, String socialSecurityCode) {
        this.name = name;
        this.lastname = lastname;
        this.socialSecurityCode = socialSecurityCode;
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

    public String getSocialSecurityCode() {
        return socialSecurityCode;
    }

    public void setSocialSecurityCode(String socialSecurityCode) {
        this.socialSecurityCode = socialSecurityCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(lastname, employee.lastname) && Objects.equals(socialSecurityCode, employee.socialSecurityCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, socialSecurityCode);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", socialSecurityCode='" + socialSecurityCode + '\'' +
                '}';
    }
}
