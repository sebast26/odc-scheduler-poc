package pl.sgorecki.schedulerpoc

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface SchedulerRepository : JpaRepository<Scheduler, String> {
    @Query("SELECT s FROM Scheduler s WHERE s.nextRun IS NULL OR s.nextRun <= :timestamp")
    fun findSchedulersToExecute(@Param("timestamp") timestamp: Long): List<Scheduler>
}