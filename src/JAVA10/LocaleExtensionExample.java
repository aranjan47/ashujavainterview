package JAVA10;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleExtensionExample {
    public static void main(String[] args) {
        // Create a locale with Thai numbering system
        Locale locale = Locale.forLanguageTag("en-US-u-nu-thai");

        // Format a number using this locale
        NumberFormat nf = NumberFormat.getInstance(locale);
        System.out.println(nf.format(123456789));
    }
}


//✅ Summary
//Unicode    Extension	     Description	Example
//nu	      Number system	       en-US-u-nu-thai
//ca	      Calendar type	        ja-JP-u-ca-japanese
//hc	      Hour cycle (12/24 hr)	   en-US-u-hc-h23