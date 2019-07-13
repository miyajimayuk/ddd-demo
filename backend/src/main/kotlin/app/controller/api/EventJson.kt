package app.controller.api

import app.context.event.type.Content
import app.context.event.type.EventId
import app.context.event.type.Title
import app.context.event.type.TitleAndContent

/**
 * Json出力用のデータクラス
 * MEMO: nullはフロント側で処理
 */
data class EventJson(
    val id: EventId,
    val title: Title,
    val content: Content,
    val titleAndContent: TitleAndContent
)