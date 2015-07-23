/*
 * Copyright 2015 Hexosse
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.hexosse.memworth;

import java.util.HashMap;
import java.util.Map;

/**
 * This file is part of MemWorth
 *
 * @author <b>hexosse</b> (<a href="https://github.com/hexosse">hexosse on GitHub</a>).
 */
public class Item implements Comparable<Item>
{
    private int id;
    private int data;
    private String name;
    private String comment;
    private double worth;

    static Map mapItem = new HashMap();

    static {
        mapItem.put(0,"Air");
        mapItem.put(1,"Stone");
        mapItem.put(2,"Grass");
        mapItem.put(3,"Dirt");
        mapItem.put(4,"Cobblestone");
        mapItem.put(5,"Wood");
        mapItem.put(6,"Sapling");
        mapItem.put(7,"Bedrock");
        mapItem.put(8,"Water");
        mapItem.put(9,"StationaryWater");
        mapItem.put(10,"Lava");
        mapItem.put(11,"StationaryLava");
        mapItem.put(12,"Sand");
        mapItem.put(13,"Gravel");
        mapItem.put(14,"GoldOre");
        mapItem.put(15,"IronOre");
        mapItem.put(16,"CoalOre");
        mapItem.put(17,"Log");
        mapItem.put(18,"Leaves");
        mapItem.put(19,"Sponge");
        mapItem.put(20,"Glass");
        mapItem.put(21,"LapisOre");
        mapItem.put(22,"LapisBlock");
        mapItem.put(23,"Dispenser");
        mapItem.put(24,"Sandstone");
        mapItem.put(25,"NoteBlock");
        mapItem.put(26,"BedBlock");
        mapItem.put(27,"PoweredRail");
        mapItem.put(28,"DetectorRail");
        mapItem.put(29,"PistonStickyBase");
        mapItem.put(30,"Web");
        mapItem.put(31,"LongGrass");
        mapItem.put(32,"DeadBush");
        mapItem.put(33,"PistonBase");
        mapItem.put(34,"PistonExtension");
        mapItem.put(35,"Wool");
        mapItem.put(36,"PistonMovingPiece");
        mapItem.put(37,"YellowFlower");
        mapItem.put(38,"RedRose");
        mapItem.put(39,"BrownMushroom");
        mapItem.put(40,"RedMushroom");
        mapItem.put(41,"GoldBlock");
        mapItem.put(42,"IronBlock");
        mapItem.put(43,"DoubleStep");
        mapItem.put(44,"Step");
        mapItem.put(45,"Brick");
        mapItem.put(46,"Tnt");
        mapItem.put(47,"Bookshelf");
        mapItem.put(48,"MossyCobblestone");
        mapItem.put(49,"Obsidian");
        mapItem.put(50,"Torch");
        mapItem.put(51,"Fire");
        mapItem.put(52,"MobSpawner");
        mapItem.put(53,"WoodStairs");
        mapItem.put(54,"Chest");
        mapItem.put(55,"RedstoneWire");
        mapItem.put(56,"DiamondOre");
        mapItem.put(57,"DiamondBlock");
        mapItem.put(58,"Workbench");
        mapItem.put(59,"Crops");
        mapItem.put(60,"Soil");
        mapItem.put(61,"Furnace");
        mapItem.put(62,"BurningFurnace");
        mapItem.put(63,"SignPost");
        mapItem.put(64,"WoodenDoor");
        mapItem.put(65,"Ladder");
        mapItem.put(66,"Rails");
        mapItem.put(67,"CobblestoneStairs");
        mapItem.put(68,"WallSign");
        mapItem.put(69,"Lever");
        mapItem.put(70,"StonePlate");
        mapItem.put(71,"IronDoorBlock");
        mapItem.put(72,"WoodPlate");
        mapItem.put(73,"RedstoneOre");
        mapItem.put(74,"GlowingRedstoneOre");
        mapItem.put(75,"RedstoneTorchOff");
        mapItem.put(76,"RedstoneTorchOn");
        mapItem.put(77,"StoneButton");
        mapItem.put(78,"Snow");
        mapItem.put(79,"Ice");
        mapItem.put(80,"SnowBlock");
        mapItem.put(81,"Cactus");
        mapItem.put(82,"Clay");
        mapItem.put(83,"SugarCaneBlock");
        mapItem.put(84,"Jukebox");
        mapItem.put(85,"Fence");
        mapItem.put(86,"Pumpkin");
        mapItem.put(87,"Netherrack");
        mapItem.put(88,"SoulSand");
        mapItem.put(89,"Glowstone");
        mapItem.put(90,"Portal");
        mapItem.put(91,"JackOLantern");
        mapItem.put(92,"CakeBlock");
        mapItem.put(93,"DiodeBlockOff");
        mapItem.put(94,"DiodeBlockOn");
        mapItem.put(95,"StainedGlass");
        mapItem.put(96,"TrapDoor");
        mapItem.put(97,"MonsterEggs");
        mapItem.put(98,"SmoothBrick");
        mapItem.put(99,"HugeMushroom1");
        mapItem.put(100,"HugeMushroom2");
        mapItem.put(101,"IronFence");
        mapItem.put(102,"ThinGlass");
        mapItem.put(103,"MelonBlock");
        mapItem.put(104,"PumpkinStem");
        mapItem.put(105,"MelonStem");
        mapItem.put(106,"Vine");
        mapItem.put(107,"FenceGate");
        mapItem.put(108,"BrickStairs");
        mapItem.put(109,"SmoothStairs");
        mapItem.put(110,"Mycel");
        mapItem.put(111,"WaterLily");
        mapItem.put(112,"NetherBrick");
        mapItem.put(113,"NetherFence");
        mapItem.put(114,"NetherBrickStairs");
        mapItem.put(115,"NetherWarts");
        mapItem.put(116,"EnchantmentTable");
        mapItem.put(117,"BrewingStand");
        mapItem.put(118,"Cauldron");
        mapItem.put(119,"EnderPortal");
        mapItem.put(120,"EnderPortalFrame");
        mapItem.put(121,"EnderStone");
        mapItem.put(122,"DragonEgg");
        mapItem.put(123,"RedstoneLampOff");
        mapItem.put(124,"RedstoneLampOn");
        mapItem.put(125,"WoodDoubleStep");
        mapItem.put(126,"WoodStep");
        mapItem.put(127,"Cocoa");
        mapItem.put(128,"SandstoneStairs");
        mapItem.put(129,"EmeraldOre");
        mapItem.put(130,"EnderChest");
        mapItem.put(131,"TripwireHook");
        mapItem.put(132,"Tripwire");
        mapItem.put(133,"EmeraldBlock");
        mapItem.put(134,"SpruceWoodStairs");
        mapItem.put(135,"BirchWoodStairs");
        mapItem.put(136,"JungleWoodStairs");
        mapItem.put(137,"Command");
        mapItem.put(138,"Beacon");
        mapItem.put(139,"CobbleWall");
        mapItem.put(140,"FlowerPot");
        mapItem.put(141,"Carrot");
        mapItem.put(142,"Potato");
        mapItem.put(143,"WoodButton");
        mapItem.put(144,"Skull");
        mapItem.put(145,"Anvil");
        mapItem.put(146,"TrappedChest");
        mapItem.put(147,"GoldPlate");
        mapItem.put(148,"IronPlate");
        mapItem.put(149,"RedstoneComparatorOff");
        mapItem.put(150,"RedstoneComparatorOn");
        mapItem.put(151,"DaylightDetector");
        mapItem.put(152,"RedstoneBlock");
        mapItem.put(153,"QuartzOre");
        mapItem.put(154,"Hopper");
        mapItem.put(155,"QuartzBlock");
        mapItem.put(156,"QuartzStairs");
        mapItem.put(157,"ActivatorRail");
        mapItem.put(158,"Dropper");
        mapItem.put(159,"StainedClay");
        mapItem.put(160,"StainedGlassPane");
        mapItem.put(161,"Leaves2");
        mapItem.put(162,"Log2");
        mapItem.put(163,"AcaciaStairs");
        mapItem.put(164,"DarkOakStairs");
        mapItem.put(165,"SlimeBlock");
        mapItem.put(166,"Barrier");
        mapItem.put(167,"IronTrapdoor");
        mapItem.put(168,"Prismarine");
        mapItem.put(169,"SeaLantern");
        mapItem.put(170,"HayBlock");
        mapItem.put(171,"Carpet");
        mapItem.put(172,"HardClay");
        mapItem.put(173,"CoalBlock");
        mapItem.put(174,"PackedIce");
        mapItem.put(175,"DoublePlant");
        mapItem.put(176,"StandingBanner");
        mapItem.put(177,"WallBanner");
        mapItem.put(178,"DaylightDetectorInverted");
        mapItem.put(179,"RedSandstone");
        mapItem.put(180,"RedSandstoneStairs");
        mapItem.put(181,"DoubleStoneSlab2");
        mapItem.put(182,"StoneSlab2");
        mapItem.put(183,"SpruceFenceGate");
        mapItem.put(184,"BirchFenceGate");
        mapItem.put(185,"JungleFenceGate");
        mapItem.put(186,"DarkOakFenceGate");
        mapItem.put(187,"AcaciaFenceGate");
        mapItem.put(188,"SpruceFence");
        mapItem.put(189,"BirchFence");
        mapItem.put(190,"JungleFence");
        mapItem.put(191,"DarkOakFence");
        mapItem.put(192,"AcaciaFence");
        mapItem.put(193,"SpruceDoor");
        mapItem.put(194,"BirchDoor");
        mapItem.put(195,"JungleDoor");
        mapItem.put(196,"AcaciaDoor");
        mapItem.put(197,"DarkOakDoor");
        mapItem.put(256,"IronSpade");
        mapItem.put(257,"IronPickaxe");
        mapItem.put(258,"IronAxe");
        mapItem.put(259,"FlintAndSteel");
        mapItem.put(260,"Apple");
        mapItem.put(261,"Bow");
        mapItem.put(262,"Arrow");
        mapItem.put(263,"Coal");
        mapItem.put(264,"Diamond");
        mapItem.put(265,"IronIngot");
        mapItem.put(266,"GoldIngot");
        mapItem.put(267,"IronSword");
        mapItem.put(268,"WoodSword");
        mapItem.put(269,"WoodSpade");
        mapItem.put(270,"WoodPickaxe");
        mapItem.put(271,"WoodAxe");
        mapItem.put(272,"StoneSword");
        mapItem.put(273,"StoneSpade");
        mapItem.put(274,"StonePickaxe");
        mapItem.put(275,"StoneAxe");
        mapItem.put(276,"DiamondSword");
        mapItem.put(277,"DiamondSpade");
        mapItem.put(278,"DiamondPickaxe");
        mapItem.put(279,"DiamondAxe");
        mapItem.put(280,"Stick");
        mapItem.put(281,"Bowl");
        mapItem.put(282,"MushroomSoup");
        mapItem.put(283,"GoldSword");
        mapItem.put(284,"GoldSpade");
        mapItem.put(285,"GoldPickaxe");
        mapItem.put(286,"GoldAxe");
        mapItem.put(287,"String");
        mapItem.put(288,"Feather");
        mapItem.put(289,"Sulphur");
        mapItem.put(290,"WoodHoe");
        mapItem.put(291,"StoneHoe");
        mapItem.put(292,"IronHoe");
        mapItem.put(293,"DiamondHoe");
        mapItem.put(294,"GoldHoe");
        mapItem.put(295,"Seeds");
        mapItem.put(296,"Wheat");
        mapItem.put(297,"Bread");
        mapItem.put(298,"LeatherHelmet");
        mapItem.put(299,"LeatherChestplate");
        mapItem.put(300,"LeatherLeggings");
        mapItem.put(301,"LeatherBoots");
        mapItem.put(302,"ChainmailHelmet");
        mapItem.put(303,"ChainmailChestplate");
        mapItem.put(304,"ChainmailLeggings");
        mapItem.put(305,"ChainmailBoots");
        mapItem.put(306,"IronHelmet");
        mapItem.put(307,"IronChestplate");
        mapItem.put(308,"IronLeggings");
        mapItem.put(309,"IronBoots");
        mapItem.put(310,"DiamondHelmet");
        mapItem.put(311,"DiamondChestplate");
        mapItem.put(312,"DiamondLeggings");
        mapItem.put(313,"DiamondBoots");
        mapItem.put(314,"GoldHelmet");
        mapItem.put(315,"GoldChestplate");
        mapItem.put(316,"GoldLeggings");
        mapItem.put(317,"GoldBoots");
        mapItem.put(318,"Flint");
        mapItem.put(319,"Pork");
        mapItem.put(320,"GrilledPork");
        mapItem.put(321,"Painting");
        mapItem.put(322,"GoldenApple");
        mapItem.put(323,"Sign");
        mapItem.put(324,"WoodDoor");
        mapItem.put(325,"Bucket");
        mapItem.put(326,"WaterBucket");
        mapItem.put(327,"LavaBucket");
        mapItem.put(328,"Minecart");
        mapItem.put(329,"Saddle");
        mapItem.put(330,"IronDoor");
        mapItem.put(331,"Redstone");
        mapItem.put(332,"SnowBall");
        mapItem.put(333,"Boat");
        mapItem.put(334,"Leather");
        mapItem.put(335,"MilkBucket");
        mapItem.put(336,"ClayBrick");
        mapItem.put(337,"ClayBall");
        mapItem.put(338,"SugarCane");
        mapItem.put(339,"Paper");
        mapItem.put(340,"Book");
        mapItem.put(341,"SlimeBall");
        mapItem.put(342,"StorageMinecart");
        mapItem.put(343,"PoweredMinecart");
        mapItem.put(344,"Egg");
        mapItem.put(345,"Compass");
        mapItem.put(346,"FishingRod");
        mapItem.put(347,"Watch");
        mapItem.put(348,"GlowstoneDust");
        mapItem.put(349,"RawFish");
        mapItem.put(350,"CookedFish");
        mapItem.put(351,"InkSack");
        mapItem.put(352,"Bone");
        mapItem.put(353,"Sugar");
        mapItem.put(354,"Cake");
        mapItem.put(355,"Bed");
        mapItem.put(356,"Diode");
        mapItem.put(357,"Cookie");
        mapItem.put(358,"Map");
        mapItem.put(359,"Shears");
        mapItem.put(360,"Melon");
        mapItem.put(361,"PumpkinSeeds");
        mapItem.put(362,"MelonSeeds");
        mapItem.put(363,"RawBeef");
        mapItem.put(364,"CookedBeef");
        mapItem.put(365,"RawChicken");
        mapItem.put(366,"CookedChicken");
        mapItem.put(367,"RottenFlesh");
        mapItem.put(368,"EnderPearl");
        mapItem.put(369,"BlazeRod");
        mapItem.put(370,"GhastTear");
        mapItem.put(371,"GoldNugget");
        mapItem.put(372,"NetherStalk");
        mapItem.put(373,"Potion");
        mapItem.put(374,"GlassBottle");
        mapItem.put(375,"SpiderEye");
        mapItem.put(376,"FermentedSpiderEye");
        mapItem.put(377,"BlazePowder");
        mapItem.put(378,"MagmaCream");
        mapItem.put(379,"BrewingStandItem");
        mapItem.put(380,"CauldronItem");
        mapItem.put(381,"EyeOfEnder");
        mapItem.put(382,"SpeckledMelon");
        mapItem.put(383,"MonsterEgg");
        mapItem.put(384,"ExpBottle");
        mapItem.put(385,"Fireball");
        mapItem.put(386,"BookAndQuill");
        mapItem.put(387,"WrittenBook");
        mapItem.put(388,"Emerald");
        mapItem.put(389,"ItemFrame");
        mapItem.put(390,"FlowerPotItem");
        mapItem.put(391,"CarrotItem");
        mapItem.put(392,"PotatoItem");
        mapItem.put(393,"BakedPotato");
        mapItem.put(394,"PoisonousPotato");
        mapItem.put(395,"EmptyMap");
        mapItem.put(396,"GoldenCarrot");
        mapItem.put(397,"SkullItem");
        mapItem.put(398,"CarrotStick");
        mapItem.put(399,"NetherStar");
        mapItem.put(400,"PumpkinPie");
        mapItem.put(401,"Firework");
        mapItem.put(402,"FireworkCharge");
        mapItem.put(403,"EnchantedBook");
        mapItem.put(404,"RedstoneComparator");
        mapItem.put(405,"NetherBrickItem");
        mapItem.put(406,"Quartz");
        mapItem.put(407,"ExplosiveMinecart");
        mapItem.put(408,"HopperMinecart");
        mapItem.put(409,"PrismarineShard");
        mapItem.put(410,"PrismarineCrystals");
        mapItem.put(411,"Rabbit");
        mapItem.put(412,"CookedRabbit");
        mapItem.put(413,"RabbitStew");
        mapItem.put(414,"RabbitFoot");
        mapItem.put(415,"RabbitHide");
        mapItem.put(416,"ArmorStand");
        mapItem.put(417,"IronBarding");
        mapItem.put(418,"GoldBarding");
        mapItem.put(419,"DiamondBarding");
        mapItem.put(420,"Leash");
        mapItem.put(421,"NameTag");
        mapItem.put(422,"CommandMinecart");
        mapItem.put(423,"Mutton");
        mapItem.put(424,"CookedMutton");
        mapItem.put(425,"Banner");
        mapItem.put(427,"SpruceDoorItem");
        mapItem.put(428,"BirchDoorItem");
        mapItem.put(429,"JungleDoorItem");
        mapItem.put(430,"AcaciaDoorItem");
        mapItem.put(431,"DarkOakDoorItem");
        mapItem.put(2256,"GoldRecord");
        mapItem.put(2257,"GreenRecord");
        mapItem.put(2258,"Record3");
        mapItem.put(2259,"Record4");
        mapItem.put(2260,"Record5");
        mapItem.put(2261,"Record6");
        mapItem.put(2262,"Record7");
        mapItem.put(2263,"Record8");
        mapItem.put(2264,"Record9");
        mapItem.put(2265,"Record10");
        mapItem.put(2266,"Record11");
        mapItem.put(2267,"Record12");
    }

    /**
     * @param id Item Id
     * @param data Item data
     * @param comment Comment to output in the worth file
     * @param worth Worth of the item
     */
    public Item(int id, int data, String comment, double worth)
    {
        this.id = id;
        this.data = data;
        this.comment = comment;
        this.worth = (double)Math.round(worth * 100)/100;  // 2 decimal

        System.out.println("id: " + id + "; data: " + data + "; worth: " + worth + "; comment: " + comment);
    }

    /**
     * @param id Item Id
     * @param data Item data
     * @param worth Worth of the item
     */
    public Item(int id, int data, double worth)
    {
        this(id, data, "", worth);
    }

    @Override
    public int compareTo(Item toCompare)
    {
        if(toCompare==null) return 1;
        // Compare Item Id
        if(this.id < toCompare.id)  return -1;
        if(this.id > toCompare.id)  return 1;
        // Compare Item data
        if(this.data < toCompare.data)  return -1;
        if(this.data > toCompare.data)  return 1;
        return 0;
    }

    /**
     * @param toCompare item to compar
     * @return if items have the same id then true else false
     */
    public boolean hasSameId(Item toCompare)
    {
        if(toCompare==null) return false;
        // Compare Item Id
        if(this.id == toCompare.id)  return true;
        return false;
    }

    /**
     * @return Item Id
     */
    public int getId()
    {
        return id;
    }

    /**
     * @return Item data
     */
    public int getData()
    {
        return data;
    }

    /**
     * @return Name of the item corresponding to the Id
     */
    public String getName()
    {
        if(name==null || name.isEmpty())
            name = (String)mapItem.get(id);
        return name;
    }

    /**
     * @return Comment to output in the worth file
     */
    public String getComment()
    {
        return comment;
    }

    /**
     * @return Worth of the item
     */
    public double getWorth()
    {
        return worth;
    }
}
