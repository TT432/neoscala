package io.github.tt432.neoscala

import net.neoforged.bus.api.IEventBus
import net.neoforged.fml.common.Mod

/**
 * @author TT432
 */

object NeoScala {
  final val MOD_ID = "neoscala"
}

@Mod(NeoScala.MOD_ID)
class NeoScala(val bus: IEventBus) {
}
