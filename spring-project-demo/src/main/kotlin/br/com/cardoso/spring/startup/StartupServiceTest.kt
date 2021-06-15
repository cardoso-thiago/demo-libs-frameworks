package br.com.cardoso.spring.startup

import br.com.cardoso.spring.service.UseConvertMessageExample
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class StartupServiceTest(private val useConvertMessageExample: UseConvertMessageExample) : CommandLineRunner {

    override fun run(vararg args: String) {
        useConvertMessageExample.convertMessage("Test Message")
    }
}