package com.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.project.App;

/** Main run file
 * @author Ben
 *
 */

@SpringBootApplication
@EnableMongoRepositories(basePackages="com.domain.repository")
public class App {

	
    public static void main( String[] args ) throws InterruptedException
    {
        SpringApplication.run(App.class, args);
    }
    
    //My bean to add user accounts
    @Bean
    public CommandLineRunner administrators(ApplicationContext ctx) {
        return args -> {       	


        };
    }
}
