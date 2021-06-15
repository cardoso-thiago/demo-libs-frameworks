package br.com.cardoso.spring.service

import br.com.cardoso.impl.ConvertMessage
import org.springframework.stereotype.Service

@Service
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