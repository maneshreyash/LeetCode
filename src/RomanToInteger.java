import java.util.Scanner;

class RomanToInteger {

    public static int romanToInt(String s) {
        int value = 0;
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) == 'I'){
                if(s.charAt(i + 1) == 'V')
                    value = value - 1;
                else if(s.charAt(i + 1) == 'X')
                    value = value - 1;
                else
                    value = value + 1;
            }
            if(s.charAt(i) == 'V'){
                value = value + 5;
            }
            if(s.charAt(i) == 'X'){
                if(s.charAt(i + 1) == 'L')
                    value = value - 10;
                else if(s.charAt(i + 1) == 'C')
                    value = value - 10;
                else
                    value = value + 10;
            }
            if(s.charAt(i) == 'L'){
                value = value + 50;
            }
            if(s.charAt(i) == 'C'){
                if(s.charAt(i + 1) == 'D')
                    value = value - 100;
                else if(s.charAt(i + 1) == 'M')
                    value = value - 100;
                else
                    value = value + 100;
            }
            if(s.charAt(i) == 'D'){
                value = value + 500;
            }
            if(s.charAt(i) == 'M'){
                value = value + 1000;
            }
        }
        for(int i = s.length()-1; i < s.length(); i++){
            if(s.charAt(i) == 'I'){
                value = value + 1;
            }
            if(s.charAt(i) == 'V'){
                value = value + 5;
            }
            if(s.charAt(i) == 'X'){
                value = value + 10;
            }
            if(s.charAt(i) == 'L'){
                value = value + 50;
            }
            if(s.charAt(i) == 'C'){
                value = value + 100;
            }
            if(s.charAt(i) == 'D'){
                value = value + 500;
            }
            if(s.charAt(i) == 'M'){
                value = value + 1000;
            }
        }
        return value;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int x = romanToInt(s);
        System.out.println(x);
    }
}
