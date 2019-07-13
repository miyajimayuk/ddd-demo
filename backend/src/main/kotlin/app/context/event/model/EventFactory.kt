package app.context.event.model

import app.context.event.type.Content
import app.context.event.type.EventId
import app.context.event.type.Title

class EventFactory {
    fun create(
        id: Long,
        title: String,
        content: String
    ): Event {
        return Event(
            id = EventId(id),
            title = Title(title),
            content = Content(content)
        )
    }

}