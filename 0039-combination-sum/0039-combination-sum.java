import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combinationsList = new ArrayList<>();
        generateCombinations(candidates, target, 0, new ArrayList<>(), combinationsList);
        return combinationsList;
    }

    private static void generateCombinations(int[] elements, int remainingTarget, int start, List<Integer> currentCombination, List<List<Integer>> combinationsList) {
        if (remainingTarget == 0) {
            combinationsList.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int i = start; i < elements.length; i++) {
            if (remainingTarget - elements[i] >= 0) {
                currentCombination.add(elements[i]);
                generateCombinations(elements, remainingTarget - elements[i], i, currentCombination, combinationsList);
                currentCombination.remove(currentCombination.size() - 1);
            }
        }
    }
}
