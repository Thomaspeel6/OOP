package Excerices;


public class MeanValue {
    public static double meanValue(double[] data) {
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum / data.length;
    }
  
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Usage: java MeanValue <number1> <number2> ... <numberN>");
            System.exit(1);
        }
        double[] data = new double[args.length];
        for (int i = 0; i < args.length; i++) {
            data[i] = Double.parseDouble(args[i]);
        }
        System.out.println(meanValue(data));
    
    }
}