package com.cph.oppencraft.block.nuke_stand;

import net.minecraft.block.*;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;


@SuppressWarnings("deprecation")
public class NukeStandBlock extends HorizontalFacingBlock {


    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.HORIZONTAL_FACING);
    }

    public NukeStandBlock(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }

    public static VoxelShape rotateShape(Direction from, Direction to, VoxelShape shape) {
        VoxelShape[] buffer = new VoxelShape[]{ shape, VoxelShapes.empty() };

        int times = (to.getHorizontal() - from.getHorizontal() + 4) % 4;
        for (int i = 0; i < times; i++) {
            buffer[0].forEachBox((minX, minY, minZ, maxX, maxY, maxZ) -> buffer[1] = VoxelShapes.union(buffer[1], VoxelShapes.cuboid(1-maxZ, minY, minX, 1-minZ, maxY, maxX)));
            buffer[0] = buffer[1];
            buffer[1] = VoxelShapes.empty();
        }

        return buffer[0];
    }


    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
        Direction dir = state.get(FACING);
        VoxelShape shape = VoxelShapes.empty();
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(-0.375, 0, 0, -0.25, 0.75, 0.125));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(-0.36250000000000004, 0.125, 0.125, -0.26250000000000007, 0.1875, 0.875));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(-0.36249999999999993, 0.34066375382941183, 0.04107613639575344, -0.26249999999999984, 0.40316375382941183, 0.9223261363957536));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(-0.25, 0.13125000000000012, 0.8875, 0.5, 0.19375000000000023, 0.9875));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(1.25, 0, 0, 1.375, 0.75, 0.125));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(1.25, 0, 0.875, 1.375, 0.75, 1));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(-0.375, 0, 0.875, -0.25, 0.75, 1));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.5, 0.13125000000000012, 0.8875, 1.25, 0.19375000000000023, 0.9875));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(-0.25, 0.13125000000000012, 0.0125, 0.5, 0.19375000000000023, 0.11250000000000004));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.5, 0.13125000000000012, 0.0125, 1.25, 0.19375000000000023, 0.11250000000000004));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(-0.25, 0.625, 0.8875, 0.5, 0.6875000000000001, 0.9875));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.5, 0.625, 0.8875, 1.25, 0.6875000000000001, 0.9875));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(-0.25, 0.625, 0.0125, 0.5, 0.6875000000000001, 0.11250000000000004));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.5, 0.625, 0.0125, 1.25, 0.6875000000000001, 0.11250000000000004));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(1.25625, 0.125, 0.125, 1.3562500000000002, 0.1875, 0.875));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(-0.361875, 0.359413753829412, 0.03482613639575347, -0.263125, 0.421913753829412, 0.9160761363957536));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(1.2625000000000002, 0.34066375382941183, 0.04107613639575344, 1.3625000000000003, 0.40316375382941183, 0.9223261363957536));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(1.263125, 0.359413753829412, 0.03482613639575347, 1.361875, 0.421913753829412, 0.9160761363957536));
        if (dir == Direction.EAST || dir == Direction.WEST) {
            return rotateShape(Direction.NORTH, dir, shape);
        } else return shape;
    }

    private BlockPos getStandAddon(BlockPos pos, Direction playerFacing, String type) {
        return switch (playerFacing) {
            case EAST -> switch (type) {
                case "LEFT" -> pos.add(0, 0, -1);
                case "RIGHT" -> pos.add(0, 0, 1);
                default -> pos;
            };
            case WEST -> switch (type) {
                case "LEFT" -> pos.add(0, 0, 1);
                case "RIGHT" -> pos.add(0, 0, -1);
                default -> pos;
            };
            case SOUTH, NORTH -> switch (type) {
                case "LEFT" -> pos.add(1, 0, 0);
                case "RIGHT" -> pos.add(-1, 0, 0);
                default -> pos;
            };
            default -> pos;
        };
    }

    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        if (!(world instanceof World)) {
            return false;
        }

        LivingEntity placer = ((World) world).getClosestPlayer(pos.getX(), pos.getY(), pos.getZ(), 20, false);
        assert placer != null;
        Direction playerFacing = placer.getHorizontalFacing();
        BlockPos leftStandBlock = getStandAddon(pos, playerFacing, "LEFT");
        BlockPos rightStandBlock = getStandAddon(pos, playerFacing, "RIGHT");
        boolean rightIsNotOccupied = world.getBlockState(rightStandBlock).getBlock() == Blocks.AIR || world.getBlockState(rightStandBlock).getBlock() == Blocks.CAVE_AIR;
        boolean leftIsNotOccupied = world.getBlockState(leftStandBlock).getBlock() == Blocks.AIR || world.getBlockState(leftStandBlock).getBlock() == Blocks.CAVE_AIR;
        return rightIsNotOccupied && leftIsNotOccupied;
    }


    @SuppressWarnings("DataFlowIssue")
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx).with(Properties.HORIZONTAL_FACING, ctx.getPlayer().getHorizontalFacing().getOpposite());
    }
}
