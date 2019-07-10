package app.context.event.type

import app.context.general.type.Id
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.Min

@Suppress("DEPRECATION")
data class EventId @Deprecated("user deserialize") constructor(
    @field: Min(0)
    override val value: Long
) : Id(value) {

    @JsonValue
    override fun toPrimitive(): Long = value

    /**
     * データを取り出す時に使う
     */
    companion object {
        @JsonCreator
        @JvmStatic
        fun deserialize(value: Long?): EventId? = value?.let { EventId(value) }
    }
}