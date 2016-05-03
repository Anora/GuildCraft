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
		//tools
		regItem(GcItems.axeBronze);
		regItem(GcItems.hoeBronze);
		regItem(GcItems.pickaxeBronze);
		regItem(GcItems.spadeBronze);
		regItem(GcItems.swordBronze);
		
		regItem(GcItems.axeCopper);
		regItem(GcItems.pickaxeCopper);
		regItem(GcItems.hoeCopper);
		regItem(GcItems.spadeCopper);
		regItem(GcItems.swordCopper);
		
		regItem(GcItems.axeDragonite);
		regItem(GcItems.hoeDragonite);
		regItem(GcItems.pickaxeDragonite);
		regItem(GcItems.spadeDragonite);
		regItem(GcItems.swordDragonite);
		
		regItem(GcItems.axeMythirl);
		regItem(GcItems.hoeMythirl);
		regItem(GcItems.pickaxeMythirl);
		regItem(GcItems.spadeMythirl);
		regItem(GcItems.swordMythirl);
		
		regItem(GcItems.axeOrichalcum);
		regItem(GcItems.hoeOrichalcum);
		regItem(GcItems.pickaxeOrichalcum);
		regItem(GcItems.spadeOrichalcum);
		regItem(GcItems.swordOrichalcum);
		
		regItem(GcItems.axeSilver);
		regItem(GcItems.hoeSilver);
		regItem(GcItems.pickaxeSilver);
		regItem(GcItems.spadeSilver);
		regItem(GcItems.swordSilver);
		
		//Armor
		regItem(GcItems.copperBoots);
		regItem(GcItems.copperChestplate);
		regItem(GcItems.copperHelmet);
		regItem(GcItems.copperLeggings);
		
		regItem(GcItems.bronzeBoots);
		regItem(GcItems.bronzeChestplate);
		regItem(GcItems.bronzeHelmet);
		regItem(GcItems.bronzeLeggings);
		
		regItem(GcItems.dragoniteBoots);
		regItem(GcItems.dragoniteChestplate);
		regItem(GcItems.dragoniteHelmet);
		regItem(GcItems.dragoniteLeggings);
		
		regItem(GcItems.silverBoots);
		regItem(GcItems.silverChestplate);
		regItem(GcItems.silverHelmet);
		regItem(GcItems.silverLeggings);
		
		regItem(GcItems.mythirlBoots);
		regItem(GcItems.mythirlChestplate);
		regItem(GcItems.mythirlHelmet);
		regItem(GcItems.mythirlLeggings);
		
		regItem(GcItems.orichalcumBoots);
		regItem(GcItems.orichalcumChestplate);
		regItem(GcItems.orichalcumHelmet);
		regItem(GcItems.orichalcumLeggings);
		
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
		regItem(GcItems.ingotTin);
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
		regItem(GcItems.nuggetTin);
		regItem(GcItems.nuggetZinc);
		
		//gems
		regItem(GcItems.gemTopaz);
		regItem(GcItems.gemPeridot);
		regItem(GcItems.gemRuby);
		
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