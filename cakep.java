/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;
import java.util.Scanner;
/**
 *NAMA  : IMZY ZULIJAR SETIAWAN
 *NIM   : 23215022
 *PRODI : TEKNIK INFORMATIKA
 */
public class cakep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("run: ");
        System.out.print("\033[31mKamu\033[0m \033[32mngerjain\033[0m \033[33msendiri\033[0m \033[34mlatihan\033[0m \033[35m17\033[0m \033[36msampe\033[0m \033[31mlatihan\033[0m \033[32m30\033[0m \033[33mini?\033[0m ");
        String jawab = scanner.nextLine();

        if (jawab.equalsIgnoreCase("Yoi")) {
            System.out.println("\033[33mCakep\033[0m \033[36mBener\033[0m. \033[33mGood\033[0m \033[36mJob\033[0m");
            System.out.println("\033[34mBUILD\033[0m \033[32mSUCCESSFUL\033[0m (total time: 8 seconds)");
        } else {
            System.out.println("\033[33mTetep\033[0m \033[36mcakep\033[0m \033[33msih\033[0m.");
            System.out.println("\033[33mSing\033[0m \033[32mpenting\033[0m \033[33mpaham\033[0m \033[36mkonsep\033[0m \033[33mnya\033[0m yee.");
            System.out.println("\033[33mKeep\033[0m \033[32mthe\033[0m \033[33mcode\033[0m \033[36mworks\033[0m \033[33mdude\033[0m");
            System.out.println("\033[34mBUILD\033[0m \033[32mSUCCESSFUL\033[0m (total time: 6 seconds)");
        }

        scanner.close();
    }
}
