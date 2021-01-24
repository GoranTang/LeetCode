public class solution62 {
    public int uniquePaths(int m, int n) {
        if (m < 2 && n < 2) {
            return 1;
        }
        int[][] dp = new int[n][m];
        for (int i = 1; i < m; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < n; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[n - 1][m - 1];
    }

    public static void main(String[] args) {
        new solution62().uniquePaths(3, 3);
    }
}