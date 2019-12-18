package com.wizaripost.teamleadhelper

import com.wizaripost.teamleadhelper.domain.entity.Project
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@SpringBootApplication
@Configuration
class TeamLeadHelperApplication{

//	@Bean
//	fun setUp(projectRepository: IProjectRepository): CommandLineRunner {
//		println("Hello Ivan")
//		return CommandLineRunner {
//
//			projectRepository.save(Project("P1", "P-11"))
//		}
//	}
}

fun main(args: Array<String>) {
	println("Hello Ivan")
	SpringApplication.run(TeamLeadHelperApplication::class.java, *args)
	println("Hello Ivan")
}
