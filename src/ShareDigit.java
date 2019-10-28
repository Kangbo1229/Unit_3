public class ShareDigit {
    public static boolean digits(int x, int y) {
        if(x/10 == y/10) {
            return true;
        }
        if(x/10 == y%10) {
            return true;
        }
        if(x%10 == y%10) {
            return true;
        }
        if(x%10 ==y/10) {
            return true;
        }
        else {
            return false;
        }

    }
    public static void main(String[] args) {
        System.out.println(digits(12, 23));
        System.out.println(digits(12, 43));
        System.out.println(digits(12, 44));
    }

}
