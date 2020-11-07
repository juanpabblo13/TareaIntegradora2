package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Option1{


    private String name;
    private String password;
    private int age;
    private String category;



    public Option1(String name, String password, int age, String category) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.category = category;
    }

    /**
     * name=Name
     * @return
     */
    public String getName() {
            return name;
        }
        public void setName (String name){
            this.name = name;
        }

    /**
     * name= Password
     * @return
     */
        public String getPassword(){
        return password;
    }
        public void setPassword(String password) {
            this.password = password;
        }

        public int getAge(){
         return age;
        }
        public void setAge(int age) {
        this.age = age;
        }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * name=user
     * it is the method of create a user
     */
    public void User() {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the name");
        String name = input.next();
        System.out.println("Enter the password");
        String password = input.next();
        System.out.println("Enter the age");
        int age = input.nextInt();
        System.out.println("Enter the category");
        String category = input.next();
        Option1 modul = new Option1(name, password, age, category);
        ArrayList<Option1> ListOptions = new ArrayList<Option1>();
        ListOptions.add(modul);
    }
}

