package net.trique.mythicupgrades.world;

import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.trique.mythicupgrades.MythicUpgrades;

import java.util.List;

public class MythicPlacedFeatures {

    public static final RegistryKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY = registerKey("sapphire_ore_placed");
    public static final RegistryKey<PlacedFeature> SAPPHIRE_CRYSTAL_PLACED_KEY = registerKey("sapphire_crystal_placed");
    public static final RegistryKey<PlacedFeature> RUBY_ORE_PLACED_KEY = registerKey("ruby_ore_placed");
    public static final RegistryKey<PlacedFeature> RUBY_CRYSTAL_PLACED_KEY = registerKey("ruby_crystal_placed");
    public static final RegistryKey<PlacedFeature> JADE_ORE_PLACED_KEY = registerKey("jade_ore_placed");
    public static final RegistryKey<PlacedFeature> JADE_CRYSTAL_PLACED_KEY = registerKey("jade_crystal_placed");
    public static final RegistryKey<PlacedFeature> TOPAZ_ORE_PLACED_KEY = registerKey("topaz_ore_placed");
    public static final RegistryKey<PlacedFeature> TOPAZ_CRYSTAL_PLACED_KEY = registerKey("topaz_crystal_placed");
    public static final RegistryKey<PlacedFeature> AMETRINE_ORE_PLACED_KEY = registerKey("ametrine_ore_placed");
    public static final RegistryKey<PlacedFeature> AMETRINE_CRYSTAL_PLACED_KEY = registerKey("ametrine_crystal_placed");
    public static final RegistryKey<PlacedFeature> AQUAMARINE_ORE_PLACED_KEY = registerKey("aquamarine_ore_placed");
    public static final RegistryKey<PlacedFeature> AQUAMARINE_CRYSTAL_PLACED_KEY = registerKey("aquamarine_crystal_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        register(context, SAPPHIRE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MythicConfiguredFeatures.SAPPHIRE_ORE_KEY),
                MythicOrePlacement.modifiersWithCount(6,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(96))));
        register(context, SAPPHIRE_CRYSTAL_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MythicConfiguredFeatures.SAPPHIRE_CRYSTAL_KEY),
                MythicOrePlacement.modifiersWithCount(12,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(96))));
        register(context, RUBY_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MythicConfiguredFeatures.RUBY_ORE_KEY),
                MythicOrePlacement.modifiersWithCount(6,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(96))));
        register(context, RUBY_CRYSTAL_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MythicConfiguredFeatures.RUBY_CRYSTAL_KEY),
                MythicOrePlacement.modifiersWithCount(12,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(96))));
        register(context, JADE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MythicConfiguredFeatures.JADE_ORE_KEY),
                MythicOrePlacement.modifiersWithCount(6,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-128), YOffset.fixed(64))));
        register(context, JADE_CRYSTAL_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MythicConfiguredFeatures.JADE_CRYSTAL_KEY),
                MythicOrePlacement.modifiersWithCount(12,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-128), YOffset.fixed(64))));
        register(context, TOPAZ_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MythicConfiguredFeatures.TOPAZ_ORE_KEY),
                MythicOrePlacement.modifiersWithCount(6,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-128), YOffset.fixed(64))));
        register(context, TOPAZ_CRYSTAL_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MythicConfiguredFeatures.TOPAZ_CRYSTAL_KEY),
                MythicOrePlacement.modifiersWithCount(12,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-128), YOffset.fixed(64))));
        register(context, AMETRINE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MythicConfiguredFeatures.AMETRINE_ORE_KEY),
                MythicOrePlacement.modifiersWithCount(6,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(64))));
        register(context, AMETRINE_CRYSTAL_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MythicConfiguredFeatures.AMETRINE_CRYSTAL_KEY),
                MythicOrePlacement.modifiersWithCount(12,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(64))));
        register(context, AQUAMARINE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MythicConfiguredFeatures.AQUAMARINE_ORE_KEY),
                MythicOrePlacement.modifiersWithCount(6,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-128), YOffset.fixed(64))));
        register(context, AQUAMARINE_CRYSTAL_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(MythicConfiguredFeatures.AQUAMARINE_CRYSTAL_KEY),
                MythicOrePlacement.modifiersWithCount(12,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-128), YOffset.fixed(64))));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MythicUpgrades.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}