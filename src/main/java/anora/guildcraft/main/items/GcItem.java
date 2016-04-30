package anora.guildcraft.main.items;

import anora.guildcraft.main.GcCreativeTab;
import anora.guildcraft.main.GcGlobal;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GcItem extends Item
{
	public GcItem(String name)
	{
		super();
	
		this.setCreativeTab(GcGlobal.gcCreativeTab);
		this.setUnlocalizedName(name);

	}
}
