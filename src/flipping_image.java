/*For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].

To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].

Example 1:

Input: [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]

Example 2:

Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]

Notes:

    1 <= A.length = A[0].length <= 20
    0 <= A[i][j] <= 1
*/


public class flipping_image {
    static private int[][] flipAndInvertImage(int[][] A) {
        int i, k, temp = 0;
        for(int m = 0; m < A.length; m++){
            i = 0;
            k = A[m].length - 1;
            while(/*i != k && */i < k){
                //System.out.println("i: " + i + "\nk: " + k);
                temp = A[m][i];
                A[m][i] = A[m][k];
                A[m][k] = temp;
                i++;
                k--;
            }
        }
        for(int x = 0; x < A.length; x++){
            for(int y = 0; y < A[0].length; y++){
                if(A[x][y] == 0){
                    A[x][y] = 1;
                }else{
                    A[x][y] = 0;
                }
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[][] A = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        System.out.println(flipAndInvertImage(A));
    }
}
