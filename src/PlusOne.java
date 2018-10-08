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
        String input = "";
        for(int i = 0; i < digits.length; i++){
            input = Integer.toString(digits[i]);
        }
        //int inputnum = Integer.parseInt(input);
        //int output = inputnum + 1;
        String[] outputstr = input.split(Integer.toString(Integer.parseInt(input) + 1));
        for(int i = 0; i < outputstr.length; i++){
            System.out.print(outputstr[1] + " ");
        }
        System.out.println(outputstr);
        /*int[] digitsans = new int[Integer.toString(output).length()];

        for(int i = digitsans.length - 1; i >= 0; i--) {
            digitsans[i] = output % 10;
            output = output / 10;
        }*/
        return digits;
    }

    public static void main(String args[]){
        int[] inp = {4, 3, 2, 1};
        int[] out = plusOne(inp);
        for(int i = 0; i < inp.length; i++){
            System.out.print(out[i]);
        }
    }
}
