/*
* You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3

Example 2:

Input: J = "z", S = "ZZ"
Output: 0

Note:

    S and J will consist of letters and have length at most 50.
    The characters in J are distinct.


*
*
* */






import java.util.HashSet;

class Jewels_Stones {
    static public int numJewelsInStones(String J, String S) {
        int count = 0;
        String[] jew = J.split("");
        String[] sto = S.split("");
        if(S.length() == 0 || J.length() == 0){
            return count;
        }
        HashSet<String> map = new HashSet<>();
        for(String j: jew){
            map.add(j);
        }
        for(String s: sto){
            if(map.contains(s)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }
}