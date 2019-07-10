package app.context.event.type

import app.context.general.type.Text
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.Size

@Suppress("DEPRECATION")
data class Title @Deprecated("use deserialize") constructor(
    @field: Size(max = 100)
    override val value: String
) : Text(value) {

    @JsonValue
    override fun toPrimitive(): String = value

    companion object {
        @JsonCreator
        @JvmStatic
        fun deserialize(value: String?): Title? = value?.let { Title(it) }
    }
}