
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package ssemik.ssemiks.dungeons.init;

import ssemik.ssemiks.dungeons.world.features.ZombieRuinFeature;
import ssemik.ssemiks.dungeons.world.features.RandomDungeonFeature;
import ssemik.ssemiks.dungeons.world.features.ClassicRuinFeature;
import ssemik.ssemiks.dungeons.SsemiksDungeonsMod;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import java.util.function.Predicate;

public class SsemiksDungeonsModFeatures {
	public static void load() {
		register("random_dungeon", RandomDungeonFeature.feature(), RandomDungeonFeature.GENERATE_BIOMES,
				GenerationStep.Decoration.SURFACE_STRUCTURES);
		register("classic_ruin", ClassicRuinFeature.feature(), ClassicRuinFeature.GENERATE_BIOMES, GenerationStep.Decoration.SURFACE_STRUCTURES);
		register("zombie_ruin", ZombieRuinFeature.feature(), ZombieRuinFeature.GENERATE_BIOMES, GenerationStep.Decoration.SURFACE_STRUCTURES);
	}

	private static void register(String registryName, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration genStep) {
		Registry.register(Registry.FEATURE, new ResourceLocation(SsemiksDungeonsMod.MODID, registryName), feature);
		BiomeModifications.addFeature(biomes, genStep,
				ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, new ResourceLocation(SsemiksDungeonsMod.MODID, registryName)));
	}
}
