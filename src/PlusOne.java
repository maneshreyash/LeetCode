/*Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list,
and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

    Example 1:
    Input: [1,2,3]
    Output: [1,2,4]
    Explanation: The array represents the integer 123.

    Example 2:
    Input: [4,3,2,1]
    Output: [4,3,2,2]

Explanation: The array represents the integer 4321.*/



public class PlusOne {
    public static int[] plusOne(int[] digits) {
        if(digits.length == 0){
            int[] emparr = new int[1];
            emparr[0] = 1;
            return emparr;
        }
        if(digits[digits.length - 1] < 9){
            digits[digits.length - 1] += 1;
            return digits;
        }else if(digits[digits.length - 1] == 9){
            int i = digits.length - 1;
            int[] result = new int[digits.length];
            int sum;
            int index = i;
            int carry = 1;
            while(i >= 0)
            {
                sum = digits[i] + carry;
                result[index] = sum % 10;
                index--;
                carry = sum / 10;
                i--;
            }
            if(carry == 1){
                int[] rescarr = new int[result.length + 1];
                i = result.length - 1;
                for(int j = rescarr.length - 1; j > 0 ; j--) {
                    rescarr[j] = result[i];
                    i--;
                }
                rescarr[0] = 1;
                return rescarr;
            }
            return result;
        }
        return null;
    }

    public static void main(String args[]){
        int[] inp = {};
        int[] out = plusOne(inp);
        for(int i = 0; i < out.length; i++){
            System.out.print(out[i]);
        }
    }
}
