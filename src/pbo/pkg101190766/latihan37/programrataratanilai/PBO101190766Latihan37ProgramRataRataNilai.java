/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg101190766.latihan37.programrataratanilai;

/**
 *
 * @author Neyza-T
 * Nama  : Nezya Tariska
 * Nim   : 10119066
 * Kelas : PBO/IF2
 */
public class PBO101190766Latihan37ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs = new Mahasiswa();
        double nilaiMahasiswa, ratarata;
        double totalNilai = 0;
        double jumlahMahasiswa = mhs.getBanyak_mahasiswa();
        
        for (int i =1; i <= jumlahMahasiswa; i++) {
            nilaiMahasiswa = mhs.getNilai(i);
            totalNilai += nilaiMahasiswa;
        }
        ratarata = totalNilai / jumlahMahasiswa;
        System.out.printf("%nMaka, rata-rata nilainya adalah : %1$.1f%n",ratarata);
        
    }
    
}
