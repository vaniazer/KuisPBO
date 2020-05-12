import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nilai, tulis, coding, wawancara, microteaching, praktek, menu;
        char ulang;
        String nim, nama, keterangan;
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("MENU FORM PENDAFTARAN");
            System.out.println("1. Asisten Laboratorium");
            System.out.println("2. Admin Laboratorium");
            System.out.print("Pilih jenis form : ");
            try{
                menu = input.nextInt();
                if(menu<=0){
                    throw new IllegalArgumentException("\t\tPilihan yang anda inputkan salah");
                }
                else if(menu>=1){
                    if(menu==1){
                        System.out.println("FORM PENDAFTARAN ASISTEN LABORATORIUM ");
                        System.out.print("Berapa banyak data yang akan di inputkan? :  ");
                        nilai = input.nextInt();
                        for (int i=1;i<=nilai;i++){
                            System.out.println("Data ke-"+i);
                            System.out.print("Input NIM : ");
                            input.nextLine();
                            nim = input.nextLine();
                            System.out.print("Input Nama : ");
                            nama = input.nextLine();
                            System.out.print("Input Nilai Tes Tulis : ");
                            tulis = input.nextInt();
                            System.out.print("Input Nilai Tes Coding : ");
                            coding = input.nextInt();
                            System.out.print("Input Nilai Tes Wawancara : ");
                            wawancara = input.nextInt();
                            System.out.print("Input Nilai Tes Microteaching : ");
                            microteaching = input.nextInt();

                            Asisten asisten = new Asisten();
                            asisten.setNim(nim);
                            asisten.setNama(nama);
                            asisten.setTulis(tulis);
                            asisten.setCoding(coding);
                            asisten.setWawancara(wawancara);
                            asisten.setMicroteaching(microteaching);

                            System.out.println("NILAI AKHIR : " + asisten.hitungRata() );
                            if (asisten.rata > 85){
                                keterangan = "LOLOS";
                                System.out.println("Selamat kepada " + asisten.getNim() + " telah diterima sebagai Aslab ");
                            }
                            else{
                                keterangan = "TIDAK LOLOS";
                                System.out.println("Mohon maaf kepada " + asisten.getNim() + " telah ditolak sebagai Aslab ");
                            }
                            System.out.println("KETERANGAN : " + keterangan);
                            System.out.println("");

                        }
                    }
                    else if(menu==2){
                        System.out.println("FORM PENDAFTARAN ADMIN LABORATORIUM ");
                        System.out.print("Berapa banyak data yang akan di inputkan? :  ");
                        nilai = input.nextInt();
                        for (int i=1;i<=nilai;i++) {
                            System.out.println("Data ke-"+i);
                            System.out.print("Input NIM : ");
                            input.nextLine();
                            nim = input.nextLine();
                            System.out.print("Input Nama : ");
                            nama = input.nextLine();
                            System.out.print("Input Nilai Tes Tulis : ");
                            tulis = input.nextInt();
                            System.out.print("Input Nilai Tes Coding : ");
                            coding = input.nextInt();
                            System.out.print("Input Nilai Tes Wawancara : ");
                            wawancara = input.nextInt();
                            System.out.print("Input Nilai Tes Praktek Jaringan : ");
                            praktek = input.nextInt();

                            Admin admin = new Admin();
                            admin.setNim(nim);
                            admin.setNama(nama);
                            admin.setTulis(tulis);
                            admin.setCoding(coding);
                            admin.setWawancara(wawancara);
                            admin.setPraktek(praktek);

                            System.out.println("NILAI AKHIR : " + admin.hitungRata());
                            if (admin.rata > 85){
                                keterangan = "LOLOS";
                                System.out.println("Selamat kepada " + admin.getNim() + " telah diterima sebagai Admin ");
                            }
                            else{
                                keterangan = "TIDAK LOLOS";
                                System.out.println("Mohon maaf kepada " + admin.getNim() + " telah ditolak sebagai Admin ");
                            }
                            System.out.println("KETERANGAN : " + keterangan);
                            System.out.println("");
                        }

                    }
                    else{
                        System.out.println("Maaf, inputan yang anda masukkan salah");
                    }
                }
            } catch (InputMismatchException inputMismatchException){
                System.out.println("\t\tHanya menerima angka");
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println(illegalArgumentException.getMessage());
            }
            System.out.print("Kembali ke menu utama? (y/n) : ");
            ulang = input.next().charAt(0);
        }while(ulang=='Y' || ulang=='y');
    }
}
