import java.io.FileInputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.JWEObject;
import com.nimbusds.jose.crypto.RSAEncrypter;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jose.*;
import com.nimbusds.jose.crypto.*;
import com.nimbusds.jwt.*;

public class EncryptCardNunber {

	
	public static void main(String args []) throws Exception {
				
		System.out.println(generateJWE("C:\\PayPal_Work\\SME\\P3 API's-PayPal Provisioning Platform\\sb_cert.txt", "4556526682360700"));
	}
	
	 public static String generateJWE(String certFileLocation, String cardNumber) throws Exception {
		    FileInputStream fileInputStream = new FileInputStream(certFileLocation);
		    CertificateFactory f = CertificateFactory.getInstance("X.509");
		    X509Certificate certificate = (X509Certificate)f.generateCertificate(fileInputStream);
		    RSAPublicKey publicKey = (RSAPublicKey) certificate.getPublicKey();
		 
		    JWTClaimsSet jwtClaims = new JWTClaimsSet.Builder().claim("card_pan", cardNumber).build();
		    JWEObject jweObject = new JWEObject(new JWEHeader(JWEAlgorithm.RSA_OAEP,
		            EncryptionMethod.A128CBC_HS256), new Payload(jwtClaims.toJSONObject().toString()));
		    jweObject.encrypt(new RSAEncrypter((RSAPublicKey) publicKey));
		    return jweObject.serialize();
		}
	
}
