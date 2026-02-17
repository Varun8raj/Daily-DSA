/* Approach : We can use the Euclidean Algorithm to solve this problem, since GCD(a,b) = GCD(a-b,b) if a>b. By this we can drastically improve the time complexity of the problem from brute force approach to optimal approach.*/
// Time Complexity = O(log(min(m1,m2)))
// Space Complexity = O(1)

package Basics.BasicMaths;

class Solution {
    public int GCD(int n1, int n2) {
        int num1 = n1;
        int num2 = n2;
        while (num1 > 0 && num2 > 0) {
            if (num1 > num2)
                num1 = num1 % num2;
            else
                num2 = num2 % num1;
        }
        if (num1 == 0)
            return num2;
        return num1;
    }
}