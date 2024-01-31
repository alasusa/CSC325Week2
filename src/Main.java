
public class Main {
    public static int getSum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(getSum(5,3));
        System.out.println(isEight(getSum(5,3)));
        System.out.println(isEight(getSum(6,3)));
    }

    public static boolean isEight(int num){
        return num ==8;
    }



}