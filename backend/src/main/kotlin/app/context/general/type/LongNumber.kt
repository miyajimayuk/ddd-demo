package app.context.general.type

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.Min

open class LongNumber @JsonCreator(mode = JsonCreator.Mode.DELEGATING) constructor(
    @field: Min(0)
    open val value: Long
) {
    @JsonValue
    open fun show(): Long = serialize()
    open fun serialize(): Long = value

}