package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
    private String Name;
    private List<String>Phone;
    private Set<String>Addresses;
    private Map<String ,Integer>courses;

    public Employee(){
        super();
    }

    public Employee(String name, List<String> phone, Set<String> addresses, Map<String, Integer> courses) {
        Name = name;
        Phone = phone;
        Addresses = addresses;
        this.courses = courses;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<String> getPhone() {
        return Phone;
    }

    public void setPhone(List<String> phone) {
        Phone = phone;
    }

    public Set<String> getAddresses() {
        return Addresses;
    }

    public void setAddresses(Set<String> addresses) {
        Addresses = addresses;
    }

    public Map<String, Integer> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, Integer> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", Phone=" + Phone +
                ", Addresses=" + Addresses +
                ", courses=" + courses +
                '}';
    }
}
