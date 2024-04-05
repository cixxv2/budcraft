package net.cixx.budcraft.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ModFoodComponents {

    public static final FoodComponent LEAN = new FoodComponent.Builder().alwaysEdible().statusEffect
            (new StatusEffectInstance(StatusEffects.SLOWNESS, 2400), 1f).build();

    public SoundEvent getDrinkSound() {
        return SoundEvents.ITEM_HONEY_BOTTLE_DRINK;
    }
}
