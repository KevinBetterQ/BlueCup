import java.util.Scanner;

public class Main {
    static int N;
    static int Mul;
    static long[] num = new long[20];
    static long[] sum = new long[20];
    static long[][] dp = new long[20][20];
    /*
     * dp[i][j]代表前i个数中有j个乘号的最大值
     * sum[i]是前i个数的和
     * 状态转移方程:dp[i][0] = sum[i]
     * dp[i][j] = max(dp[i][j],dp[k-1][j-1]*(sum[i]-sum[j-1]))
     * k为乘号的位置；
     */

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        N= in.nextInt();
        Mul = in.nextInt();
        for ( int i = 0 ; i < 20 ; i++){
            for ( int j = 0 ; j < 20 ; j++){
                dp[i][j] = 0;
            }
        }
        sum[0] = 0;
        num[0] = 0; 
        for ( int i = 1 ; i <= N ; i++){
            num[i] = in.nextLong();
            sum[i] = sum[i-1] + num[i];
            dp[i][0] = sum[i];
        }
        for ( int i = 2 ; i <= N ; i++){
            int t = Math.min(i, Mul);
            for ( int j = 1 ; j <= t ; j++){//j为乘号的个数
                for ( int k = 2 ; k <= i ; k++){//k为乘号的位置
                    long tmp = sum[i]-sum[k-1];
                    dp[i][j] = Math.max(dp[i][j], dp[k-1][j-1]*tmp);
                }
            }
        }
        System.out.print(dp[N][Mul]);
        in.close();
    }

}