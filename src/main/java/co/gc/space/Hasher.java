package co.gc.space;
import java.security.spec.KeySpec;
import java.util.Base64;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
//import java.security.SecureRandom;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

public final class Hasher {
	public static String Hash(String in) {
        byte[] salt = new byte[16];
        //(new SecureRandom()).nextBytes(salt);
        KeySpec spec = new PBEKeySpec(in.toCharArray(), salt, 65536, 128);
        SecretKeyFactory f = null;
		try {
			f = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        byte[] hash = null;
		try {
			hash = f.generateSecret(spec).getEncoded();
		} catch (InvalidKeySpecException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Base64.Encoder enc = Base64.getEncoder();
        return enc.encodeToString(hash);
	}
}
