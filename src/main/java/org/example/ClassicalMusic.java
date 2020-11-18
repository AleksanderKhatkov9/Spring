package org.example;

public class ClassicalMusic implements Music{
    private String nameMusic;
    private String autor;
    @Override
    public String getSong() {
        nameMusic = "Hungarian Rhapsody";
        return nameMusic;
    }

    @Override
    public String getAutor() {
        autor = "Queen";
       return autor;
    }
}
