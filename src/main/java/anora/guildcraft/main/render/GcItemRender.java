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
		//Tools
		regItem(GcItems.pickaxeCopper);
		regItem(GcItems.axeCopper);
		regItem(GcItems.hoeCopper);
		regItem(GcItems.spadeCopper);
		regItem(GcItems.swordCopper);
		
		regItem(GcItems.pickaxeBronze);
		regItem(GcItems.axeBronze);
		regItem(GcItems.hoeBronze);
		regItem(GcItems.spadeBronze);
		regItem(GcItems.swordBronze);
		
		regItem(GcItems.pickaxeDragonite);
		regItem(GcItems.axeDragonite);
		regItem(GcItems.hoeDragonite);
		regItem(GcItems.spadeDragonite);
		regItem(GcItems.swordDragonite);
		
		regItem(GcItems.pickaxeSilver);
		regItem(GcItems.axeSilver);
		regItem(GcItems.hoeSilver);
		regItem(GcItems.spadeSilver);
		regItem(GcItems.swordSilver);
		
		regItem(GcItems.pickaxeMythirl);
		regItem(GcItems.axeMythirl);
		regItem(GcItems.hoeMythirl);
		regItem(GcItems.spadeMythirl);
		regItem(GcItems.swordMythirl);
		
		regItem(GcItems.pickaxeOrichalcum);
		regItem(GcItems.axeOrichalcum);
		regItem(GcItems.hoeOrichalcum);
		regItem(GcItems.spadeOrichalcum);
		regItem(GcItems.swordOrichalcum);
		
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
		
		//Gems
		regItem(GcItems.gemTopaz);
		regItem(GcItems.gemPeridot);
		regItem(GcItems.gemRuby);
		
		//Crafted
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