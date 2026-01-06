public class Day2 {
    //reverse a string using Two Pointer technique
    public static void main(String[] args) {
        Day2 ob = new Day2();
        char[] str = { 'h', 'e', 'l', 'l', 'o' };
        ob.reverseString(str);
    }

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        System.out.println(s);
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        System.out.println(s);
    }
}