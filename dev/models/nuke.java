// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class oppencraft:nuke extends EntityModel<Entity> {
	private final ModelPart voxel_file;
	public oppencraft:nuke(ModelPart root) {
		this.voxel_file = root.getChild("voxel_file");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData voxel_file = modelPartData.addChild("voxel_file", ModelPartBuilder.create().uv(61, 35).cuboid(-6.1175F, 7.4628F, -4.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(57, 45).cuboid(-6.1175F, 10.4628F, -4.4885F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(85, 20).cuboid(-6.1175F, 3.4628F, -4.4885F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 34).cuboid(-6.1175F, 16.4628F, -4.4885F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 56).cuboid(-6.1175F, -0.5372F, -4.4885F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(76, 99).cuboid(-6.1175F, -3.5372F, -4.4885F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(48, 0).cuboid(6.8825F, -7.5372F, -4.4885F, 1.0F, 32.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 100).cuboid(-6.1175F, -7.5372F, -4.4885F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(69, 0).cuboid(5.8825F, -9.5372F, -4.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(79, 54).cuboid(-5.1175F, -9.5372F, -4.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(67, 80).cuboid(-5.1175F, 27.4628F, -4.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(75, 83).cuboid(4.8825F, -10.5372F, -4.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(86, 62).cuboid(5.8825F, 27.4628F, -4.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(86, 64).cuboid(-4.1175F, 28.4628F, -4.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 87).cuboid(-4.1175F, -10.5372F, -4.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 96).cuboid(4.8825F, 28.4628F, -4.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(38, 96).cuboid(-3.1175F, 29.4628F, -4.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(87, 98).cuboid(3.8825F, -11.5372F, -4.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(101, 19).cuboid(-3.1175F, -11.5372F, -4.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(101, 80).cuboid(3.8825F, 29.4628F, -4.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(65, 21).cuboid(-1.1175F, 30.4628F, -4.4885F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(18, 88).cuboid(3.8825F, -27.5372F, -3.4885F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(69, 60).cuboid(-4.1175F, -19.5372F, -3.4885F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(73, 81).cuboid(2.8825F, -12.5372F, -4.4885F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(102, 13).cuboid(4.8825F, -18.5372F, -3.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(96, 36).cuboid(-3.1175F, -12.5372F, -4.4885F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(102, 40).cuboid(-4.1175F, -16.5372F, -3.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(31, 100).cuboid(-2.1175F, -17.5372F, -3.4885F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(102, 67).cuboid(4.8825F, -16.5372F, -3.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(102, 84).cuboid(-3.1175F, -15.5372F, -3.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(83, 7).cuboid(-1.1175F, -17.5372F, -3.4885F, 4.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(80, 100).cuboid(-2.1175F, -14.5372F, -3.4885F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(72, 51).cuboid(-1.1175F, -13.5372F, -4.4885F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(54, 30).cuboid(4.8825F, -17.5372F, -4.4885F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(30, 94).cuboid(2.8825F, -17.5372F, -3.4885F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(71, 74).cuboid(-4.1175F, -11.5372F, -4.4885F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(69, 29).cuboid(3.8825F, -18.5372F, -4.4885F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(93, 72).cuboid(4.8825F, -11.5372F, -4.4885F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(69, 24).cuboid(-4.1175F, -18.5372F, -4.4885F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(94, 89).cuboid(5.8825F, -10.5372F, -4.4885F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(69, 65).cuboid(3.8825F, -19.5372F, -4.4885F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(95, 9).cuboid(-6.1175F, -8.5372F, -4.4885F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(95, 27).cuboid(6.8825F, -8.5372F, -4.4885F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(94, 100).cuboid(-7.1175F, -7.5372F, -3.4885F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(97, 0).cuboid(2.8825F, -20.5372F, -4.4885F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(33, 75).cuboid(-6.1175F, -5.5372F, -4.4885F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(102, 90).cuboid(-2.1175F, -20.5372F, -4.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(98, 100).cuboid(-7.1175F, -3.5372F, -3.4885F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(95, 30).cuboid(-6.1175F, -1.5372F, -4.4885F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(67, 92).cuboid(-3.1175F, -21.5372F, -4.4885F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(77, 35).cuboid(-5.1175F, -21.5372F, -4.4885F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(93, 41).cuboid(-6.1175F, 1.4628F, -4.4885F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(102, 99).cuboid(4.8825F, -22.5372F, -4.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(9, 101).cuboid(-7.1175F, 3.4628F, -3.4885F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(86, 67).cuboid(1.8825F, -22.5372F, -4.4885F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(101, 102).cuboid(-0.1175F, -22.5372F, -4.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(93, 85).cuboid(-6.1175F, 5.4628F, -4.4885F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(103, 4).cuboid(-7.1175F, 7.4628F, -3.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(95, 79).cuboid(-2.1175F, -22.5372F, -4.4885F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(103, 7).cuboid(-4.1175F, -22.5372F, -4.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(94, 23).cuboid(-6.1175F, 8.4628F, -4.4885F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(18, 101).cuboid(-7.1175F, 10.4628F, -3.4885F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(68, 35).cuboid(-6.1175F, 12.4628F, -4.4885F, 1.0F, 4.0F, 2.0F, new Dilation(0.0F))
		.uv(103, 10).cuboid(-5.1175F, -23.5372F, -4.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(22, 101).cuboid(-7.1175F, 16.4628F, -3.4885F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(52, 0).cuboid(-6.1175F, 18.4628F, -4.4885F, 1.0F, 9.0F, 2.0F, new Dilation(0.0F))
		.uv(61, 24).cuboid(6.8825F, 24.4628F, -4.4885F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(95, 82).cuboid(-5.1175F, 28.4628F, -4.4885F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(103, 24).cuboid(4.8825F, -25.5372F, -4.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(89, 95).cuboid(5.8825F, 28.4628F, -4.4885F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(30, 103).cuboid(-4.1175F, 29.4628F, -3.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(95, 93).cuboid(4.8825F, 29.4628F, -4.4885F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(4, 96).cuboid(-2.1175F, 30.4628F, -4.4885F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(96, 33).cuboid(2.8825F, 30.4628F, -4.4885F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(103, 50).cuboid(-1.1175F, 31.4628F, -3.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(92, 52).cuboid(-4.1175F, -20.5372F, -3.4885F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(96, 45).cuboid(4.8825F, -20.5372F, -3.4885F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(96, 57).cuboid(-2.1175F, -15.5372F, -3.4885F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(103, 71).cuboid(-5.1175F, -26.5372F, -4.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(58, 0).cuboid(5.8825F, -27.5372F, -4.4885F, 1.0F, 10.0F, 1.0F, new Dilation(0.0F))
		.uv(96, 66).cuboid(-3.1175F, -13.5372F, -3.4885F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(75, 96).cuboid(3.8825F, -13.5372F, -3.4885F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(96, 75).cuboid(4.8825F, -12.5372F, -3.4885F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(72, 45).cuboid(-2.1175F, -27.5372F, -4.4885F, 7.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(93, 96).cuboid(-5.1175F, -10.5372F, -3.4885F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(77, 43).cuboid(-2.1175F, 29.4628F, -5.4885F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(80, 103).cuboid(3.8825F, 28.4628F, -5.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(91, 103).cuboid(-3.1175F, 28.4628F, -5.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(95, 103).cuboid(4.8825F, 27.4628F, -5.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 21).cuboid(-4.1175F, 26.4628F, -5.4885F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 97).cuboid(-3.1175F, 30.4628F, -3.4885F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(16, 97).cuboid(3.8825F, 30.4628F, -3.4885F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(84, 33).cuboid(-3.1175F, -22.5372F, -4.4885F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(57, 30).cuboid(-4.1175F, -21.5372F, -3.4885F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(86, 74).cuboid(4.8825F, -21.5372F, -3.4885F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(83, 2).cuboid(-0.1175F, -18.5372F, -3.4885F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 104).cuboid(-3.1175F, -15.5372F, -1.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(97, 19).cuboid(-3.1175F, -14.5372F, -2.4885F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(6, 104).cuboid(-4.1175F, -13.5372F, -1.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(88, 43).cuboid(-4.1175F, -12.5372F, -3.4885F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(47, 97).cuboid(-5.1175F, -11.5372F, -2.4885F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(10, 104).cuboid(-6.1175F, -10.5372F, -1.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(88, 87).cuboid(-6.1175F, -9.5372F, -3.4885F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(89, 25).cuboid(6.8825F, -9.5372F, -3.4885F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(57, 35).cuboid(-7.1175F, -7.5372F, -2.4885F, 1.0F, 7.0F, 2.0F, new Dilation(0.0F))
		.uv(49, 60).cuboid(-7.1175F, 1.4628F, -2.4885F, 1.0F, 26.0F, 2.0F, new Dilation(0.0F))
		.uv(90, 3).cuboid(-6.1175F, 27.4628F, -3.4885F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(90, 9).cuboid(6.8825F, 27.4628F, -3.4885F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(81, 29).cuboid(-0.1175F, 31.4628F, -3.4885F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(78, 20).cuboid(-3.1175F, -23.5372F, -4.4885F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(75, 81).cuboid(-4.1175F, -23.5372F, -3.4885F, 1.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(35, 101).cuboid(-1.1175F, -23.5372F, -0.4885F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(39, 101).cuboid(-2.1175F, -22.5372F, -0.4885F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(79, 65).cuboid(-3.1175F, -21.5372F, -0.4885F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(59, 60).cuboid(-3.1175F, -18.5372F, -2.4885F, 1.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(101, 47).cuboid(-4.1175F, -15.5372F, -0.4885F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(104, 15).cuboid(-5.1175F, -13.5372F, -0.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 104).cuboid(-6.1175F, -11.5372F, -0.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(48, 101).cuboid(-7.1175F, -10.5372F, -0.4885F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(18, 82).cuboid(-7.1175F, -0.5372F, -3.4885F, 1.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(6, 36).cuboid(5.8825F, -8.5372F, -5.4885F, 1.0F, 36.0F, 1.0F, new Dilation(0.0F))
		.uv(10, 36).cuboid(-5.1175F, -8.5372F, -5.4885F, 1.0F, 36.0F, 1.0F, new Dilation(0.0F))
		.uv(104, 18).cuboid(4.8825F, -9.5372F, -5.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(20, 104).cuboid(-4.1175F, -9.5372F, -5.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(104, 28).cuboid(3.8825F, -10.5372F, -5.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(33, 104).cuboid(-3.1175F, -10.5372F, -5.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(52, 101).cuboid(2.8825F, -11.5372F, -5.4885F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(56, 101).cuboid(-7.1175F, 27.4628F, -0.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 30).cuboid(-6.1175F, 28.4628F, -2.4885F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(91, 35).cuboid(-5.1175F, 29.4628F, -2.4885F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(91, 47).cuboid(-4.1175F, 30.4628F, -2.4885F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(37, 104).cuboid(-2.1175F, -11.5372F, -5.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(83, 12).cuboid(-2.1175F, 31.4628F, -2.4885F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(85, 71).cuboid(-1.1175F, -12.5372F, -5.4885F, 4.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 73).cuboid(-3.1175F, -24.5372F, -4.4885F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(97, 71).cuboid(-4.1175F, -23.5372F, 0.5115F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(77, 34).cuboid(4.8825F, -23.5372F, -3.4885F, 1.0F, 2.0F, 5.0F, new Dilation(0.0F))
		.uv(10, 0).cuboid(-0.1175F, -23.5372F, -0.4885F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F))
		.uv(52, 24).cuboid(-2.1175F, -18.5372F, -3.4885F, 2.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(97, 41).cuboid(4.8825F, -18.5372F, -5.4885F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 75).cuboid(1.8825F, -18.5372F, -3.4885F, 2.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(104, 42).cuboid(-5.1175F, -18.5372F, -5.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(97, 49).cuboid(-5.1175F, -12.5372F, -0.4885F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(79, 97).cuboid(7.8825F, -9.5372F, -0.4885F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(46, 104).cuboid(-7.1175F, -7.5372F, 0.5115F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(60, 101).cuboid(4.8825F, -21.5372F, -5.4885F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(50, 104).cuboid(4.8825F, -23.5372F, -5.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(71, 92).cuboid(-4.1175F, -23.5372F, -5.4885F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(68, 35).cuboid(-4.1175F, -24.5372F, -5.4885F, 1.0F, 1.0F, 7.0F, new Dilation(0.0F))
		.uv(79, 74).cuboid(-7.1175F, 27.4628F, 0.5115F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(104, 52).cuboid(-6.1175F, 29.4628F, 0.5115F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(54, 104).cuboid(-5.1175F, 30.4628F, 0.5115F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(58, 104).cuboid(4.8825F, -26.5372F, -5.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(62, 104).cuboid(-4.1175F, -26.5372F, -5.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 98).cuboid(5.8825F, 30.4628F, -0.4885F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(104, 62).cuboid(-4.1175F, 31.4628F, 0.5115F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(85, 80).cuboid(5.8825F, -27.5372F, -5.4885F, 2.0F, 9.0F, 1.0F, new Dilation(0.0F))
		.uv(85, 20).cuboid(2.8825F, 31.4628F, -2.4885F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(97, 85).cuboid(-2.1175F, 32.4628F, 0.5115F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(98, 13).cuboid(1.8825F, 32.4628F, -0.4885F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(69, 29).cuboid(-1.1175F, -24.5372F, -1.4885F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(75, 0).cuboid(-4.1175F, -24.5372F, 1.5115F, 2.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(81, 81).cuboid(4.8825F, -23.5372F, 1.5115F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(65, 0).cuboid(-3.1175F, -18.5372F, 0.5115F, 1.0F, 5.0F, 2.0F, new Dilation(0.0F))
		.uv(78, 51).cuboid(3.8825F, -14.5372F, -2.4885F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(20, 98).cuboid(-4.1175F, -13.5372F, 0.5115F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(85, 38).cuboid(4.8825F, -13.5372F, -1.4885F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(85, 47).cuboid(5.8825F, -12.5372F, -1.4885F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(98, 22).cuboid(-6.1175F, -10.5372F, 0.5115F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(62, 55).cuboid(-2.1175F, 27.4628F, -6.4885F, 6.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(79, 65).cuboid(6.8825F, -10.5372F, -2.4885F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(91, 57).cuboid(7.8825F, 27.4628F, -0.4885F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(66, 104).cuboid(-4.1175F, 30.4628F, 1.5115F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(86, 62).cuboid(-3.1175F, 31.4628F, -1.4885F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(44, 34).cuboid(-1.1175F, 31.4628F, 1.5115F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(98, 52).cuboid(1.8825F, 31.4628F, 1.5115F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(85, 52).cuboid(-0.1175F, 32.4628F, -0.4885F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(62, 45).cuboid(-3.1175F, -26.5372F, -4.4885F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(63, 71).cuboid(-4.1175F, -24.5372F, 2.5115F, 2.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(52, 24).cuboid(4.8825F, -23.5372F, 2.5115F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(75, 17).cuboid(-2.1175F, -18.5372F, 1.5115F, 6.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(45, 42).cuboid(3.8825F, -18.5372F, -2.4885F, 1.0F, 3.0F, 6.0F, new Dilation(0.0F))
		.uv(104, 76).cuboid(-2.1175F, -14.5372F, 2.5115F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(48, 88).cuboid(3.8825F, 20.4628F, -6.4885F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(26, 93).cuboid(-3.1175F, -18.5372F, 2.5115F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(64, 101).cuboid(3.8825F, -14.5372F, 2.5115F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(38, 98).cuboid(-4.1175F, -12.5372F, 1.5115F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(104, 79).cuboid(4.8825F, -12.5372F, 2.5115F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(91, 67).cuboid(-5.1175F, -11.5372F, 0.5115F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(8, 74).cuboid(5.8825F, -11.5372F, -2.4885F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(91, 75).cuboid(-6.1175F, -9.5372F, 0.5115F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(51, 98).cuboid(6.8825F, -9.5372F, 1.5115F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(71, 74).cuboid(-7.1175F, -8.5372F, -2.4885F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(75, 0).cuboid(7.8825F, -8.5372F, -2.4885F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(40, 73).cuboid(-3.1175F, 16.4628F, -6.4885F, 1.0F, 12.0F, 1.0F, new Dilation(0.0F))
		.uv(102, 103).cuboid(-7.1175F, 18.4628F, -0.4885F, 1.0F, 9.0F, 4.0F, new Dilation(0.0F))
		.uv(71, 65).cuboid(7.8825F, 24.4628F, -2.4885F, 1.0F, 3.0F, 6.0F, new Dilation(0.0F))
		.uv(58, 98).cuboid(-6.1175F, 28.4628F, 1.5115F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(104, 81).cuboid(3.8825F, 15.4628F, -6.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(75, 10).cuboid(6.8825F, 28.4628F, -2.4885F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(98, 60).cuboid(-5.1175F, 29.4628F, 1.5115F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(99, 30).cuboid(-4.1175F, 30.4628F, 2.5115F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 75).cuboid(4.8825F, 30.4628F, -2.4885F, 1.0F, 1.0F, 6.0F, new Dilation(0.0F))
		.uv(83, 98).cuboid(-2.1175F, 31.4628F, 1.5115F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(79, 74).cuboid(3.8825F, 31.4628F, -1.4885F, 1.0F, 1.0F, 5.0F, new Dilation(0.0F))
		.uv(57, 35).cuboid(-3.1175F, -27.5372F, -4.4885F, 1.0F, 1.0F, 9.0F, new Dilation(0.0F))
		.uv(65, 12).cuboid(-4.1175F, -26.5372F, -3.4885F, 1.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(83, 104).cuboid(3.8825F, 12.4628F, -6.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(65, 0).cuboid(4.8825F, -26.5372F, -3.4885F, 1.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(87, 104).cuboid(-3.1175F, -19.5372F, 3.5115F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(81, 87).cuboid(3.8825F, -27.5372F, 3.5115F, 1.0F, 9.0F, 1.0F, new Dilation(0.0F))
		.uv(91, 79).cuboid(-4.1175F, -24.5372F, 3.5115F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(104, 92).cuboid(3.8825F, 9.4628F, -6.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(43, 93).cuboid(4.8825F, -23.5372F, 3.5115F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(104, 94).cuboid(-4.1175F, -16.5372F, 3.5115F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(18, 82).cuboid(-2.1175F, -18.5372F, 3.5115F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(104, 97).cuboid(4.8825F, -16.5372F, 3.5115F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(99, 43).cuboid(-3.1175F, -15.5372F, 3.5115F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(22, 66).cuboid(3.8825F, -15.5372F, -3.4885F, 1.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(0, 81).cuboid(-1.1175F, -18.5372F, 3.5115F, 5.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(98, 104).cuboid(-2.1175F, -13.5372F, 3.5115F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(99, 63).cuboid(2.8825F, -13.5372F, 3.5115F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(68, 101).cuboid(-3.1175F, -13.5372F, 3.5115F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(72, 101).cuboid(3.8825F, 5.4628F, -6.4885F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(104, 101).cuboid(-4.1175F, -11.5372F, 3.5115F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(101, 77).cuboid(4.8825F, -12.5372F, 3.5115F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(98, 87).cuboid(-5.1175F, -10.5372F, 2.5115F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(89, 98).cuboid(5.8825F, -10.5372F, 2.5115F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(102, 104).cuboid(3.8825F, 2.4628F, -6.4885F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 101).cuboid(-6.1175F, -9.5372F, 3.5115F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(88, 101).cuboid(6.8825F, -9.5372F, 3.5115F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(22, 38).cuboid(4.8825F, -7.5372F, -6.4885F, 1.0F, 35.0F, 1.0F, new Dilation(0.0F))
		.uv(64, 99).cuboid(3.8825F, -8.5372F, -6.4885F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(26, 38).cuboid(-4.1175F, -8.5372F, -6.4885F, 1.0F, 35.0F, 1.0F, new Dilation(0.0F))
		.uv(59, 66).cuboid(1.8825F, -9.5372F, -6.4885F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(101, 95).cuboid(-3.1175F, -9.5372F, -6.4885F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(92, 64).cuboid(-0.1175F, -10.5372F, -6.4885F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(99, 16).cuboid(-2.1175F, -10.5372F, -6.4885F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(12, 81).cuboid(-5.1175F, -27.5372F, -6.4885F, 1.0F, 9.0F, 2.0F, new Dilation(0.0F))
		.uv(39, 102).cuboid(-7.1175F, -7.5372F, -0.4885F, 1.0F, 26.0F, 5.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(7.8825F, -7.5372F, -3.4885F, 1.0F, 28.0F, 8.0F, new Dilation(0.0F))
		.uv(105, 0).cuboid(6.8825F, 20.4628F, 3.5115F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(59, 60).cuboid(7.8825F, 20.4628F, -3.4885F, 1.0F, 4.0F, 8.0F, new Dilation(0.0F))
		.uv(89, 91).cuboid(-6.1175F, 27.4628F, 1.5115F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(98, 90).cuboid(6.8825F, 27.4628F, 2.5115F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(99, 69).cuboid(-5.1175F, 29.4628F, 3.5115F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(69, 55).cuboid(5.8825F, 29.4628F, -2.4885F, 1.0F, 1.0F, 7.0F, new Dilation(0.0F))
		.uv(70, 99).cuboid(-3.1175F, 30.4628F, 3.5115F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(99, 82).cuboid(3.8825F, 30.4628F, 3.5115F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 57).cuboid(-1.1175F, 31.4628F, 2.5115F, 5.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(49, 48).cuboid(-4.1175F, -27.5372F, -5.4885F, 1.0F, 1.0F, 11.0F, new Dilation(0.0F))
		.uv(52, 0).cuboid(4.8825F, -27.5372F, -5.4885F, 1.0F, 1.0F, 11.0F, new Dilation(0.0F))
		.uv(52, 12).cuboid(-4.1175F, -25.5372F, -5.4885F, 1.0F, 1.0F, 11.0F, new Dilation(0.0F))
		.uv(57, 24).cuboid(4.8825F, -24.5372F, -4.4885F, 1.0F, 1.0F, 10.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-0.1175F, -27.5372F, 3.5115F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F))
		.uv(6, 87).cuboid(-1.1175F, -27.5372F, 3.5115F, 1.0F, 7.0F, 2.0F, new Dilation(0.0F))
		.uv(75, 87).cuboid(1.8825F, -27.5372F, 3.5115F, 1.0F, 7.0F, 2.0F, new Dilation(0.0F))
		.uv(37, 86).cuboid(-2.1175F, -27.5372F, 3.5115F, 1.0F, 8.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 87).cuboid(2.8825F, -27.5372F, 3.5115F, 1.0F, 8.0F, 2.0F, new Dilation(0.0F))
		.uv(12, 92).cuboid(-5.1175F, -24.5372F, 4.5115F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(56, 93).cuboid(5.8825F, -23.5372F, 4.5115F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(4, 99).cuboid(-4.1175F, -17.5372F, 3.5115F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(99, 4).cuboid(4.8825F, -17.5372F, 3.5115F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(29, 81).cuboid(-3.1175F, -27.5372F, 4.5115F, 1.0F, 12.0F, 1.0F, new Dilation(0.0F))
		.uv(33, 81).cuboid(3.8825F, -27.5372F, 4.5115F, 1.0F, 12.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 13).cuboid(-1.1175F, -13.5372F, 4.5115F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(99, 93).cuboid(-2.1175F, -12.5372F, 4.5115F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(3, 105).cuboid(2.8825F, -12.5372F, 4.5115F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(102, 1).cuboid(-3.1175F, -12.5372F, 4.5115F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(3, 102).cuboid(3.8825F, -12.5372F, 4.5115F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(105, 12).cuboid(-4.1175F, -10.5372F, 4.5115F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(13, 105).cuboid(4.8825F, -10.5372F, 4.5115F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(105, 20).cuboid(-5.1175F, -9.5372F, 4.5115F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(23, 105).cuboid(5.8825F, -9.5372F, 4.5115F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(55, 60).cuboid(-6.1175F, -8.5372F, 4.5115F, 1.0F, 27.0F, 1.0F, new Dilation(0.0F))
		.uv(41, 35).cuboid(6.8825F, -8.5372F, 4.5115F, 1.0F, 33.0F, 1.0F, new Dilation(0.0F))
		.uv(69, 81).cuboid(-6.1175F, 18.4628F, 3.5115F, 1.0F, 9.0F, 2.0F, new Dilation(0.0F))
		.uv(75, 10).cuboid(6.8825F, 24.4628F, 3.5115F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(105, 26).cuboid(-5.1175F, 27.4628F, 4.5115F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(27, 105).cuboid(5.8825F, 27.4628F, 4.5115F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(99, 7).cuboid(-5.1175F, 28.4628F, 3.5115F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(99, 10).cuboid(5.8825F, 28.4628F, 3.5115F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(13, 100).cuboid(-4.1175F, 29.4628F, 4.5115F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(105, 30).cuboid(4.8825F, 29.4628F, 4.5115F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(25, 100).cuboid(-2.1175F, 30.4628F, 4.5115F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(93, 7).cuboid(1.8825F, 30.4628F, 4.5115F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(102, 34).cuboid(-4.1175F, -27.5372F, 5.5115F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 75).cuboid(-5.1175F, -27.5372F, 4.5115F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 82).cuboid(4.8825F, -27.5372F, 5.5115F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 73).cuboid(5.8825F, -27.5372F, 4.5115F, 1.0F, 4.0F, 2.0F, new Dilation(0.0F))
		.uv(52, 88).cuboid(6.8825F, -27.5372F, 5.5115F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(62, 45).cuboid(-5.1175F, -24.5372F, 5.5115F, 2.0F, 7.0F, 1.0F, new Dilation(0.0F))
		.uv(65, 12).cuboid(4.8825F, -23.5372F, 5.5115F, 2.0F, 6.0F, 1.0F, new Dilation(0.0F))
		.uv(94, 55).cuboid(-0.1175F, -12.5372F, 5.5115F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 26).cuboid(-2.1175F, -11.5372F, 5.5115F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(100, 32).cuboid(-3.1175F, -10.5372F, 5.5115F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(100, 38).cuboid(2.8825F, -10.5372F, 5.5115F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(105, 33).cuboid(-4.1175F, -9.5372F, 5.5115F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(105, 36).cuboid(4.8825F, -9.5372F, 5.5115F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(14, 36).cuboid(-5.1175F, -8.5372F, 5.5115F, 1.0F, 36.0F, 1.0F, new Dilation(0.0F))
		.uv(33, 37).cuboid(5.8825F, -8.5372F, 5.5115F, 1.0F, 36.0F, 1.0F, new Dilation(0.0F))
		.uv(43, 100).cuboid(-5.1175F, 27.4628F, 5.5115F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(105, 39).cuboid(4.8825F, 27.4628F, 5.5115F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(100, 45).cuboid(-4.1175F, 28.4628F, 5.5115F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(100, 57).cuboid(3.8825F, 28.4628F, 5.5115F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(69, 63).cuboid(-3.1175F, 29.4628F, 5.5115F, 8.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(92, 61).cuboid(-0.1175F, 30.4628F, 4.5115F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(91, 39).cuboid(-1.1175F, -10.5372F, 6.5115F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(78, 60).cuboid(-2.1175F, -9.5372F, 6.5115F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(102, 54).cuboid(-3.1175F, -9.5372F, 6.5115F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(102, 59).cuboid(3.8825F, -9.5372F, 6.5115F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(84, 33).cuboid(-3.1175F, -6.5372F, 6.5115F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(76, 102).cuboid(-3.1175F, -1.5372F, 6.5115F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(90, 105).cuboid(3.8825F, -7.5372F, -7.4885F, 1.0F, 35.0F, 1.0F, new Dilation(0.0F))
		.uv(40, 105).cuboid(-3.1175F, 22.4628F, 6.5115F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(77, 105).cuboid(-4.1175F, -8.5372F, 6.5115F, 1.0F, 33.0F, 1.0F, new Dilation(0.0F))
		.uv(40, 0).cuboid(4.8825F, -8.5372F, 6.5115F, 1.0F, 34.0F, 1.0F, new Dilation(0.0F))
		.uv(44, 68).cuboid(-3.1175F, -7.5372F, -7.4885F, 1.0F, 24.0F, 1.0F, new Dilation(0.0F))
		.uv(95, 2).cuboid(-4.1175F, 24.4628F, 6.5115F, 2.0F, 3.0F, 1.0F, new Dilation(0.0F))
		.uv(34, 0).cuboid(1.8825F, -8.5372F, -7.4885F, 2.0F, 36.0F, 1.0F, new Dilation(0.0F))
		.uv(99, 26).cuboid(3.8825F, 25.4628F, 6.5115F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(100, 65).cuboid(-3.1175F, 27.4628F, 6.5115F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 36).cuboid(-2.1175F, -8.5372F, -7.4885F, 2.0F, 36.0F, 1.0F, new Dilation(0.0F))
		.uv(28, 0).cuboid(-0.1175F, -9.5372F, -7.4885F, 2.0F, 37.0F, 1.0F, new Dilation(0.0F))
		.uv(100, 74).cuboid(2.8825F, 27.4628F, 6.5115F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(83, 0).cuboid(-2.1175F, 28.4628F, 6.5115F, 6.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(73, 105).cuboid(-3.1175F, -7.5372F, 7.5115F, 1.0F, 34.0F, 1.0F, new Dilation(0.0F))
		.uv(44, 0).cuboid(3.8825F, -7.5372F, 7.5115F, 1.0F, 33.0F, 1.0F, new Dilation(0.0F))
		.uv(37, 37).cuboid(-2.1175F, -8.5372F, 7.5115F, 1.0F, 36.0F, 1.0F, new Dilation(0.0F))
		.uv(18, 38).cuboid(2.8825F, -8.5372F, 7.5115F, 1.0F, 36.0F, 1.0F, new Dilation(0.0F))
		.uv(18, 0).cuboid(-1.1175F, -8.5372F, 7.5115F, 4.0F, 37.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-8.8825F, -9.4628F, 7.4885F));
		return TexturedModelData.of(modelData, 256, 256);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		voxel_file.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}