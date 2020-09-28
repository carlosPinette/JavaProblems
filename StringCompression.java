public class StringCompression {
    public static void main(String[] args){
        String s = "aaaabbbc";
        String com = compression(s);
        System.out.println(decompress(com));

    }

    public static String compression(String s){
        StringBuilder sb = new StringBuilder();
        int anchor = 0;
        for(int i = 0; i < s.length(); i++){
            if(i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)){
                sb.append(s.charAt(i));
                int val = i - anchor + 1;
                sb.append(val);
                anchor = i + 1;
            }
        }
        return s.length() < sb.length() ? s : sb.toString();
    }

    public static String decompress(String s){
        StringBuilder sb = new StringBuilder();
        int qty = 0;
        int pow = 0;
        char prev = s.charAt(0);
        for(int i = 1; i <= s.length(); i++){
            if(i == s.length() || Character.isLetter(s.charAt(i))){
                for(int j = 0; j < qty; j++){
                    sb.append(prev);
                }
                qty = 0;
                pow = 0;
                if(i < s.length())
                    prev = s.charAt(i);
            }else{
                qty = (int) (qty * Math.pow(10, pow++)) + s.charAt(i) - '0';
            }
        }
        return sb.toString();
    }
}
