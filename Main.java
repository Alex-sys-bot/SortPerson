package ru.sapteh;

import sortList.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        List<Person> listPerson = new ArrayList<>();
//          CreateFile;
        String fileName = "Person.txt";
        File file = new File(fileName);
        System.out.println(file.createNewFile() ? "Файл создан" : "Такой файл уже существует");

//        read from file;
        try(var readFromFile = new BufferedReader(new FileReader(fileName))){
            while (readFromFile.ready()){
                Person person = getPerson(readFromFile.readLine());
                listPerson.add(person);
            }
        }
        Collections.sort(listPerson, Person.getSortFirstName());

//        writeFile;
        try(FileWriter fwPerson = new FileWriter("RewPerson.txt")){
            for (Person person: listPerson) {
                fwPerson.write(person.toString());
                fwPerson.write("\n");
             }
        }
    }


//    createObject;
    public static Person getPerson(String strLine){
        String[] arrPerson = strLine.split(" ");
        String lastName = arrPerson[0];
        String firstName = arrPerson[1];
        String patronymic = arrPerson[2];
        int age = Integer.parseInt(arrPerson[3]);
        int jobPrice = Integer.parseInt(arrPerson[4]);

        return new Person(lastName, firstName, patronymic, age, jobPrice);
    }
}
