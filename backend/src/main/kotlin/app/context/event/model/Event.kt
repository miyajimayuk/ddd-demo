package app.context.event.model

import app.context.event.type.Content
import app.context.event.type.EventId
import app.context.event.type.Title

data class Event(
    private val id: EventId?,
    private val title: Title?,
    private val content: Content?
) {

    fun <T> decapsulateMapFromId(mapper: (EventId?) -> T): T = mapper(id)
    fun <T> decapsulateMapFromTitle(mapper: (Title?) -> T): T = mapper(title)
    fun <T> decapsulateMapFromContent(mapper: (Content?) -> T):T = mapper(content)

}