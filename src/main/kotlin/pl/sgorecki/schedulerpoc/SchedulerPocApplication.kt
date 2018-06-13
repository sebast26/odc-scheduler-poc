package pl.sgorecki.schedulerpoc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class SchedulerPocApplication

fun main(args: Array<String>) {
    runApplication<SchedulerPocApplication>(*args)
}
