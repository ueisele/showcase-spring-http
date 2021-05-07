package net.uweeisele.http11.webflux.delegate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"net.uweeisele.http11.webflux.delegate.config",
		"net.uweeisele.http11.webflux.delegate.rest",
		"net.uweeisele.http11.webflux.delegate.service"})
public class Http11WebFluxDelegateApplication {

	public static void main(String[] args) {
		SpringApplication.run(Http11WebFluxDelegateApplication.class, args);
	}
}
