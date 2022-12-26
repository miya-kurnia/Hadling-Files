import java.io.File;

import java.io.IOException;


public class Create {
    public static void main(String[] args) {
        try{
            File myObj = new File ("belajar.txt");
            if (myObj.createNewFile()){
                System.out.println("file create: " + myObj.getName());
            }
            else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}