package anora.guildcraft.main.blocks;

import anora.guildcraft.main.GcGlobal;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

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
}

