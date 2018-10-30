public class ilikecheese {
    public static void main(String[] args) {
        String s1 = "I am using HackerRank to improve programming";

        String s2 = "am HackerRank to improve";
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");
        String[] res = new String[str1.length];
        int i = 0, j = 0, k = 0;
        while(i < str1.length && j < str2.length){
            if (str1[i].equals(str2[j])){
                i++;
                j++;
                continue;
            }else{
                res[k] = str1[i];
                k++;
                i++;
            }
        }
        while(i < str1.length){
            res[k] = str1[i];
            i++;
            k++;
        }
        for(int z = 0; z < res.length; z++){
            if(res[z] != null)
                System.out.print(res[z] + " ");
        }
    }
}
