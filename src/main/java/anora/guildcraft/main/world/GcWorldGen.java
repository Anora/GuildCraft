package anora.guildcraft.main.world;

import java.util.Random;

import anora.guildcraft.main.blocks.GcBlocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class GcWorldGen implements IWorldGenerator
{

	//Ores
	private WorldGenerator oreDragonite;
	private WorldGenerator oreAluminum;
	private WorldGenerator oreCopper;
	private WorldGenerator oreTin;
	private WorldGenerator orePlatinum;
	private WorldGenerator oreSilver;
	private WorldGenerator oreMythirll;
	private WorldGenerator oreOrichalcum;
	
	public GcWorldGen()
	{
		//overworld
		this.oreAluminum = new GcWorldGenMinable(GcBlocks.oreAluminum.getDefaultState(), 3);
		this.oreCopper = new GcWorldGenMinable(GcBlocks.oreCopper.getDefaultState(), 8);
		this.oreDragonite = new GcWorldGenMinable(GcBlocks.oreDragonite.getDefaultState(), 3);
		this.oreMythirll = new GcWorldGenMinable(GcBlocks.oreMythirll.getDefaultState(), 5);
		this.oreOrichalcum = new GcWorldGenMinable(GcBlocks.oreOrichalcum.getDefaultState(), 3);
		this.orePlatinum = new GcWorldGenMinable(GcBlocks.orePlatinum.getDefaultState(), 4);
		this.oreSilver = new GcWorldGenMinable(GcBlocks.oreSilver.getDefaultState(), 4);
		this.oreTin = new GcWorldGenMinable(GcBlocks.oreTin.getDefaultState(), 6);
		//nether
		
		
		//end
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider)
	{
		switch(world.provider.getDimensionId())
		{
		case 0:
		//Overworld
			//Ores
			this.runGenerator(this.oreAluminum, world, random, chunkX, chunkZ, 10, 0, 100);
			this.runGenerator(this.oreCopper, world, random, chunkX, chunkZ, 20, 0, 225);
			this.runGenerator(this.oreDragonite, world, random, chunkX, chunkZ, 8, 3, 16);
			this.runGenerator(this.oreMythirll, world, random, chunkX, chunkZ, 10, 4, 15);
			this.runGenerator(this.oreOrichalcum, world, random, chunkX, chunkZ, 7, 3, 10);
			this.runGenerator(this.orePlatinum, world, random, chunkX, chunkZ, 10, 0, 45);
			this.runGenerator(this.oreSilver, world, random, chunkX, chunkZ, 10, 4, 20);
			this.runGenerator(this.oreTin, world, random, chunkX, chunkZ, 20, 0, 75);
			
			//Gems
			
			break;
			
		case -1:
		//Nether
			//Ores
			
			//Gems
			
			break;
			
		case 1:
		//End
			//Ores
			
			//Gems
			
			break;
		}
	}
	
	private void runGenerator (WorldGenerator generator, World world,Random rand, int chunkX, int chunkZ, int chanceToSpawn, int minHeight, int maxHeight)
	{
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Minimum or maximum hight out of bounds");
		
		int hightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chanceToSpawn; i++) 
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(hightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			generator.generate(world, rand, new BlockPos(x, y, z));
		}
	}
}
