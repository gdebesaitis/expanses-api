package br.com.debesaitis.expenses_api.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.debesaitis.expenses_api.domain.User;
import br.com.debesaitis.expenses_api.repositories.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

  @Autowired
  private UserRepository userRepository;

  @Override
  public void run(String... args) throws Exception {

    User user1 = new User(null, "guilteste", "12345", Instant.now());
    User user2 = new User(null, "ana_silva", "12345", Instant.now());
    User user3 = new User(null, "joao_pereira", "12345", Instant.now());
    User user4 = new User(null, "marcos_oliveira", "12345", Instant.now());
    User user5 = new User(null, "lucas_rocha", "12345", Instant.now());
    User user6 = new User(null, "paula_mendes", "12345", Instant.now());
    User user7 = new User(null, "carla_freitas", "12345", Instant.now());
    User user8 = new User(null, "renato_costa", "12345", Instant.now());

    userRepository.saveAll(Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8));
  }
  
}
