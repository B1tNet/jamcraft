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

import dev.bitnet.jamcraft.Jamcraft;
import dev.bitnet.jamcraft.item.BaseJamJarItem;
import dev.bitnet.jamcraft.item.ChorusFruitJamJarItem;
import dev.bitnet.jamcraft.util.ModSetup;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Jamcraft.MODID);

    public static final RegistryObject<Item> JAR = ITEMS.register("jar", () -> new Item(new Item.Properties().group(ModSetup.itemGroup)));

    public static final RegistryObject<Item> CHORUS_FRUIT_JAM_BALL = ITEMS.register("chorus_fruit_jam_ball", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> APPLE_JAM_JAR = ITEMS.register("apple_jam_jar", () -> new BaseJamJarItem(ModFoods.APPLE_JAM_JAR));
    public static final RegistryObject<Item> BEETROOT_JAM_JAR = ITEMS.register("beetroot_jam_jar", () -> new BaseJamJarItem(ModFoods.BEETROOT_JAM_JAR));
    public static final RegistryObject<Item> CARROT_JAM_JAR = ITEMS.register("carrot_jam_jar", () -> new BaseJamJarItem(ModFoods.CARROT_JAM_JAR));
    public static final RegistryObject<Item> CHORUS_FRUIT_JAM_JAR = ITEMS.register("chorus_fruit_jam_jar", ChorusFruitJamJarItem::new);
    public static final RegistryObject<Item> ENCHANTED_GOLDEN_APPLE_JAM_JAR = ITEMS.register("enchanted_golden_apple_jam_jar", () -> new BaseJamJarItem(ModFoods.ENCHANTED_GOLDEN_APPLE_JAM_JAR));
    public static final RegistryObject<Item> GLISTERING_MELON_JAM_JAR = ITEMS.register("glistering_melon_jam_jar", () -> new BaseJamJarItem(ModFoods.GLISTERING_MELON_JAM_JAR));
    public static final RegistryObject<Item> GOLDEN_APPLE_JAM_JAR = ITEMS.register("golden_apple_jam_jar", () -> new BaseJamJarItem(ModFoods.GOLDEN_APPLE_JAM_JAR));
    public static final RegistryObject<Item> GOLDEN_CARROT_JAM_JAR = ITEMS.register("golden_carrot_jam_jar", () -> new BaseJamJarItem(ModFoods.GOLDEN_CARROT_JAM_JAR));
    public static final RegistryObject<Item> MELON_JAM_JAR = ITEMS.register("melon_jam_jar", () -> new BaseJamJarItem(ModFoods.MELON_JAM_JAR));
    public static final RegistryObject<Item> POTATO_JAM_JAR = ITEMS.register("potato_jam_jar", () -> new BaseJamJarItem(ModFoods.POTATO_JAM_JAR));
    public static final RegistryObject<Item> PUMPKIN_JAM_JAR = ITEMS.register("pumpkin_jam_jar", () -> new BaseJamJarItem(ModFoods.PUMPKIN_JAM_JAR));
    public static final RegistryObject<Item> SWEET_BERRY_JAM_JAR = ITEMS.register("sweet_berry_jam_jar", () -> new BaseJamJarItem(ModFoods.SWEET_BERRY_JAM_JAR));
}
