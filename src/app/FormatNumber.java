package app;

import java.text.NumberFormat;

public class FormatNumber {
    public static void main(String[] args) {
        String resultString = NumberFormat.getPercentInstance().format(0.74);
        System.out.println(resultString);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1266589.2354);
        System.out.println(result);

    }
}