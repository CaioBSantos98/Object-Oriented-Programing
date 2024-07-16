package br.com.alura.desafios.writer.dois;

import java.util.Date;

public class Titulo {
    private String name;
    private int year;
    private String author;
    private boolean in_launch = false;

    public Titulo(String name, int year, String author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIn_launch() {
        return in_launch;
    }

    public void setIn_launch(boolean in_launch) {
        this.in_launch = in_launch;
    }

    @Override
    public String toString() {
        return "{" +
                "name = " + name +
                ", year = " + year +
                ", author = " + author +
                ", in_launch = " + in_launch +
                '}';
    }
}
