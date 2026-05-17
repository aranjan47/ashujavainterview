package java12;

import java.text.NumberFormat;
import java.util.Locale;
// Compact Number Formatting (Locale-dependent)
public class CompactNumberFormatExample {
    public static void main(String[] args) {
        NumberFormat shortFormat = NumberFormat.getCompactNumberInstance(
            Locale.US, NumberFormat.Style.SHORT);
        shortFormat.setMaximumFractionDigits(1);

        System.out.println(shortFormat.format(1000));    // 1K
        System.out.println(shortFormat.format(2500000)); // 2.5M
    }
}
