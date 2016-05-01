package anora.guildcraft.main.items.tools;

import anora.guildcraft.main.GcGlobal;
import net.minecraft.item.ItemSpade;

public class GcspadeOrichalcum extends ItemSpade
{
	public GcspadeOrichalcum (String unlocalizedName, ToolMaterial material)
	{
		super (material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(GcGlobal.gcCreativeTab);
	}
}
