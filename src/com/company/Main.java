package com.company;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Main {
    public static void main(String... args) throws Exception {
        final String s = "text in utf8";
        byte[] authBytes = s.getBytes(StandardCharsets.UTF_8);
        final String encoded = Base64.getEncoder().encodeToString(authBytes);

        System.out.println(s + " => " + encoded);
           authBytes = encoded.getBytes();
        byte[] valueDecoded= Base64.getDecoder().decode(authBytes);
        System.out.println(encoded + " => "+ new String(valueDecoded, StandardCharsets.UTF_8));
    }
}
