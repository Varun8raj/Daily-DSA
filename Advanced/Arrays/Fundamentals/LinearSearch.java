/* Approach : We just search for an element in a linear fashion, and we return the index once we find an element, if the traget is not found then we return -1.*/
// Time Complexity = O(n)
// Space Complexity = O(1) 

package Advanced.Arrays.Fundamentals;

class Solution {
    public int linearSearch(int nums[], int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
        }
        return -1;
    }
}
