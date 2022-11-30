import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner inPut = new Scanner(System.in);
        int count = Integer.parseInt(inPut.nextLine());
        double countTwo = Double.parseDouble(inPut.nextLine());
        String text = inPut.nextLine();
        //Bu okumaları normal bir şekilde de yapabiliriz fakat program
        //o şekliyle hata veriyor
        //o yüzden aldığımız değerlerin girdilerin tamamını aldığına ve
        //girdilerin bizim istediğimiz tipte olmaslarına kesinlikele dikkat etmeliyiz

        System.out.println("String: " + text);
        System.out.println("Double: " + countTwo);
        System.out.println("Int: " + count);


    }
}
