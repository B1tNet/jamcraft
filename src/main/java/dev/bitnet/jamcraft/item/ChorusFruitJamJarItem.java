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

package dev.bitnet.jamcraft.item;

import dev.bitnet.jamcraft.init.ModFoods;
import dev.bitnet.jamcraft.init.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.EnderPearlEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.*;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class ChorusFruitJamJarItem extends JamJarItem {
    public ChorusFruitJamJarItem() {
        super(ModFoods.CHORUS_FRUIT_JAM_JAR);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if (playerIn.isCrouching()) {
            ItemStack stack = playerIn.getHeldItem(handIn);
            worldIn.playSound(null, playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(), SoundEvents.ENTITY_ENDER_PEARL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
            playerIn.getCooldownTracker().setCooldown(this, 10);
            if (!worldIn.isRemote()) {
                EnderPearlEntity enderPearlEntity = new EnderPearlEntity(worldIn, playerIn);
                enderPearlEntity.setItem(new ItemStack(ModItems.CHORUS_FRUIT_JAM_BALL.get()));
                enderPearlEntity.func_234612_a_(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0f, 1.5f, 1.0f);
                worldIn.addEntity(enderPearlEntity);
            }

            playerIn.addStat(Stats.ITEM_USED.get(this));
            ItemStack stack1 = DrinkHelper.fill(stack, playerIn, new ItemStack(ModItems.JAR.get()));

            return ActionResult.func_233538_a_(stack1, worldIn.isRemote());
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        if (!entityLiving.isCrouching()) {
            ItemStack itemstack = super.onItemUseFinish(stack, worldIn, entityLiving);
            if (!worldIn.isRemote) {
                double d0 = entityLiving.getPosX();
                double d1 = entityLiving.getPosY();
                double d2 = entityLiving.getPosZ();

                for(int i = 0; i < 16; ++i) {
                    double d3 = entityLiving.getPosX() + (entityLiving.getRNG().nextDouble() - 0.5D) * 16.0D;
                    double d4 = MathHelper.clamp(entityLiving.getPosY() + (double)(entityLiving.getRNG().nextInt(16) - 8), 0.0D, worldIn.func_234938_ad_() - 1);
                    double d5 = entityLiving.getPosZ() + (entityLiving.getRNG().nextDouble() - 0.5D) * 16.0D;
                    if (entityLiving.isPassenger()) {
                        entityLiving.stopRiding();
                    }

                    if (entityLiving.attemptTeleport(d3, d4, d5, true)) {
                        SoundEvent soundevent = SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT;
                        worldIn.playSound(null, d0, d1, d2, soundevent, SoundCategory.PLAYERS, 1.0F, 1.0F);
                        entityLiving.playSound(soundevent, 1.0F, 1.0F);
                        break;
                    }
                }

                if (entityLiving instanceof PlayerEntity) {
                    ((PlayerEntity)entityLiving).getCooldownTracker().setCooldown(this, 20);
                }
            }

            return DrinkHelper.fill(itemstack, (PlayerEntity) entityLiving, new ItemStack(ModItems.JAR.get()));
        }

        return super.onItemUseFinish(stack, worldIn, entityLiving);
    }
}
