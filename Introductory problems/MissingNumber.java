//https://cses.fi/problemset/task/1083
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MissingNumber {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 1;
        String[] s = br.readLine().split(" ");
        for(int i = 2; i <= n; i++){
            int k = Integer.parseInt(s[i-2]);
            ans = ans + i - k;
        }
        System.out.println(ans);
    }
}
