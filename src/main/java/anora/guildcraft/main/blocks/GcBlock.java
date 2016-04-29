package anora.guildcraft.main.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class GcBlock extends Block
{
	public GcBlock(String unlocalizedname, Material material, float hardness, float resistance)
	{
		super(material);
		
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setRegistryName(unlocalizedname);
		this.setHardness(hardness);
		this.setResistance(resistance);
		
	}
}

