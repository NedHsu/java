package SHA256;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256 {
    private static final Charset UTF_8 = StandardCharsets.UTF_8;
    private static String algorithm = "SHA-256";

    public static String encrypt(String input) {
        return bytesToHex(digest(input.getBytes(UTF_8), algorithm));
    }

    public static byte[] digest(byte[] input, String algorithm) {
        try {
            MessageDigest md = MessageDigest.getInstance(algorithm);
            md.update(input);
            return md.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}