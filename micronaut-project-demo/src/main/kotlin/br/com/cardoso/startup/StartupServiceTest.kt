package br.com.cardoso.startup

import br.com.cardoso.service.UseConvertMessageExample
import io.micronaut.context.event.ApplicationEventListener
import io.micronaut.runtime.server.event.ServerStartupEvent
import javax.inject.Singleton
import kotlin.system.exitProcess

@Singleton
class StartupServiceTest(private val useConvertMessageExample: UseConvertMessageExample) :
    ApplicationEventListener<ServerStartupEvent> {

    override fun onApplicationEvent(event: ServerStartupEvent) {
        useConvertMessageExample.convertMessage("Test Message")
        exitProcess(0)
    }
}