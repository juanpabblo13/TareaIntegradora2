package model;

import java.util.Scanner;

public class Option4 {

    private String publicPlaylist;
    private String privatePlaylist;
    private String restricedPlays;

    Scanner sc = new Scanner(System.in);

    public Option4(String publicPlaylist, String privatePlaylist, String restricedPlays) {
        this.publicPlaylist = publicPlaylist;
        this.privatePlaylist = privatePlaylist;
        this.restricedPlays = restricedPlays;
    }

    public String getPublicPlaylist() {
        return publicPlaylist;
    }

    public void setPublicPlaylist(String publicPlaylist) {
        this.publicPlaylist = publicPlaylist;
    }

    public String getPrivatePlaylist() {
        return privatePlaylist;
    }

    public void setPrivatePlaylist(String privatePlaylist) {
        this.privatePlaylist = privatePlaylist;
    }

    public String getRestricedPlays() {
        return restricedPlays;
    }

    public void setRestricedPlays(String restricedPlays) {
        this.restricedPlays = restricedPlays;
    }

    public void AddPlaylist(){
        System.out.println("Enter the type of the PlayList");
        boolean exit = false;
        int options;


        while (!exit) {
            System.out.println("1. option 1 (your option is public)");
            System.out.println("2. option 2 (your option is restriced)");
            System.out.println("3. option 3 (your option is private)");
            options = sc.nextInt();
        switch (options) {
            case 1 -> {
                System.out.println("have you selected public");
            }
            case 2 -> {
                System.out.println("have you selected resticed");
            }
            case 3 -> {
                System.out.println("have you selected private");
                }
            }
        }
    }
}



