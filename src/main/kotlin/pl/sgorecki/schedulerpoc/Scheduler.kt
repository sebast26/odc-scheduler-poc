package pl.sgorecki.schedulerpoc

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Scheduler(@Id val id: String, val frequency: Int, var nextRun: Long? = null) {
    constructor() : this("", 0)
}