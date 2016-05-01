package anora.guildcraft.main.crafting;

import anora.guildcraft.main.blocks.GcBlocks;
import anora.guildcraft.main.items.GcItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GcSmelting 
{
	public static void initSmelting()
	{
		GameRegistry.addSmelting(GcBlocks.oreAluminum, new ItemStack(GcItems.ingotAluminum), 0);
		GameRegistry.addSmelting(GcBlocks.oreCopper, new ItemStack(GcItems.ingotCopper), 0);
		GameRegistry.addSmelting(GcBlocks.oreDragonite, new ItemStack(GcItems.ingotDragonite), 0);
		GameRegistry.addSmelting(GcBlocks.oreMythirl, new ItemStack(GcItems.ingotMythirl), 0);
		GameRegistry.addSmelting(GcBlocks.oreOrichalcum, new ItemStack(GcItems.ingotOrichalcum), 0);
		GameRegistry.addSmelting(GcBlocks.orePlatinum, new ItemStack(GcItems.ingotPlatinum), 0);
		GameRegistry.addSmelting(GcBlocks.oreSilver, new ItemStack(GcItems.ingotSilver), 0);
		GameRegistry.addSmelting(GcBlocks.oreTin, new ItemStack(GcItems.ingotTime), 0);
		GameRegistry.addSmelting(GcBlocks.oreZinc, new ItemStack(GcItems.ingotZinc), 0);
	}
}
