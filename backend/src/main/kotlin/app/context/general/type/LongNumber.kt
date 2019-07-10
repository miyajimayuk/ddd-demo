package app.context.general.type

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.Min

@Suppress("DEPRECATION")
open class LongNumber @Deprecated("user deserialize") constructor(
    @Deprecated("user toPrimitive")
    @field: Min(0)
    open val value: Long
) {
    @JsonValue
    open fun toPrimitive(): Long = value

    companion object {
        @JsonCreator
        @JvmStatic
        fun deserialize(value: Long?): LongNumber? = value?.let { LongNumber(it) }
    }
}