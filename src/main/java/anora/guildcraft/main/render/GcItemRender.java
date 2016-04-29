package anora.guildcraft.main.render;

import anora.guildcraft.main.items.GcItems;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class GcItemRender
{
	public static void registerItemRender()
	{
		//Ingots
		regItem(GcItems.ingotCopper);
		regItem(GcItems.ingotAluminum);
		//regItem(GcItems.ingotBrass);
		regItem(GcItems.ingotBronze);
		regItem(GcItems.ingotDragonite);
		regItem(GcItems.ingotMythirll);
		regItem(GcItems.ingotOrichalcum);
		regItem(GcItems.ingotPlatnum);
		regItem(GcItems.ingotSilver);
		regItem(GcItems.ingotTin);
		regItem(GcItems.ingotZinc);
		
		//Nuggets
		regItem(GcItems.nuggetAluminum);
		regItem(GcItems.nuggetBrass);
		regItem(GcItems.nuggetBronze);
		regItem(GcItems.nuggetCopper);
		regItem(GcItems.nuggetDragonite);
		regItem(GcItems.nuggetMythirll);
		regItem(GcItems.nuggetOrichalcum);
		regItem(GcItems.nuggetPlatnum);
		regItem(GcItems.nuggetSilver);
		regItem(GcItems.nuggetTin);
		regItem(GcItems.nuggetZinc);
		
		//crafted
		regItem(GcItems.stickDragonite);
		
		//Unique
		regItem(GcItems.stoneMystic);
		
	}

	private static void regItem(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}

