public class RotateString {
    public static void main(String[] args){
        String a = "baaca";
        String b = "caba";
        System.out.println(rotateString(a, b));
    }

    public static boolean rotateString(String a, String b){
        if(a.length() != b.length())
            return false;
        String rotation = a + a;
        return rotation.indexOf(b) != -1;
    }
}
