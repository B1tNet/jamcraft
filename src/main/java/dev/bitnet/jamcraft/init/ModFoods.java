/*
 * MIT License
 *
 * Copyright (c) 2021 BitNet
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
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

    public static final Food PUMPKIN_SLICE = (new Food.Builder()).hunger(2).saturation(0.3f).build();
    public static final Food ROASTED_PUMPKIN_SLICE = (new Food.Builder()).hunger(5).saturation(0.5f).build();
    public static final Food ROASTED_BEETROOT = (new Food.Builder()).hunger(3).saturation(0.6f).build();
}
