/* Approach : We can approach this problem by using 2 pointers where one pointer points to the last element of the first array and second pointer points to the first element of the second array, then we just swap the elements if the first pointer ele is greater than second pointer ele, we do this until a break point, now we 2 unsorted arrays but the 2nd array has all the elements greated than 1st array. So we just sort the individual arrays. */
// Time Complexity = O(min(n,m)) + O(nlogm) + O(mlogn)
// Space Complexity = O(1)

package Advanced.Arrays.FAQS_Hard;

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m - 1;
        int right = 0;
        while (left >= 0 && right < n) {
            if (nums1[left] > nums2[right]) {
                int temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = temp;
                left--;
                right++;
            } else
                break;
        }
        Arrays.sort(nums1, 0, m);
        Arrays.sort(nums2);
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i - m];
        }
    }
}