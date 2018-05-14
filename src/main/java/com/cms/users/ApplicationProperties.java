package com.cms.users;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@EnableConfigurationProperties
@ConfigurationProperties
public class ApplicationProperties {
	private String cookieSecret;
	
	private String urlRedirectLogin;
	
	public String getCookieSecret() {
		return cookieSecret;
	}

	public void setCookieSecret(String cookieSecret) {
		this.cookieSecret = cookieSecret;
	}
	
	public String getUrlRedirect() {
		return this.urlRedirectLogin;
	}

	public void setUrlRedirectLogin(String urlRedirectLogin) {
		this.urlRedirectLogin = urlRedirectLogin;
	}
}
