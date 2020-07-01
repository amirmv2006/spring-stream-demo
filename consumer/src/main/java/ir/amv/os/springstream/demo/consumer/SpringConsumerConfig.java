package ir.amv.os.springstream.demo.consumer;

import java.util.function.Consumer;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author Amir
 */
@SpringBootApplication
@Slf4j
public class SpringConsumerConfig {

  public static void main(String[] args) {
    SpringApplication.run(SpringConsumerConfig.class, args);
  }

  @Bean
  public Consumer<Person> log() {
    return person -> {
      log.info("Received: {}", person);
    };
  }

  @Data
  public static class Person {
    private String name;
  }
}
