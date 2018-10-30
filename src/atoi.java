class atoi {
    public int myAtoi(String str) {
        if(str.length() == 0){
            return 0;
        }
        String[] arr = str.split("");
        String result = "";
        int flag = 0;
        int sign = 0;
        for(int i = 0; i < arr.length; i++){
            if(!arr[i].equals(" ") && !((int)(arr[i].charAt(0)) >= 48 && (int)(arr[i].charAt(0)) <= 57) && !((int)(arr[i].charAt(0)) == 43 || (int)(arr[i].charAt(0)) == 45) && (flag == 0)){
                return 0;
            }
            if((int)(arr[i].charAt(0)) >= 48 && (int)(arr[i].charAt(0)) <= 57){
                result = result + arr[i];
                flag = 1;
            }else if(((int)(arr[i].charAt(0)) == 43 || (int)(arr[i].charAt(0)) == 45) && (flag == 0) && flag != 1){
                if(sign == 1){
                    break;
                }
                result = result + arr[i];
                sign = 1;
            }
            else if((flag == 1) && (arr[i].equals(" ") || !((int)(arr[i].charAt(0)) >= 48 && (int)(arr[i].charAt(0)) <= 57) || ((int)(arr[i].charAt(0)) == 43 || (int)(arr[i].charAt(0)) == 45))){
                break;
            }
            if(sign == 1 && (arr[i].equals(" ") && !((int)(arr[i].charAt(0)) >= 48 && (int)(arr[i].charAt(0)) <= 57))){
                System.out.println("HEREEEE");
                return 0;
            }
        }
        if(result.equals("") || result.equals("+") || result.equals("-")){

            return 0;
        }
        if(result.length() > 18 && result.charAt(0) != '0'){
            if(result.charAt(0) == '-' && result.charAt(1) != '0')
                return -2147483648;
            else if(result.charAt(0) != '-')
                return 2147483647;
        }
        long res = Long.parseLong(result);
        if(res > 2147483647){
            return 2147483647;
        }else if(res < -2147483648){
            return -2147483648;
        }else{
            return (int) res;
        }
    }
}