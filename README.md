# MemWorth [![Build Status](https://drone.io/github.com/hexosse/MemWorth/status.png)](https://drone.io/github.com/hexosse/MemWorth/latest) [![Dependency Status](https://www.versioneye.com/user/projects/56b1fd881c89e1003039a303/badge.svg?style=flat)](https://www.versioneye.com/user/projects/56b1fd881c89e1003039a303)
Quickly create worth.yml file from Minecraft Economy Manager.

<br>
###Why
When creating shops for your server the easiest way is to use essentials worth file (or independent worth file) as it store all item's worth.<br>
To help us doing so, vagrant326 created MEM for [Minecraft Economy Manager](http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-tools/1263020-minecraft-economy-manager) which help you to difine each price for each item.<br>
However, after establishing prices tou still need to create a worth file to use with your favorite economical plugins.<br>
This where MemWorth come in action. It will simply export all defined prices to a worth file and save you precious time.

<br>
###How to use it
1. download [Minecraft Economy Manager](http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-tools/1263020-minecraft-economy-manager)
2. configure Minecraft Economy Manager
3. export your sheet and name it **Minecraft Economy Manager.csv**
3. lanch MemWorth, whether by double cliking it or by running **java -jar MemWorth.jar**

<br>
###Options
MemWorth comes with different options (run **java -jar MemWorth.jar -h** for a full list of options)<br>
&nbsp;&nbsp;&nbsp;&nbsp;**-c** csv file name : **java -jar MemWorth.jar -c MyMemFile.csv**<br>
&nbsp;&nbsp;&nbsp;&nbsp;**-w** worth file name : **java -jar MemWorth.jar -w MyWorthFile.yml**<br>
&nbsp;&nbsp;&nbsp;&nbsp;**-n** will generate worth file using item name (this is by default)<br>
&nbsp;&nbsp;&nbsp;&nbsp;**-i** will generate worth file using id<br>

<br>
###localization
When using Excel, number formating are differents from one country to another.<br>
For example :<br>
&nbsp;&nbsp;&nbsp;&nbsp;one thousand will be 1,000 in US formatting and 1 000 in French formatting<br>
&nbsp;&nbsp;&nbsp;&nbsp;and 1,000.59 in US formatting will be 1 000,59 with French formatting<br>
That's why I'm using localisation number formatting to extract the worth value.<br>

