package anora.guildcraft.main.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GcItems 
{
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
	
	/**
	//unsorter
	public static Item rodMystic;
	public static Item axeBronz;
	public static Item hoeBronz;
	public static Item pickBronz;
	public static Item shovelBronz;
	public static Item swordBronz;
	public static Item axeCopper;
	public static Item hoeCopper;
	public static Item pickCopper;
	public static Item shovelCopper;
	public static Item swordCopper;
	public static Item axeDragonite;
	public static Item dragonite_bow_standby;
	public static Item hoeDragonite;
	public static Item pickDragonite;
	public static Item shovelDragonite;
	public static Item swordDragonite;
	public static Item axeMystic;
	public static Item mystic_bow_standby;
	public static Item hoeMystic;
	public static Item pickMystic;
	public static Item shovelMystic;
	public static Item swordMystic;
	public static Item axeOrichalcum;
	public static Item hoeOrichalcum;
	public static Item pickOrichalcum;
	public static Item shovelOrichalcum;
	public static Item swordOrichalcum;
	*/
	
	public static void initItems()
	{
		//Ingots
		GameRegistry.registerItem(ingotCopper = new GcItem("ingotcopper"),"ingotCopper");
		GameRegistry.registerItem(ingotTin = new GcItem("ingotTin"),"ingotTin");
		GameRegistry.registerItem(ingotBronze = new GcItem("ingotBronze"),"ingotBronze");
		GameRegistry.registerItem(ingotZinc = new GcItem("ingotZinc"),"ingotZinc");
		GameRegistry.registerItem(ingotAluminum = new GcItem("ingotAluminum"),"ingotAluminum");
		GameRegistry.registerItem(ingotSilver = new GcItem("ingotSilver"),"ingotSilver");
		GameRegistry.registerItem(ingotPlatinum = new GcItem("ingotPlatnum"),"ingotPlatnum");
		GameRegistry.registerItem(ingotMythirl = new GcItem("ingotMythirll"),"ingotMythirll");
		GameRegistry.registerItem(ingotDragonite = new GcItem("ingotDragonite"),"ingotDragonite");
		GameRegistry.registerItem(ingotOrichalcum = new GcItem("ingotOrichalcum"),"ingotOrichalcum");
		GameRegistry.registerItem(ingotBrass = new GcItem("ingotBrass"), "ingotBrass");
		
		//Crafted
		GameRegistry.registerItem(stickDragonite = new GcItem("stickDragonite"),"stickDragonite");
		GameRegistry.registerItem(nuggetDragonite = new GcItem("nuggetDragonite"),"nuggetDragonite");
		GameRegistry.registerItem(nuggetBronze = new GcItem("nuggetBronze"),"nuggetBronze");
		GameRegistry.registerItem(nuggetCopper = new GcItem("nuggetCopper"),"nuggetCopper");
		GameRegistry.registerItem(nuggetBrass = new GcItem("nuggetBrass"),"nuggetBrass");
		GameRegistry.registerItem(nuggetAluminum = new GcItem("nuggetAluminum"),"nuggetAluminum");
		GameRegistry.registerItem(nuggetTin = new GcItem("nuggetTin"),"nuggetTin");
		GameRegistry.registerItem(nuggetPlatinum = new GcItem("nuggetPlatnum"),"nuggetPlatnum");
		GameRegistry.registerItem(nuggetSilver = new GcItem("nuggetSilver"),"nuggetSilver");
		GameRegistry.registerItem(nuggetMythirl = new GcItem("nuggetMythirll"),"nuggetMythirll");
		GameRegistry.registerItem(nuggetOrichalcum = new GcItem("nuggetOrichalcum"),"nuggetOrichalcum");
		GameRegistry.registerItem(nuggetZinc = new GcItem("nuggetZinc"),"nuggetZinc");
		
	}
}
