Stream.of(
Block.makeCuboidShape(9, 1, 8, 10, 11, 9),
Block.makeCuboidShape(9, 0, 7, 10, 11, 8),
Block.makeCuboidShape(9, 1, 6, 10, 11, 7),
Block.makeCuboidShape(8, 1, 7, 9, 11, 8),
Block.makeCuboidShape(10, 1, 7, 11, 11, 8),
Block.makeCuboidShape(6, 7, 5, 13, 21, 6),
Block.makeCuboidShape(6, 7, 9, 13, 21, 10),
Block.makeCuboidShape(5, 7, 6, 6, 21, 7),
Block.makeCuboidShape(5, 7, 8, 6, 21, 9),
Block.makeCuboidShape(4, 7, 7, 5, 21, 8),
Block.makeCuboidShape(14, 7, 7, 15, 32, 8),
Block.makeCuboidShape(13, 7, 8, 14, 32, 9),
Block.makeCuboidShape(13, 7, 6, 14, 32, 7),
Block.makeCuboidShape(5, 21, 7, 6, 25, 8),
Block.makeCuboidShape(6, 25, 7, 7, 28, 8),
Block.makeCuboidShape(7, 28, 7, 8, 30, 8),
Block.makeCuboidShape(8, 30, 7, 9, 31, 8),
Block.makeCuboidShape(9, 31, 7, 14, 32, 8),
Block.makeCuboidShape(6, 21, 6, 7, 25, 7),
Block.makeCuboidShape(7, 25, 6, 8, 28, 7),
Block.makeCuboidShape(8, 28, 6, 9, 30, 7),
Block.makeCuboidShape(9, 30, 6, 10, 31, 7),
Block.makeCuboidShape(10, 31, 6, 13, 32, 7),
Block.makeCuboidShape(7, 21, 5, 13, 25, 9),
Block.makeCuboidShape(8, 25, 5, 13, 28, 9),
Block.makeCuboidShape(9, 28, 5, 13, 30, 9),
Block.makeCuboidShape(10, 30, 5, 13, 31, 9),
Block.makeCuboidShape(11, 31, 5, 13, 32, 6),
Block.makeCuboidShape(6, 21, 8, 7, 25, 9),
Block.makeCuboidShape(7, 25, 8, 8, 28, 9),
Block.makeCuboidShape(8, 28, 8, 9, 30, 9),
Block.makeCuboidShape(9, 30, 8, 10, 31, 9),
Block.makeCuboidShape(10, 31, 8, 13, 32, 9),
Block.makeCuboidShape(7, 21, 9, 13, 25, 10),
Block.makeCuboidShape(8, 25, 9, 13, 28, 10),
Block.makeCuboidShape(9, 28, 9, 13, 30, 10),
Block.makeCuboidShape(10, 30, 9, 13, 31, 10),
Block.makeCuboidShape(11, 31, 9, 13, 32, 10),
Block.makeCuboidShape(13, 7, 7, 14, 8, 8),
Block.makeCuboidShape(5, 7, 7, 6, 8, 8),
Block.makeCuboidShape(6, 7, 6, 13, 15, 9)
).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);});