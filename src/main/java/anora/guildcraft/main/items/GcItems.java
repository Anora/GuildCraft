package anora.guildcraft.main.items;

import anora.guildcraft.main.GcGlobal;
import anora.guildcraft.main.items.armor.GcBronzeArmor;
import anora.guildcraft.main.items.armor.GcCopperArmor;
import anora.guildcraft.main.items.armor.GcDragoniteArmor;
import anora.guildcraft.main.items.armor.GcMythirlArmor;
import anora.guildcraft.main.items.armor.GcOrichalcumArmor;
import anora.guildcraft.main.items.armor.GcSilverArmor;
import anora.guildcraft.main.items.tools.GcaxeBronze;
import anora.guildcraft.main.items.tools.GcaxeCopper;
import anora.guildcraft.main.items.tools.GcaxeDragonite;
import anora.guildcraft.main.items.tools.GcaxeMythirl;
import anora.guildcraft.main.items.tools.GcaxeOrichalcum;
import anora.guildcraft.main.items.tools.GcaxeSilver;
import anora.guildcraft.main.items.tools.GchoeBronze;
import anora.guildcraft.main.items.tools.GchoeCopper;
import anora.guildcraft.main.items.tools.GchoeDragonite;
import anora.guildcraft.main.items.tools.GchoeMythirl;
import anora.guildcraft.main.items.tools.GchoeOrichalcum;
import anora.guildcraft.main.items.tools.GchoeSilver;
import anora.guildcraft.main.items.tools.GcpickaxeBronze;
import anora.guildcraft.main.items.tools.GcpickaxeCopper;
import anora.guildcraft.main.items.tools.GcpickaxeDragonite;
import anora.guildcraft.main.items.tools.GcpickaxeMythirl;
import anora.guildcraft.main.items.tools.GcpickaxeOrichalcum;
import anora.guildcraft.main.items.tools.GcpickaxeSilver;
import anora.guildcraft.main.items.tools.GcspadeBronze;
import anora.guildcraft.main.items.tools.GcspadeCopper;
import anora.guildcraft.main.items.tools.GcspadeDragonite;
import anora.guildcraft.main.items.tools.GcspadeMythirl;
import anora.guildcraft.main.items.tools.GcspadeOrichalcum;
import anora.guildcraft.main.items.tools.GcspadeSilver;
import anora.guildcraft.main.items.tools.GcswordBronze;
import anora.guildcraft.main.items.tools.GcswordCopper;
import anora.guildcraft.main.items.tools.GcswordDragonite;
import anora.guildcraft.main.items.tools.GcswordMythirl;
import anora.guildcraft.main.items.tools.GcswordOrichalcum;
import anora.guildcraft.main.items.tools.GcswordSilver;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GcItems 
{
	//Tools
	public static ToolMaterial toolsCopper = EnumHelper.addToolMaterial("toolCopper", 1, 180, 4.0F, 1.5F, 10);
	public static ToolMaterial toolsBronze = EnumHelper.addToolMaterial("toolsBronze", 2, 350, 6.0F, 2.0F, 15);
	public static ToolMaterial toolsDragonite = EnumHelper.addToolMaterial("toolDragonite", 4, 180, 9.0F, 3.5F, 17);
	public static ToolMaterial toolsSilver = EnumHelper.addToolMaterial("toolSilver", 2, 550, 6.0F, 1.8F, 16);
	public static ToolMaterial toolsMythirl = EnumHelper.addToolMaterial("toolMythirl", 3, 1375, 12.0F, 2.5F, 12);
	public static ToolMaterial toolsOrichalcum = EnumHelper.addToolMaterial("toolOrichalcum", 5, 180, 10.0F, 4.0F, 20);
	
	//Armor
	public static ArmorMaterial armorCopper = EnumHelper.addArmorMaterial("armorCopper", GcGlobal.MOD_ID + ":" + "Copper", 10, new int[]{2, 5, 3, 1}, 11);
	public static ArmorMaterial armorBronze = EnumHelper.addArmorMaterial("armorBronze", GcGlobal.MOD_ID + ":" + "Bronze", 14, new int[]{2, 5, 3, 2}, 11);
	public static ArmorMaterial armorDragonite = EnumHelper.addArmorMaterial("armorDragonite", GcGlobal.MOD_ID + ":" + "Dragonite", 39, new int[]{4, 9, 7, 3}, 15);
	public static ArmorMaterial armorSilver = EnumHelper.addArmorMaterial("armorSilver", GcGlobal.MOD_ID + ":" + "Silver", 19, new int[]{2, 6, 5, 2}, 25);
	public static ArmorMaterial armorMythirl = EnumHelper.addArmorMaterial("armorMythirl", GcGlobal.MOD_ID + ":" + "Mythirl", 25, new int[]{2, 7, 4, 2}, 25);
	public static ArmorMaterial armorOrichalcum = EnumHelper.addArmorMaterial("armorOrichalcum", GcGlobal.MOD_ID + ":" + "Orichalcum", 45, new int[]{4, 10, 8, 4}, 30);

	//Tools
	public static Item pickaxeCopper;
	public static Item axeCopper;
	public static Item spadeCopper;
	public static Item hoeCopper;
	public static Item swordCopper;

	public static Item pickaxeBronze;
	public static Item axeBronze;
	public static Item spadeBronze;
	public static Item hoeBronze;
	public static Item swordBronze;

	public static Item pickaxeDragonite;
	public static Item axeDragonite;
	public static Item spadeDragonite;
	public static Item hoeDragonite;
	public static Item swordDragonite;

	public static Item pickaxeSilver;
	public static Item axeSilver;
	public static Item spadeSilver;
	public static Item hoeSilver;
	public static Item swordSilver;

	public static Item pickaxeMythirl;
	public static Item axeMythirl;
	public static Item spadeMythirl;
	public static Item hoeMythirl;
	public static Item swordMythirl;

	public static Item pickaxeOrichalcum;
	public static Item axeOrichalcum;
	public static Item spadeOrichalcum;
	public static Item hoeOrichalcum;
	public static Item swordOrichalcum;
	
	//Armor
	public static Item copperHelmet;
	public static Item copperChestplate;
	public static Item copperLeggings;
	public static Item copperBoots;
	
	public static Item bronzeHelmet;
	public static Item bronzeChestplate;
	public static Item bronzeLeggings;
	public static Item bronzeBoots;
	
	public static Item dragoniteHelmet;
	public static Item dragoniteChestplate;
	public static Item dragoniteLeggings;
	public static Item dragoniteBoots;
	
	public static Item silverHelmet;
	public static Item silverChestplate;
	public static Item silverLeggings;
	public static Item silverBoots;
	
	public static Item mythirlHelmet;
	public static Item mythirlChestplate;
	public static Item mythirlLeggings;
	public static Item mythirlBoots;
	
	public static Item orichalcumHelmet;
	public static Item orichalcumChestplate;
	public static Item orichalcumLeggings;
	public static Item orichalcumBoots;
	
	//ingot
	public static Item ingotBronze;
	public static Item ingotCopper;
	public static Item ingotBrass;
	public static Item ingotDragonite;
	public static Item ingotAluminum;
	public static Item ingotTin;
	public static Item ingotPlatinum;
	public static Item ingotSilver;
	public static Item ingotMythirl;
	public static Item ingotOrichalcum;
	public static Item ingotZinc;
	
	//gems
	public static Item gemTopaz;
	public static Item gemRuby;
	public static Item gemPeridot;

	//crafted item
	public static Item stickDragonite;
	public static Item nuggetDragonite;
	public static Item nuggetBronze;
	public static Item nuggetCopper;
	public static Item nuggetBrass;
	public static Item nuggetAluminum;
	public static Item nuggetTin;
	public static Item nuggetPlatinum;
	public static Item nuggetSilver;
	public static Item nuggetMythirl;
	public static Item nuggetOrichalcum;
	public static Item nuggetZinc;
	
	
	//looted item
	public static Item stoneMystic;
	
	
	public static void initItems()
	{
		//Tools
		GameRegistry.registerItem(pickaxeCopper = new GcpickaxeCopper("pickaxeCopper", toolsCopper), "pickaxeCopper");
		GameRegistry.registerItem(axeCopper = new GcaxeCopper("axeCopper", toolsCopper), "axeCopper");
		GameRegistry.registerItem(spadeCopper = new GcspadeCopper("spadeCopper", toolsCopper), "spadeCopper");
		GameRegistry.registerItem(hoeCopper = new GchoeCopper("hoeCopper", toolsCopper), "hoeCopper");
		GameRegistry.registerItem(swordCopper = new GcswordCopper("swordCopper", toolsCopper), "swordCopper");
		
		GameRegistry.registerItem(pickaxeBronze = new GcpickaxeBronze("pickaxeBronze", toolsBronze), "pickaxeBronze");
		GameRegistry.registerItem(axeBronze = new GcaxeBronze("axeBronze", toolsBronze), "axeBronze");
		GameRegistry.registerItem(spadeBronze = new GcspadeBronze("spadeBronze", toolsBronze), "spadeBronze");
		GameRegistry.registerItem(hoeBronze = new GchoeBronze("hoeBronze", toolsBronze), "hoeBronze");
		GameRegistry.registerItem(swordBronze = new GcswordBronze("swordBronze", toolsBronze), "swordBronze");
		
		GameRegistry.registerItem(pickaxeDragonite = new GcpickaxeDragonite("pickaxeDragonite", toolsDragonite), "pickaxeDragonite");
		GameRegistry.registerItem(axeDragonite = new GcaxeDragonite("axeDragonite", toolsDragonite), "axeDragonite");
		GameRegistry.registerItem(spadeDragonite = new GcspadeDragonite("spadeDragonite", toolsDragonite), "spadeDragonite");
		GameRegistry.registerItem(hoeDragonite = new GchoeDragonite("hoeDragonite", toolsDragonite), "hoeDragonite");
		GameRegistry.registerItem(swordDragonite = new GcswordDragonite("swordDragonite", toolsDragonite), "swordDragonite");
		
		GameRegistry.registerItem(pickaxeSilver = new GcpickaxeSilver("pickaxeSilver", toolsSilver), "pickaxeSilver");
		GameRegistry.registerItem(axeSilver = new GcaxeSilver("axeSilver", toolsSilver), "axeSilver");
		GameRegistry.registerItem(spadeSilver = new GcspadeSilver("spadeSilver", toolsSilver), "spadeSilver");
		GameRegistry.registerItem(hoeSilver = new GchoeSilver("hoeSilver", toolsSilver), "hoeSilver");
		GameRegistry.registerItem(swordSilver = new GcswordSilver("swordSilver", toolsSilver), "swordSilver");
		
		GameRegistry.registerItem(pickaxeMythirl = new GcpickaxeMythirl("pickaxeMythirl", toolsMythirl), "pickaxeMythirl");
		GameRegistry.registerItem(axeMythirl = new GcaxeMythirl("axeMythirl", toolsMythirl), "axeMythirl");
		GameRegistry.registerItem(spadeMythirl = new GcspadeMythirl("spadeMythirl", toolsMythirl), "spadeMythirl");
		GameRegistry.registerItem(hoeMythirl = new GchoeMythirl("hoeMythirl", toolsMythirl), "hoeMythirl");
		GameRegistry.registerItem(swordMythirl = new GcswordMythirl("swordMythirl", toolsMythirl), "swordMythirl");
		
		GameRegistry.registerItem(pickaxeOrichalcum = new GcpickaxeOrichalcum("pickaxeOrichalcum", toolsOrichalcum), "pickaxeOrichalcum");
		GameRegistry.registerItem(axeOrichalcum = new GcaxeOrichalcum("axeOrichalcum", toolsOrichalcum), "axeOrichalcum");
		GameRegistry.registerItem(spadeOrichalcum = new GcspadeOrichalcum("spadeOrichalcum", toolsOrichalcum), "spadeOrichalcum");
		GameRegistry.registerItem(hoeOrichalcum = new GchoeOrichalcum("hoeOrichalcum", toolsOrichalcum), "hoeOrichalcum");
		GameRegistry.registerItem(swordOrichalcum = new GcswordOrichalcum("swordOrichalcum", toolsOrichalcum), "swordOrichalcum");
		
		//Armor
		GameRegistry.registerItem(copperHelmet = new GcCopperArmor("copperHelmet", armorCopper, 1, 0),"copperHelmet");
		GameRegistry.registerItem(copperChestplate = new GcCopperArmor("copperChestplatet", armorCopper, 1, 1),"copperChestplate");
		GameRegistry.registerItem(copperLeggings = new GcCopperArmor("copperLeggings", armorCopper, 2, 2),"copperLeggings");
		GameRegistry.registerItem(copperBoots = new GcCopperArmor("copperBoots", armorCopper, 1, 3),"copperBoots");
		
		GameRegistry.registerItem(bronzeHelmet = new GcBronzeArmor("bronzeHelmet", armorBronze, 1, 0),"bronzeHelmet");
		GameRegistry.registerItem(bronzeChestplate = new GcBronzeArmor("bronzeChestplatet", armorBronze, 1, 1),"bronzeChestplate");
		GameRegistry.registerItem(bronzeLeggings = new GcBronzeArmor("bronzeLeggings", armorBronze, 2, 2),"bronzeLeggings");
		GameRegistry.registerItem(bronzeBoots = new GcBronzeArmor("bronzeBoots", armorBronze, 1, 3),"bronzeBoots");
		
		GameRegistry.registerItem(dragoniteHelmet = new GcDragoniteArmor("dragoniteHelmet", armorDragonite, 1, 0),"dragoniteHelmet");
		GameRegistry.registerItem(dragoniteChestplate = new GcDragoniteArmor("dragoniteChestplatet", armorDragonite, 1, 1),"dragoniteChestplate");
		GameRegistry.registerItem(dragoniteLeggings = new GcDragoniteArmor("dragoniteLeggings", armorDragonite, 2, 2),"dragoniteLeggings");
		GameRegistry.registerItem(dragoniteBoots = new GcDragoniteArmor("dragoniteBoots", armorDragonite, 1, 3),"dragoniteBoots");
		
		GameRegistry.registerItem(silverHelmet = new GcSilverArmor("silverHelmet", armorSilver, 1, 0),"silverHelmet");
		GameRegistry.registerItem(silverChestplate = new GcSilverArmor("silverChestplatet", armorSilver, 1, 1),"silverChestplate");
		GameRegistry.registerItem(silverLeggings = new GcSilverArmor("silverLeggings", armorSilver, 2, 2),"silverLeggings");
		GameRegistry.registerItem(silverBoots = new GcSilverArmor("silverBoots", armorSilver, 1, 3),"silverBoots");
		
		GameRegistry.registerItem(mythirlHelmet = new GcMythirlArmor("mythirlHelmet", armorMythirl, 1, 0),"mythirlHelmet");
		GameRegistry.registerItem(mythirlChestplate = new GcMythirlArmor("mythirlChestplatet", armorMythirl, 1, 1),"mythirlChestplate");
		GameRegistry.registerItem(mythirlLeggings = new GcMythirlArmor("mythirlLeggings", armorMythirl, 2, 2),"mythirlLeggings");
		GameRegistry.registerItem(mythirlBoots = new GcMythirlArmor("mythirlBoots", armorMythirl, 1, 3),"mythirlBoots");
		
		GameRegistry.registerItem(orichalcumHelmet = new GcOrichalcumArmor("orichalcumHelmet", armorOrichalcum, 1, 0),"orichalcumHelmet");
		GameRegistry.registerItem(orichalcumChestplate = new GcOrichalcumArmor("orichalcumChestplatet", armorOrichalcum, 1, 1),"orichalcumChestplate");
		GameRegistry.registerItem(orichalcumLeggings = new GcOrichalcumArmor("orichalcumLeggings", armorOrichalcum, 2, 2),"orichalcumLeggings");
		GameRegistry.registerItem(orichalcumBoots = new GcOrichalcumArmor("orichalcumBoots", armorOrichalcum, 1, 3),"orichalcumBoots");
		
		//Ingots
		GameRegistry.registerItem(ingotCopper = new GcItem("ingotcopper"),"ingotCopper");
		GameRegistry.registerItem(ingotTin = new GcItem("ingotTin"),"ingotTin");
		GameRegistry.registerItem(ingotBronze = new GcItem("ingotBronze"),"ingotBronze");
		GameRegistry.registerItem(ingotZinc = new GcItem("ingotZinc"),"ingotZinc");
		GameRegistry.registerItem(ingotAluminum = new GcItem("ingotAluminum"),"ingotAluminum");
		GameRegistry.registerItem(ingotSilver = new GcItem("ingotSilver"),"ingotSilver");
		GameRegistry.registerItem(ingotPlatinum = new GcItem("ingotPlatinum"),"ingotPlatinum");
		GameRegistry.registerItem(ingotMythirl = new GcItem("ingotMythirl"),"ingotMythirl");
		GameRegistry.registerItem(ingotDragonite = new GcItem("ingotDragonite"),"ingotDragonite");
		GameRegistry.registerItem(ingotOrichalcum = new GcItem("ingotOrichalcum"),"ingotOrichalcum");
		GameRegistry.registerItem(ingotBrass = new GcItem("ingotBrass"), "ingotBrass");
		
		//gems
		GameRegistry.registerItem(gemTopaz = new GcItem("Topaz"), "Topaz");
		GameRegistry.registerItem(gemRuby = new GcItem("Ruby"), "Ruby");
		GameRegistry.registerItem(gemPeridot = new GcItem("Peridot"), "Peridot");
		
		//Crafted
		GameRegistry.registerItem(stickDragonite = new GcItem("stickDragonite"),"stickDragonite");
		GameRegistry.registerItem(nuggetDragonite = new GcItem("nuggetDragonite"),"nuggetDragonite");
		GameRegistry.registerItem(nuggetBronze = new GcItem("nuggetBronze"),"nuggetBronze");
		GameRegistry.registerItem(nuggetCopper = new GcItem("nuggetCopper"),"nuggetCopper");
		GameRegistry.registerItem(nuggetBrass = new GcItem("nuggetBrass"),"nuggetBrass");
		GameRegistry.registerItem(nuggetAluminum = new GcItem("nuggetAluminum"),"nuggetAluminum");
		GameRegistry.registerItem(nuggetTin = new GcItem("nuggetTin"),"nuggetTin");
		GameRegistry.registerItem(nuggetPlatinum = new GcItem("nuggetPlatinum"),"nuggetPlatinum");
		GameRegistry.registerItem(nuggetSilver = new GcItem("nuggetSilver"),"nuggetSilver");
		GameRegistry.registerItem(nuggetMythirl = new GcItem("nuggetMythirl"),"nuggetMythirl");
		GameRegistry.registerItem(nuggetOrichalcum = new GcItem("nuggetOrichalcum"),"nuggetOrichalcum");
		GameRegistry.registerItem(nuggetZinc = new GcItem("nuggetZinc"),"nuggetZinc");
		
		
		//looted item
		GameRegistry.registerItem(stoneMystic = new GcItem("stoneMystic"),"stoneMystic");
		
	}
}
