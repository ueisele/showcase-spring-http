package net.uweeisele.web.delegate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"net.uweeisele.web.delegate.config",
		"net.uweeisele.web.delegate.rest",
		"net.uweeisele.web.delegate.service"})
public class WebDelegateApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebDelegateApplication.class, args);
	}
}
