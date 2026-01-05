package logicBuildingUsingJava;
public class Day1 {
    //Number Reverse
    public static void main(String[] args) {
        Day1 ob = new Day1();
        System.out.println(ob.reverseNumber(456));
    }
    public int reverseNumber(int num){
        int reverse=0;
        int temp=0;
        while(num > 0){
            temp=num%10;
            reverse=(reverse*10)+temp;
            num=num/10;
       }
        return reverse;
    }
}
