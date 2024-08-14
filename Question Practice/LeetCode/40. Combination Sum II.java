import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        // created new result list which is a nested list/mutidimensional List
        List<List<Integer>> result = new ArrayList<>();
        // sorted for easy comparison of elements ex: when we reach reach at element which is greater than target we abort further comparisons..
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    // recursive function to find all combinations with distinct elements and target sum
    private void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            // this checks if the previous element is same as current element for ex : in sorted array [2,3,4,5,5,9] it prevents duplication
            if (i > start && candidates[i] == candidates[i - 1]) continue;

            // break if the current element is greater than target, as we want to avoid exceeding the target sum.
            if (candidates[i] > target) break;

            current.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}

// view question description - https://leetcode.com/problems/combination-sum-ii/