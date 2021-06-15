package br.com.cardoso.spring

import br.com.cardoso.configuration.SpringLibConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import(SpringLibConfiguration::class)
class SpringProjectDemoApplication

fun main(args: Array<String>) {
	runApplication<SpringProjectDemoApplication>(*args)
}
