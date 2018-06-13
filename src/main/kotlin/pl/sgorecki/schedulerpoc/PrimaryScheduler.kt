package pl.sgorecki.schedulerpoc

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional
import java.time.Instant

@Component
class PrimaryScheduler(val schedulerRepository: SchedulerRepository) {

    @Scheduled(cron = "*/5 * * * * *")
    @Transactional
    fun runSchedulers() {
        val now = Instant.now().epochSecond
        val schedulers = schedulerRepository.findSchedulersToExecute(now)
        println("$now: ${schedulers.joinToString()}")
        schedulers.forEach { it.nextRun = now + it.frequency }
    }
}