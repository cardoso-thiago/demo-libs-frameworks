package br.com.cardoso.impl

class ConvertMessage {

    fun convertToInfoMessage(message: String) = "INFO - $message"
    fun convertToWarningMessage(message: String) = "WARNING - $message"
    fun convertToErrorMessage(message: String) = "ERROR - $message"
}