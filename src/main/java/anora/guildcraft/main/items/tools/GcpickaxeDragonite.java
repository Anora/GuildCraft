package anora.guildcraft.main.items.tools;

import anora.guildcraft.main.GcGlobal;
import net.minecraft.item.ItemPickaxe;

public class GcpickaxeDragonite extends ItemPickaxe
{
	public GcpickaxeDragonite (String unlocalizedName, ToolMaterial material)
	{
		super (material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(GcGlobal.gcCreativeTab);
	}
}
