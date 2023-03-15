import java.util.Scanner;
/*
Author: M. Khoirul Risqi
NIM: 221101023
Kelas: TI 2A
Github: Https://github.com/risqikhoirul/utsDesktop
*/
public class tugasUtsSatu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai x: ");
        double x = input.nextDouble();
        // double x = 5;

        // Hitung nilai y dari persamaan y=2.5x+4.3x+3.5x²+9.4
        double y1 = 2.5*x + 4.3*x + 3.5*Math.pow(x, 2) + 9.4;
        System.out.println("Nilai y dari persamaan y=2.5x+4.3x+3.5x²+9.4 adalah: " + y1);

        // Hitung nilai y dari persamaan y=√x+4.3x²+3.5x²+9.4
        double y2 = Math.sqrt(x) + 4.3*Math.pow(x, 2) + 3.5*Math.pow(x, 2) + 9.4;
        System.out.println("Nilai y dari persamaan y=√x+4.3x²+3.5x²+9.4 adalah: " + y2);

    }
   
}
