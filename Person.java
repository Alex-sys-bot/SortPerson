package ru.sapteh;

import java.util.Comparator;

public class Person {
    private String lastName;
    private String firstName;
    private String patronymic;
    private int age;
    private int jobPrice;

    public Person(String lastName, String firstName, String patronymic, int age, int jobPrice){
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.age = age;
        this.jobPrice = jobPrice;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getAge() {
        return age;
    }

    public int getJobPrice() {
        return jobPrice;
    }

    public String toString(){
        return String.format("%s %s %s %d %d",
                getLastName(), getFirstName(), getPatronymic(),getAge(),getJobPrice());
    }

// sort by lastName;
    private static class SortLastName implements Comparator<Person>{
        @Override
        public int compare(Person lastName1, Person lastName2) {
            return lastName1.getLastName().compareTo(lastName2.getLastName());
        }
    }
    public static SortLastName getSortLastName(){
        return new SortLastName();
    }

//    sortby firstName
private static class SortFirstName implements Comparator<Person>{
    @Override
    public int compare(Person firstName1, Person firstName2) {
        return firstName1.getFirstName().compareTo(firstName2.getFirstName());
    }
}
    public static SortFirstName getSortFirstName(){
        return new SortFirstName();
    }

//    sort Patronymic;
    private static class SortPatronymic implements Comparator<Person>{
        @Override
        public int compare(Person patronymic1, Person patronymic2) {
            return patronymic1.getLastName().compareTo(patronymic1.getLastName());
        }
    }
    public static SortPatronymic getSortPatronymic(){
        return new SortPatronymic();
    }

//    sort age;
    private static class SortAge implements Comparator<Person>{
        @Override
        public int compare(Person age1, Person age2) {
         return age1.getAge() - age2.getAge();
        }
    }
        public static SortAge getSortAge(){
         return new SortAge();
    }

//    sort jobPrice
private static class SortJobPrice implements Comparator<Person>{
    @Override
    public int compare(Person jobPrice1, Person jobPrice2) {
        return jobPrice1.getLastName().compareTo(jobPrice2.getLastName());
    }
}
    public static SortJobPrice getSortPrice(){
        return new SortJobPrice();
    }
}
