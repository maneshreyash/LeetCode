/*Write a function to find the longest common prefix string amongst an array of strings.

        If there is no common prefix, return an empty string "".

        Example 1:

        Input: ["flower","flow","flight"]
        Output: "fl"
        Example 2:

        Input: ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.*/


public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        int min = Integer.MAX_VALUE;
        int index = 0;
        for(int i = 0; i < strs.length; i++) {
            if (strs[i].length() < min) {
                min = strs[i].length();
                index = i;
            }
        }
        String result = strs[index];
        int flag = 1;

        for(int i = 0; i < strs.length; i++){
            int count = 0;
            for(int j = result.length()-1; j >= 0; j--){
                if(strs[index].charAt(j) != strs[i].charAt(j)){
                    if(flag == 0){
                        result = result.substring(0, result.length() - 1 - count);
                        flag = 1;
                    }else
                        result = result.substring(0, result.length() - 1);
                }else {
                    flag = 0;
                    count++;
                }
            }
        }
        return result;
    }


    public static void main(String args[]){
        String[] arr = {"dog","racecar","car"};
        String result = longestCommonPrefix(arr);
        System.out.println(result);
    }

}
