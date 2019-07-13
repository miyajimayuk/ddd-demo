package app.context.general.type

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

open class ShortText @JsonCreator(mode = JsonCreator.Mode.DELEGATING) constructor(
    override val value: String
) : Text(value) {

    @JsonValue
    override fun show(): String = serialize()

    override fun serialize(): String = value

}