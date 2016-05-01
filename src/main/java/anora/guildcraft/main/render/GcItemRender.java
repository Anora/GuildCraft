package anora.guildcraft.main.render;

import anora.guildcraft.main.GcGlobal;
import anora.guildcraft.main.items.GcItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class GcItemRender
{
	public static void registerItemRender()
	{
		//Ingots
		regItem(GcItems.ingotCopper);
		regItem(GcItems.ingotAluminum);
		regItem(GcItems.ingotBrass);
		regItem(GcItems.ingotBronze);
		regItem(GcItems.ingotDragonite);
		regItem(GcItems.ingotMythirl);
		regItem(GcItems.ingotOrichalcum);
		regItem(GcItems.ingotPlatinum);
		regItem(GcItems.ingotSilver);
		regItem(GcItems.ingotTime);
		regItem(GcItems.ingotZinc);
		
		//Nuggets
		regItem(GcItems.nuggetAluminum);
		regItem(GcItems.nuggetBrass);
		regItem(GcItems.nuggetBronze);
		regItem(GcItems.nuggetCopper);
		regItem(GcItems.nuggetDragonite);
		regItem(GcItems.nuggetMythirl);
		regItem(GcItems.nuggetOrichalcum);
		regItem(GcItems.nuggetPlatinum);
		regItem(GcItems.nuggetSilver);
		regItem(GcItems.nuggetTim);
		regItem(GcItems.nuggetZinc);
		
		//gems
		regItem(GcItems.Topaz);
		regItem(GcItems.Peridot);
		regItem(GcItems.Ruby);
		
		//crafted
		regItem(GcItems.stickDragonite);
		
		//Unique
		regItem(GcItems.stoneMystic);
		
	}

	private static void regItem(Item item)
	{
		//ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory")); do not use
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(GcGlobal.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}