package JAVA10;

import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OldJavaSSLExample {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://example.com");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        reader.lines().forEach(System.out::println);
    }
}


//Exception in thread "main" javax.net.ssl.SSLHandshakeException: 
  //  PKIX path building failed: 
   // sun.security.provider.certpath.SunCertPathBuilderException: 
   // unable to find valid certification path to requested target
