public class ConvertBinaryToDecimal {
    public static void main(String[] args) {
        convertBinaryToDecimal(101);
    }

    public static void convertBinaryToDecimal(int binaryNumber) {
        int decimal = 0;
        int power =0;
        while (binaryNumber>0) {
            int lastDigit = binaryNumber%10;
            decimal += lastDigit * Math.pow(2, power);
            binaryNumber /= 10;
            power++;
        }

        System.out.println("Decimal representation: " + decimal);
    }
    
}
