package telran.java2022;

import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class KarafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KarafkaConsumerApplication.class, args);
	}

	@Bean
	public Consumer<String> log() {
		return log::info;
	}

}
