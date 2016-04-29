package anora.guildcraft.main.proxy;

import anora.guildcraft.main.blocks.GcBlocks;
import anora.guildcraft.main.items.GcItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent preEvent)
	{
		GcBlocks.initBlocks();
		GcItems.initItems();
	}

	public void Init(FMLInitializationEvent event)
	{
		
	}
	
	
	public void postInit(FMLPostInitializationEvent postEvent)
	{
		
	}
}
.