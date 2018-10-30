public class mystery {

    public static void main(String[] args) {
        int x = 2437, y = 875;
        while(x != y){
            if(x > y)
                x = x - y;
            else if(y > x)
                y = y - x;
        }
        System.out.println(x);
    }

}
