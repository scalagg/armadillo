package gg.scala.armadillo

import gg.scala.commons.ExtendedScalaPlugin
import me.lucko.helper.plugin.ap.Plugin
import me.lucko.helper.plugin.ap.PluginDependency

/**
 * @author GrowlyX
 * @since 8/8/2022
 */
@Plugin(
    name = "armadillo",
    depends = [
        PluginDependency("scala-commons"),
        PluginDependency("store-spigot")
    ]
)
class ArmadilloSpigotPlugin : ExtendedScalaPlugin()
{
}
