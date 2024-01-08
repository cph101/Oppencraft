package com.cph.oppencraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;


public class NukeStandBlock extends Block {
    public static final EnumProperty<NukeStandTypeProperty> TYPE = EnumProperty.of("type", NukeStandTypeProperty.class);


    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(TYPE);
    }

    public NukeStandBlock(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(TYPE, NukeStandTypeProperty.CENTER));
    }

    private BlockPos getStandAddon(BlockPos pos, Direction playerFacing, NukeStandTypeProperty type) {
        switch (playerFacing) {
            case EAST:
                switch (type) {
                    case LEFT:
                        return pos.add(0, 0, -1);
                    case RIGHT:
                        return pos.add(0, 0, 1);
                    default:
                        return pos;
                }
            case WEST:
                switch (type) {
                    case LEFT:
                        return pos.add(0, 0, 1);
                    case RIGHT:
                        return pos.add(0, 0, -1);
                    default:
                        return pos;
                }
            case SOUTH:
                switch (type) {
                    case LEFT:
                        return pos.add(1, 0, 0);
                    case RIGHT:
                        return pos.add(-1, 0, 0);
                    default:
                        return pos;
                }
            case NORTH:
                switch (type) {
                    case LEFT:
                        return pos.add(1, 0, 0);
                    case RIGHT:
                        return pos.add(-1, 0, 0);
                    default:
                        return pos;
                }
            default:
                return pos;
        }
    }

    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        if (!(world instanceof World)) {
            return false;
        }

        LivingEntity placer = ((World) world).getClosestPlayer(pos.getX(), pos.getY(), pos.getZ(), 20, false);
        assert placer != null;
        Direction playerFacing = placer.getHorizontalFacing();
        BlockPos leftStandBlock = getStandAddon(pos, playerFacing, NukeStandTypeProperty.LEFT);
        BlockPos rightStandBlock = getStandAddon(pos, playerFacing, NukeStandTypeProperty.RIGHT);
        boolean rightIsNotOccupied = world.getBlockState(rightStandBlock).getBlock() == Blocks.AIR || world.getBlockState(rightStandBlock).getBlock() == Blocks.CAVE_AIR;
        boolean leftIsNotOccupied = world.getBlockState(leftStandBlock).getBlock() == Blocks.AIR || world.getBlockState(leftStandBlock).getBlock() == Blocks.CAVE_AIR;
        return rightIsNotOccupied && leftIsNotOccupied;
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);
        assert placer != null;
        Direction playerFacing = placer.getHorizontalFacing();
        BlockPos leftStandBlock = getStandAddon(pos, playerFacing, NukeStandTypeProperty.LEFT);
        BlockPos rightStandBlock = getStandAddon(pos, playerFacing, NukeStandTypeProperty.RIGHT);
        boolean rightIsNotOccupied = world.getBlockState(rightStandBlock).getBlock() == Blocks.AIR || world.getBlockState(rightStandBlock).getBlock() == Blocks.CAVE_AIR;
        boolean leftIsNotOccupied = world.getBlockState(leftStandBlock).getBlock() == Blocks.AIR || world.getBlockState(leftStandBlock).getBlock() == Blocks.CAVE_AIR;
        if (rightIsNotOccupied && leftIsNotOccupied) {
            world.setBlockState(leftStandBlock, state.with(TYPE, NukeStandTypeProperty.LEFT));
            world.setBlockState(rightStandBlock, state.with(TYPE, NukeStandTypeProperty.RIGHT));
        }
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        super.onBreak(world, pos, state, player);
    }
}
