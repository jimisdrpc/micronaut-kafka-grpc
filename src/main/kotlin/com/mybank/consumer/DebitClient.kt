package com.mybank.consumer

import io.micronaut.configuration.kafka.annotation.KafkaKey
import io.micronaut.configuration.kafka.annotation.KafkaListener
import io.micronaut.configuration.kafka.annotation.OffsetReset
import io.micronaut.configuration.kafka.annotation.Topic


@KafkaListener(offsetReset = OffsetReset.EARLIEST)
class DebitClient {
    @Topic("test")
    fun receive(@KafkaKey day: String, message: String) {
        println("Got Message for the  - $day and Message is  $message")
    }
}