package net.uweeisele.webflux.delegate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"net.uweeisele.webflux.delegate.config",
		"net.uweeisele.webflux.delegate.rest",
		"net.uweeisele.webflux.delegate.service"})
public class WebFluxDelegateApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebFluxDelegateApplication.class, args);
	}
}
