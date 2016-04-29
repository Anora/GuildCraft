package anora.guildcraft.main.proxy;

import anora.guildcraft.main.render.GcBlockRender;
import anora.guildcraft.main.render.GcItemRender;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
	
	public void preInit(FMLPreInitializationEvent preEvent)
	{
		super.preInit(preEvent);
		
		GcBlockRender.registerBlockRender();
		GcItemRender.registerItemRender();
	}

	public void Init(FMLInitializationEvent event)
	{
		super.Init(event);
	}
	
	
	public void postInit(FMLPostInitializationEvent postEvent)
	{
		super.postInit(postEvent);
	}
}
.