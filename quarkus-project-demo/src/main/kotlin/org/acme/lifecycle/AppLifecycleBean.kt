package org.acme.lifecycle

import br.com.cardoso.service.UseConvertMessageExample
import io.quarkus.runtime.Quarkus
import io.quarkus.runtime.StartupEvent
import javax.enterprise.context.ApplicationScoped
import javax.enterprise.event.Observes

@ApplicationScoped
class AppLifecycleBean(private val useConvertMessageExample: UseConvertMessageExample) {

    fun onStart(@Observes ev: StartupEvent) {
        useConvertMessageExample.convertMessage("Test Message")
        Quarkus.asyncExit()
    }
}