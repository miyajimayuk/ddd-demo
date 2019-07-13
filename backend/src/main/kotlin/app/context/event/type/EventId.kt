package app.context.event.type

import app.context.general.type.Id
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.Min

@Suppress("DEPRECATION")
data class EventId @JsonCreator(mode = JsonCreator.Mode.DELEGATING) constructor(
    @field: Min(0)
    override val value: Long
) : Id(value) {

    @JsonValue
    override fun show(): Long = serialize()
    override fun serialize(): Long = value

}