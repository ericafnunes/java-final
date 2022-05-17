package com.letscode.Entities;

import java.io.Serializable;

import static java.lang.Integer.*;


public class Oscar implements Serializable {
    private static final long serialVersionUID = 1L;

    private int Index;
    private String Year;
    private int Age;
    private String Name;
    private String Movie;


    public Oscar(int index, String year, int age, String name, String movie) {
        super();
        Index= index;
        Year = year;
        Age = age;
        Name = name;
        Movie = movie;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }


    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMovie() {
        return Movie;
    }

    public void setMovie(String movie) {
        Movie = movie;
    }

    public int getIndex() {
        return Index;
    }

    public void setIndex(int index) {
        Index = index;
    }

    @Override
    public String toString() {
        return "Oscar{" +
                "Index=" + Index +
                ", Year='" + Year + '\'' +
                ", Age=" + Age +
                ", Name='" + Name + '\'' +
                ", Movie='" + Movie + '\'' +
                '}';
    }

}
