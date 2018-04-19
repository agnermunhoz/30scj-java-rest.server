package fiap.scj.restful.ws.security;

import java.io.IOException;
import java.util.Base64;
import java.util.StringTokenizer;

public class AuthenticationService {

	public boolean authenticate(final String authCredentials) {

		if (authCredentials == null) {
			return false;
		}

		final String encodedUserPassword = authCredentials.replaceFirst("Basic ", "");

		String usernameAndPassword = null;
		try {
			byte[] decodedBytes = Base64.getDecoder().decode(encodedUserPassword);
			usernameAndPassword = new String(decodedBytes, "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}

		final StringTokenizer tokenizer = new StringTokenizer(usernameAndPassword, ":");
		if (tokenizer.countTokens() < 2) {
			return false;
		}

		final String username = tokenizer.nextToken();
		final String password = tokenizer.nextToken();

		boolean authenticationStatus = "admin".equals(username) && "123".equals(password);
		return authenticationStatus;
	}

}
