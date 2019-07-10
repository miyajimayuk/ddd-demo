package app.context.event.type

import app.context.general.type.LongText
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.Size

@Suppress("DEPRECATION")
data class Content @Deprecated("use deserialize") constructor(
    override val value: String
): LongText(value) {

    @JsonValue
    override fun toPrimitive(): String = value

    companion object {
        @JsonCreator
        @JvmStatic
        fun deserialize(value: String?): Content? = value?.let { Content(it) }
    }
}