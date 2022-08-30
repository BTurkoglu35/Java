package practice_05;

import java.util.Scanner;

public class Q03_Forloop {
    public static void main(String[] args) {
 /*
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */

    Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen satir giriniz");
        int str=scanner.nextInt();
        System.out.println("lutfen sutun giriniz");
        int sutun = scanner.nextInt();

        for (int i = 1; i <=str ; i++) {
            for (int j = 1; j <=sutun ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
