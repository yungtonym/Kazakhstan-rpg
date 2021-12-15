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

    private static OreFeatureConfig.FillerBlockType ENDSTONE_FILLER = OreFeatureConfig.FillerBlockType
            .create("firstmod:ENDSTONE", "firstmod:endstone", new BlockMatcher(Blocks.END_STONE));

    public static void addOresToBiomes(){
        for (Biome biome : ForgeRegistries.BIOMES){
            if (biome.getCategory() == Biome.Category.DESERT)
            {
                generate(biome, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.RUBY_ORE.get(),
                        20, 6, 40, 8);
            }
        }
    }

    public static void generate(Biome biome, OreFeatureConfig.FillerBlockType filler, Block oreBlock, int commoness, int minLevel, int maxLevel, int size) {
        ConfiguredPlacement customConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(commoness, minLevel, 0, maxLevel));
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                new OreFeatureConfig(filler, oreBlock.getDefaultState(), size)).withPlacement(customConfig));
    }
}
