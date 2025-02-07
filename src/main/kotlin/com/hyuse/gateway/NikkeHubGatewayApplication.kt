package com.hyuse.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class NikkeHubGatewayApplication

fun main(args: Array<String>) {
	runApplication<NikkeHubGatewayApplication>(*args)
}
