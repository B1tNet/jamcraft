/*
 * Copyright (c) 2021. BitNet
 * This file is part of Jamcraft.
 *
 *     Jamcraft is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Jamcraft is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Jamcraft.  If not, see <https://www.gnu.org/licenses/>.
 */

package dev.bitnet.jamcraft.init;

import dev.bitnet.jamcraft.util.EffectLists;
import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ModFoods {
    private static final int dur = 800;

    public static final Food APPLE_JAM_JAR = (new Food.Builder()).hunger(8).saturation(0.5f).build();
    public static final Food BEETROOT_JAM_JAR = (new Food.Builder()).hunger(6).saturation(0.9f).build();
    public static final Food CARROT_JAM_JAR = (new Food.Builder()).hunger(6).saturation(0.8f).build();
    public static final Food CHORUS_FRUIT_JAM_JAR = (new Food.Builder()).hunger(8).saturation(0.7f).build();
    public static final Food ENCHANTED_GOLDEN_APPLE_JAM_JAR = (new Food.Builder()).hunger(20).saturation(10f)
            .effect(() -> new EffectInstance(Effects.ABSORPTION, dur), 1)
            .effect(() -> new EffectInstance(Effects.CONDUIT_POWER, dur), 1)
            .effect(() -> new EffectInstance(Effects.DOLPHINS_GRACE, dur), 1)
            .effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, dur), 1)
            .effect(() -> new EffectInstance(Effects.GLOWING, dur) ,1)
            .effect(() -> new EffectInstance(Effects.HASTE, dur), 1)
            .effect(() -> new EffectInstance(Effects.HEALTH_BOOST, dur), 1)
            .effect(() -> new EffectInstance(Effects.HERO_OF_THE_VILLAGE, dur), 1)
            .effect(() -> new EffectInstance(Effects.INSTANT_HEALTH, dur), 1)
            .effect(() -> new EffectInstance(Effects.INVISIBILITY, dur), 1)
            .effect(() -> new EffectInstance(Effects.JUMP_BOOST, dur), 1)
            .effect(() -> new EffectInstance(Effects.LUCK, dur), 1)
            .effect(() -> new EffectInstance(Effects.NIGHT_VISION, dur), 1)
            .effect(() -> new EffectInstance(Effects.REGENERATION, dur), 1)
            .effect(() -> new EffectInstance(Effects.RESISTANCE, dur), 1)
            .effect(() -> new EffectInstance(Effects.SATURATION, dur), 1)
            .effect(() -> new EffectInstance(Effects.SPEED, dur), 1)
            .effect(() -> new EffectInstance(Effects.STRENGTH, dur), 1)
            .effect(() -> new EffectInstance(Effects.WATER_BREATHING, dur), 1)
            .build();

    public static final Food GLISTERING_MELON_JAM_JAR = (new Food.Builder()).hunger(6).saturation(0.5f).effect(() -> new EffectInstance(Effects.REGENERATION, dur), 1).build();
    public static final Food GOLDEN_APPLE_JAM_JAR = (new Food.Builder()).hunger(8).saturation(1.0f).effect(() -> new EffectInstance(EffectLists.getRandomGoodEffect(), dur), 1).build();
    public static final Food GOLDEN_CARROT_JAM_JAR = (new Food.Builder()).hunger(10).saturation(0.6f).effect(() -> new EffectInstance(Effects.NIGHT_VISION, dur), 1).build();
    public static final Food MELON_JAM_JAR = (new Food.Builder()).hunger(6).saturation(0.5f).build();
    public static final Food POTATO_JAM_JAR = (new Food.Builder()).hunger(10).saturation(0.9f).build();
    public static final Food PUMPKIN_JAM_JAR = (new Food.Builder()).hunger(6).saturation(0.5f).build();
    public static final Food SWEET_BERRY_JAM_JAR = (new Food.Builder()).hunger(6).saturation(0.4f).build();
}
