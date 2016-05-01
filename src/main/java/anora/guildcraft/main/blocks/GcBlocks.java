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
	public static Block dragoniteBlock;
	public static Block aluminumBlock;
	public static Block copperBlock;
	public static Block tinBlock;
	public static Block platinumBlock;
	public static Block silverBlock;
	public static Block mythirlBlock;
	public static Block orichalcumBlock;
	public static Block zincBlock;
	public static Block bronzeBlock;
	public static Block brassBlock;

	
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

		GameRegistry.registerBlock(dragoniteBlock = new GcBlock("dragoniteBlock", Material.iron, 5, 10), "dragoniteBlock");
		GameRegistry.registerBlock(aluminumBlock = new GcBlock("aluminumBlock", Material.iron, 5, 10), "aluminumBlock");
		GameRegistry.registerBlock(copperBlock = new GcBlock("copperBlock", Material.iron, 5, 10), "copperBlock");
		GameRegistry.registerBlock(tinBlock = new GcBlock("tinBlock", Material.iron, 5, 10), "tinBlock");
		GameRegistry.registerBlock(platinumBlock = new GcBlock("platinumBlock", Material.iron, 5, 10), "platinumBlock");
		GameRegistry.registerBlock(silverBlock = new GcBlock("silverBlock", Material.iron, 5, 10), "silverBlock");
		GameRegistry.registerBlock(mythirlBlock = new GcBlock("mythirlBlock", Material.iron, 5, 10), "mythirlBlock");
		GameRegistry.registerBlock(orichalcumBlock = new GcBlock("orichalcumBlock", Material.iron, 5, 10), "orichalcumBlock");
		GameRegistry.registerBlock(zincBlock = new GcBlock("zincBlock", Material.iron, 5, 10), "zincBlock");
		GameRegistry.registerBlock(bronzeBlock = new GcBlock("bronzeBlock", Material.iron, 5, 10), "bronzeBlock");
		GameRegistry.registerBlock(brassBlock = new GcBlock("brassBlock", Material.iron, 5, 10), "brassBlock");
		//GameRegistry.registerBlock(tableMystic = new GcBlock("tableMystic"),Material.iron)
		//GameRegistry.registerBlock(furnesAloyMysticIdle = new GcBlock(furnesAloyMysticIdle),Material.iron)
		//GameRegistry.registerBlock(furnesAloyMysticActive = new GcBlock(furnesAloyMysticActive),Material.iron)
	}

}

