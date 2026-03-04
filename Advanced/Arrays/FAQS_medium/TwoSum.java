/* Approach : The approach for this problem is to first the array elements using custom comparator along with their index. And then we just need to use the 2 pointer approach to find the elements indexes that sum upto the target.*/
// Time Complexity = O(nlogn)
// Space Complexity = O(n)

package Advanced.Arrays.FAQS_medium;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        int[][] eleindex = new int[n][2];
        for (int i = 0; i < nums.length; i++) {
            eleindex[i][0] = nums[i];
            eleindex[i][1] = i;
        }

        Arrays.sort(eleindex, new Comparator<int[]>() {
            public int compare(int a[], int b[]) {
                return Integer.compare(a[0], b[0]);
            }
        });

        int left = 0, right = n - 1, sum;
        while (left < right) {
            sum = eleindex[left][0] + eleindex[right][0];
            if (sum == target) {
                ans[0] = eleindex[left][1];
                ans[1] = eleindex[right][1];
                return ans;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] { -1, -1 };
    }
}
