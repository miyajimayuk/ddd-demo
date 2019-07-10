package app.context.general.type

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

@Suppress("DEPRECATION")
open class LongText @Deprecated("use deserialize") constructor(
    @Deprecated("use toPrimitive")
    open val value: String
) {

    @JsonValue
    open fun toPrimitive(): String = value

    companion object {
        @JsonCreator
        @JvmStatic
        fun deserialize(value: String?): LongText? = value?.let { LongText(it) }
    }
}