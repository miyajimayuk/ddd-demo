package app.context.event.type

import app.context.general.type.Text

class TitleAndContent constructor(
    private val title: Title,
    private val content: Content
) : Text(title.join(content).value)