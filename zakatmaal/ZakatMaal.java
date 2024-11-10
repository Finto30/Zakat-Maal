/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zakatmaal;

/**
 *
 * @author galang finto
 */

import java.util.Scanner;

public class ZakatMaal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        for (;;) {
            System.out.println("==============================");
            System.out.println("     GALANG FINTO ANERGI      ");
            System.out.println("      TEKNIK INFORMATIKA      ");
            System.out.println("==============================");
        
            System.out.println("=== Menu Zakat Maal ===");
            System.out.println("1. Zakat Uang");
            System.out.println("2. Zakat Emas");
            System.out.println("3. Zakat Ternak");
            System.out.println("4. Keluar");
            System.out.print("Pilih jenis zakat maal : ");
            
            // Cek apakah input adalah integer
            if (input.hasNextInt()) {
                pilihan = input.nextInt();
            } else {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                input.next(); // Menghapus input yang tidak valid
                continue; // Kembali ke awal loop
            }

            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukkan nama donatur: ");
                    String nama = input.next();
                    System.out.print("Masukkan jumlah uang: ");
                    double uang = input.nextDouble();

                    Donatur donatur = new Donatur(nama, uang, 0);
                    double nisabUang = 85 * 1363000;  
                    if (donatur.getJumlahUang() >= nisabUang) {
                        double zakatUang = donatur.getJumlahUang() * 0.025;
                        System.out.printf("Jumlah zakat uang yang wajib dibayarkan: %.2f\n", zakatUang);
                    } else {
                        System.out.println("Jumlah uang belum mencapai nisab. Tidak wajib zakat.");
                    }
                }

                case 2 -> {
                    System.out.print("Masukkan nama donatur: ");
                    String nama = input.next();
                    System.out.print("Masukkan jumlah emas (gram): ");
                    double emas = input.nextDouble();

                    Donatur donatur = new Donatur(nama, 0, emas);
                    if (donatur.getJumlahEmas() >= 85) {
                        double zakatEmas = donatur.getJumlahEmas() * 0.025;
                        System.out.printf("Jumlah zakat emas yang wajib dibayarkan: %.2f gram\n", zakatEmas);
                    } else {
                        System.out.println("Jumlah emas belum mencapai nisab. Tidak wajib zakat.");
                    }
                }

                case 3 -> {
                    System.out.println("Pilih jenis ternak:");
                    System.out.println("1. Kambing");
                    System.out.println("2. Sapi");
                    System.out.print("Pilih: ");
                    int ternakChoice = input.nextInt();

                    switch (ternakChoice) {
                        case 1 -> {
                            System.out.print("Masukkan jumlah kambing yang dimiliki : ");
                            int kambing = input.nextInt();

                            if (kambing >= 40) {
                                int zakatKambing = (kambing >= 40 && kambing < 121) ? 1 :
                                        (kambing >= 121 && kambing < 201) ? 2 : 3;
                                System.out.println("Jumlah zakat kambing yang wajib dibayarkan: " + zakatKambing + " ekor");
                            } else {
                                System.out.println("Jumlah kambing belum mencapai nisab. Tidak wajib zakat.");
                            }
                        }
                        case 2 -> {
                            System.out.print("Masukkan jumlah sapi yang dimiliki : ");
                            int sapi = input.nextInt();

                            if (sapi >= 30) {
                                int zakatSapi = (sapi >= 30 && sapi < 40) ? 1 :
                                        (sapi >= 40 && sapi < 60) ? 2 : 3;
                                System.out.println("Jumlah zakat sapi yang wajib dibayarkan: " + zakatSapi + " ekor");
                            } else {
                                System.out.println("Jumlah sapi belum mencapai nisab. Tidak wajib zakat.");
                            }
                        }
                        default -> System.out.println("Pilihan tidak valid.");
                    }
                }

                case 4 -> {
                    System.out.println("Terima kasih! Program selesai.");
                    input.close();
                    return; // Keluar dari program
                }

                default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
``