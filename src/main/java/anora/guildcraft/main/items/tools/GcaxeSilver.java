package anora.guildcraft.main.items.tools;

import anora.guildcraft.main.GcGlobal;
import net.minecraft.item.ItemAxe;

public class GcaxeSilver extends ItemAxe
{
	public GcaxeSilver (String unlocalizedName, ToolMaterial material)
	{
		super (material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(GcGlobal.gcCreativeTab);
	}
}
