package anora.guildcraft.main.items.armor;

import anora.guildcraft.main.GcGlobal;
import anora.guildcraft.main.items.GcItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class GcDragoniteArmor extends ItemArmor
{

	public GcDragoniteArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) 
	{
		super(material, renderIndex, armorType);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(GcGlobal.gcCreativeTab);
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemstack)
	{
		if(itemstack.getItem() == GcItems.dragoniteHelmet)
		{
			this.effectPlayer(player, Potion.nightVision, 0);
		}
		if(itemstack.getItem() == GcItems.dragoniteChestplate)
		{
			this.effectPlayer(player, Potion.healthBoost, 1);
		}
		if(itemstack.getItem() == GcItems.dragoniteLeggings)
		{
			this.effectPlayer(player, Potion.jump, 0);
		}
		if(itemstack.getItem() == GcItems.dragoniteBoots)
		{
			this.effectPlayer(player, Potion.moveSpeed, 1);
		}
		if(this.isWearingFullset(player, GcItems.dragoniteHelmet, GcItems.dragoniteChestplate, GcItems.dragoniteLeggings, GcItems.dragoniteBoots))
		{
			this.effectPlayer(player, Potion.invisibility, 1);
		}
	}
	
	private boolean isWearingFullset(EntityPlayer player, Item helmet, Item chestplate, Item leggings, Item boots)
	{
		return player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == helmet
				&& player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == chestplate
				&& player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == leggings
				&& player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == boots;
	}
	
	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier)
	{
		if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
			player.addPotionEffect(new PotionEffect(potion.id, 159, amplifier, true, true));
	}

}
