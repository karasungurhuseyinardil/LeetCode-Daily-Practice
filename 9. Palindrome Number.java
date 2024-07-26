import java.util.*;
class Solution {
    public static boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        int rev=0;
        int temp=x;
        while (x!=0){
            int ld=x%10;
            rev = rev * 10+ld;
            x=x/10;
        }
        if (temp==rev){
            return true;
        }

        return false;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        System.out.println(isPalindrome(x));
    }
}
