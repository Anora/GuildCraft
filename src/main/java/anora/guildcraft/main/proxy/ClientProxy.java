package anora.guildcraft.main.proxy;

import anora.guildcraft.main.render.GcBlockRender;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
	
	public void preInit(FMLPreInitializationEvent preEvent)
	{
		super.preInit(preEvent);
		


	}

	public void Init(FMLInitializationEvent event)
	{
		super.Init(event);
		
		GcBlockRender.registerBlockRender();
	}
	
	
	public void postInit(FMLPostInitializationEvent postEvent)
	{
		super.postInit(postEvent);
	}
}
