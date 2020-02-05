public class Runner{
    //your main containing tests and output
        public static void main(String[] args) {
        }
        //your codingbat method here - must match
        // the method name from codingbat
        public static String helloName(String name) {
            return "hi " + name;
        }   // next codingbat method here









    public int diff21(int n) {
        if ( n <= 21){
            return 21 - n;
        }else{
            return (n - 21) * 2;
        }
    }
    public boolean arrayFront9(int[] nums) {
        int close = nums.length;
        if ( close > 4) close = 4;

        for (int i=0; i<close; i++) {
            if(nums[i] == 9) return true;
        }
        return false;
    }

    public boolean has23(int[] nums) {
        for(int i=0; i < nums.length; i++){
            if(nums[i] == 2 || nums[i] == 3){
                return true;
            }
        }return false;
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if(a > b && b > c){
            return false;
        }
        if( a < b && b < c){
            return true;
        }
        if(c > b && bOk == true){
            return true;
        }
        return false;
    }
    public boolean evenlySpaced(int a, int b, int c) {
        if ( a - b == b - c){
            return true;
        }
        if(a - c == b - a){
            return true;
        }
        if(a - c == c - b){
            return true;
        }
        return false;
    }

    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-1; i++){
            if(str.substring(i, i+2).equals("hi")){
                count++;
            }
        }
        return count;
    }

    public String firstTwo(String str) {
        if(str.length() >= 3){
            return str.substring (0,2);
        }return str;
    }

    public String getSandwich(String str) {
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");
        if(first != -1 && last != -1 && first != last) {
            return str.substring(first + 5, last);
        }
        return "";
    }

}

