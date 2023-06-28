package util;

public class Converter {
    private static final double IOF = 0.06;
    public static double CurrencyConverter(double dollarPrice, double dollarBought){
        double dollarBoughtNotIOF = dollarPrice * dollarBought;
        return  dollarBoughtNotIOF + (dollarBoughtNotIOF * IOF);
    }

}
