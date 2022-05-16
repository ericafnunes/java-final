package com.letscode.Entities;

import java.io.Serializable;

import static java.lang.Integer.*;


public class Oscar implements Serializable {
    private static final long serialVersionUID = 1L;
    private String Year;
    private int Age;
    private String Name;
    private String Movie;


    public Oscar(String year, Integer age, String name, String movie) {
        super();
        Year = year;
        Age = parseInt(String.valueOf(age));
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

    @Override
    public String toString() {
        return "Oscar[" +
                "Year=" + Year +
                ", Age=" + Age +
                ", Name='" + Name + '\'' +
                ", Movie='" + Movie + '\'' +
                ']';
    }

}
