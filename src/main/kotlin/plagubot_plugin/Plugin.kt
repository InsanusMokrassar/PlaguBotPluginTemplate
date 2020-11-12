package plagubot_plugin

import dev.inmo.plagubot.Plugin
import dev.inmo.tgbotapi.bot.TelegramBot
import dev.inmo.tgbotapi.updateshandlers.FlowsUpdatesFilter
import kotlinx.coroutines.CoroutineScope
import kotlinx.serialization.Serializable
import org.jetbrains.exposed.sql.Database

@Serializable
class PlaguBotPlugin : Plugin {
    override suspend fun invoke(
        bot: TelegramBot,
        database: Database,
        updatesFilter: FlowsUpdatesFilter,
        scope: CoroutineScope
    ) {
        TODO("Not yet implemented")
    }
}
