/*In a row of trees, the i-th tree produces fruit with type tree[i].

You start at any tree of your choice, then repeatedly perform the following steps:

    Add one piece of fruit from this tree to your baskets.  If you cannot, stop.
    Move to the next tree to the right of the current tree.  If there is no tree to the right, stop.

Note that you do not have any choice after the initial choice of starting tree: you must perform step 1, then step 2, then back to step 1, then step 2, and so on until you stop.

You have two baskets, and each basket can carry any quantity of fruit, but you want each basket to only carry one type of fruit each.

What is the total amount of fruit you can collect with this procedure?



Example 1:

Input: [1,2,1]
Output: 3
Explanation: We can collect [1,2,1].

Example 2:

Input: [0,1,2,2]
Output: 3
Explanation: We can collect [1,2,2].
If we started at the first tree, we would only collect [0, 1].

Example 3:

Input: [1,2,3,2,2]
Output: 4
Explanation: We can collect [2,3,2,2].
If we started at the first tree, we would only collect [1, 2].

Example 4:

Input: [3,3,3,1,2,1,1,2,3,3,4]
Output: 5
Explanation: We can collect [1,2,1,1,2].
If we started at the first tree or the eighth tree, we would only collect 4 fruits.



Note:

    1 <= tree.length <= 40000
    0 <= tree[i] < tree.length

d*/

class fruit_basket {
    public static int totalFruit(int[] tree) {
        if(tree == null || tree.length == 0){
            return 0;
        }
        int type1 = tree[0], type2 = tree[0];
        int type1count = 1, type2count = 1;
        int result = 1;
        for(int i = 1; i < tree.length; i++) {
            if(tree[i] != type1) {
                if(tree[i] == type2) {
                    type2count++;
                } else {
                    type2count = type1count + 1;
                }
                type2 = type1;
                type1count = 1;
                type1 = tree[i];
            } else {
                type1count++;
                type2count++;
            }
            if(type2count > result)
                result = type2count;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] tree = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        System.out.println(totalFruit(tree));
    }
}