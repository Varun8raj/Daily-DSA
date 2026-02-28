/* Approach : The solution for this problem is using 2 pointers. The first pointer tracks all the elements from the first array and the second pointer tracks all the elements from the second array. Then we just have to traverse simultaneously and just adding the smaller number between the two elements of two arrays to the resultant array if the number is not already present*/
// Time Complexity = O(m+n)
// Space Complexity = O(m+n)

package Advanced.Arrays.LogicBuilding;

import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        List<Integer> nums3 = new ArrayList<>();
        int i, j;
        i = 0;
        j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                nums3.add(nums1[i]);
                while (i < nums1.length - 1 && nums1[i] == nums1[i + 1])
                    i++;
                i++;
            } else if (nums1[i] > nums2[j]) {
                nums3.add(nums2[j]);
                while (j < nums2.length - 1 && nums2[j] == nums2[j + 1])
                    j++;
                j++;
            } else {
                nums3.add(nums2[j]);
                while (i < nums1.length - 1 && nums1[i] == nums1[i + 1])
                    i++;
                while (j < nums2.length - 1 && nums2[j] == nums2[j + 1])
                    j++;
                i++;
                j++;
            }
        }
        while (i < nums1.length) {
            if (nums3.isEmpty() || nums3.get(nums3.size() - 1) != nums1[i])
                nums3.add(nums1[i]);
            i++;
        }
        while (j < nums2.length) {
            if (nums3.isEmpty() || nums3.get(nums3.size() - 1) != nums2[j])
                nums3.add(nums2[j]);
            j++;
        }
        int[] union = new int[nums3.size()];
        for (int k = 0; k < nums3.size(); k++) {
            union[k] = nums3.get(k);
        }
        return union;
    }
}