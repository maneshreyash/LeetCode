/*
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

        Example 1:

        Input: 121
        Output: true
        Example 2:

        Input: -121
        Output: false
        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
        Example 3:

        Input: 10
        Output: false
        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
*/



public class PalindromeInt {

    public boolean isPalindrome(int x) {
        //boolean flag = false;
        if(x < 0)
            return false;
        String temp = new String(Integer.toString(x));
        String half1 = "";
        String half2 = "";
        if(temp.length() % 2 != 0){
            half1 = temp.substring(0, temp.length()/2 + 1);
            half2 = temp.substring(temp.length()/2, temp.length());
        }else{
            half1 = temp.substring(0, temp.length()/2);
            half2 = temp.substring(temp.length()/2, temp.length());
        }
        StringBuffer rev = new StringBuffer(half2);
        rev.reverse();
        half2 = rev.toString();
        if(half1.equals(half2))
            return true;
        else
            return false;

    }

}
