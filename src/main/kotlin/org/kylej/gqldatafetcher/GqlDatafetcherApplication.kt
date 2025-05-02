package org.kylej.gqldatafetcher

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GqlDatafetcherApplication

fun main(args: Array<String>) {
	runApplication<GqlDatafetcherApplication>(*args)
}
