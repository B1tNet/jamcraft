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
