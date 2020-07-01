package ir.amv.os.springstream.demo.producer;

import java.util.UUID;
import java.util.function.Supplier;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author Amir
 */
@SpringBootApplication
@Slf4j
public class SpringProducerConfig {

  public static void main(String[] args) {
    SpringApplication.run(SpringProducerConfig.class, args);
  }

  @Bean
  public Supplier<Person> log() {
    return () -> new Person(UUID.randomUUID().toString());
  }

  @Data
  @AllArgsConstructor
  @NoArgsConstructor
  public static class Person {
    private String name;
  }
}
