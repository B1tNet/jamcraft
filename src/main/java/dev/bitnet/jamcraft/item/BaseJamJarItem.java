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

package dev.bitnet.jamcraft.item;

import dev.bitnet.jamcraft.init.ModItems;
import dev.bitnet.jamcraft.util.ModSetup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class BaseJamJarItem extends Item {
    public BaseJamJarItem(Food foodIn) {
        super(new Item.Properties()
                .food(foodIn)
                .group(ModSetup.itemGroup)
                .maxStackSize(16)
                .containerItem(ModItems.JAR.get())
        );
    }
}
