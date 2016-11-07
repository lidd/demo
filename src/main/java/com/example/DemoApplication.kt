package com.example

import com.example.web.entity.User
import com.example.web.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
open class DemoApplication {


    @Bean
    open fun dataLoader(@Autowired repository: UserRepository): CommandLineRunner {
        return CommandLineRunner { repository.save(User("holly","123")) }
    }

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(DemoApplication::class.java, *args)
        }
    }
}

