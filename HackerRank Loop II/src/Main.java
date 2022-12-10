import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        Scanner number = new Scanner(System.in);


        int t = number.nextInt();
        for (int j = 0 ; j < t ; j++){

            int a = number.nextInt();
            int b = number.nextInt();
            int n = number.nextInt();

            int toplam = a;

            for(int i = 0 ; i < n ; i++){
                int adim = (int)Math.pow(2,i)*b;

                toplam = toplam + adim;

                System.out.printf("%s " , toplam);
            }

            if(j < t-1){
                System.out.print("\n");
            }

        }
        number.close();




    }
}
