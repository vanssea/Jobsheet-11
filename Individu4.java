import java.util.Scanner;
public class Individu4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] array= new String[4][6];
        array[0][0]= "Badminton";
        array[1][0]= "Tenis Meja";
        array[2][0]= "Basket";
        array[3][0]= "Bola voly";

        for(int i=0; i<array.length; i++){
            for(int j=1; j<array[i].length; j++){
                System.out.print("Masukkan nama atlet "+array[i][0]+" ke-"+j+": ");
                array[i][j]= sc.nextLine();
            }
            System.out.println();
            for (int k = 1; k < array[i].length; k++) {
                for (int l = k + 1; l < array[i].length; l++) {
                    if (array[i][k].compareTo(array[i][l]) > 0) {
                        String temp = array[i][k];
                        array[i][k] = array[i][l];
                        array[i][l] = temp;
                    }
                }
            }
        }
        for(int i=0; i<array.length; i++){
            System.out.println(array[i][0] + ":");
            for(int j=1; j<array[i].length; j++){
                System.out.println(array[i][j]);
            }
            System.out.println();
        }
    }
}