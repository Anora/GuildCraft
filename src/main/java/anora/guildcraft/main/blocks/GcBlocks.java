package anora.guildcraft.main.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GcBlocks
{
	
	//ore
	public static Block oreDragonite;
	public static Block oreAluminum;
	public static Block oreCopper;
	public static Block oreTin;
	public static Block orePlatnum;
	public static Block oreSilver;
	public static Block oreMythirll;
	public static Block oreOrichalcum;
	public static Block oreZink;
	
	//blocks
	
	//crafting block
	//public static Block tableMystic;
	//public static Block furnesAloyMysticIdle;
	//public static Block furnesAloyMysticActive;
	
	public static void initBlocks()
	{
		//Ores
		GameRegistry.registerBlock(oreCopper = new GcBlock("oreCopper", Material.rock, 3, 15), "oreCopper");
		GameRegistry.registerBlock(oreTin = new GcBlock("oreTin", Material.rock, 3, 15), "oreTin");
		GameRegistry.registerBlock(oreAluminum = new GcBlock("oreAluminum", Material.rock, 3, 15), "oreAluminum");
		GameRegistry.registerBlock(oreSilver = new GcBlock("oreSilver", Material.rock, 3, 15), "oreSilver");
		GameRegistry.registerBlock(orePlatnum = new GcBlock("orePlatnum", Material.rock, 3, 15), "orePlatnum");
		GameRegistry.registerBlock(oreMythirll = new GcBlock("oreMythirll", Material.rock, 3, 15), "oreMythirll");
		GameRegistry.registerBlock(oreDragonite = new GcBlock("oreDragonite", Material.rock, 4, 15), "oreDragonite");
		GameRegistry.registerBlock(oreOrichalcum = new GcBlock("oreOrichalcum", Material.rock, 4, 15), "oreOrichalcum");
		GameRegistry.registerBlock(oreZink = new GcBlock("oreZink", Material.rock, 4, 15), "oreZink");
		
		//Blocks
		//GameRegistry.registerBlock(tableMystic = new GcBlock("tableMystic"),Material.iron)
		//GameRegistry.registerBlock(furnesAloyMysticIdle = new GcBlock(furnesAloyMysticIdle),Material.iron)
		//GameRegistry.registerBlock(furnesAloyMysticActive = new GcBlock(furnesAloyMysticActive),Material.iron)
	}

}
.