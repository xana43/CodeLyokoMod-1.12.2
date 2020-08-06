Stream.of(
Block.makeCuboidShape(19, 0, 5.8518599999999985, 20, 15.3, 11.851859999999999),
Block.makeCuboidShape(-4.000000000000002, 0, 5.8518599999999985, -3.0000000000000018, 15.3, 11.851859999999999),
Block.makeCuboidShape(5, 0, -3.1481400000000015, 11, 15.3, -2.1481400000000015),
Block.makeCuboidShape(18, 0, 11.851859999999999, 19, 15.3, 14.851859999999999),
Block.makeCuboidShape(-3.0000000000000018, 0, 2.8518599999999985, -2.0000000000000018, 15.3, 5.8518599999999985),
Block.makeCuboidShape(18, 0, 2.8518599999999985, 19, 15.3, 5.8518599999999985),
Block.makeCuboidShape(-3.0000000000000018, 0, 11.851859999999999, -2.0000000000000018, 15.3, 14.851859999999999),
Block.makeCuboidShape(2, 1, 18.851860000000002, 3, 16.3, 19.851860000000002),
Block.makeCuboidShape(11, 0, -2.1481400000000015, 14, 15.3, -1.1481400000000015),
Block.makeCuboidShape(13, 1, 18.851860000000002, 14, 16.3, 19.851860000000002),
Block.makeCuboidShape(2, 0, -2.1481400000000015, 5, 15.3, -1.1481400000000015),
Block.makeCuboidShape(17, 0, 14.851859999999999, 18, 15.3, 15.851859999999999),
Block.makeCuboidShape(-2.0000000000000018, 0, 1.8518599999999985, -1.0000000000000018, 15.3, 2.8518599999999985),
Block.makeCuboidShape(14, 0, -1.1481400000000015, 15, 15.3, -0.1481400000000015),
Block.makeCuboidShape(1, 0, 17.851860000000002, 2, 15.3, 18.851860000000002),
Block.makeCuboidShape(16, 0, 15.851859999999999, 17, 15.3, 16.851860000000002),
Block.makeCuboidShape(-1.0000000000000018, 0, 0.8518599999999985, -1.7763568394002505e-15, 15.3, 1.8518599999999985),
Block.makeCuboidShape(15, 0, -0.1481400000000015, 16, 15.3, 0.8518599999999985),
Block.makeCuboidShape(-1.7763568394002505e-15, 0, 16.851860000000002, 1, 15.3, 17.851860000000002),
Block.makeCuboidShape(15, 0, 16.851860000000002, 16, 15.3, 17.851860000000002),
Block.makeCuboidShape(-1.7763568394002505e-15, 0, -0.1481400000000015, 1, 15.3, 0.8518599999999985),
Block.makeCuboidShape(16, 0, 0.8518599999999985, 17, 15.3, 1.8518599999999985),
Block.makeCuboidShape(-1.0000000000000018, 0, 15.851859999999999, -1.7763568394002505e-15, 15.3, 16.851860000000002),
Block.makeCuboidShape(14, 0, 17.851860000000002, 15, 15.3, 18.851860000000002),
Block.makeCuboidShape(1, 0, -1.1481400000000015, 2, 15.3, -0.1481400000000015),
Block.makeCuboidShape(17, 0, 1.8518599999999985, 18, 15.3, 2.8518599999999985),
Block.makeCuboidShape(-2.0000000000000018, 0, 14.851859999999999, -1.0000000000000018, 15.3, 15.851859999999999)
).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);});