package anora.guildcraft.main;

import anora.guildcraft.main.items.GcItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Ty's PC on 4/29/2016.
 */
public class GcCreativeTab extends CreativeTabs {
    public GcCreativeTab (String string)
    {
        super(string);
    }

    public Item getTabIconItem()
    {
        return GcItems.ingotDragonite;
    }

}
