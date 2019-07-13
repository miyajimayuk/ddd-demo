package app.context.event.model

import app.context.event.type.EventId

interface EventRepository {
    fun getBy(id: EventId): Event
}