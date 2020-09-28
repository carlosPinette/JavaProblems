public class IntegerToEnglish {

    public static void main(String[] args){
        int n = 1098412980;
        System.out.println(intToEng(n));
    }

    public static String[] TENS = {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    public static String[] SMALL = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

    public static String intToEng(int n){
        if(n == 0)
            return "Zero";
        return helper(n);
    }

    public static String helper(int n){
        StringBuilder sb = new StringBuilder();
        if(n >= 1000000000)
            sb.append(helper(n/1000000000)).append(" Billion ").append(helper(n%1000000000));
        else if(n >= 1000000)
            sb.append(helper(n/1000000)).append(" Million ").append(helper(n%1000000));
        else if(n >= 1000)
            sb.append(helper(n/1000)).append( " Thousand ").append(helper(n%1000));
        else if(n >= 100)
            sb.append(helper(n/100)).append(" Hundred ").append(helper(n%100));
        else if(n >= 20)
            sb.append(TENS[(n - 20) / 10]).append(" ").append(helper(n%10));
        else
            sb.append(SMALL[n]);
        return sb.toString().trim();
    }
    
}
