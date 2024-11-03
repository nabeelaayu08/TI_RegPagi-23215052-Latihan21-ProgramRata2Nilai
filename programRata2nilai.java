package programRata2nilai;
/**
 *NAMA : NABE'ELA AYU NING TYAS ZAHRA
 * PRODI : TEKNIK INFORMATIKA
 * NIM       : 23215052
 * Deskripsi Program : Program ini digunakan untuk menghitung rata-rata nilai mahasiswa.
 */

import java.util.Scanner;
public class programRata2nilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input jumlah mahasiswa
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        int jumlahMahasiswa = input.nextInt();

        // Array untuk menyimpan nilai mahasiswa
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        int totalNilai = 0;

        // Meminta input nilai setiap mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i + 1) + " : ");
            nilaiMahasiswa[i] = input.nextInt();
            totalNilai += nilaiMahasiswa[i];
        }

        // Menghitung rata-rata nilai
        double rataRata = (double) totalNilai / jumlahMahasiswa;

        // Menampilkan hasil
        System.out.println("Maka, Rata-rata Nilainya adalah " + rataRata);
    }
}