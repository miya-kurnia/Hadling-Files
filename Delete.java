import java.io.File;

public class Delete {
    public static void main(String[] args){
        File myObj = new File("belajar.txt");
        if (myObj.delete()){
            System.out.println("Delete the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}