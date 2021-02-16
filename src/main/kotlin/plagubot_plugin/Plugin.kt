package plagubot_plugin

import dev.inmo.plagubot.Plugin
import dev.inmo.tgbotapi.bot.TelegramBot
import dev.inmo.tgbotapi.updateshandlers.FlowsUpdatesFilter
import dev.inmo.tgbotapi.extensions.behaviour_builder.BehaviourContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.serialization.Serializable
import org.jetbrains.exposed.sql.Database

@Serializable
class PlaguBotPlugin : Plugin {
    override suspend fun BehaviourContext.invoke(
        database: Database,
        params: Map<String, Any>
    ) {
        TODO("Not yet implemented")
    }
}
