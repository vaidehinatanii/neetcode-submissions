class Solution {
    public boolean hasDuplicate(int[] nums) {
        /*
         * IDEA:
         * Compare every element with every other element.
         * If any two elements are equal, a duplicate exists.
         */
         int n = nums.length;
        //  for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]==nums[j]) return true;
        //     }
        //  }
        //  return false;
         /*
 * TIME COMPLEXITY:
 * O(n²)
 *
 * Two nested loops.
 *
 * SPACE COMPLEXITY:
 * O(1)
 *
 * No extra data structure used.
 */


/*
         * IDEA:
         * Sort the array.
         * Duplicate elements will become adjacent.
         * Check neighboring elements.
         */
        // Arrays.sort(nums);

        // for (int i = 1; i < nums.length; i++) {

        //     if (nums[i] == nums[i - 1]) {
        //         return true;
        //     }
        // }

        // return false;
        /*
 * TIME COMPLEXITY:
 * O(n log n)
 *
 * Sorting dominates the complexity.
 *
 * SPACE COMPLEXITY:
 * O(1)
 * (Ignoring sorting implementation space)
 */

  /*
         * IDEA:
         * Store visited elements in a HashSet.
         *
         * If current element already exists in the set,
         * duplicate found.
         */
         HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;

    }
}