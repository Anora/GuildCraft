package anora.guildcraft.main.items;

import anora.guildcraft.main.items.tools.GcaxeBronze;
import anora.guildcraft.main.items.tools.GcaxeCopper;
import anora.guildcraft.main.items.tools.GcaxeDragonite;
import anora.guildcraft.main.items.tools.GcaxeMythirl;
import anora.guildcraft.main.items.tools.GcaxeSilver;
import anora.guildcraft.main.items.tools.GchoeBronze;
import anora.guildcraft.main.items.tools.GchoeCopper;
import anora.guildcraft.main.items.tools.GchoeDragonite;
import anora.guildcraft.main.items.tools.GchoeMythirl;
import anora.guildcraft.main.items.tools.GchoeSilver;
import anora.guildcraft.main.items.tools.GcpickaxeBronze;
import anora.guildcraft.main.items.tools.GcpickaxeCopper;
import anora.guildcraft.main.items.tools.GcpickaxeDragonite;
import anora.guildcraft.main.items.tools.GcpickaxeMythirl;
import anora.guildcraft.main.items.tools.GcpickaxeSilver;
import anora.guildcraft.main.items.tools.GcspadeBronze;
import anora.guildcraft.main.items.tools.GcspadeCopper;
import anora.guildcraft.main.items.tools.GcspadeDragonite;
import anora.guildcraft.main.items.tools.GcspadeMythirl;
import anora.guildcraft.main.items.tools.GcspadeSilver;
import anora.guildcraft.main.items.tools.GcswordBronze;
import anora.guildcraft.main.items.tools.GcswordCopper;
import anora.guildcraft.main.items.tools.GcswordDragonite;
import anora.guildcraft.main.items.tools.GcswordMythirl;
import anora.guildcraft.main.items.tools.GcswordSilver;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GcItems 
{
	//tools
	public static ToolMaterial toolsCopper = EnumHelper.addToolMaterial("toolCopper", 1, 180, 4.0F, 1.5F, 10);
	public static ToolMaterial toolsBronze = EnumHelper.addToolMaterial("toolsBronze", 2, 350, 6.0F, 2.0F, 15);
	public static ToolMaterial toolsDragonite = EnumHelper.addToolMaterial("toolDragonite", 4, 180, 9.0F, 3.5F, 17);
	public static ToolMaterial toolsSilver = EnumHelper.addToolMaterial("toolSilver", 2, 550, 6.0F, 1.8F, 16);
	public static ToolMaterial toolsMythirl = EnumHelper.addToolMaterial("toolMythirl", 3, 1375, 12.0F, 2.5F, 12);
	public static ToolMaterial toolsOrichalcum = EnumHelper.addToolMaterial("toolOrichalcum", 5, 180, 10.0F, 4.0F, 20);

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
	
	//ingot
	public static Item ingotBronze;
	public static Item ingotCopper;
	public static Item ingotBrass;
	public static Item ingotDragonite;
	public static Item ingotAluminum;
	public static Item ingotTime;
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
	public static Item nuggetTim;
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
		

		
		//Ingots
		GameRegistry.registerItem(ingotCopper = new GcItem("ingotcopper"),"ingotCopper");
		GameRegistry.registerItem(ingotTime = new GcItem("ingotTime"),"ingotTime");
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
		GameRegistry.registerItem(nuggetTim = new GcItem("nuggetTim"),"nuggetTim");
		GameRegistry.registerItem(nuggetPlatinum = new GcItem("nuggetPlatinum"),"nuggetPlatinum");
		GameRegistry.registerItem(nuggetSilver = new GcItem("nuggetSilver"),"nuggetSilver");
		GameRegistry.registerItem(nuggetMythirl = new GcItem("nuggetMythirl"),"nuggetMythirl");
		GameRegistry.registerItem(nuggetOrichalcum = new GcItem("nuggetOrichalcum"),"nuggetOrichalcum");
		GameRegistry.registerItem(nuggetZinc = new GcItem("nuggetZinc"),"nuggetZinc");
		
		
		//looted item
		GameRegistry.registerItem(stoneMystic = new GcItem("stoneMystic"),"stoneMystic");
		
	}
}
