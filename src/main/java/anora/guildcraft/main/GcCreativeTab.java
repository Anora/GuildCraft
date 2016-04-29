package anora.guildcraft.main;

import anora.guildcraft.main.items.GcItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GcCreativeTab extends CreativeTabs{

	public GcCreativeTab(String string) 
	{
		super(string);
	}

	@Override
	public Item getTabIconItem() {
		return GcItems.ingotDragonite;
	}

}
.