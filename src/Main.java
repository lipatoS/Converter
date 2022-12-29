public class Main {

    public static void main(String[] args) {
        System.out.println("Converter for base converting");
        System.out.println("Version 1.1");
        double miles = 15;
        double kms = 26;
        double kmsRes = convertMilesToKms(miles);
        System.out.println(kmsRes + " kms in " + miles + " miles.");
    }
    private static double convertMilesToKms(double miles) {
        return miles * 1.60934;
    }
}