package anora.guildcraft.main.handler;

import anora.guildcraft.main.items.GcItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class GcFuelHandler implements IFuelHandler
{

	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.getItem() == GcItems.stoneMystic)return 1600;
		return 0;
	}

}
