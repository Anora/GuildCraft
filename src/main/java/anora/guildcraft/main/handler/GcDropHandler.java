package anora.guildcraft.main.handler;

import java.util.Random;

import anora.guildcraft.main.items.GcItems;
import anora.guildcraft.main.items.tools.GcpickaxeCopper;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class GcDropHandler 
{
	private Random rand = new Random();
	
	@SubscribeEvent
	public void addEntityDrop(LivingDropsEvent event)
	{
		if (event.entity instanceof EntitySkeleton)
		{
			ItemStack itemstack = new ItemStack(GcItems.stoneMystic, rand.nextInt(1));
			event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, itemstack));
		}
	}
	
	@SubscribeEvent
	public void addBlockDrop(HarvestDropsEvent event)
	{
		if(event.state.getBlock() == Blocks.mob_spawner)
		{
		
			
			ItemStack holding = event.harvester.inventory.getStackInSlot(event.harvester.inventory.currentItem);
			if(holding != null && holding.getItem() instanceof GcpickaxeCopper)
			{
				event.drops.clear();
				event.drops.add(new ItemStack(GcItems.stoneMystic, rand.nextInt(1)));
			}
		}
	}
}
