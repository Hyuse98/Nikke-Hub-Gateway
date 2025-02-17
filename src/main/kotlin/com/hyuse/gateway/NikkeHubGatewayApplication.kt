package com.hyuse.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NikkeHubGatewayApplication

fun main(args: Array<String>) {
	runApplication<NikkeHubGatewayApplication>(*args)
}
