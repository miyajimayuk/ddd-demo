package app.context.general.type

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.Min

@Suppress("DEPRECATION")
open class Id @Deprecated("user deserialize") constructor(
    @field: Min(0)
    override val value: Long
): LongNumber(value) {

    @JsonValue
    override fun toPrimitive(): Long = value

    companion object {
        @JsonCreator
        @JvmStatic
        fun deserialize(value: Long?): Id? = value?.let { Id(value) }
    }
}