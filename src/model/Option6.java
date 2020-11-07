package model;

import java.util.Scanner;

public class Option6 extends mcs {

    private String NewSong;
    private int[] NumberOfSong;

    Scanner sc = new Scanner(System.in);

    public Option6(String newSong, int[] numberOfSong) {
        NewSong = newSong;
        NumberOfSong = numberOfSong;
    }

    public String getNewSong() {
        return NewSong;
    }

    public void setNewSong(String newSong) {
        NewSong = newSong;
    }

    public int[] getNumberOfSong() {
        return NumberOfSong;
    }

    public void setNumberOfSong(int[] numberOfSong) {
        NumberOfSong = numberOfSong;
    }

    public void addSongPool(){

        int e;

        System.out.println("Say the number of songs you want to create");
        int i = sc.nextInt();
        String[] NumberOfSong  = new String[i];

        System.out.println("add song to the pool");
        NewSong = sc.next();

    }
}
