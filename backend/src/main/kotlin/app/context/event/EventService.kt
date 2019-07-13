package app.context.event

import app.context.event.model.EventRepository
import app.context.event.type.EventId
import app.controller.api.EventJson
import org.springframework.stereotype.Service

@Service
class EventService(
    private val eventRepository: EventRepository
) {
    fun fetch(id: Long): EventJson {
        val event = eventRepository.getBy(EventId(id))
        return EventJson(
            id = event.decapsulateMapFromId { it },
            title = event.decapsulateMapFromTitle { it },
            content = event.decapsulateMapFromContent { it },
            titleAndContent = event.decapsulateMapFromTitleAndContent { it }
        )
    }
}