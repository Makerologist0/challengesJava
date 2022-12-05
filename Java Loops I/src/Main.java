import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int sonuc = 0;
        bufferedReader.close();

        for(int i=1; i<=10 ; i++){
            System.out.print(N);
            System.out.print(" x ");
            System.out.print(i);
            System.out.print(" = ");
            sonuc = i*N;
            System.out.println(sonuc);
        }
    }
}
