package app.controller.api

import app.context.event.EventService
import app.context.event.type.EventId
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(ApiPath.api_event_id)
class EventController(
    private val eventService: EventService
) {
    @GetMapping
    fun fetch(
        @PathVariable id: Long
    ): EventJson {
        return eventService.fetch(id)
    }
}