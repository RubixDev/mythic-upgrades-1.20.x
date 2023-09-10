package net.trique.mythicupgrades.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class MythicEffects {
    public static StatusEffect THORNS = new ThornsEffect(StatusEffectCategory.BENEFICIAL, 4699647);
    public static StatusEffect FREEZE = new FreezeEffect(StatusEffectCategory.HARMFUL, 0x45c1e0);
}
