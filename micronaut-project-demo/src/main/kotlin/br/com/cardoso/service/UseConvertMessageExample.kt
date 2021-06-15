package br.com.cardoso.service

import br.com.cardoso.impl.ConvertMessage
import javax.inject.Singleton

@Singleton
class UseConvertMessageExample(private val convertMessage: ConvertMessage) {

    fun convertMessage(message:String) {
        val convertToInfoMessage = convertMessage.convertToInfoMessage(message)
        val convertToWarningMessage = convertMessage.convertToWarningMessage(message)
        val convertToErrorMessage = convertMessage.convertToErrorMessage(message)

        println(convertToInfoMessage)
        println(convertToWarningMessage)
        println(convertToErrorMessage)
    }
}