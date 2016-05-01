package anora.guildcraft.main.items.tools;

import anora.guildcraft.main.GcGlobal;
import net.minecraft.item.ItemPickaxe;

public class GcpickaxeMythirl extends ItemPickaxe 
{
	public GcpickaxeMythirl (String unlocalizedName, ToolMaterial material)
	{
		super (material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(GcGlobal.gcCreativeTab);
	}
}
