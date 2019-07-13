package app.infrastructure

import app.context.event.model.Event
import app.context.event.model.EventFactory
import app.context.event.model.EventRepository
import app.context.event.type.Content
import app.context.event.type.EventId
import app.context.event.type.Title
import app.infrastructure.dao.EventEntityDao
import org.springframework.stereotype.Repository

@Repository
class EventRepositoryImpl(
    private val eventEntityDao: EventEntityDao
): EventRepository {
    override fun getBy(id: EventId): Event {
        val event = eventEntityDao.selectById(id.serialize())
        return EventFactory().create(
            id = event.id,
            title = event.title,
            content = event.content
        )
    }
}