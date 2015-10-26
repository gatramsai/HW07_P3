public class Main {
    static double power = 0;
    static int sum = 0;
    public static void main(String[] args) {
        System.out.println(bin2Dec("101010101010"));
    }

    public static int bin2Dec(String binaryString)
    {
        if(binaryString.length() == 0) {
            return sum;
        }
        int length = binaryString.length();
        int num = Character.getNumericValue(binaryString.charAt(length-1));
        sum += (num*Math.pow(2.0,power));
        power++;
        bin2Dec(binaryString.substring(0, length - 1));
        return sum;
    }
}
