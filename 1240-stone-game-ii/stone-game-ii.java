class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;

        int[][] dp = new int[n][n + 1];
        int[] suffix = new int[n + 1];

        // Suffix sum
        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + piles[i];
        }

        // DP from the end
        for (int i = n - 1; i >= 0; i--) {
            for (int M = 1; M <= n; M++) {

                if (i + 2 * M >= n) {
                    dp[i][M] = suffix[i];
                } else {
                    for (int X = 1; X <= 2 * M; X++) {
                        dp[i][M] = Math.max(
                            dp[i][M],
                            suffix[i] - dp[i + X][Math.max(M, X)]
                        );
                    }
                }
            }
        }

        return dp[0][1];
    }
}