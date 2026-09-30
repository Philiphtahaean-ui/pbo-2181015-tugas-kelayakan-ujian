import java.util.Scanner;

public class KelayakanUjian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kehadiran (%)   : ");
        int kehadiran = input.nextInt();
        System.out.print("Nilai tugas     : ");
        int nilaiTugas = input.nextInt();
        System.out.print("Dispensasi      : ");
        boolean dispensasi = input.nextBoolean();

        System.out.println();
        System.out.println("===== KELAYAKAN UJIAN =====");
        System.out.println("Kehadiran   : " + kehadiran + "%");
        System.out.println("Nilai tugas : " + nilaiTugas);
        System.out.println("Dispensasi  : " + dispensasi);
    }
}