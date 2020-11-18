package org.example;

public class RockMusic implements Music{
    private String nameMusic;
    private String autor;
    @Override
    public String getSong() {
        nameMusic = "Wind cries Mary";
        return nameMusic;
    }

    @Override
    public String getAutor() {
        autor = "Jimi Hendrix";
        return autor;

    }
}
