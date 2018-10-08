/*
Given a 32-bit signed integer, reverse digits of an integer.

        Example 1:

        Input: 123
        Output: 321
        Example 2:

        Input: -123
        Output: -321
        Example 3:

        Input: 120
        Output: 21
        Note:
        Assume we are dealing with an environment which could only store integers
         within the 32-bit signed integer range: [−231,  231 − 1].
         For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
*/

public class ReverseInteger {

    public int reverse(int x) {
        if(x > Integer.MAX_VALUE)
            return 0;
        int flag = 0;
        if(x < 0){
            flag = -1;
            x *= -1;
        }
        StringBuffer buff = new StringBuffer(Integer.toString(x));
        buff.reverse();
        String temp = buff.toString();
        try{
            x = Integer.parseInt(temp);
        } catch (NumberFormatException e){
            return 0;
        }


        if(flag == -1)
            return x * -1;
        return x;
    }

}
