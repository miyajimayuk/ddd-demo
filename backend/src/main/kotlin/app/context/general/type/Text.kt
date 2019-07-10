package app.context.general.type

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.Size

@Suppress("DEPRECATION")
open class Text @Deprecated("user deserialize") constructor(
    @field: Size(max = 255)
    @Deprecated("use toPrimitive")
    open val value: String
) {

    @JsonValue
    open fun toPrimitive(): String = value

    companion object {
        @JsonCreator
        @JvmStatic
        fun deserialize(value: String?): Text? = value?.let { Text(it) }
    }
}