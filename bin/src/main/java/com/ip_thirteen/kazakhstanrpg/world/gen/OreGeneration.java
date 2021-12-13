package com.ip_thirteen.kazakhstanrpg.world.gen;


import com.ip_thirteen.kazakhstanrpg.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration {
    // use this to generate ores in end stone since Vanilla doesnt have any that need it
    private static OreFeatureConfig.FillerBlockType ENDSTONE_FILLER = OreFeatureConfig.FillerBlockType
            .create("firstmod:ENDSTONE", "firstmod:endstone", new BlockMatcher(Blocks.END_STONE));

    public static void addOresToBiomes(){
        for (Biome biome : ForgeRegistries.BIOMES){
            // make smile blocks generate in the nether from levels 20 to 40, as common as coal in veins of up to 25
            if (biome.getCategory() == Biome.Category.DESERT){
                generate(biome, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.RUBY_ORE.get(),
                        20, 6, 40, 8);
            }

            // make diamond blocks generate in the end
            if (biome.getCategory() == Biome.Category.FOREST){
                generate(biome, ENDSTONE_FILLER, Blocks.DIAMOND_BLOCK, 10, 6, 40, 8);
            }
        }
    }

    public static void generate(Biome biome, OreFeatureConfig.FillerBlockType filler, Block oreBlock, int commoness, int minLevel, int maxLevel, int size) {
        ConfiguredPlacement customConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(commoness, minLevel, 0, maxLevel));
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                new OreFeatureConfig(filler, oreBlock.getDefaultState(), size)).withPlacement(customConfig));
    }
}
