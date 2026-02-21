/* Approach : The approach is pretty simple just to make recursive calls with a base condition as n==0, else return the product of itself and next smaller number to get the factorial.*/
// Time Complexity = O(n)
// Space Complexity = O(n) 

package Basics.BasicRecursion;

class Solution {
    public long factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }
}