package org.example;

public class HiphopMusic implements Music{
    private String nameMusic;
    private String autor;
    @Override
    public String getSong() {
        nameMusic = "Ego Trippin";
        return nameMusic;
    }

    @Override
    public String getAutor() {
        autor = "Snoop Dogg";
        return autor;
    }
}
