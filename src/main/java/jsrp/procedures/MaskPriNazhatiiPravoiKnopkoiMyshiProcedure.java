package jsrp.procedures;

import net.minecraft.entity.Entity;

import jsrp.JsrpMod;

import java.util.Map;

public class MaskPriNazhatiiPravoiKnopkoiMyshiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				JsrpMod.LOGGER.warn("Failed to load dependency entity for procedure MaskPriNazhatiiPravoiKnopkoiMyshi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"replaceitem entity @s armor.head jsrp:mask");
			}
		}
	}
}
