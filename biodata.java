import java.util.Scanner;

public class biodata {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        String name = s.nextLine();

        System.out.print("Masukkan Umur Anda : ");
        String umur = s.nextLine();
        
        System.out.print("Masukan Angkatan Anda : ");
        String angkatan = s.nextLine();

        System.out.print("Masukan Program Studi Anda : ");
        String prodi = s.nextLine();

    
        System.out.println("Selamat Belajar Java " + name + "!");
        System.out.println("Umur Anda Adalah " + umur);
        System.out.println("Angkatan Anda Adalah " + angkatan);
        System.out.println("Program Studi Anda Adalah " + prodi);

         if (Integer.parseInt(umur) > 18) {
            System.out.println("Anda Sudah Dewasa");
        } else {
            System.out.println("Anda Masih Dibawah Umur");
        }

        if (Integer.parseInt(umur) > 22 && Integer.parseInt(angkatan) < 2025) {
            System.out.println("Mahasiswa In Danger");
        } else {
            System.out.println("Mahasiswa Aman Aman Saja");
        }

        
        s.close();
    }
}