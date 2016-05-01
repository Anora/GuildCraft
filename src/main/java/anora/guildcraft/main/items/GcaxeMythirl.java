package anora.guildcraft.main.items;

import anora.guildcraft.main.GcGlobal;
import net.minecraft.item.ItemAxe;

public class GcaxeMythirl extends ItemAxe
{
	public GcaxeMythirl (String unlocalizedName, ToolMaterial material)
	{
		super (material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(GcGlobal.gcCreativeTab);
	}
}
