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
