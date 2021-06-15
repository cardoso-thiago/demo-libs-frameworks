package br.com.cardoso.configuration

import br.com.cardoso.impl.ConvertMessage
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class SpringLibConfiguration {

    @Bean
    open fun convertMessage() = ConvertMessage()
}