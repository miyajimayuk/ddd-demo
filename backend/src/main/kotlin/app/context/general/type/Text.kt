package app.context.general.type

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.Size

open class Text @JsonCreator(mode = JsonCreator.Mode.DELEGATING) constructor(
    @field: Size(max = 255)
    open val value: String
) {

    @JsonValue
    open fun show(): String = serialize()
    open fun serialize(): String = value

    fun join(text: Text): Text = Text(this.value + text.value)
}