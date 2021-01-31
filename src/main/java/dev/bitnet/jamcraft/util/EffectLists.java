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

package dev.bitnet.jamcraft.util;

import net.minecraft.potion.Effect;
import net.minecraft.potion.Effects;

import java.util.Random;

public class EffectLists {
    private static final Random random = new Random();

    public static final Effect[] GOOD_EFFECTS = {
            Effects.ABSORPTION,
            Effects.CONDUIT_POWER,
            Effects.DOLPHINS_GRACE,
            Effects.FIRE_RESISTANCE,
            Effects.GLOWING,
            Effects.HASTE,
            Effects.HEALTH_BOOST,
            Effects.HERO_OF_THE_VILLAGE,
            Effects.INSTANT_HEALTH,
            Effects.INVISIBILITY,
            Effects.JUMP_BOOST,
            Effects.LEVITATION,
            Effects.LUCK,
            Effects.NIGHT_VISION,
            Effects.REGENERATION,
            Effects.RESISTANCE,
            Effects.SATURATION,
            Effects.SPEED,
            Effects.STRENGTH,
            Effects.WATER_BREATHING
    };

    public static Effect getRandomGoodEffect() {
        return GOOD_EFFECTS[random.nextInt(GOOD_EFFECTS.length)];
    }
}
