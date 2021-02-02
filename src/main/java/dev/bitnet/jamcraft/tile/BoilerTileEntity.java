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

package dev.bitnet.jamcraft.tile;

import dev.bitnet.jamcraft.block.BoilerBlock;
import dev.bitnet.jamcraft.init.ModTileEntityTypes;
import net.minecraft.block.Block;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.INameable;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;

public class BoilerTileEntity extends TileEntity implements ITickableTileEntity, INameable {

    private float heatValue = 0f;

    public BoilerTileEntity() {
        this(ModTileEntityTypes.BOILER.get());
    }

    public BoilerTileEntity(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }

    @Override
    public void tick() {
        heatValue = getHeatValue();
        if (isHeated()) {
            this.world.setBlockState(pos, getBlockState().with(BoilerBlock.HEATED, true));
        }
        else {
            this.world.setBlockState(pos, getBlockState().with(BoilerBlock.HEATED, false));
        }
    }

    public float getHeatValue() {
        Block blockBelow = this.world.getBlockState(pos.down()).getBlock();
        String blockId = ForgeRegistries.BLOCKS.getKey(blockBelow).toString();

        int light = blockBelow.getLightValue(this.world.getBlockState(pos.down()), this.world, pos.down());
        System.out.println(light);

        return (float)light;
    }

    @Override
    public ITextComponent getName() {
        return null;
    }

    @Override
    public boolean hasCustomName() {
        return false;
    }

    @Override
    public ITextComponent getDisplayName() {
        return null;
    }

    @Nullable
    @Override
    public ITextComponent getCustomName() {
        return null;
    }

    public boolean isHeated() {
        return heatValue != 0;
    }
}
