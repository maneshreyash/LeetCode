import java.util.HashSet;

class valid_email {
    static public int numUniqueEmails(String[] emails) {
        HashSet<String> map = new HashSet<String>();
        for(int i = 0; i < emails.length; i++){
            String[] str = emails[i].split("@");
            String[] local = str[0].split(".");
            String locfin = "";
            for(int j = 0; j < local.length; j++){
                if(local[j] == "+"){
                    break;
                }else{
                    locfin += local[j];
                }
            }
            String ema = locfin + str[1];
            map.add(ema);
        }
        return map.size();
    }

    public static void main(String[] args) {
        System.out.println(numUniqueEmails(args));
    }
}