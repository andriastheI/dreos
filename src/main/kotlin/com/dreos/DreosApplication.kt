package com.dreos

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DreosApplication

fun main(args: Array<String>) {
	runApplication<DreosApplication>(*args)
}
