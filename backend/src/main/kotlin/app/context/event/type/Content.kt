package app.context.event.type

import app.context.general.type.LongText
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.Size

@Suppress("DEPRECATION")
data class Content @JsonCreator(mode = JsonCreator.Mode.DELEGATING) constructor(
    override val value: String
) : LongText(value) {

    @JsonValue
    override fun show(): String = serialize()

    override fun serialize(): String = value

}