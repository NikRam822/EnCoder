import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Decoder {
    public static void main(String[] args) {

         String utf8 = "text in utf8";

        System.out.println(utf8 + " - from utf8 to base64 > " + Base64.getEncoder().encodeToString(utf8.getBytes(StandardCharsets.UTF_8)));

        System.out.println(Base64.getEncoder().encodeToString(utf8.getBytes(StandardCharsets.UTF_8)) + " - from base64  to utf8 >  "+
        new  String(Base64.getDecoder().decode(Base64.getEncoder().encodeToString(utf8.getBytes(StandardCharsets.UTF_8)).getBytes()), StandardCharsets.UTF_8));
    }
}
