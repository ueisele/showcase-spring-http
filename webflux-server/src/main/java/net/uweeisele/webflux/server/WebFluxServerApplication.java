package net.uweeisele.webflux.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"net.uweeisele.webflux.server.config",
		"net.uweeisele.webflux.server.rest"})
public class WebFluxServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebFluxServerApplication.class, args);
	}
}
