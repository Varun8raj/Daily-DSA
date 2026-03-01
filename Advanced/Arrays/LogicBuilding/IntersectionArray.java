/* Approach : The solution for this problem is using 2 pointers. The first pointer tracks all the elements from the first array and the second pointer tracks all the elements from the second array. Then we just have to traverse simultaneously and add the common elements and if they are not common we just ignore and continue traversing. But when the elements are not common we just need to increase the pointer of the array of the smaller element.*/
// Time Complexity = O(m+n)
// Space Complexity = O(min(m+n))

package Advanced.Arrays.LogicBuilding;

import java.util.List;
import java.util.ArrayList;;

class Solution {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        List<Integer> nums3 = new ArrayList<>();
        int i, j;
        i = 0;
        j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                while (i < nums1.length - 1 && nums1[i] == nums1[i + 1])
                    i++;
                i++;
            } else if (nums1[i] > nums2[j]) {
                while (j < nums2.length - 1 && nums2[j] == nums2[j + 1])
                    j++;
                j++;
            } else {
                nums3.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] intersection = new int[nums3.size()];
        for (int k = 0; k < nums3.size(); k++) {
            intersection[k] = nums3.get(k);
        }
        return intersection;
    }
}