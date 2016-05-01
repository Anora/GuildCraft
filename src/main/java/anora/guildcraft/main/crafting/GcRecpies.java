package anora.guildcraft.main.crafting;

import anora.guildcraft.main.blocks.GcBlocks;
import anora.guildcraft.main.items.GcItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Ty's PC on 4/30/2016.
 */
public class GcRecpies {

    public static void initRecipes()
    {


        //INGOTS --> BLOCKS
        GameRegistry.addRecipe(new ItemStack(GcBlocks.copperBlock),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.ingotCopper

                });

        GameRegistry.addRecipe(new ItemStack(GcBlocks.aluminumBlock),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.ingotAluminum

                });

        GameRegistry.addRecipe(new ItemStack(GcBlocks.zincBlock),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.ingotZinc

                });

        GameRegistry.addRecipe(new ItemStack(GcBlocks.platinumBlock),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.ingotPlatinum

                });

        GameRegistry.addRecipe(new ItemStack(GcBlocks.platinumBlock),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.ingotPlatinum

                });

        GameRegistry.addRecipe(new ItemStack(GcBlocks.bronzeBlock),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.ingotBronze

                });

        GameRegistry.addRecipe(new ItemStack(GcBlocks.brassBlock),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.ingotBrass

                });

        GameRegistry.addRecipe(new ItemStack(GcBlocks.silverBlock),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.ingotSilver

                });

        GameRegistry.addRecipe(new ItemStack(GcBlocks.dragoniteBlock),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.ingotDragonite

                });

        GameRegistry.addRecipe(new ItemStack(GcBlocks.orichalcumBlock),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.ingotOrichalcum

                });




        //BLOCKS -->  INGOTS
        GameRegistry.addShapelessRecipe(new ItemStack(GcItems.ingotPlatinum,9),
                new Object[]{
                        GcBlocks.platinumBlock

                });

        GameRegistry.addShapelessRecipe(new ItemStack(GcItems.ingotZinc,9),
                new Object[]{
                        GcBlocks.zincBlock

                });

        GameRegistry.addShapelessRecipe(new ItemStack(GcItems.ingotOrichalcum,9),
                new Object[]{
                        GcBlocks.orichalcumBlock

                });

        GameRegistry.addShapelessRecipe(new ItemStack(GcItems.ingotTime,9),
                new Object[]{
                        GcBlocks.tinBlock

                });

        GameRegistry.addShapelessRecipe(new ItemStack(GcItems.ingotMythirl,9),
                new Object[]{
                        GcBlocks.mythirlBlock

                });

        GameRegistry.addShapelessRecipe(new ItemStack(GcItems.ingotSilver,9),
                new Object[]{
                        GcBlocks.silverBlock

                });

        GameRegistry.addShapelessRecipe(new ItemStack(GcItems.ingotAluminum,9),
                new Object[]{
                        GcBlocks.aluminumBlock

                });

        GameRegistry.addShapelessRecipe(new ItemStack(GcItems.ingotBrass,9),
                new Object[]{
                        GcBlocks.brassBlock

                });

        GameRegistry.addShapelessRecipe(new ItemStack(GcItems.ingotBronze,9),
                new Object[]{
                        GcBlocks.bronzeBlock

                });

        //INGOTS --> NUGGETS

        GameRegistry.addShapelessRecipe(new ItemStack(GcItems.nuggetPlatinum, 9),
                new Object[]{
                        GcItems.ingotPlatinum

                });

        GameRegistry.addShapelessRecipe(new ItemStack(GcItems.nuggetZinc, 9),
                new Object[]{
                        GcItems.ingotZinc

                });

        GameRegistry.addShapelessRecipe(new ItemStack(GcItems.nuggetOrichalcum, 9),
                new Object[]{
                        GcItems.ingotOrichalcum

                });

        GameRegistry.addShapelessRecipe(new ItemStack(GcItems.nuggetMythirl, 9),
                new Object[]{
                        GcItems.ingotMythirl

                });

        GameRegistry.addShapelessRecipe(new ItemStack(GcItems.nuggetSilver, 9),
                new Object[]{
                        GcItems.ingotSilver

                });

        GameRegistry.addShapelessRecipe(new ItemStack(GcItems.nuggetAluminum, 9),
                new Object[]{
                        GcItems.ingotAluminum

                });

        GameRegistry.addShapelessRecipe(new ItemStack(GcItems.nuggetBrass, 9),
                new Object[]{
                        GcItems.ingotBrass

                });

        GameRegistry.addShapelessRecipe(new ItemStack(GcItems.nuggetBronze, 9),
                new Object[]{
                        GcItems.ingotBronze

                });

        GameRegistry.addShapelessRecipe(new ItemStack(GcItems.nuggetCopper, 9),
                new Object[]{
                        GcItems.ingotCopper

                });

        GameRegistry.addShapelessRecipe(new ItemStack(GcItems.nuggetTim, 9),
                new Object[]{
                        GcItems.ingotTime

                });

        //NUGGETS --> INGOTS

        GameRegistry.addRecipe(new ItemStack(GcItems.ingotPlatinum),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.nuggetPlatinum

                });

        GameRegistry.addRecipe(new ItemStack(GcItems.ingotBronze),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.nuggetBronze

                });

        GameRegistry.addRecipe(new ItemStack(GcItems.ingotZinc),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.nuggetZinc

                });

        GameRegistry.addRecipe(new ItemStack(GcItems.ingotBrass),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.nuggetBrass

                });

        GameRegistry.addRecipe(new ItemStack(GcItems.ingotAluminum),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.nuggetAluminum

                });

        GameRegistry.addRecipe(new ItemStack(GcItems.ingotCopper),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.nuggetCopper

                });

        GameRegistry.addRecipe(new ItemStack(GcItems.ingotDragonite),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.nuggetDragonite

                });

        GameRegistry.addRecipe(new ItemStack(GcItems.ingotMythirl),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.nuggetMythirl

                });

        GameRegistry.addRecipe(new ItemStack(GcItems.ingotOrichalcum),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.nuggetOrichalcum

                });

        GameRegistry.addRecipe(new ItemStack(GcItems.ingotSilver),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.nuggetSilver

                });

        GameRegistry.addRecipe(new ItemStack(GcItems.ingotTime),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.nuggetTim

                });


    }
}

