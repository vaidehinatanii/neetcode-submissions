class Solution {
    public boolean isAnagram(String s, String t) {
        //  if (s.length() != t.length()) {
        //     return false;
        // }

        // char[] arr1 = s.toCharArray();
        // char[] arr2 = t.toCharArray();

        // Arrays.sort(arr1);
        // Arrays.sort(arr2);

        // return Arrays.equals(arr1, arr2);
 /*
         * IDEA:
         * If two strings are anagrams,
         * their sorted versions will be identical.
         *//*
 * TIME COMPLEXITY:
 * O(n log n)
 *
 * Sorting both strings dominates.
 *
 * SPACE COMPLEXITY:
 * O(n)
 *
 * Character arrays are created.
 */


  /*
         * IDEA:
         * Count frequency of each character in s.
         * Remove frequencies using t.
         * If all counts become zero, strings are anagrams.
         */
         /*
 * TIME COMPLEXITY:
 * O(n)
 *
 * SPACE COMPLEXITY:
 * O(n)
 */
 if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {

            if (!map.containsKey(c)) {
                return false;
            }

            map.put(c, map.get(c) - 1);

            if (map.get(c) == 0) {
                map.remove(c);
            }
        }

        return map.isEmpty();
    }
}
