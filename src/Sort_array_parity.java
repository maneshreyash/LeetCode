/*Given an array A of non-negative integers, return an array consisting of all the even elements of A,
 followed by all the odd elements of A.

You may return any answer array that satisfies this condition.



Example 1:

Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.



Note:

    1 <= A.length <= 5000
    0 <= A[i] <= 5000

*/


import java.util.ArrayList;
import java.util.List;

public class Sort_array_parity {

    static public int[] sortArrayByParity(int[] A) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for(int i: A){
            if(i % 2 == 0){
                even.add(i);
            }else{
                odd.add(i);
            }
        }
        for(int k: odd){
            even.add(k);
        }
        int[] result = new int[even.size()];
        for(int q = 0; q < result.length; q++){
            result[q] = even.get(q);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {1,1,2,6,4,2};
        System.out.println(sortArrayByParity(input));
    }

}
