package anora.guildcraft.main.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GcItem extends Item
{
	public GcItem(String name)
	{
		super();
		
		this.setRegistryName(name);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
}
