/*The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.

Example:

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.
*/


import java.util.ArrayList;
import java.util.List;

public class hamming_distance {
     static public int hammingDistance(int x, int y) {
        List<Integer> xb = new ArrayList<>();
        List<Integer> yb = new ArrayList<>();
        int xi = 0;
        while(x != 0){
            xb.add(x % 2);
            x = x / 2;
            xi++;
        }
        int yi = 0;
        while(y != 0){
            yb.add(y % 2);
            y = y / 2;
            yi++;
        }
        if(xb.size() > yb.size()){
            while(yi != xi){
                yb.add(0);
                yi++;
            }
        }
        if(yb.size() > xb.size()){
            while(xi != yi){
                xb.add(0);
                xi++;
            }
        }
        System.out.println(xb);
        System.out.println(yb);
        int count = 0;
        for(int i = 0; i < xb.size(); i++){
            if(xb.get(i) != yb.get(i)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(4 , 2));
    }
}
