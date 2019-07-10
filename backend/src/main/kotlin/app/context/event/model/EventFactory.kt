package app.context.event.model

import app.context.event.type.Content
import app.context.event.type.EventId
import app.context.event.type.Title

class EventFactory {
    fun create(
        id: EventId?,
        title: Title?,
        content: Content?
    ): Event {
        return Event(
            id = id,
            title = title,
            content = content
        )
    }

}