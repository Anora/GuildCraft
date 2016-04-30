package anora.guildcraft.main.render;

import anora.guildcraft.main.GcGlobal;
import anora.guildcraft.main.blocks.GcBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
//import net.minecraftforge.client.model.ModelLoader;

public class GcBlockRender
{
	public static void registerBlockRender()
	{
		//Ores
		regBlock(GcBlocks.oreAluminum);
		regBlock(GcBlocks.oreCopper);
		regBlock(GcBlocks.oreDragonite);
		regBlock(GcBlocks.oreMythirl);
		regBlock(GcBlocks.oreOrichalcum);
		regBlock(GcBlocks.orePlatinum);
		regBlock(GcBlocks.oreSilver);
		regBlock(GcBlocks.oreTin);
		
		//Blocks
		
	}

	private static void regBlock(Block block) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block) , 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(GcGlobal.MOD_ID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
}