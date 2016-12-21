package io.scalac.rabbit

import io.scalac.amqp.{Direct, Exchange, Queue}


object RabbitRegistry {

  val inboundExchange = Exchange(name = "censorship.inbound.exchange", `type` = Direct, durable = true)
  val inboundQueue = Queue("censorship.inbound.queue")
    
  val outboundExchange = Exchange(name = "censorship.outbound.exchange", `type` = Direct, durable = true)
  val outOkQueue = Queue("censorship.ok.queue")
  val outNokQueue = Queue("censorship.nok.queue")
}
