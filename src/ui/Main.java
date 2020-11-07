package ui;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println(
                "(((((((((((((((((((((((((((((((((((((((((((((((((\n" +
                "((((((((((((((((/((((((((((((((((((((((((((((((((\n" +
                "(((/  .(((((((*  .((((((*        (((((/      /(((\n" +
                "(((/   .((((((.  .(((((   ,((((((((((*  .((((((((\n" +
                "(((/    /((((/   .((((/  ,(((((((((((.  /((((((((\n" +
                "(((/     ((((*   .((((*  ,(((((((((((/   ((((((((\n" +
                "(((/  *  *(((     ((((*  ,((((((((((((,  .(((((((\n" +
                "(((/  /.  ((*     ((((*  *(((((((((((((,   ((((((\n" +
                "(((/  //  ,(  .   ((((*  *((((((((((((((/   /((((\n" +
                "(((/  *(*  ,  (   ((((*  *((((((((((((((((   /(((\n" +
                "(((/  ,(/    ,(   /(((*  ,(((((((((((((((((   (((\n" +
                "(((/  .((    ((   /((((  .(((((((((((((((((.  /((\n" +
                "(((/  .((.  .((.  *((((,  *((((((((((((((((   /((\n" +
                "(((/  .((((((((.  *(((((   *((((/,/(((((((/   (((\n" +
                "(((/  .((((((((.  *((((((.        *((   .   .((((\n" +
                "(((((((((((((((/*/((((((((((///(((((((////(((((((\n" +
                "(((((((((((((((((((((((((((((((((((((((((((((((((\n" +
                "               ./(###((///((###(*                \n" +
                "           *#(,                   *((,           \n" +
                "        ,#/                           ((         \n" +
                "      .#*          .**/////*,.          ((       \n" +
                "     *(.      .//////////////////*       *#      \n" +
                "    .#,     *///////////////////////,     /(     \n" +
                "    /(    *///////////////////////////    .#.    \n" +
                "  ,/////,*/////////////////////////////,*////*.  \n" +
                "  /////////////////////////*,...,/////////////,  \n" +
                "  //////*,,,********,,.............,,,,,//////,  \n" +
                "  //////*.........//*........//*.......,//////,  \n" +
                "  //////*.........,,.........,,........,//////,  \n" +
                "  //////*..............................,//////,  \n" +
                "   *///*  ........,/.........**.......  .*///,   \n" +
                "            .......,/*.....,/*.......            \n" +
                "               ........,,,,.......               \n" +
                "                    .........                    \n" +
                "     \n" +
                "*************************************************\n");
        System.out.println("W E L C O M E to M C S");

        boolean exit = false;
        int options;

        while (!exit) {
            System.out.println("1. option 1 (you want to create a user)");
            System.out.println("2. option 2 (list the already created users)");
            System.out.println("3. option 3 (Create a song with your data and include in the pool)");
            System.out.println("4. option 4 (List the songs of the pool)");
            System.out.println("5. option 5 (Create playlist of the three variants (public, restricted and private))");
            System.out.println("6. option 6 (Create a playlist with a name, with a duration of zero and an unknown genre)");
            System.out.println("7. option 7 (Add to each playlist regardless of its type, the application allows you to add songs from the shared song pool)");
            System.out.println("8. option 8 (the application allows you to add the only user who has access to the songs in the playlist)");
            System.out.println("9. option 9 (with a restricted playlist, the application allows you to add up to five users who have access to the songs in the playlist)");
            System.out.println("10. option 10 ( with a public playlist, the application allows a user to assign a score and display the average score)");
            System.out.println("11. option 11 (List the playlists created in the M C S)");
            System.out.println("12. option 12 (Exit)");
            System.out.println("Select a option");
            options = sc.nextInt();
            switch (options) {
                case 1 -> {
                    System.out.println("have you selected option 1");
                }
                case 2 -> {
                    System.out.println("have you selected option 2");
                }
                case 3 -> {
                    System.out.println("have you selected option 3");
                }
                case 4 -> {
                    System.out.println("have you selected option 4");
                }
                case 5 -> {
                    System.out.println("have you selected option 5");
                }
                case 6 -> {
                    System.out.println("have you selected option 6");
                }
                case 7 -> {
                    System.out.println("have you selected option 7");
                }
                case 8 -> {
                    System.out.println("have you selected option 8");
                }
                case 9 -> {
                    System.out.println("have you selected option 9");
                }
                case 10 -> {
                    System.out.println("have you selected option 10");
                }
                case 11 -> {
                    System.out.println("have you selected option 11");
                }
                case 12 -> {
                    System.out.println("Good bye");
                    exit = true;
                }
                default -> System.out.println("oh oh, that is not fair");
            }
        }
    }
}
