package anora.guildcraft.main;

import anora.guildcraft.main.proxy.CommonProxy;
import anora.guildcraft.main.world.GcWorldGen;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = GcGlobal.MOD_ID, name = GcGlobal.MOD_NAME, version = GcGlobal.VERSION )
public class Guildcraft 
{
	
	@Instance(GcGlobal.MOD_ID)
	public static Guildcraft instance;
	
	
	@SidedProxy(clientSide = GcGlobal.GC_CLIENT_PROXY, serverSide = GcGlobal.GC_SERVER_PROXY)
	public static CommonProxy proxy;
	
	public static final GcCreativeTab tabguildcraft = new GcCreativeTab("tabguildcraft");
	
	@SuppressWarnings("static-access")
	@EventHandler
	public void preInit(FMLPreInitializationEvent preEvent)
	{
		this.proxy.preInit(preEvent);
		
		
	}

	@SuppressWarnings("static-access")
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		this.proxy.Init(event);
		
		GameRegistry.registerWorldGenerator(new GcWorldGen(), 0);
		
	}
	
	@SuppressWarnings("static-access")
	@EventHandler
	public void postInit(FMLPostInitializationEvent postEvent)
	{
		this.proxy.postInit(postEvent);
	}
}
.