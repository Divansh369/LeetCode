import java.util.*;

class Solution {
    public boolean canCross(int[] stones) {
        int n = stones.length;
        Map<Integer, Set<Integer>> jumps = new HashMap<>();

        for (int stone : stones) {
            jumps.put(stone, new HashSet<>());
        }

        jumps.get(stones[0]).add(0);

        for (int i = 0; i < n - 1; i++) {
            int stone = stones[i];
            for (int jump : jumps.get(stone)) {
                for (int nextJump = jump - 1; nextJump <= jump + 1; nextJump++) {
                    if (nextJump > 0 && jumps.containsKey(stone + nextJump)) {
                        jumps.get(stone + nextJump).add(nextJump);
                    }
                }
            }
        }

        return !jumps.get(stones[n - 1]).isEmpty();
    }
}
