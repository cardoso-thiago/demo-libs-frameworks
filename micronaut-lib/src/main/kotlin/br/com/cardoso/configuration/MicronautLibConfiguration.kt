package br.com.cardoso.configuration

import br.com.cardoso.impl.ConvertMessage
import io.micronaut.context.annotation.Factory
import javax.inject.Singleton

@Factory
class MicronautLibConfiguration {

    @Singleton
    fun convertMessage() = ConvertMessage()
}