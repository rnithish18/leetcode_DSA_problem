import java.util.*;

class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int[] inv : invocations) graph.get(inv[0]).add(inv[1]);

        // Step 1: BFS from k to mark all suspicious methods
        boolean[] suspicious = new boolean[n];
        suspicious[k] = true;
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(k);
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int next : graph.get(cur)) {
                if (!suspicious[next]) {
                    suspicious[next] = true;
                    queue.add(next);
                }
            }
        }

        // Step 2: check if any outside method calls into the suspicious group
        for (int[] inv : invocations) {
            int a = inv[0], b = inv[1];
            if (!suspicious[a] && suspicious[b]) {
                List<Integer> all = new ArrayList<>();
                for (int i = 0; i < n; i++) all.add(i);
                return all;   // unsafe to remove anything
            }
        }

        // Step 3: return everything that's NOT suspicious
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) if (!suspicious[i]) result.add(i);
        return result;
    }
}