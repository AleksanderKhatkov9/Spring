package org.example;

public class DiscoMusic implements Music{
    private String nameMusic;
    private String autor;
    @Override
    public String getSong() {
        nameMusic = "Freestyler";
        return nameMusic;
    }

    @Override
    public String getAutor() {
        autor = "Bomfunk MCS";
        return autor;
    }
}
