class ConvertDecimalToBinary {
    public static void main(String[] args) {
        convertDecimalToBinary(5);
    }
    public static void convertDecimalToBinary(int decimal) {
    int result = 0;
    int power = 0;
    while (decimal>0) {
        int remainder = decimal%2;
        result += remainder * Math.pow(10, power);
        decimal /= 2;
        power++;
        
    }
    System.out.println("Binary representation: " + result);
}
}

