import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class DataMahasiswa {
    public static void Create() {
        try {
            File myObj = new File("DataMahasiswa.txt");
            if (myObj.createNewFile()) {
                System.out.println("File berhasil dibuat");
            } else {
                System.out.println("File sudah ada");
            }
        } catch (IOException e) {
            System.out.println("Gagal");
            e.printStackTrace();
        }
    }

    public static void Write() {
        try {
            FileWriter myWriter = new FileWriter("DataMahasiswa.txt");
            Scanner input = new Scanner(System.in);
            System.out.print("Masukan data : ");
            String text = input.nextLine();
            myWriter.write(text);
            myWriter.close();
            System.out.println("Sukses");
        } catch (IOException e) {
            System.out.println("Gagal");
            e.printStackTrace();
        }
    }

    public static void Delete() {
        File myObj = new File("DataMahasiswa.txt");
        if (myObj.delete()) {
            System.out.println("Sukses");
        } else {
            System.out.println("Gagal");
        }
    }

    public static void Read() {
        try {
            File myObj = new File("DataMahasiswa.txt");
            Scanner input = new Scanner(myObj);
            System.out.print("Menampilkan Isi file : ");
            while (input.hasNextLine()) {
                String data = input.nextLine();
                System.out.println(data);
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("Gagal");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Create();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Menu : ");
            System.out.println("1. Masukan Data");
            System.out.println("2. Lihat Data");
            System.out.print("Pilih Menu : ");
            int menu = input.nextInt();
            switch (menu) {
                case 1:
                    Write();
                    break;
                case 2:
                    Read();
                    break;
                case 3:
                    Delete();
                    System.exit(0);
                    input.close();
                    break;
            }
        }

    }
}