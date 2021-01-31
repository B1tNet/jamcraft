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

import dev.bitnet.jamcraft.Jamcraft;
import dev.bitnet.jamcraft.item.JamJarItem;
import dev.bitnet.jamcraft.item.ChorusFruitJamJarItem;
import dev.bitnet.jamcraft.item.IronKnifeItem;
import dev.bitnet.jamcraft.util.ModSetup;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Jamcraft.MODID);

    public static final RegistryObject<Item> JAR = ITEMS.register("jar", () -> new Item(new Item.Properties().group(ModSetup.itemGroup)));
    public static final RegistryObject<JamJarItem> APPLE_JAM_JAR = ITEMS.register("apple_jam_jar", () -> new JamJarItem(ModFoods.APPLE_JAM_JAR));
    public static final RegistryObject<JamJarItem> BEETROOT_JAM_JAR = ITEMS.register("beetroot_jam_jar", () -> new JamJarItem(ModFoods.BEETROOT_JAM_JAR));
    public static final RegistryObject<JamJarItem> CARROT_JAM_JAR = ITEMS.register("carrot_jam_jar", () -> new JamJarItem(ModFoods.CARROT_JAM_JAR));
    public static final RegistryObject<ChorusFruitJamJarItem> CHORUS_FRUIT_JAM_JAR = ITEMS.register("chorus_fruit_jam_jar", ChorusFruitJamJarItem::new);
    public static final RegistryObject<JamJarItem> ENCHANTED_GOLDEN_APPLE_JAM_JAR = ITEMS.register("enchanted_golden_apple_jam_jar", () -> new JamJarItem(ModFoods.ENCHANTED_GOLDEN_APPLE_JAM_JAR));
    public static final RegistryObject<JamJarItem> GLISTERING_MELON_JAM_JAR = ITEMS.register("glistering_melon_jam_jar", () -> new JamJarItem(ModFoods.GLISTERING_MELON_JAM_JAR));
    public static final RegistryObject<JamJarItem> GOLDEN_APPLE_JAM_JAR = ITEMS.register("golden_apple_jam_jar", () -> new JamJarItem(ModFoods.GOLDEN_APPLE_JAM_JAR));
    public static final RegistryObject<JamJarItem> GOLDEN_CARROT_JAM_JAR = ITEMS.register("golden_carrot_jam_jar", () -> new JamJarItem(ModFoods.GOLDEN_CARROT_JAM_JAR));
    public static final RegistryObject<JamJarItem> MELON_JAM_JAR = ITEMS.register("melon_jam_jar", () -> new JamJarItem(ModFoods.MELON_JAM_JAR));
    public static final RegistryObject<JamJarItem> POTATO_JAM_JAR = ITEMS.register("potato_jam_jar", () -> new JamJarItem(ModFoods.POTATO_JAM_JAR));
    public static final RegistryObject<JamJarItem> PUMPKIN_JAM_JAR = ITEMS.register("pumpkin_jam_jar", () -> new JamJarItem(ModFoods.PUMPKIN_JAM_JAR));
    public static final RegistryObject<JamJarItem> SWEET_BERRY_JAM_JAR = ITEMS.register("sweet_berry_jam_jar", () -> new JamJarItem(ModFoods.SWEET_BERRY_JAM_JAR));

    public static final RegistryObject<Item> CHORUS_FRUIT_JAM_BALL = ITEMS.register("chorus_fruit_jam_ball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PUMPKIN_SLICE = ITEMS.register("pumpkin_slice", () -> new Item(new Item.Properties().group(ModSetup.itemGroup).food(ModFoods.PUMPKIN_SLICE)));
    public static final RegistryObject<Item> ROASTED_PUMPKIN_SLICE = ITEMS.register("roasted_pumpkin_slice", () -> new Item(new Item.Properties().group(ModSetup.itemGroup).food(ModFoods.ROASTED_PUMPKIN_SLICE)));
    public static final RegistryObject<Item> ROASTED_BEETROOT_SLICE = ITEMS.register("roasted_beetroot", () -> new Item(new Item.Properties().group(ModSetup.itemGroup).food(ModFoods.ROASTED_BEETROOT)));
    public static final RegistryObject<IronKnifeItem> IRON_KNIFE = ITEMS.register("iron_knife", IronKnifeItem::new);
}
