import java.util.Scanner;
public class Individu1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = input.nextInt();
        input.close();

        if (N < 3) {
            System.out.println("Nilai N harus minimal 3.");
        } else {
            for (int i = 1; i <= N; i++) {
                // Cetak angka dari 1 hingga i
                for (int k = 1; k <= i; k++) {
                    System.out.print(k);
                }

                // Cetak spasi setelah angka
                for (int j = 1; j <= N - i; j++) {
                    System.out.print(" ");
                }

                System.out.println(); // Pindah ke baris berikutnya
            }
        }
    }
}