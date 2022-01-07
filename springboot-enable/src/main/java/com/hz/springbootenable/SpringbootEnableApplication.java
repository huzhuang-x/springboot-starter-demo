package com.hz.springbootenable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import redis.clients.jedis.Jedis;

@SpringBootApplication
public class SpringbootEnableApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootEnableApplication.class, args);

        Jedis jedis = context.getBean(Jedis.class);
        System.out.println(jedis);

        jedis.set("a","123");
        System.out.println(jedis.get("a"));

    }

    @Bean
    public Jedis jedis() {
        return new Jedis("localhost",6379);
    }

}
