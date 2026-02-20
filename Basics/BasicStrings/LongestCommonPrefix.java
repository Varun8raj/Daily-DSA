/* Approach : We can solve this problem first by getting the shortest string of all strings of an array, then we can compare each character of the shortest string to each character of remaining strings to get the largest prefix.*/
// Time Complexity = O(n * m) (m is the size of the shortest string)
// Space Complexity = O(m) (if we consider returning a string of size equal to short string as extra space)

package Basics.BasicStrings;

class Solution {
    public String longestCommonPrefix(String[] str) {
        String shortstr = str[0];
        boolean flag = true;
        int count = 0;
        for (int i = 1; i < str.length; i++) {
            if (str[i].length() < shortstr.length())
                shortstr = str[i];
        }
        for (int i = 0; i < shortstr.length(); i++) {
            for (int j = 0; j < str.length; j++) {
                if (shortstr.charAt(i) != str[j].charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if (flag == false) {
                if (count == 0)
                    return "";
                else
                    return shortstr.substring(0, count);
            }
            if (flag == true)
                count++;
        }
        return shortstr;
    }
}
