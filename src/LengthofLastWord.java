/*Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

        If the last word does not exist, return 0.

        Note: A word is defined as a character sequence consists of non-space characters only.

        Example:

        Input: "Hello World"
        Output: 5*/



public class LengthofLastWord {

    public static int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        if(arr.length == 0)
            return 0;
        return arr[arr.length-1].length();
    }

    public static void main(String args[]){
        System.out.println(lengthOfLastWord(" "));
    }

}
