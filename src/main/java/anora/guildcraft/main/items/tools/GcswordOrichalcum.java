package anora.guildcraft.main.items.tools;

import anora.guildcraft.main.GcGlobal;
import net.minecraft.item.ItemSword;

public class GcswordOrichalcum extends ItemSword
{
	public GcswordOrichalcum (String unlocalizedName, ToolMaterial material)
	{
		super (material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(GcGlobal.gcCreativeTab);
	}
}
