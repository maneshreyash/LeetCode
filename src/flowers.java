import java.util.HashMap;

public class flowers{


    public static void main(String []args){
        HashMap<Integer,Integer> map = new HashMap<>();
        //int arr[] = {1,2,1,3,4,3,5,1,2};
        int arr[] = {};
        int first = 0;
        int second = 0;
        int uniqueCount = 0;
        int ans = 0;


        while(second < arr.length)
        {
            if(!map.containsKey(arr[second]))
            {
                map.put(arr[second],1);
                uniqueCount++;
            }
            else
            {
                map.put(arr[second],map.get(arr[second])+1);
                second++;
            }

            while(uniqueCount > 2)
            {
                map.put(arr[first], map.get(arr[first]) - 1);
                if(map.get(arr[first]) == 0)
                {
                    uniqueCount--;
                }
                first++;
            }

            ans = Math.max(ans, second-first);

        }
        System.out.println(ans);
    }
}