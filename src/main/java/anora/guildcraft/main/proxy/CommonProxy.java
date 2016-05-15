package anora.guildcraft.main.proxy;

import anora.guildcraft.main.blocks.GcBlocks;
import anora.guildcraft.main.crafting.GcRecpies;
import anora.guildcraft.main.crafting.GcSmelting;
import anora.guildcraft.main.handler.GcDropHandler;
import anora.guildcraft.main.handler.GcFuelHandler;
import anora.guildcraft.main.items.GcItems;
import anora.guildcraft.main.world.GcWorldGen;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent preEvent)
	{
		//Init blocks and such
		GcBlocks.initBlocks();
		GcItems.initItems();

		//Init Crafting things
		GcRecpies.initRecipes();
		GcSmelting.initSmelting();


	}

	public void Init(FMLInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new GcWorldGen(), 0);
		MinecraftForge.EVENT_BUS.register(new GcDropHandler());
		GameRegistry.registerFuelHandler(new GcFuelHandler());
	}
	
	
	public void postInit(FMLPostInitializationEvent postEvent)
	{
		
	}
}
