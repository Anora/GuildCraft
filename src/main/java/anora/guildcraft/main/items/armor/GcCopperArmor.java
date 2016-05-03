package anora.guildcraft.main.items.armor;

import anora.guildcraft.main.GcGlobal;
import net.minecraft.item.ItemArmor;

public class GcCopperArmor extends ItemArmor
{

	public GcCopperArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) 
	{
		super(material, renderIndex, armorType);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(GcGlobal.gcCreativeTab);
	}

}
