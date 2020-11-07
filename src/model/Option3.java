package model;

import java.util.Scanner;

public class Option3 {

    Scanner adss = new Scanner(System.in);

    private String title;
    private String artist;
    private String duration;
    private String genre;
    private String[] Print;


    public Option3(String title, String artist, String duration, String genre, String[] Print){
        this.title=title;
        this.artist=artist;
        this.duration=duration;
        this.genre=genre;
        this.Print=Print;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    public String[] getPrint() {
        return Print;
    }

    public void setPrint(String[] print) {
        Print = print;
    }

    public void Create() {

        System.out.println("Say the number of songs you want to create");
        int i = adss.nextInt();
        String[] array = new String[i];
        // Ask for the info depending of the quantify entered
        for (int j = 0; j < i; j++) {
            System.out.println("enter the position where is the song " + j + " of the array");
            String SongPs = adss.next();
            array[j] = SongPs;
        }
        //Follow the array
        System.out.println("this is the data of your created songs");
        for (int j = 0; j < i; j++) {
            System.out.println("" + array[j]);
        }
    }


    public String genre() {

        System.out.println("enter the title of the song");
        String e = adss.next();
        System.out.println("enter the genre of the song");
        String i = adss.next();
        System.out.println("enter the duration of the song");
        String a = adss.next();

        String Song[] = new String[2];
        Song [0] = e;
        Song [1] = i;
        Song [2] = a;

        return genre;
    }
}

