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
        mapItem.put(0,"air");
        mapItem.put(1,"stone");
        mapItem.put(2,"grass");
        mapItem.put(3,"dirt");
        mapItem.put(4,"cobblestone");
        mapItem.put(5,"wood");
        mapItem.put(6,"sapling");
        mapItem.put(7,"bedrock");
        mapItem.put(8,"water");
        mapItem.put(9,"stationarywater");
        mapItem.put(10,"lava");
        mapItem.put(11,"stationarylava");
        mapItem.put(12,"sand");
        mapItem.put(13,"gravel");
        mapItem.put(14,"goldore");
        mapItem.put(15,"ironore");
        mapItem.put(16,"coalore");
        mapItem.put(17,"log");
        mapItem.put(18,"leaves");
        mapItem.put(19,"sponge");
        mapItem.put(20,"glass");
        mapItem.put(21,"lapisore");
        mapItem.put(22,"lapisblock");
        mapItem.put(23,"dispenser");
        mapItem.put(24,"sandstone");
        mapItem.put(25,"noteblock");
        mapItem.put(26,"bedblock");
        mapItem.put(27,"poweredrail");
        mapItem.put(28,"detectorrail");
        mapItem.put(29,"pistonstickybase");
        mapItem.put(30,"web");
        mapItem.put(31,"longgrass");
        mapItem.put(32,"deadbush");
        mapItem.put(33,"pistonbase");
        mapItem.put(34,"pistonextension");
        mapItem.put(35,"wool");
        mapItem.put(36,"pistonmovingpiece");
        mapItem.put(37,"yellowflower");
        mapItem.put(38,"redrose");
        mapItem.put(39,"brownmushroom");
        mapItem.put(40,"redmushroom");
        mapItem.put(41,"goldblock");
        mapItem.put(42,"ironblock");
        mapItem.put(43,"doublestep");
        mapItem.put(44,"step");
        mapItem.put(45,"brick");
        mapItem.put(46,"tnt");
        mapItem.put(47,"bookshelf");
        mapItem.put(48,"mossycobblestone");
        mapItem.put(49,"obsidian");
        mapItem.put(50,"torch");
        mapItem.put(51,"fire");
        mapItem.put(52,"mobspawner");
        mapItem.put(53,"woodstairs");
        mapItem.put(54,"chest");
        mapItem.put(55,"redstonewire");
        mapItem.put(56,"diamondore");
        mapItem.put(57,"diamondblock");
        mapItem.put(58,"workbench");
        mapItem.put(59,"crops");
        mapItem.put(60,"soil");
        mapItem.put(61,"furnace");
        mapItem.put(62,"burningfurnace");
        mapItem.put(63,"signpost");
        mapItem.put(64,"woodendoor");
        mapItem.put(65,"ladder");
        mapItem.put(66,"rails");
        mapItem.put(67,"cobblestonestairs");
        mapItem.put(68,"wallsign");
        mapItem.put(69,"lever");
        mapItem.put(70,"stoneplate");
        mapItem.put(71,"irondoorblock");
        mapItem.put(72,"woodplate");
        mapItem.put(73,"redstoneore");
        mapItem.put(74,"glowingredstoneore");
        mapItem.put(75,"redstonetorchoff");
        mapItem.put(76,"redstonetorchon");
        mapItem.put(77,"stonebutton");
        mapItem.put(78,"snow");
        mapItem.put(79,"ice");
        mapItem.put(80,"snowblock");
        mapItem.put(81,"cactus");
        mapItem.put(82,"clay");
        mapItem.put(83,"sugarcaneblock");
        mapItem.put(84,"jukebox");
        mapItem.put(85,"fence");
        mapItem.put(86,"pumpkin");
        mapItem.put(87,"netherrack");
        mapItem.put(88,"soulsand");
        mapItem.put(89,"glowstone");
        mapItem.put(90,"portal");
        mapItem.put(91,"jackolantern");
        mapItem.put(92,"cakeblock");
        mapItem.put(93,"diodeblockoff");
        mapItem.put(94,"diodeblockon");
        mapItem.put(95,"stainedglass");
        mapItem.put(96,"trapdoor");
        mapItem.put(97,"monstereggs");
        mapItem.put(98,"smoothbrick");
        mapItem.put(99,"hugemushroom1");
        mapItem.put(100,"hugemushroom2");
        mapItem.put(101,"ironfence");
        mapItem.put(102,"thinglass");
        mapItem.put(103,"melonblock");
        mapItem.put(104,"pumpkinstem");
        mapItem.put(105,"melonstem");
        mapItem.put(106,"vine");
        mapItem.put(107,"fencegate");
        mapItem.put(108,"brickstairs");
        mapItem.put(109,"smoothstairs");
        mapItem.put(110,"mycel");
        mapItem.put(111,"waterlily");
        mapItem.put(112,"netherbrick");
        mapItem.put(113,"netherfence");
        mapItem.put(114,"netherbrickstairs");
        mapItem.put(115,"netherwarts");
        mapItem.put(116,"enchantmenttable");
        mapItem.put(117,"brewingstand");
        mapItem.put(118,"cauldron");
        mapItem.put(119,"enderportal");
        mapItem.put(120,"enderportalframe");
        mapItem.put(121,"enderstone");
        mapItem.put(122,"dragonegg");
        mapItem.put(123,"redstonelampoff");
        mapItem.put(124,"redstonelampon");
        mapItem.put(125,"wooddoublestep");
        mapItem.put(126,"woodstep");
        mapItem.put(127,"cocoa");
        mapItem.put(128,"sandstonestairs");
        mapItem.put(129,"emeraldore");
        mapItem.put(130,"enderchest");
        mapItem.put(131,"tripwirehook");
        mapItem.put(132,"tripwire");
        mapItem.put(133,"emeraldblock");
        mapItem.put(134,"sprucewoodstairs");
        mapItem.put(135,"birchwoodstairs");
        mapItem.put(136,"junglewoodstairs");
        mapItem.put(137,"command");
        mapItem.put(138,"beacon");
        mapItem.put(139,"cobblewall");
        mapItem.put(140,"flowerpot");
        mapItem.put(141,"carrot");
        mapItem.put(142,"potato");
        mapItem.put(143,"woodbutton");
        mapItem.put(144,"skull");
        mapItem.put(145,"anvil");
        mapItem.put(146,"trappedchest");
        mapItem.put(147,"goldplate");
        mapItem.put(148,"ironplate");
        mapItem.put(149,"redstonecomparatoroff");
        mapItem.put(150,"redstonecomparatoron");
        mapItem.put(151,"daylightdetector");
        mapItem.put(152,"redstoneblock");
        mapItem.put(153,"quartzore");
        mapItem.put(154,"hopper");
        mapItem.put(155,"quartzblock");
        mapItem.put(156,"quartzstairs");
        mapItem.put(157,"activatorrail");
        mapItem.put(158,"dropper");
        mapItem.put(159,"stainedclay");
        mapItem.put(160,"stainedglasspane");
        mapItem.put(161,"leaves2");
        mapItem.put(162,"log2");
        mapItem.put(163,"acaciastairs");
        mapItem.put(164,"darkoakstairs");
        mapItem.put(165,"slimeblock");
        mapItem.put(166,"barrier");
        mapItem.put(167,"irontrapdoor");
        mapItem.put(168,"prismarine");
        mapItem.put(169,"sealantern");
        mapItem.put(170,"hayblock");
        mapItem.put(171,"carpet");
        mapItem.put(172,"hardclay");
        mapItem.put(173,"coalblock");
        mapItem.put(174,"packedice");
        mapItem.put(175,"doubleplant");
        mapItem.put(176,"standingbanner");
        mapItem.put(177,"wallbanner");
        mapItem.put(178,"daylightdetectorinverted");
        mapItem.put(179,"redsandstone");
        mapItem.put(180,"redsandstonestairs");
        mapItem.put(181,"doublestoneslab2");
        mapItem.put(182,"stoneslab2");
        mapItem.put(183,"sprucefencegate");
        mapItem.put(184,"birchfencegate");
        mapItem.put(185,"junglefencegate");
        mapItem.put(186,"darkoakfencegate");
        mapItem.put(187,"acaciafencegate");
        mapItem.put(188,"sprucefence");
        mapItem.put(189,"birchfence");
        mapItem.put(190,"junglefence");
        mapItem.put(191,"darkoakfence");
        mapItem.put(192,"acaciafence");
        mapItem.put(193,"sprucedoor");
        mapItem.put(194,"birchdoor");
        mapItem.put(195,"jungledoor");
        mapItem.put(196,"acaciadoor");
        mapItem.put(197,"darkoakdoor");
        mapItem.put(256,"ironspade");
        mapItem.put(257,"ironpickaxe");
        mapItem.put(258,"ironaxe");
        mapItem.put(259,"flintandsteel");
        mapItem.put(260,"apple");
        mapItem.put(261,"bow");
        mapItem.put(262,"arrow");
        mapItem.put(263,"coal");
        mapItem.put(264,"diamond");
        mapItem.put(265,"ironingot");
        mapItem.put(266,"goldingot");
        mapItem.put(267,"ironsword");
        mapItem.put(268,"woodsword");
        mapItem.put(269,"woodspade");
        mapItem.put(270,"woodpickaxe");
        mapItem.put(271,"woodaxe");
        mapItem.put(272,"stonesword");
        mapItem.put(273,"stonespade");
        mapItem.put(274,"stonepickaxe");
        mapItem.put(275,"stoneaxe");
        mapItem.put(276,"diamondsword");
        mapItem.put(277,"diamondspade");
        mapItem.put(278,"diamondpickaxe");
        mapItem.put(279,"diamondaxe");
        mapItem.put(280,"stick");
        mapItem.put(281,"bowl");
        mapItem.put(282,"mushroomsoup");
        mapItem.put(283,"goldsword");
        mapItem.put(284,"goldspade");
        mapItem.put(285,"goldpickaxe");
        mapItem.put(286,"goldaxe");
        mapItem.put(287,"string");
        mapItem.put(288,"feather");
        mapItem.put(289,"sulphur");
        mapItem.put(290,"woodhoe");
        mapItem.put(291,"stonehoe");
        mapItem.put(292,"ironhoe");
        mapItem.put(293,"diamondhoe");
        mapItem.put(294,"goldhoe");
        mapItem.put(295,"seeds");
        mapItem.put(296,"wheat");
        mapItem.put(297,"bread");
        mapItem.put(298,"leatherhelmet");
        mapItem.put(299,"leatherchestplate");
        mapItem.put(300,"leatherleggings");
        mapItem.put(301,"leatherboots");
        mapItem.put(302,"chainmailhelmet");
        mapItem.put(303,"chainmailchestplate");
        mapItem.put(304,"chainmailleggings");
        mapItem.put(305,"chainmailboots");
        mapItem.put(306,"ironhelmet");
        mapItem.put(307,"ironchestplate");
        mapItem.put(308,"ironleggings");
        mapItem.put(309,"ironboots");
        mapItem.put(310,"diamondhelmet");
        mapItem.put(311,"diamondchestplate");
        mapItem.put(312,"diamondleggings");
        mapItem.put(313,"diamondboots");
        mapItem.put(314,"goldhelmet");
        mapItem.put(315,"goldchestplate");
        mapItem.put(316,"goldleggings");
        mapItem.put(317,"goldboots");
        mapItem.put(318,"flint");
        mapItem.put(319,"pork");
        mapItem.put(320,"grilledpork");
        mapItem.put(321,"painting");
        mapItem.put(322,"goldenapple");
        mapItem.put(323,"sign");
        mapItem.put(324,"wooddoor");
        mapItem.put(325,"bucket");
        mapItem.put(326,"waterbucket");
        mapItem.put(327,"lavabucket");
        mapItem.put(328,"minecart");
        mapItem.put(329,"saddle");
        mapItem.put(330,"irondoor");
        mapItem.put(331,"redstone");
        mapItem.put(332,"snowball");
        mapItem.put(333,"boat");
        mapItem.put(334,"leather");
        mapItem.put(335,"milkbucket");
        mapItem.put(336,"claybrick");
        mapItem.put(337,"clayball");
        mapItem.put(338,"sugarcane");
        mapItem.put(339,"paper");
        mapItem.put(340,"book");
        mapItem.put(341,"slimeball");
        mapItem.put(342,"storageminecart");
        mapItem.put(343,"poweredminecart");
        mapItem.put(344,"egg");
        mapItem.put(345,"compass");
        mapItem.put(346,"fishingrod");
        mapItem.put(347,"watch");
        mapItem.put(348,"glowstonedust");
        mapItem.put(349,"rawfish");
        mapItem.put(350,"cookedfish");
        mapItem.put(351,"inksack");
        mapItem.put(352,"bone");
        mapItem.put(353,"sugar");
        mapItem.put(354,"cake");
        mapItem.put(355,"bed");
        mapItem.put(356,"diode");
        mapItem.put(357,"cookie");
        mapItem.put(358,"map");
        mapItem.put(359,"shears");
        mapItem.put(360,"melon");
        mapItem.put(361,"pumpkinseeds");
        mapItem.put(362,"melonseeds");
        mapItem.put(363,"rawbeef");
        mapItem.put(364,"cookedbeef");
        mapItem.put(365,"rawchicken");
        mapItem.put(366,"cookedchicken");
        mapItem.put(367,"rottenflesh");
        mapItem.put(368,"enderpearl");
        mapItem.put(369,"blazerod");
        mapItem.put(370,"ghasttear");
        mapItem.put(371,"goldnugget");
        mapItem.put(372,"netherstalk");
        mapItem.put(373,"potion");
        mapItem.put(374,"glassbottle");
        mapItem.put(375,"spidereye");
        mapItem.put(376,"fermentedspidereye");
        mapItem.put(377,"blazepowder");
        mapItem.put(378,"magmacream");
        mapItem.put(379,"brewingstanditem");
        mapItem.put(380,"cauldronitem");
        mapItem.put(381,"eyeofender");
        mapItem.put(382,"speckledmelon");
        mapItem.put(383,"monsteregg");
        mapItem.put(384,"expbottle");
        mapItem.put(385,"fireball");
        mapItem.put(386,"bookandquill");
        mapItem.put(387,"writtenbook");
        mapItem.put(388,"emerald");
        mapItem.put(389,"itemframe");
        mapItem.put(390,"flowerpotitem");
        mapItem.put(391,"carrotitem");
        mapItem.put(392,"potatoitem");
        mapItem.put(393,"bakedpotato");
        mapItem.put(394,"poisonouspotato");
        mapItem.put(395,"emptymap");
        mapItem.put(396,"goldencarrot");
        mapItem.put(397,"skullitem");
        mapItem.put(398,"carrotstick");
        mapItem.put(399,"netherstar");
        mapItem.put(400,"pumpkinpie");
        mapItem.put(401,"firework");
        mapItem.put(402,"fireworkcharge");
        mapItem.put(403,"enchantedbook");
        mapItem.put(404,"redstonecomparator");
        mapItem.put(405,"netherbrickitem");
        mapItem.put(406,"quartz");
        mapItem.put(407,"explosiveminecart");
        mapItem.put(408,"hopperminecart");
        mapItem.put(409,"prismarineshard");
        mapItem.put(410,"prismarinecrystals");
        mapItem.put(411,"rabbit");
        mapItem.put(412,"cookedrabbit");
        mapItem.put(413,"rabbitstew");
        mapItem.put(414,"rabbitfoot");
        mapItem.put(415,"rabbithide");
        mapItem.put(416,"armorstand");
        mapItem.put(417,"ironbarding");
        mapItem.put(418,"goldbarding");
        mapItem.put(419,"diamondbarding");
        mapItem.put(420,"leash");
        mapItem.put(421,"nametag");
        mapItem.put(422,"commandminecart");
        mapItem.put(423,"mutton");
        mapItem.put(424,"cookedmutton");
        mapItem.put(425,"banner");
        mapItem.put(427,"sprucedooritem");
        mapItem.put(428,"birchdooritem");
        mapItem.put(429,"jungledooritem");
        mapItem.put(430,"acaciadooritem");
        mapItem.put(431,"darkoakdooritem");
        mapItem.put(2256,"goldrecord");
        mapItem.put(2257,"greenrecord");
        mapItem.put(2258,"record3");
        mapItem.put(2259,"record4");
        mapItem.put(2260,"record5");
        mapItem.put(2261,"record6");
        mapItem.put(2262,"record7");
        mapItem.put(2263,"record8");
        mapItem.put(2264,"record9");
        mapItem.put(2265,"record10");
        mapItem.put(2266,"record11");
        mapItem.put(2267,"record12");
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
