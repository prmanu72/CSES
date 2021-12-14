import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

//1068
class WeirdAlgorithm{
    public static void main(String[] args) throws Exception{
        // Scanner scn = new Scanner(System.in);
        // long n = scn.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = (long)Integer.parseInt(br.readLine());
        while( n != 1){
            System.out.print(n + " ");
            if(n %2 == 0){
                n/=2;
            }
            else{
                n = n*3 +1;
            }
        }
        System.out.print(1);
    }
}