Stream.of(
Block.makeCuboidShape(2, -16, -2, 14, -15, 18),
Block.makeCuboidShape(-4, -16, 5, -3, 32, 11),
Block.makeCuboidShape(-3, 31, 5, -2, 32, 11),
Block.makeCuboidShape(-3, -16, 5, -2, -15, 11),
Block.makeCuboidShape(19, -16, 5, 20, 32, 11),
Block.makeCuboidShape(5, 31, -3, 11, 32, -2),
Block.makeCuboidShape(5, -16, -3, 11, -15.5, -2),
Block.makeCuboidShape(5, -16, 19, 11, 32, 20),
Block.makeCuboidShape(5, 31, 18, 11, 32, 19),
Block.makeCuboidShape(5, -16, 18, 11, -15, 19),
Block.makeCuboidShape(-3, -16, 2, -2, 32, 5),
Block.makeCuboidShape(18, -16, 11, 19, 32, 14),
Block.makeCuboidShape(-3, -16, 11, -2, 32, 14),
Block.makeCuboidShape(18, -16, 2, 19, 32, 5),
Block.makeCuboidShape(11, -16, -3, 14, -15.5, -2),
Block.makeCuboidShape(11, 31, -3, 14, 32, -2),
Block.makeCuboidShape(2, -16, 18, 5, 32, 19),
Block.makeCuboidShape(2, -16, -3, 5, -15.5, -2),
Block.makeCuboidShape(2, 31, -3, 5, 32, -2),
Block.makeCuboidShape(11, -16, 18, 14, 32, 19),
Block.makeCuboidShape(-2, -16, 1, -1, 32, 2),
Block.makeCuboidShape(-2, 31, 2, -1, 32, 14),
Block.makeCuboidShape(-2, -16, 2, -1, -15, 14),
Block.makeCuboidShape(-1, 31, 1, 0, 32, 15),
Block.makeCuboidShape(-1, -16, 1, 0, -15, 15),
Block.makeCuboidShape(0, 31, 0, 1, 32, 16),
Block.makeCuboidShape(0, -16, 0, 1, -15, 16),
Block.makeCuboidShape(1, 31, -1, 2, 32, 17),
Block.makeCuboidShape(1, -16, -1, 2, -15, 17),
Block.makeCuboidShape(14, 31, -1, 15, 32, 17),
Block.makeCuboidShape(14, -16, -1, 15, -15, 17),
Block.makeCuboidShape(15, 31, 0, 16, 32, 16),
Block.makeCuboidShape(15, -16, 0, 16, -15, 16),
Block.makeCuboidShape(16, 31, 1, 17, 32, 15),
Block.makeCuboidShape(16, -16, 1, 17, -15, 15),
Block.makeCuboidShape(17, 31, 2, 18, 32, 14),
Block.makeCuboidShape(17, -16, 2, 18, -15, 14),
Block.makeCuboidShape(18, 31, 5, 19, 32, 11),
Block.makeCuboidShape(18, -16, 5, 19, -15, 11),
Block.makeCuboidShape(17, -16, 14, 18, 32, 15),
Block.makeCuboidShape(1, -16, 17, 2, 32, 18),
Block.makeCuboidShape(14, -16, -2, 15, 32, -1),
Block.makeCuboidShape(-1, -16, 0, 0, 32, 1),
Block.makeCuboidShape(16, -16, 15, 17, 32, 16),
Block.makeCuboidShape(0, -16, 16, 1, 32, 17),
Block.makeCuboidShape(15, -16, -1, 16, 32, 0),
Block.makeCuboidShape(0, -16, -1, 1, 32, 0),
Block.makeCuboidShape(15, -16, 16, 16, 32, 17),
Block.makeCuboidShape(-1, -16, 15, 0, 32, 16),
Block.makeCuboidShape(16, -16, 0, 17, 32, 1),
Block.makeCuboidShape(1, -16, -2, 2, 32, -1),
Block.makeCuboidShape(14, -16, 17, 15, 32, 18),
Block.makeCuboidShape(-2, -16, 14, -1, 32, 15),
Block.makeCuboidShape(17, -16, 1, 18, 32, 2),
Block.makeCuboidShape(2, 31, -2, 14, 32, 18)
).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);});