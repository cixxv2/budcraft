package net.cixx.budcraft.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent LEAN = new FoodComponent.Builder().alwaysEdible().statusEffect
            (new StatusEffectInstance(StatusEffects.SLOWNESS, 2400), 1f).build();
}
