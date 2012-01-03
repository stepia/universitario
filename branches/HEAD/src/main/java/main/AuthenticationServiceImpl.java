package main;

import javax.annotation.Resource;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service("authenticationService")
public class AuthenticationServiceImpl implements AuthenticationService {

	@Resource(name = "authenticationManager")
	private AuthenticationManager authenticationManager;

	public boolean login(String username, String password) {
		try {
			Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
					username, password));

			if (authenticate.isAuthenticated()) {
				SecurityContextHolder.getContext().setAuthentication(authenticate);
				return true;
			}
		} catch (AuthenticationException ae) {
			// TODO add logger.debug declaration
			System.out.println("logged out");
		} catch (Exception e) {
			throw new RuntimeException("authentication failed: " + e.getCause());
		}
		return false;
	}

}
