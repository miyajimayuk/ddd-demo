package app.context.general.type

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.Min

open class Id @JsonCreator(mode = JsonCreator.Mode.DELEGATING) constructor(
    override val value: Long
): LongNumber(value) {

    @JsonValue
    override fun show(): Long = serialize()
    override fun serialize(): Long = value

}