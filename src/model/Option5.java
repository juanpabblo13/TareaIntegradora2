package model;

import java.util.Scanner;

public class Option5{

    Scanner sc = new Scanner(System.in);

    private String namePlaylist;
    private String durationPlaylist;
    private String genrePlaylist;

    public Option5(String namePlaylist, String durationPlaylist, String genrePlaylist){
        this.durationPlaylist=durationPlaylist;
        this.genrePlaylist=genrePlaylist;
        this.namePlaylist=namePlaylist;
    }


    public String getNamePlaylist() {
        return namePlaylist;
    }

    public void setNamePlaylist(String namePlaylist) {
        this.namePlaylist = namePlaylist;
    }

    public String getDurationPlaylist() {
        return durationPlaylist;
    }

    public void setDurationPlaylist(String durationPlaylist) {
        this.durationPlaylist = durationPlaylist;
    }

    public String getGenrePlaylist() {
        return genrePlaylist;
    }

    public void setGenrePlaylist(String genrePlaylist) {
        this.genrePlaylist = genrePlaylist;
    }

    public void playlist(){
        System.out.println("enter the name of the playlist");
        String namePlaylist  = sc.next();
        System.out.println("enter the duration of the playlist");
        String durationPlaylist = sc.next();
        System.out.println("enter the genre of the playlist");
        String genrePlaylit = sc.next();

        String Playlist[] = new String[2];
        Playlist [0] = namePlaylist;
        Playlist [1] = durationPlaylist;
        Playlist [2] = genrePlaylit;

    }

}
