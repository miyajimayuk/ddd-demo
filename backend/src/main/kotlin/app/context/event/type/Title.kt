package app.context.event.type

import app.context.general.type.ShortText
import app.context.general.type.Text
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.Size

@Suppress("DEPRECATION")
data class Title @JsonCreator(mode = JsonCreator.Mode.DELEGATING) constructor(
    @field: Size(max = 100)
    override val value: String
) : ShortText(value) {

    @JsonValue
    override fun show(): String = serialize()
    override fun serialize(): String = value

}