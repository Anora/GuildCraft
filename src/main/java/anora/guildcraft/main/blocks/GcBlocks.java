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
	public static Block orePlatinum;
	public static Block oreSilver;
	public static Block oreMythirl;
	public static Block oreOrichalcum;
	public static Block oreZinc;
	
	//gems
	public static Block oreTopaz;
	public static Block orePeridot;
	public static Block oreRuby;
	
	//blocks
	public static Block blockDragonite;
	public static Block blockAluminum;
	public static Block blockCopper;
	public static Block blockTin;
	public static Block blockPlatinum;
	public static Block blockSilver;
	public static Block blockMythirl;
	public static Block blockOrichalcum;
	public static Block blockZinc;
	public static Block blockBronze;
	public static Block blockBrass;

	
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
		GameRegistry.registerBlock(orePlatinum = new GcBlock("orePlatinum", Material.rock, 3, 15), "orePlatinum");
		GameRegistry.registerBlock(oreMythirl = new GcBlock("oreMythirl", Material.rock, 3, 15), "oreMythirl");
		GameRegistry.registerBlock(oreDragonite = new GcBlock("oreDragonite", Material.rock, 4, 15), "oreDragonite");
		GameRegistry.registerBlock(oreOrichalcum = new GcBlock("oreOrichalcum", Material.rock, 4, 15), "oreOrichalcum");
		GameRegistry.registerBlock(oreZinc = new GcBlock("oreZinc", Material.rock, 4, 15), "oreZinc");
		
		//gems
		GameRegistry.registerBlock(oreTopaz = new GcBlock("oreTopaz", Material.rock, 3, 15), "oreTopaz");
		GameRegistry.registerBlock(orePeridot = new GcBlock("orePeridot", Material.rock, 3, 15), "orePeridot");
		GameRegistry.registerBlock(oreRuby = new GcBlock("oreRuby", Material.rock, 3, 15), "oreRuby");
		
		//Blocks
		GameRegistry.registerBlock(blockDragonite = new GcBlock("blockDragonite", Material.iron, 5, 10), "blockDragonite");
		GameRegistry.registerBlock(blockAluminum = new GcBlock("blockAluminum", Material.iron, 5, 10), "blockAluminum");
		GameRegistry.registerBlock(blockCopper = new GcBlock("blockCopper", Material.iron, 5, 10), "blockCopper");
		GameRegistry.registerBlock(blockTin = new GcBlock("blockTin", Material.iron, 5, 10), "blockTin");
		GameRegistry.registerBlock(blockPlatinum = new GcBlock("blockPlatinum", Material.iron, 5, 10), "blockPlatinum");
		GameRegistry.registerBlock(blockSilver = new GcBlock("blockSilver", Material.iron, 5, 10), "blockSilver");
		GameRegistry.registerBlock(blockMythirl = new GcBlock("blockMythirl", Material.iron, 5, 10), "blockMythirl");
		GameRegistry.registerBlock(blockOrichalcum = new GcBlock("blockOrichalcum", Material.iron, 5, 10), "blockOrichalcum");
		GameRegistry.registerBlock(blockZinc = new GcBlock("blockZinc", Material.iron, 5, 10), "blockZinc");
		GameRegistry.registerBlock(blockBronze = new GcBlock("blockBronze", Material.iron, 5, 10), "blockBronze");
		GameRegistry.registerBlock(blockBrass = new GcBlock("blockBrass", Material.iron, 5, 10), "blockBrass");
		//GameRegistry.registerBlock(tableMystic = new GcBlock("tableMystic"),Material.iron)
		//GameRegistry.registerBlock(furnesAloyMysticIdle = new GcBlock(furnesAloyMysticIdle),Material.iron)
		//GameRegistry.registerBlock(furnesAloyMysticActive = new GcBlock(furnesAloyMysticActive),Material.iron)
	}

}

