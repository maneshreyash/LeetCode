/*Given two binary strings, return their sum (also a binary string).

        The input strings are both non-empty and contains only characters 1 or 0.

        Example 1:

        Input: a = "11", b = "1"
        Output: "100"
        Example 2:

        Input: a = "1010", b = "1011"
        Output: "10101"*//*





public class AddBinary {

    public static String addBinary(String a, String b) {
        //int ainp = toInt(a);
        String[] ain = a.split("");
        String[] bin = b.split("");
        int i = ain.length,j = bin.length;
        long sum = 0;
        long carry = 0;
        int index = Math. max(ain.length);
        while(i < x.len && j < y.len)
        {
            sum = x.arr[i] + y.arr[j] + carry;
            result[index] = sum % x.base();
            index++;
            carry = sum / x.base();
            i++;
            j++;
        }

        while(i < x.len)
        {
            sum = x.arr[i] + carry;
            result[index] = sum % x.base();
            index++;
            carry = sum / x.base();
            i++;
        }

        while(j < y.len)
        {
            sum =  y.arr[j] + carry;
            result[index] = sum % x.base;
            index++;
            carry = sum / x.base;
            j++;
        }

        if(carry > 0)
        {
            result[index] = carry;
            index++;
        }
        return result;
        return null;
    }

    public static void main(String args[]){
        System.out.println(addBinary("11", "10"));
    }
}
*/
