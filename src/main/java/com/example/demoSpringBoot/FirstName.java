package com.example.demoSpringBoot;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@Configuration
@NoArgsConstructor
@ConfigurationProperties(prefix="name")
public class FirstName {

    String firstName;

}
