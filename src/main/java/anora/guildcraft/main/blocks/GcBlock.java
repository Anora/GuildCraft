package anora.guildcraft.main.blocks;

import java.util.Random;

import anora.guildcraft.main.GcGlobal;
import anora.guildcraft.main.items.GcItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class GcBlock extends Block
{
	public GcBlock(String unlocalizedname, Material material, float hardness, float resistance)
	{
		super(material);
		
		this.setCreativeTab(GcGlobal.gcCreativeTab);
		this.setUnlocalizedName(unlocalizedname);
		this.setHardness(hardness);
		this.setResistance(resistance);
		
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return this == GcBlocks.oreTopaz ? GcItems.gemTopaz : this == GcBlocks.orePeridot ? GcItems.gemPeridot :
			this == GcBlocks.oreRuby ? GcItems.gemRuby : Item.getItemFromBlock(this);
	}
	
	public int quantityDropped(Random random)
	{
		return this == GcBlocks.oreTopaz ? 1 + random.nextInt(2) : this == GcBlocks.orePeridot ? 1 + random.nextInt(2) : 
			this == GcBlocks.oreRuby ? 1 + random.nextInt(2) : 1;
	}
}

