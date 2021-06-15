package br.com.cardoso

import io.quarkus.runtime.Quarkus
import io.quarkus.runtime.annotations.QuarkusMain

@QuarkusMain
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        Quarkus.run(*args)
    }
}