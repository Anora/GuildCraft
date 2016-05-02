package anora.guildcraft.main.crafting;

import anora.guildcraft.main.blocks.GcBlocks;
import anora.guildcraft.main.items.GcItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static net.minecraft.init.Items.stick;

/**
 * Created by Ty's PC on 4/30/2016.
 */
public class GcRecpies {

    public static void initRecipes()
    {


        //INGOTS --> BLOCKS
        GameRegistry.addRecipe(new ItemStack(GcBlocks.blockCopper),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.ingotCopper

                });

        GameRegistry.addRecipe(new ItemStack(GcBlocks.blockAluminum),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.ingotAluminum

                });

        GameRegistry.addRecipe(new ItemStack(GcBlocks.blockZinc),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.ingotZinc

                });

        GameRegistry.addRecipe(new ItemStack(GcBlocks.blockPlatinum),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.ingotPlatinum

                });

        GameRegistry.addRecipe(new ItemStack(GcBlocks.blockPlatinum),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.ingotPlatinum

                });

        GameRegistry.addRecipe(new ItemStack(GcBlocks.blockBronze),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.ingotBronze

                });

        GameRegistry.addRecipe(new ItemStack(GcBlocks.blockBrass),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.ingotBrass

                });

        GameRegistry.addRecipe(new ItemStack(GcBlocks.blockSilver),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.ingotSilver

                });

        GameRegistry.addRecipe(new ItemStack(GcBlocks.blockDragonite),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.ingotDragonite

                });

        GameRegistry.addRecipe(new ItemStack(GcBlocks.blockOrichalcum),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.ingotOrichalcum

                });




        //BLOCKS -->  INGOTS
        GameRegistry.addShapelessRecipe(new ItemStack(GcItems.ingotPlatinum,9),
                new Object[]{
                        GcBlocks.blockPlatinum

                });

        GameRegistry.addShapelessRecipe(new ItemStack(GcItems.ingotZinc,9),
                new Object[]{
                        GcBlocks.blockZinc

                });

        GameRegistry.addShapelessRecipe(new ItemStack(GcItems.ingotOrichalcum,9),
                new Object[]{
                        GcBlocks.blockOrichalcum

                });

        GameRegistry.addShapelessRecipe(new ItemStack(GcItems.ingotTin,9),
                new Object[]{
                        GcBlocks.blockTin

                });

        GameRegistry.addShapelessRecipe(new ItemStack(GcItems.ingotMythirl,9),
                new Object[]{
                        GcBlocks.blockMythirl

                });

        GameRegistry.addShapelessRecipe(new ItemStack(GcItems.ingotSilver,9),
                new Object[]{
                        GcBlocks.blockSilver

                });

        GameRegistry.addShapelessRecipe(new ItemStack(GcItems.ingotAluminum,9),
                new Object[]{
                        GcBlocks.blockAluminum

                });

        GameRegistry.addShapelessRecipe(new ItemStack(GcItems.ingotBrass,9),
                new Object[]{
                        GcBlocks.blockBrass

                });

        GameRegistry.addShapelessRecipe(new ItemStack(GcItems.ingotBronze,9),
                new Object[]{
                        GcBlocks.blockBronze

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

        GameRegistry.addShapelessRecipe(new ItemStack(GcItems.nuggetTin, 9),
                new Object[]{
                        GcItems.ingotTin

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

        GameRegistry.addRecipe(new ItemStack(GcItems.ingotTin),
                new Object[]{
                        "###",
                        "###",
                        "###",
                        '#', GcItems.nuggetTin

                });

        //TOOLS!!!

        GameRegistry.addRecipe(new ItemStack(GcItems.pickaxeBronze),
                new Object[]{
                        "###",
                        " * ",
                        " * ",
                        '#', GcItems.ingotBronze,
                        '*', stick

                });

        GameRegistry.addRecipe(new ItemStack(GcItems.spadeBronze),
                new Object[]{
                        " # ",
                        " * ",
                        " * ",
                        '#', GcItems.ingotBronze,
                        '*', stick

                });

        GameRegistry.addRecipe(new ItemStack(GcItems.axeBronze),
                new Object[]{
                        "## ",
                        "#* ",
                        " * ",
                        '#', GcItems.ingotBronze,
                        '*', stick

                });

        GameRegistry.addRecipe(new ItemStack(GcItems.swordBronze),
                new Object[]{
                        " # ",
                        " # ",
                        " * ",
                        '#', GcItems.ingotBronze,
                        '*', stick

                });
        //Copper Tools
        GameRegistry.addRecipe(new ItemStack(GcItems.pickaxeCopper),
                new Object[]{
                        "###",
                        " * ",
                        " * ",
                        '#', GcItems.ingotCopper,
                        '*', stick

                });

        GameRegistry.addRecipe(new ItemStack(GcItems.spadeCopper),
                new Object[]{
                        " # ",
                        " * ",
                        " * ",
                        '#', GcItems.ingotCopper,
                        '*', stick

                });

        GameRegistry.addRecipe(new ItemStack(GcItems.axeCopper),
                new Object[]{
                        "## ",
                        "#* ",
                        " * ",
                        '#', GcItems.ingotCopper,
                        '*', stick

                });

        GameRegistry.addRecipe(new ItemStack(GcItems.swordCopper),
                new Object[]{
                        " # ",
                        " # ",
                        " * ",
                        '#', GcItems.ingotCopper,
                        '*', stick

                });

        //Dragonite Tools
        GameRegistry.addRecipe(new ItemStack(GcItems.pickaxeDragonite),
                new Object[]{
                        "###",
                        " * ",
                        " * ",
                        '#', GcItems.ingotDragonite,
                        '*', stick

                });

        GameRegistry.addRecipe(new ItemStack(GcItems.spadeDragonite),
                new Object[]{
                        " # ",
                        " * ",
                        " * ",
                        '#', GcItems.ingotDragonite,
                        '*', stick

                });

        GameRegistry.addRecipe(new ItemStack(GcItems.axeDragonite),
                new Object[]{
                        "## ",
                        "#* ",
                        " * ",
                        '#', GcItems.ingotDragonite,
                        '*', stick

                });

        GameRegistry.addRecipe(new ItemStack(GcItems.swordDragonite),
                new Object[]{
                        " # ",
                        " # ",
                        " * ",
                        '#', GcItems.ingotDragonite,
                        '*', stick

                });

        //Mythirl Tools

        GameRegistry.addRecipe(new ItemStack(GcItems.pickaxeMythirl),
                new Object[]{
                        "###",
                        " * ",
                        " * ",
                        '#', GcItems.ingotMythirl,
                        '*', stick

                });

        GameRegistry.addRecipe(new ItemStack(GcItems.spadeMythirl),
                new Object[]{
                        " # ",
                        " * ",
                        " * ",
                        '#', GcItems.ingotMythirl,
                        '*', stick

                });

        GameRegistry.addRecipe(new ItemStack(GcItems.axeMythirl),
                new Object[]{
                        "## ",
                        "#* ",
                        " * ",
                        '#', GcItems.ingotMythirl,
                        '*', stick

                });

        GameRegistry.addRecipe(new ItemStack(GcItems.swordMythirl),
                new Object[]{
                        " # ",
                        " # ",
                        " * ",
                        '#', GcItems.ingotMythirl,
                        '*', stick

                });

        //Orichalcum Tools

        GameRegistry.addRecipe(new ItemStack(GcItems.pickaxeOrichalcum),
                new Object[]{
                        "###",
                        " * ",
                        " * ",
                        '#', GcItems.ingotOrichalcum,
                        '*', stick

                });

        GameRegistry.addRecipe(new ItemStack(GcItems.spadeOrichalcum),
                new Object[]{
                        " # ",
                        " * ",
                        " * ",
                        '#', GcItems.ingotOrichalcum,
                        '*', stick

                });

        GameRegistry.addRecipe(new ItemStack(GcItems.axeOrichalcum),
                new Object[]{
                        "## ",
                        "#* ",
                        " * ",
                        '#', GcItems.ingotOrichalcum,
                        '*', stick

                });

        GameRegistry.addRecipe(new ItemStack(GcItems.swordOrichalcum),
                new Object[]{
                        " # ",
                        " # ",
                        " * ",
                        '#', GcItems.ingotOrichalcum,
                        '*', stick

                });

        //Silver Tools

        GameRegistry.addRecipe(new ItemStack(GcItems.pickaxeSilver),
                new Object[]{
                        "###",
                        " * ",
                        " * ",
                        '#', GcItems.ingotSilver,
                        '*', stick

                });

        GameRegistry.addRecipe(new ItemStack(GcItems.spadeSilver),
                new Object[]{
                        " # ",
                        " * ",
                        " * ",
                        '#', GcItems.ingotSilver,
                        '*', stick

                });

        GameRegistry.addRecipe(new ItemStack(GcItems.axeSilver),
                new Object[]{
                        "## ",
                        "#* ",
                        " * ",
                        '#', GcItems.ingotSilver,
                        '*', stick

                });

        GameRegistry.addRecipe(new ItemStack(GcItems.swordSilver),
                new Object[]{
                        " # ",
                        " # ",
                        " * ",
                        '#', GcItems.ingotSilver,
                        '*', stick

                });

    }
}

