import java.util.Scanner;

public class LastDigitOfLargeNumbers {
    static int getLastDigit(String a, String b) {
        // code here
        if(b.equals("0")) return 1;
        int base = getLastDigitOfBase(a);
        int exponent = getExponentValue(b);
        int powerValue = getFinalValue(base, exponent);
        return powerValue%10;
    }

    static int getLastDigitOfBase(String a) {
        return a.charAt(a.length() - 1) - '0';
    }
    static int getExponentValue(String b) {
        int exp = 0;
        for(int i = 0; i < b.length(); i++) {
            exp = (exp*10 + (b.charAt(i) - '0')) % 4;
        }
        return exp == 0 ? 4 : exp;
    }
    static int getFinalValue(int base, int exponent) {
        return (int)Math.pow(base, exponent);
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base value:");
        String a = input.nextLine();
        System.out.println("Enter exponential value:");
        String b = input.nextLine();
        System.out.println(getLastDigit(a,b));    }
}


