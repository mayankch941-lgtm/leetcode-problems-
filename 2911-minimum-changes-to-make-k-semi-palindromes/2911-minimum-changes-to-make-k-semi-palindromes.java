class Solution {
    public int minimumChanges(String s, int k) {

        int n = s.length();
        int[][] cost = new int[n][n];

        for (int len = 2; len <= n; len++) {

            for (int i = 0; i + len <= n; i++) {

                int best = Integer.MAX_VALUE;

                for (int d = 1; d < len; d++) {

                    if (len % d != 0) {
                        continue;
                    }

                    int changes = 0;
                    int groups = len / d;

                    for (int r = 0; r < d; r++) {

                        for (int t = 0; t < groups / 2; t++) {

                            int left = i + r + t * d;

                            int right = i + r
                                    + (groups - 1 - t) * d;

                            if (s.charAt(left) != s.charAt(right)) {
                                changes++;
                            }
                        }
                    }

                    best = Math.min(best, changes);
                }

                cost[i][i + len - 1] = best;
            }
        }


        int INF = 1000000;

        int[][] dp = new int[k + 1][n + 1];

        for (int i = 0; i <= k; i++) {
            java.util.Arrays.fill(dp[i], INF);
        }

        dp[0][0] = 0;


        for (int parts = 1; parts <= k; parts++) {

            for (int end = 2 * parts; end <= n; end++) {

                for (int start = 2 * (parts - 1);
                     start <= end - 2; start++) {

                    dp[parts][end] = Math.min(
                        dp[parts][end],
                        dp[parts - 1][start]
                        + cost[start][end - 1]
                    );
                }
            }
        }

        return dp[k][n];
    }
}