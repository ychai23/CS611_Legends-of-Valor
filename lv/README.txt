# CS611-<Assignment 3>
## <Lengends of Valor>
---------------------------------------------------------------------------
<Yuanming Chai>
<jchai23@bu.edu>
<U43949722>

## Files
---------------------------------------------------------------------------
Armor.java: Armor class that provides template for any armor
ArmorReader.java: ArmorReader class that helps parse txt file into Armor objects
Battle.java: Battle class that operates actions of player and monsters during a battle
BattleGrid.java: BattleGrid class that provides a template for creating grid where a battle could potentially happen
Control.java: Control class that take input from player for option
Dragon.java: Dragon class that provides a template to create a dragon (baseDamage 10% higher)
Exoskeleton.java: Exoskeleton class that provides a template to create an exoskeleton (defense 10% higher)
GameControl.java: Gamecontrol class that operates the main logic of the entire game
Grid.java: Grid abstract class that provides a template to create any grid on the map
Hero.java: Hero class that contains all the actions a hero can take during the game
HeroReader.java: HeroReader class that helps parse txt file into Hero objects
HeroInfo.java: HeroInfo class that serves as a factory of heros
IllegalGrid.java: IllegalGrid class that provides a template for a grid that player can't enter
Inventory.java: Inventory class that contains inventory of different types of items
Item.java: Item class that provides the basic information any item would have
Main.java: Create the game and run the game
Market.java: Market class that display items and operates player's actions in a market
MarketGrid.java: MarketGrid class that allow creation of a market in the grid
Monster.java: Monster class that contains all the actions a monster can take during the game
MonsterReader.java: MonsterReader class that helps parse txt file into Monster objects
MonsterInfo.java: MonsterInfo class that serves as a factory of monsters
Paladin.java: Paladin class that provides special effect for Paladin
Player.java: Player class that operates all actions a player can take during a game
Potion.java: Potion class that provides template for any potion
PotionReader.java: PotionReader class that helps parse txt file into Potion objects
Sorcerer.java: Sorcerer class that provides special effect for Sorcerer
Spell.java: Spell class that provides template for any type of spell
SpellReader.java: SpellReader class that helps parse txt file into Spell objects
Spirit.java: Spirit class that provides a template to create spirit (dodge 10% higher)
Warrior.java: Warrior class that allows special effect for warrior
Weapon.java: Weapon class that provides template for any weapon
WeaponReader.java: WeaponReader class that helps parse txt file into Weapon objects
World.java: World class where the map is created and player can make move/visualize the map


## Notes
---------------------------------------------------------------------------
1. Files to be parsed are stored in ConfigFiles folder, for parser class to
read class
2. <Bonus Done>
    a. Allow each hero to choose which monster it can attack
    b. Applied capping for health, strength, mana, dexterity, agility etc. for each level for heros (potion use can boost dexterity agility and strength above cap)
3. For more detailed comments for some classes, refer to the more detailed header comments that I wrote on top of each class

## How to compile and run
---------------------------------------------------------------------------
1. Navigate to the directory "mh" after unzipping the files
2. Run the following instructions:
javac *.java
java Main

## Input/Output Example
---------------------------------------------------------------------------
:mh yuanmingchai$ java Main
****** LEGENDS: MONSTORS AND HEROS ******
Welcome! Please set-up your party
Enter single character for your map symbol: r
Insert number of heros (1-3): 2
1) Warrior
2) Sorccerer
3) Paladin

Selection? 1

[0] Name: Parzival
Level: 1 | Health: 100.0 | Mana: 300.0 | Strength: 750.0 | Defense: 0.0 | Agility: 650.0 | Dexterity: 700.0 | Money: 2500.0 | Exp: 7.0 | Status: 1 | 
[1] Name: Sehanine_Moonbow
Level: 1 | Health: 100.0 | Mana: 300.0 | Strength: 750.0 | Defense: 0.0 | Agility: 700.0 | Dexterity: 700.0 | Money: 2500.0 | Exp: 7.0 | Status: 1 | 
[2] Name: Skoraeus_Stonebones
Level: 1 | Health: 100.0 | Mana: 250.0 | Strength: 650.0 | Defense: 0.0 | Agility: 600.0 | Dexterity: 350.0 | Money: 2500.0 | Exp: 4.0 | Status: 1 | 
[3] Name: Garl_Glittergold
Level: 1 | Health: 100.0 | Mana: 100.0 | Strength: 600.0 | Defense: 0.0 | Agility: 500.0 | Dexterity: 400.0 | Money: 2500.0 | Exp: 5.0 | Status: 1 | 
[4] Name: Amaryllis_Astra
Level: 1 | Health: 100.0 | Mana: 500.0 | Strength: 500.0 | Defense: 0.0 | Agility: 500.0 | Dexterity: 500.0 | Money: 2500.0 | Exp: 5.0 | Status: 1 | 
[5] Name: Caliber_Heist
Level: 1 | Health: 100.0 | Mana: 400.0 | Strength: 400.0 | Defense: 0.0 | Agility: 400.0 | Dexterity: 400.0 | Money: 2500.0 | Exp: 8.0 | Status: 1 | 

Selection? 2
You selected Skoraeus_Stonebones
1) Warrior
2) Sorccerer
3) Paladin

Selection? 2

[0] Name: Rillifane_Rallathil
Level: 1 | Health: 100.0 | Mana: 1300.0 | Strength: 750.0 | Defense: 0.0 | Agility: 450.0 | Dexterity: 500.0 | Money: 2500.0 | Exp: 9.0 | Status: 1 | 
[1] Name: Segojan_Earthcaller
Level: 1 | Health: 100.0 | Mana: 900.0 | Strength: 800.0 | Defense: 0.0 | Agility: 500.0 | Dexterity: 650.0 | Money: 2500.0 | Exp: 5.0 | Status: 1 | 
[2] Name: Reign_Havoc
Level: 1 | Health: 100.0 | Mana: 800.0 | Strength: 800.0 | Defense: 0.0 | Agility: 800.0 | Dexterity: 800.0 | Money: 2500.0 | Exp: 8.0 | Status: 1 | 
[3] Name: Reverie_Ashels
Level: 1 | Health: 100.0 | Mana: 900.0 | Strength: 800.0 | Defense: 0.0 | Agility: 700.0 | Dexterity: 400.0 | Money: 2500.0 | Exp: 7.0 | Status: 1 | 
[4] Name: Kalabar
Level: 1 | Health: 100.0 | Mana: 800.0 | Strength: 850.0 | Defense: 0.0 | Agility: 400.0 | Dexterity: 600.0 | Money: 2500.0 | Exp: 6.0 | Status: 1 | 
[5] Name: Skye_Soar
Level: 1 | Health: 100.0 | Mana: 1000.0 | Strength: 700.0 | Defense: 0.0 | Agility: 400.0 | Dexterity: 500.0 | Money: 2500.0 | Exp: 5.0 | Status: 1 | 

Selection? 2
You selected Reign_Havoc

You have formed your hero team.
Your current position is 00
 +--+--+--+--+--+--+--+--
0|r |  |M |X |  |  |  |  |
 +--+--+--+--+--+--+--+--
1|  |  |  |M |  |X |  |M |
 +--+--+--+--+--+--+--+--
2|  |X |  |  |  |  |X |  |
 +--+--+--+--+--+--+--+--
3|M |  |M |  |  |M |M |X |
 +--+--+--+--+--+--+--+--
4|X |M |  |  |M |  |X |  |
 +--+--+--+--+--+--+--+--
5|  |  |M |  |  |M |  |  |
 +--+--+--+--+--+--+--+--
6|M |  |  |  |M |M |  |M |
 +--+--+--+--+--+--+--+--
7|X |  |M |  |  |  |  |  |
 +--+--+--+--+--+--+--+--
  0  1  2  3  4  5  6  7  



W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon

Enter your move: d
**** You have entered a BATTLE Grid! ****
Rolling a dice...
You rolled 5
        **** BATTLE HAS BEGUN ****

**** Round has started. ****

        **** Current HERO team ****
[0] Name: Skoraeus_Stonebones
Level: 1 | Health: 100.0 | Mana: 250.0 | Strength: 650.0 | Defense: 0.0 | Agility: 600.0 | Dexterity: 350.0 | Money: 2500.0 | Exp: 4.0 | Status: 1 | 
[1] Name: Reign_Havoc
Level: 1 | Health: 100.0 | Mana: 800.0 | Strength: 800.0 | Defense: 0.0 | Agility: 800.0 | Dexterity: 800.0 | Money: 2500.0 | Exp: 8.0 | Status: 1 | 


        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 100.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 
[1] Name: BigBad-Wolf
Level: 1 | Health: 100.0 | Strength: 150.0 | Defense: 252.5 | Agility: 15.0 | Status: 1 | 

a/A: Attack
s/S: Cast a spell
p/P: Use Potion
i/I: Show Battle Status
Enter your move for hero: Skoraeus_Stonebones a

        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 100.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 
[1] Name: BigBad-Wolf
Level: 1 | Health: 100.0 | Strength: 150.0 | Defense: 252.5 | Agility: 15.0 | Status: 1 | 

Enter which monster(ID) you want to attack: 0
Skoraeus_Stonebones have attacked monsterBlinky with Sword
Blinky dodged your weapon attack.

        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 100.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 
[1] Name: BigBad-Wolf
Level: 1 | Health: 100.0 | Strength: 150.0 | Defense: 252.5 | Agility: 15.0 | Status: 1 | 

a/A: Attack
s/S: Cast a spell
p/P: Use Potion
i/I: Show Battle Status
Enter your move for hero: Reign_Havoc s

        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 100.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 
[1] Name: BigBad-Wolf
Level: 1 | Health: 100.0 | Strength: 150.0 | Defense: 252.5 | Agility: 15.0 | Status: 1 | 

Enter which monster(ID) you want to cast a spell to: 1
* Spells: [0)Lightning_Dagger- lvl: 1.0, price: 400.0 damage: 500.0 manaCost: 150.0 spellType: l | ]
Enter the spell(ID) you want to use: 0
Reign_Havoc have casted sepll Lightning_Dagger on monster BigBad-Wolf
Spell dealt damage of 14.375 to BigBad-Wolf

        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 100.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 
[1] Name: BigBad-Wolf
Level: 1 | Health: 85.625 | Strength: 150.0 | Defense: 252.5 | Agility: 15.0 | Status: 1 | 

Skoraeus_Stonebones have dodged monster's attack.
Skoraeus_Stonebones have dodged monster's attack.
**** Round ended ****


**** Round has started. ****

        **** Current HERO team ****
[0] Name: Skoraeus_Stonebones
Level: 1 | Health: 100.0 | Mana: 250.0 | Strength: 650.0 | Defense: 0.0 | Agility: 600.0 | Dexterity: 350.0 | Money: 2500.0 | Exp: 4.0 | Status: 1 | 
[1] Name: Reign_Havoc
Level: 1 | Health: 100.0 | Mana: 800.0 | Strength: 800.0 | Defense: 0.0 | Agility: 800.0 | Dexterity: 800.0 | Money: 2500.0 | Exp: 8.0 | Status: 1 | 


        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 100.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 
[1] Name: BigBad-Wolf
Level: 1 | Health: 85.625 | Strength: 150.0 | Defense: 252.5 | Agility: 15.0 | Status: 1 | 

a/A: Attack
s/S: Cast a spell
p/P: Use Potion
i/I: Show Battle Status
Enter your move for hero: Skoraeus_Stonebones a

        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 100.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 
[1] Name: BigBad-Wolf
Level: 1 | Health: 85.625 | Strength: 150.0 | Defense: 252.5 | Agility: 15.0 | Status: 1 | 

Enter which monster(ID) you want to attack: 0
Skoraeus_Stonebones have attacked monsterBlinky with Sword
Blinky dodged your weapon attack.

        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 100.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 
[1] Name: BigBad-Wolf
Level: 1 | Health: 85.625 | Strength: 150.0 | Defense: 252.5 | Agility: 15.0 | Status: 1 | 

a/A: Attack
s/S: Cast a spell
p/P: Use Potion
i/I: Show Battle Status
Enter your move for hero: Reign_Havoc a

        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 100.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 
[1] Name: BigBad-Wolf
Level: 1 | Health: 85.625 | Strength: 150.0 | Defense: 252.5 | Agility: 15.0 | Status: 1 | 

Enter which monster(ID) you want to attack: 1
Reign_Havoc have attacked monsterBigBad-Wolf with Sword
Weapon dealt damage of 67.375 to BigBad-Wolf

        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 100.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 
[1] Name: BigBad-Wolf
Level: 1 | Health: 18.25 | Strength: 150.0 | Defense: 252.5 | Agility: 15.0 | Status: 1 | 

Reign_Havoc have dodged monster's attack.
Reign_Havoc have dodged monster's attack.
**** Round ended ****


**** Round has started. ****

        **** Current HERO team ****
[0] Name: Skoraeus_Stonebones
Level: 1 | Health: 100.0 | Mana: 250.0 | Strength: 650.0 | Defense: 0.0 | Agility: 600.0 | Dexterity: 350.0 | Money: 2500.0 | Exp: 4.0 | Status: 1 | 
[1] Name: Reign_Havoc
Level: 1 | Health: 100.0 | Mana: 800.0 | Strength: 800.0 | Defense: 0.0 | Agility: 800.0 | Dexterity: 800.0 | Money: 2500.0 | Exp: 8.0 | Status: 1 | 


        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 100.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 
[1] Name: BigBad-Wolf
Level: 1 | Health: 18.25 | Strength: 150.0 | Defense: 252.5 | Agility: 15.0 | Status: 1 | 

a/A: Attack
s/S: Cast a spell
p/P: Use Potion
i/I: Show Battle Status
Enter your move for hero: Skoraeus_Stonebones a

        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 100.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 
[1] Name: BigBad-Wolf
Level: 1 | Health: 18.25 | Strength: 150.0 | Defense: 252.5 | Agility: 15.0 | Status: 1 | 

Enter which monster(ID) you want to attack: 1
Skoraeus_Stonebones have attacked monsterBigBad-Wolf with Sword
Weapon dealt damage of 59.875 to BigBad-Wolf
BigBad-Wolf has fainted.

        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 100.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 

a/A: Attack
s/S: Cast a spell
p/P: Use Potion
i/I: Show Battle Status
Enter your move for hero: Reign_Havoc a

        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 100.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 

Enter which monster(ID) you want to attack: 0
Reign_Havoc have attacked monsterBlinky with Sword
Weapon dealt damage of 62.5 to Blinky

        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 37.5 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 

Skoraeus_Stonebones have dodged monster's attack.
**** Round ended ****


**** Round has started. ****

        **** Current HERO team ****
[0] Name: Skoraeus_Stonebones
Level: 1 | Health: 100.0 | Mana: 250.0 | Strength: 650.0 | Defense: 0.0 | Agility: 600.0 | Dexterity: 350.0 | Money: 2500.0 | Exp: 4.0 | Status: 1 | 
[1] Name: Reign_Havoc
Level: 1 | Health: 100.0 | Mana: 800.0 | Strength: 800.0 | Defense: 0.0 | Agility: 800.0 | Dexterity: 800.0 | Money: 2500.0 | Exp: 8.0 | Status: 1 | 


        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 37.5 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 

a/A: Attack
s/S: Cast a spell
p/P: Use Potion
i/I: Show Battle Status
Enter your move for hero: Skoraeus_Stonebones a

        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 37.5 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 

Enter which monster(ID) you want to attack: 0
Skoraeus_Stonebones have attacked monsterBlinky with Sword
Blinky dodged your weapon attack.

        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 37.5 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 

a/A: Attack
s/S: Cast a spell
p/P: Use Potion
i/I: Show Battle Status
Enter your move for hero: Reign_Havoc a

        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 37.5 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 

Enter which monster(ID) you want to attack: 0
Reign_Havoc have attacked monsterBlinky with Sword
Weapon dealt damage of 62.5 to Blinky
Blinky has fainted.

        **** Current MONSTER team ****

All the monsters have been defeated.
**** Round ended ****

        **** BATTLE IS OVER ****
 +--+--+--+--+--+--+--+--
0|X |r |M |X |  |  |  |  |
 +--+--+--+--+--+--+--+--
1|  |  |  |M |  |X |  |M |
 +--+--+--+--+--+--+--+--
2|  |X |  |  |  |  |X |  |
 +--+--+--+--+--+--+--+--
3|M |  |M |  |  |M |M |X |
 +--+--+--+--+--+--+--+--
4|X |M |  |  |M |  |X |  |
 +--+--+--+--+--+--+--+--
5|  |  |M |  |  |M |  |  |
 +--+--+--+--+--+--+--+--
6|M |  |  |  |M |M |  |M |
 +--+--+--+--+--+--+--+--
7|X |  |M |  |  |  |  |  |
 +--+--+--+--+--+--+--+--
  0  1  2  3  4  5  6  7  



W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon

Enter your move: i
**** Current HERO team status ****
[0] Name: Skoraeus_Stonebones
Level: 1 | Health: 100.0 | Mana: 250.0 | Strength: 650.0 | Defense: 0.0 | Agility: 600.0 | Dexterity: 350.0 | Money: 2501.0 | Exp: 8.0 | Status: 1 | 
***************** Inventory *******************
* Weapons: [0)Sword- lvl: 1.0, price: 500.0 damage: 800.0 | ]
* Armors: []
* Potions: []
* Spells: []
***********************************************
[1] Name: Reign_Havoc
Level: 2 | Health: 100.0 | Mana: 800.0 | Strength: 800.0 | Defense: 0.0 | Agility: 840.0 | Dexterity: 840.0 | Money: 2501.0 | Exp: 2.0 | Status: 1 | 
***************** Inventory *******************
* Weapons: [0)Sword- lvl: 1.0, price: 500.0 damage: 800.0 | ]
* Armors: []
* Potions: []
* Spells: [0)Lightning_Dagger- lvl: 1.0, price: 400.0 damage: 500.0 manaCost: 150.0 spellType: l | ]
***********************************************
 +--+--+--+--+--+--+--+--
0|X |r |M |X |  |  |  |  |
 +--+--+--+--+--+--+--+--
1|  |  |  |M |  |X |  |M |
 +--+--+--+--+--+--+--+--
2|  |X |  |  |  |  |X |  |
 +--+--+--+--+--+--+--+--
3|M |  |M |  |  |M |M |X |
 +--+--+--+--+--+--+--+--
4|X |M |  |  |M |  |X |  |
 +--+--+--+--+--+--+--+--
5|  |  |M |  |  |M |  |  |
 +--+--+--+--+--+--+--+--
6|M |  |  |  |M |M |  |M |
 +--+--+--+--+--+--+--+--
7|X |  |M |  |  |  |  |  |
 +--+--+--+--+--+--+--+--
  0  1  2  3  4  5  6  7  



W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon

Enter your move: d
**** You have entered a MARKET Grid! ****
Would you like to enter the market? y/n: y

******** Welcome to the market ********
Weapons: [1)Sword- lvl: 1.0, price: 500.0 damage: 800.0 | 2)Bow- lvl: 2.0, price: 300.0 damage: 500.0 | 3)Scythe- lvl: 6.0, price: 1000.0 damage: 1100.0 | 4)Axe- lvl: 5.0, price: 550.0 damage: 850.0 | 5)TSwords- lvl: 8.0, price: 1400.0 damage: 1600.0 | 6)Dagger- lvl: 1.0, price: 200.0 damage: 250.0 | ]

Armors: [1)Platinum_Shield- lvl: 1.0, price: 150.0 defense: 200.0 | 2)Breastplate- lvl: 3.0, price: 350.0 defense: 600.0 | 3)Full_Body_Armor- lvl: 8.0, price: 1000.0 defense: 1100.0 | 4)Wizard_Shield- lvl: 10.0, price: 1200.0 defense: 1500.0 | 5)Guardian_Angel- lvl: 10.0, price: 1000.0 defense: 1000.0 | ]

Potions: [1)Healing_Potion- lvl: 1.0, price: 250.0 effect: [Health] heal: 100.0 | 2)Strength_Potion- lvl: 1.0, price: 200.0 effect: [Strength] heal: 75.0 | 3)Magic_Potion- lvl: 2.0, price: 350.0 effect: [Mana] heal: 100.0 | 4)Luck_Elixir- lvl: 4.0, price: 500.0 effect: [Agility] heal: 65.0 | 5)Mermaid_Tears- lvl: 5.0, price: 850.0 effect: [Health, Mana, Strength, Agility] heal: 100.0 | 6)Ambrosia- lvl: 8.0, price: 1000.0 effect: [All] heal: 150.0 | ]

Spells: [1)Lightning_Dagger- lvl: 1.0, price: 400.0 damage: 500.0 manaCost: 150.0 spellType: l | 2)Thunder_Blast- lvl: 4.0, price: 750.0 damage: 950.0 manaCost: 400.0 spellType: l | 3)Electric_Arrows- lvl: 5.0, price: 550.0 damage: 650.0 manaCost: 200.0 spellType: l | 4)Spark_Needles- lvl: 2.0, price: 500.0 damage: 600.0 manaCost: 200.0 spellType: l | 5)Snow_Cannon- lvl: 2.0, price: 500.0 damage: 650.0 manaCost: 250.0 spellType: i | 6)Ice_Blade- lvl: 1.0, price: 250.0 damage: 450.0 manaCost: 100.0 spellType: i | 7)Frost_Blizzard- lvl: 5.0, price: 750.0 damage: 850.0 manaCost: 350.0 spellType: i | 8)Arctic_Storm- lvl: 6.0, price: 700.0 damage: 800.0 manaCost: 300.0 spellType: i | 9)Lightning_Dagger- lvl: 1.0, price: 400.0 damage: 500.0 manaCost: 150.0 spellType: l | 10)Thunder_Blast- lvl: 4.0, price: 750.0 damage: 950.0 manaCost: 400.0 spellType: l | 11)Electric_Arrows- lvl: 5.0, price: 550.0 damage: 650.0 manaCost: 200.0 spellType: l | 12)Spark_Needles- lvl: 2.0, price: 500.0 damage: 600.0 manaCost: 200.0 spellType: l | ]

Hero's inventory currently is: 
***************** Inventory *******************
* Weapons: [0)Sword- lvl: 1.0, price: 500.0 damage: 800.0 | ]
* Armors: []
* Potions: []
* Spells: []
***********************************************
Would you like to sell any item with Skoraeus_Stonebones y/n: n
Name: Skoraeus_Stonebones
Level: 1 | Health: 100.0 | Mana: 250.0 | Strength: 650.0 | Defense: 0.0 | Agility: 600.0 | Dexterity: 350.0 | Money: 2501.0 | Exp: 8.0 | Status: 1 | 
Would you like to buy any item with this hero: Skoraeus_Stonebones y/n: y

0) No buy
1) Weapon
2) Armor
3) Potion
4) Spell
Enter the type of item you want to purchase: 1
Enter the index of the item you want to purchase: 4

Added Item Axe in hero's weapon inventory
Would you like to buy any item with this hero: Skoraeus_Stonebones y/n: y

0) No buy
1) Weapon
2) Armor
3) Potion
4) Spell
Enter the type of item you want to purchase: 3
Enter the index of the item you want to purchase: 1

Added Item Healing_Potion in hero's potion inventory
Would you like to buy any item with this hero: Skoraeus_Stonebones y/n: n

Hero's inventory currently is: 
***************** Inventory *******************
* Weapons: [0)Sword- lvl: 1.0, price: 500.0 damage: 800.0 | ]
* Armors: []
* Potions: []
* Spells: [0)Lightning_Dagger- lvl: 1.0, price: 400.0 damage: 500.0 manaCost: 150.0 spellType: l | ]
***********************************************
Would you like to sell any item with Reign_Havoc y/n: y

0) No Sell
1) Weapon
2) Armor
3) Potion
4) Spell
Which type of items you would like to sell? 1
* Weapons: [0)Sword- lvl: 1.0, price: 500.0 damage: 800.0 | ]
Enter the index of the item you want to sell: 0
Item Sword sold
Hero's inventory currently is: 
***************** Inventory *******************
* Weapons: []
* Armors: []
* Potions: []
* Spells: [0)Lightning_Dagger- lvl: 1.0, price: 400.0 damage: 500.0 manaCost: 150.0 spellType: l | ]
***********************************************
Would you like to sell any item with Reign_Havoc y/n: n
Name: Reign_Havoc
Level: 2 | Health: 100.0 | Mana: 800.0 | Strength: 800.0 | Defense: 0.0 | Agility: 840.0 | Dexterity: 840.0 | Money: 2501.0 | Exp: 2.0 | Status: 1 | 
Would you like to buy any item with this hero: Reign_Havoc y/n: y

0) No buy
1) Weapon
2) Armor
3) Potion
4) Spell
Enter the type of item you want to purchase: 2
Enter the index of the item you want to purchase: 2

Added Item Breastplate in hero's armor inventory
Would you like to buy any item with this hero: Reign_Havoc y/n: y

0) No buy
1) Weapon
2) Armor
3) Potion
4) Spell
Enter the type of item you want to purchase: 1
Enter the index of the item you want to purchase: 3

Added Item Scythe in hero's weapon inventory
Would you like to buy any item with this hero: Reign_Havoc y/n: n


Leaving the market...
 +--+--+--+--+--+--+--+--
0|X |  |r |X |  |  |  |  |
 +--+--+--+--+--+--+--+--
1|  |  |  |M |  |X |  |M |
 +--+--+--+--+--+--+--+--
2|  |X |  |  |  |  |X |  |
 +--+--+--+--+--+--+--+--
3|M |  |M |  |  |M |M |X |
 +--+--+--+--+--+--+--+--
4|X |M |  |  |M |  |X |  |
 +--+--+--+--+--+--+--+--
5|  |  |M |  |  |M |  |  |
 +--+--+--+--+--+--+--+--
6|M |  |  |  |M |M |  |M |
 +--+--+--+--+--+--+--+--
7|X |  |M |  |  |  |  |  |
 +--+--+--+--+--+--+--+--
  0  1  2  3  4  5  6  7  



W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon

Enter your move: i
**** Current HERO team status ****
[0] Name: Skoraeus_Stonebones
Level: 1 | Health: 100.0 | Mana: 250.0 | Strength: 650.0 | Defense: 0.0 | Agility: 600.0 | Dexterity: 350.0 | Money: 1701.0 | Exp: 8.0 | Status: 1 | 
***************** Inventory *******************
* Weapons: [0)Sword- lvl: 1.0, price: 500.0 damage: 800.0 | 1)Axe- lvl: 5.0, price: 550.0 damage: 850.0 | ]
* Armors: []
* Potions: [0)Healing_Potion- lvl: 1.0, price: 250.0 effect: [Health] heal: 100.0 | ]
* Spells: []
***********************************************
[1] Name: Reign_Havoc
Level: 2 | Health: 100.0 | Mana: 800.0 | Strength: 800.0 | Defense: 0.0 | Agility: 840.0 | Dexterity: 840.0 | Money: 1151.0 | Exp: 2.0 | Status: 1 | 
***************** Inventory *******************
* Weapons: [0)Scythe- lvl: 6.0, price: 1000.0 damage: 1100.0 | ]
* Armors: [0)Breastplate- lvl: 3.0, price: 350.0 defense: 600.0 | ]
* Potions: []
* Spells: [0)Lightning_Dagger- lvl: 1.0, price: 400.0 damage: 500.0 manaCost: 150.0 spellType: l | ]
***********************************************
 +--+--+--+--+--+--+--+--
0|X |  |r |X |  |  |  |  |
 +--+--+--+--+--+--+--+--
1|  |  |  |M |  |X |  |M |
 +--+--+--+--+--+--+--+--
2|  |X |  |  |  |  |X |  |
 +--+--+--+--+--+--+--+--
3|M |  |M |  |  |M |M |X |
 +--+--+--+--+--+--+--+--
4|X |M |  |  |M |  |X |  |
 +--+--+--+--+--+--+--+--
5|  |  |M |  |  |M |  |  |
 +--+--+--+--+--+--+--+--
6|M |  |  |  |M |M |  |M |
 +--+--+--+--+--+--+--+--
7|X |  |M |  |  |  |  |  |
 +--+--+--+--+--+--+--+--
  0  1  2  3  4  5  6  7  



W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon

Enter your move: i
**** Current HERO team status ****
[0] Name: Skoraeus_Stonebones
Level: 1 | Health: 100.0 | Mana: 250.0 | Strength: 650.0 | Defense: 0.0 | Agility: 600.0 | Dexterity: 350.0 | Money: 1701.0 | Exp: 8.0 | Status: 1 | 
***************** Inventory *******************
* Weapons: [0)Sword- lvl: 1.0, price: 500.0 damage: 800.0 | 1)Axe- lvl: 5.0, price: 550.0 damage: 850.0 | ]
* Armors: []
* Potions: [0)Healing_Potion- lvl: 1.0, price: 250.0 effect: [Health] heal: 100.0 | ]
* Spells: []
***********************************************
[1] Name: Reign_Havoc
Level: 2 | Health: 100.0 | Mana: 800.0 | Strength: 800.0 | Defense: 0.0 | Agility: 840.0 | Dexterity: 840.0 | Money: 1151.0 | Exp: 2.0 | Status: 1 | 
***************** Inventory *******************
* Weapons: [0)Scythe- lvl: 6.0, price: 1000.0 damage: 1100.0 | ]
* Armors: [0)Breastplate- lvl: 3.0, price: 350.0 defense: 600.0 | ]
* Potions: []
* Spells: [0)Lightning_Dagger- lvl: 1.0, price: 400.0 damage: 500.0 manaCost: 150.0 spellType: l | ]
***********************************************
 +--+--+--+--+--+--+--+--
0|X |  |r |X |  |  |  |  |
 +--+--+--+--+--+--+--+--
1|  |  |  |M |  |X |  |M |
 +--+--+--+--+--+--+--+--
2|  |X |  |  |  |  |X |  |
 +--+--+--+--+--+--+--+--
3|M |  |M |  |  |M |M |X |
 +--+--+--+--+--+--+--+--
4|X |M |  |  |M |  |X |  |
 +--+--+--+--+--+--+--+--
5|  |  |M |  |  |M |  |  |
 +--+--+--+--+--+--+--+--
6|M |  |  |  |M |M |  |M |
 +--+--+--+--+--+--+--+--
7|X |  |M |  |  |  |  |  |
 +--+--+--+--+--+--+--+--
  0  1  2  3  4  5  6  7  



W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon

Enter your move: c
Would you like to change Skoraeus_Stonebones's main weapon? y/n: n
Would you like to change Skoraeus_Stonebones's main armor? y/n: n
Would you like to change Reign_Havoc's main weapon? y/n: y
* Weapons: [0)Scythe- lvl: 6.0, price: 1000.0 damage: 1100.0 | ]
Please select your mainhand weapon(ID): 0
Main weapon has been set to Scythe
Would you like to change Reign_Havoc's main armor? y/n: y
* Armors: [0)Breastplate- lvl: 3.0, price: 350.0 defense: 600.0 | ]
Please select your main armor(ID): 0
Your armor has been set to Breastplate
 +--+--+--+--+--+--+--+--
0|X |  |r |X |  |  |  |  |
 +--+--+--+--+--+--+--+--
1|  |  |  |M |  |X |  |M |
 +--+--+--+--+--+--+--+--
2|  |X |  |  |  |  |X |  |
 +--+--+--+--+--+--+--+--
3|M |  |M |  |  |M |M |X |
 +--+--+--+--+--+--+--+--
4|X |M |  |  |M |  |X |  |
 +--+--+--+--+--+--+--+--
5|  |  |M |  |  |M |  |  |
 +--+--+--+--+--+--+--+--
6|M |  |  |  |M |M |  |M |
 +--+--+--+--+--+--+--+--
7|X |  |M |  |  |  |  |  |
 +--+--+--+--+--+--+--+--
  0  1  2  3  4  5  6  7  



W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon

Enter your move: c
Would you like to change Skoraeus_Stonebones's main weapon? y/n: y
* Weapons: [0)Sword- lvl: 1.0, price: 500.0 damage: 800.0 | 1)Axe- lvl: 5.0, price: 550.0 damage: 850.0 | ]
Please select your mainhand weapon(ID): 1
Main weapon has been set to Axe
Would you like to change Skoraeus_Stonebones's main armor? y/n: n
Would you like to change Reign_Havoc's main weapon? y/n: n
Would you like to change Reign_Havoc's main armor? y/n: n
 +--+--+--+--+--+--+--+--
0|X |  |r |X |  |  |  |  |
 +--+--+--+--+--+--+--+--
1|  |  |  |M |  |X |  |M |
 +--+--+--+--+--+--+--+--
2|  |X |  |  |  |  |X |  |
 +--+--+--+--+--+--+--+--
3|M |  |M |  |  |M |M |X |
 +--+--+--+--+--+--+--+--
4|X |M |  |  |M |  |X |  |
 +--+--+--+--+--+--+--+--
5|  |  |M |  |  |M |  |  |
 +--+--+--+--+--+--+--+--
6|M |  |  |  |M |M |  |M |
 +--+--+--+--+--+--+--+--
7|X |  |M |  |  |  |  |  |
 +--+--+--+--+--+--+--+--
  0  1  2  3  4  5  6  7  



W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon

Enter your move: q
Game ended













:mh yuanmingchai$ java Main
****** LEGENDS: MONSTORS AND HEROS ******
Welcome! Please set-up your party
Enter single character for your map symbol: r
Insert number of heros (1-3): 1
1) Warrior
2) Sorccerer
3) Paladin

Selection? 1

[0] Name: Parzival
Level: 1 | Health: 100.0 | Mana: 300.0 | Strength: 750.0 | Defense: 0.0 | Agility: 650.0 | Dexterity: 700.0 | Money: 2500.0 | Exp: 7.0 | Status: 1 | 
[1] Name: Sehanine_Moonbow
Level: 1 | Health: 100.0 | Mana: 300.0 | Strength: 750.0 | Defense: 0.0 | Agility: 700.0 | Dexterity: 700.0 | Money: 2500.0 | Exp: 7.0 | Status: 1 | 
[2] Name: Skoraeus_Stonebones
Level: 1 | Health: 100.0 | Mana: 250.0 | Strength: 650.0 | Defense: 0.0 | Agility: 600.0 | Dexterity: 350.0 | Money: 2500.0 | Exp: 4.0 | Status: 1 | 
[3] Name: Garl_Glittergold
Level: 1 | Health: 100.0 | Mana: 100.0 | Strength: 600.0 | Defense: 0.0 | Agility: 500.0 | Dexterity: 400.0 | Money: 2500.0 | Exp: 5.0 | Status: 1 | 
[4] Name: Amaryllis_Astra
Level: 1 | Health: 100.0 | Mana: 500.0 | Strength: 500.0 | Defense: 0.0 | Agility: 500.0 | Dexterity: 500.0 | Money: 2500.0 | Exp: 5.0 | Status: 1 | 
[5] Name: Caliber_Heist
Level: 1 | Health: 100.0 | Mana: 400.0 | Strength: 400.0 | Defense: 0.0 | Agility: 400.0 | Dexterity: 400.0 | Money: 2500.0 | Exp: 8.0 | Status: 1 | 

Selection? 1
You selected Sehanine_Moonbow

You have formed your hero team.
Your current position is 00
 +--+--+--+--+--+--+--+--
0|r |  |  |X |  |  |  |  |
 +--+--+--+--+--+--+--+--
1|  |  |M |  |  |  |M |  |
 +--+--+--+--+--+--+--+--
2|  |  |  |  |  |M |M |X |
 +--+--+--+--+--+--+--+--
3|  |M |  |M |X |X |  |  |
 +--+--+--+--+--+--+--+--
4|M |M |M |  |  |  |  |M |
 +--+--+--+--+--+--+--+--
5|X |  |M |  |X |X |M |  |
 +--+--+--+--+--+--+--+--
6|X |X |M |  |  |  |X |  |
 +--+--+--+--+--+--+--+--
7|  |M |X |X |  |  |X |  |
 +--+--+--+--+--+--+--+--
  0  1  2  3  4  5  6  7  



W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon

Enter your move: d
**** You have entered a BATTLE Grid! ****
Rolling a dice...
You rolled 1
        **** BATTLE HAS BEGUN ****

**** Round has started. ****

        **** Current HERO team ****
[0] Name: Sehanine_Moonbow
Level: 1 | Health: 100.0 | Mana: 300.0 | Strength: 750.0 | Defense: 0.0 | Agility: 700.0 | Dexterity: 700.0 | Money: 2500.0 | Exp: 7.0 | Status: 1 | 


        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 100.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 

a/A: Attack
s/S: Cast a spell
p/P: Use Potion
i/I: Show Battle Status
Enter your move for hero: Sehanine_Moonbow a

        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 100.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 

Enter which monster(ID) you want to attack: 0
Sehanine_Moonbow have attacked monsterBlinky with Sword
Blinky dodged your weapon attack.

        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 100.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 

Sehanine_Moonbow received 4.545 damage from the monster.
**** Round ended ****


**** Round has started. ****

        **** Current HERO team ****
[0] Name: Sehanine_Moonbow
Level: 1 | Health: 95.455 | Mana: 300.0 | Strength: 750.0 | Defense: 0.0 | Agility: 700.0 | Dexterity: 700.0 | Money: 2500.0 | Exp: 7.0 | Status: 1 | 


        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 100.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 

a/A: Attack
s/S: Cast a spell
p/P: Use Potion
i/I: Show Battle Status
Enter your move for hero: Sehanine_Moonbow a

        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 100.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 

Enter which monster(ID) you want to attack: 0
Sehanine_Moonbow have attacked monsterBlinky with Sword
Weapon dealt damage of 60.0 to Blinky

        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 40.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 

Sehanine_Moonbow received 4.545 damage from the monster.
**** Round ended ****


**** Round has started. ****

        **** Current HERO team ****
[0] Name: Sehanine_Moonbow
Level: 1 | Health: 90.91 | Mana: 300.0 | Strength: 750.0 | Defense: 0.0 | Agility: 700.0 | Dexterity: 700.0 | Money: 2500.0 | Exp: 7.0 | Status: 1 | 


        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 40.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 

a/A: Attack
s/S: Cast a spell
p/P: Use Potion
i/I: Show Battle Status
Enter your move for hero: Sehanine_Moonbow a

        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 40.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 

Enter which monster(ID) you want to attack: 0
Sehanine_Moonbow have attacked monsterBlinky with Sword
Blinky dodged your weapon attack.

        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 40.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 

Sehanine_Moonbow received 4.545 damage from the monster.
**** Round ended ****


**** Round has started. ****

        **** Current HERO team ****
[0] Name: Sehanine_Moonbow
Level: 1 | Health: 86.365 | Mana: 300.0 | Strength: 750.0 | Defense: 0.0 | Agility: 700.0 | Dexterity: 700.0 | Money: 2500.0 | Exp: 7.0 | Status: 1 | 


        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 40.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 

a/A: Attack
s/S: Cast a spell
p/P: Use Potion
i/I: Show Battle Status
Enter your move for hero: Sehanine_Moonbow a

        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 40.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 

Enter which monster(ID) you want to attack: 0
Sehanine_Moonbow have attacked monsterBlinky with Sword
Blinky dodged your weapon attack.

        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 40.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 

Sehanine_Moonbow received 4.545 damage from the monster.
**** Round ended ****


**** Round has started. ****

        **** Current HERO team ****
[0] Name: Sehanine_Moonbow
Level: 1 | Health: 81.82 | Mana: 300.0 | Strength: 750.0 | Defense: 0.0 | Agility: 700.0 | Dexterity: 700.0 | Money: 2500.0 | Exp: 7.0 | Status: 1 | 


        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 40.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 

a/A: Attack
s/S: Cast a spell
p/P: Use Potion
i/I: Show Battle Status
Enter your move for hero: Sehanine_Moonbow a

        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 40.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 

Enter which monster(ID) you want to attack: 0
Sehanine_Moonbow have attacked monsterBlinky with Sword
Weapon dealt damage of 60.0 to Blinky
Blinky has fainted.

        **** Current MONSTER team ****

All the monsters have been defeated.
**** Round ended ****

        **** BATTLE IS OVER ****
 +--+--+--+--+--+--+--+--
0|  |r |  |X |  |  |  |  |
 +--+--+--+--+--+--+--+--
1|  |  |M |  |  |  |M |  |
 +--+--+--+--+--+--+--+--
2|  |  |  |  |  |M |M |X |
 +--+--+--+--+--+--+--+--
3|  |M |  |M |X |X |  |  |
 +--+--+--+--+--+--+--+--
4|M |M |M |  |  |  |  |M |
 +--+--+--+--+--+--+--+--
5|X |  |M |  |X |X |M |  |
 +--+--+--+--+--+--+--+--
6|X |X |M |  |  |  |X |  |
 +--+--+--+--+--+--+--+--
7|  |M |X |X |  |  |X |  |
 +--+--+--+--+--+--+--+--
  0  1  2  3  4  5  6  7  



W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon

Enter your move: d
**** You have entered a BATTLE Grid! ****
Rolling a dice...
You rolled 4
        **** BATTLE HAS BEGUN ****

**** Round has started. ****

        **** Current HERO team ****
[0] Name: Sehanine_Moonbow
Level: 1 | Health: 90.002 | Mana: 300.0 | Strength: 750.0 | Defense: 0.0 | Agility: 700.0 | Dexterity: 700.0 | Money: 2501.0 | Exp: 9.0 | Status: 1 | 


        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 100.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 

a/A: Attack
s/S: Cast a spell
p/P: Use Potion
i/I: Show Battle Status
Enter your move for hero: Sehanine_Moonbow a

        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 100.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 

Enter which monster(ID) you want to attack: 0
Sehanine_Moonbow have attacked monsterBlinky with Sword
Blinky dodged your weapon attack.

        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 100.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 

Sehanine_Moonbow received 4.545 damage from the monster.
**** Round ended ****


**** Round has started. ****

        **** Current HERO team ****
[0] Name: Sehanine_Moonbow
Level: 1 | Health: 85.457 | Mana: 300.0 | Strength: 750.0 | Defense: 0.0 | Agility: 700.0 | Dexterity: 700.0 | Money: 2501.0 | Exp: 9.0 | Status: 1 | 


        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 100.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 

a/A: Attack
s/S: Cast a spell
p/P: Use Potion
i/I: Show Battle Status
Enter your move for hero: Sehanine_Moonbow a

        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 100.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 

Enter which monster(ID) you want to attack: 0
Sehanine_Moonbow have attacked monsterBlinky with Sword
Weapon dealt damage of 60.0 to Blinky

        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 40.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 

Sehanine_Moonbow received 4.545 damage from the monster.
**** Round ended ****


**** Round has started. ****

        **** Current HERO team ****
[0] Name: Sehanine_Moonbow
Level: 1 | Health: 80.91199999999999 | Mana: 300.0 | Strength: 750.0 | Defense: 0.0 | Agility: 700.0 | Dexterity: 700.0 | Money: 2501.0 | Exp: 9.0 | Status: 1 | 


        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 40.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 

a/A: Attack
s/S: Cast a spell
p/P: Use Potion
i/I: Show Battle Status
Enter your move for hero: Sehanine_Moonbow a

        **** Current MONSTER team ****
[0] Name: Blinky
Level: 1 | Health: 40.0 | Strength: 454.5 | Defense: 350.0 | Agility: 35.0 | Status: 1 | 

Enter which monster(ID) you want to attack: 0
Sehanine_Moonbow have attacked monsterBlinky with Sword
Weapon dealt damage of 60.0 to Blinky
Blinky has fainted.

        **** Current MONSTER team ****

All the monsters have been defeated.
**** Round ended ****

        **** BATTLE IS OVER ****
 +--+--+--+--+--+--+--+--
0|  |  |r |X |  |  |  |  |
 +--+--+--+--+--+--+--+--
1|  |  |M |  |  |  |M |  |
 +--+--+--+--+--+--+--+--
2|  |  |  |  |  |M |M |X |
 +--+--+--+--+--+--+--+--
3|  |M |  |M |X |X |  |  |
 +--+--+--+--+--+--+--+--
4|M |M |M |  |  |  |  |M |
 +--+--+--+--+--+--+--+--
5|X |  |M |  |X |X |M |  |
 +--+--+--+--+--+--+--+--
6|X |X |M |  |  |  |X |  |
 +--+--+--+--+--+--+--+--
7|  |M |X |X |  |  |X |  |
 +--+--+--+--+--+--+--+--
  0  1  2  3  4  5  6  7  



W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon

Enter your move: s
**** You have entered a MARKET Grid! ****
Would you like to enter the market? y/n: y

******** Welcome to the market ********
Weapons: [1)Sword- lvl: 1.0, price: 500.0 damage: 800.0 | 2)Bow- lvl: 2.0, price: 300.0 damage: 500.0 | 3)Scythe- lvl: 6.0, price: 1000.0 damage: 1100.0 | 4)Axe- lvl: 5.0, price: 550.0 damage: 850.0 | 5)TSwords- lvl: 8.0, price: 1400.0 damage: 1600.0 | 6)Dagger- lvl: 1.0, price: 200.0 damage: 250.0 | ]

Armors: [1)Platinum_Shield- lvl: 1.0, price: 150.0 defense: 200.0 | 2)Breastplate- lvl: 3.0, price: 350.0 defense: 600.0 | 3)Full_Body_Armor- lvl: 8.0, price: 1000.0 defense: 1100.0 | 4)Wizard_Shield- lvl: 10.0, price: 1200.0 defense: 1500.0 | 5)Guardian_Angel- lvl: 10.0, price: 1000.0 defense: 1000.0 | ]

Potions: [1)Healing_Potion- lvl: 1.0, price: 250.0 effect: [Health] heal: 100.0 | 2)Strength_Potion- lvl: 1.0, price: 200.0 effect: [Strength] heal: 75.0 | 3)Magic_Potion- lvl: 2.0, price: 350.0 effect: [Mana] heal: 100.0 | 4)Luck_Elixir- lvl: 4.0, price: 500.0 effect: [Agility] heal: 65.0 | 5)Mermaid_Tears- lvl: 5.0, price: 850.0 effect: [Health, Mana, Strength, Agility] heal: 100.0 | 6)Ambrosia- lvl: 8.0, price: 1000.0 effect: [All] heal: 150.0 | ]

Spells: [1)Lightning_Dagger- lvl: 1.0, price: 400.0 damage: 500.0 manaCost: 150.0 spellType: l | 2)Thunder_Blast- lvl: 4.0, price: 750.0 damage: 950.0 manaCost: 400.0 spellType: l | 3)Electric_Arrows- lvl: 5.0, price: 550.0 damage: 650.0 manaCost: 200.0 spellType: l | 4)Spark_Needles- lvl: 2.0, price: 500.0 damage: 600.0 manaCost: 200.0 spellType: l | 5)Snow_Cannon- lvl: 2.0, price: 500.0 damage: 650.0 manaCost: 250.0 spellType: i | 6)Ice_Blade- lvl: 1.0, price: 250.0 damage: 450.0 manaCost: 100.0 spellType: i | 7)Frost_Blizzard- lvl: 5.0, price: 750.0 damage: 850.0 manaCost: 350.0 spellType: i | 8)Arctic_Storm- lvl: 6.0, price: 700.0 damage: 800.0 manaCost: 300.0 spellType: i | 9)Lightning_Dagger- lvl: 1.0, price: 400.0 damage: 500.0 manaCost: 150.0 spellType: l | 10)Thunder_Blast- lvl: 4.0, price: 750.0 damage: 950.0 manaCost: 400.0 spellType: l | 11)Electric_Arrows- lvl: 5.0, price: 550.0 damage: 650.0 manaCost: 200.0 spellType: l | 12)Spark_Needles- lvl: 2.0, price: 500.0 damage: 600.0 manaCost: 200.0 spellType: l | ]

Hero's inventory currently is: 
***************** Inventory *******************
* Weapons: [0)Sword- lvl: 1.0, price: 500.0 damage: 800.0 | ]
* Armors: []
* Potions: []
* Spells: []
***********************************************
Would you like to sell any item with Sehanine_Moonbow y/n: n
Name: Sehanine_Moonbow
Level: 2 | Health: 200.0 | Mana: 330.0 | Strength: 826.875 | Defense: 0.0 | Agility: 771.75 | Dexterity: 735.0 | Money: 2502.0 | Exp: 1.0 | Status: 1 | 
Would you like to buy any item with this hero: Sehanine_Moonbow y/n: y

0) No buy
1) Weapon
2) Armor
3) Potion
4) Spell
Enter the type of item you want to purchase: 3
Enter the index of the item you want to purchase: 5

Added Item Mermaid_Tears in hero's potion inventory
Would you like to buy any item with this hero: Sehanine_Moonbow y/n: n


Leaving the market...
 +--+--+--+--+--+--+--+--
0|  |  |  |X |  |  |  |  |
 +--+--+--+--+--+--+--+--
1|  |  |r |  |  |  |M |  |
 +--+--+--+--+--+--+--+--
2|  |  |  |  |  |M |M |X |
 +--+--+--+--+--+--+--+--
3|  |M |  |M |X |X |  |  |
 +--+--+--+--+--+--+--+--
4|M |M |M |  |  |  |  |M |
 +--+--+--+--+--+--+--+--
5|X |  |M |  |X |X |M |  |
 +--+--+--+--+--+--+--+--
6|X |X |M |  |  |  |X |  |
 +--+--+--+--+--+--+--+--
7|  |M |X |X |  |  |X |  |
 +--+--+--+--+--+--+--+--
  0  1  2  3  4  5  6  7  



W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon

Enter your move: d
**** You have entered a BATTLE Grid! ****
Rolling a dice...
You rolled 6
        **** BATTLE HAS BEGUN ****

**** Round has started. ****

        **** Current HERO team ****
[0] Name: Sehanine_Moonbow
Level: 2 | Health: 200.0 | Mana: 330.0 | Strength: 826.875 | Defense: 0.0 | Agility: 771.75 | Dexterity: 735.0 | Money: 1652.0 | Exp: 1.0 | Status: 1 | 


        **** Current MONSTER team ****
[0] Name: Andrealphus
Level: 2 | Health: 200.0 | Strength: 606.0 | Defense: 500.0 | Agility: 40.0 | Status: 1 | 

a/A: Attack
s/S: Cast a spell
p/P: Use Potion
i/I: Show Battle Status
Enter your move for hero: Sehanine_Moonbow a

        **** Current MONSTER team ****
[0] Name: Andrealphus
Level: 2 | Health: 200.0 | Strength: 606.0 | Defense: 500.0 | Agility: 40.0 | Status: 1 | 

Enter which monster(ID) you want to attack: 0
Sehanine_Moonbow have attacked monsterAndrealphus with Sword
Weapon dealt damage of 56.34375 to Andrealphus

        **** Current MONSTER team ****
[0] Name: Andrealphus
Level: 2 | Health: 143.65625 | Strength: 606.0 | Defense: 500.0 | Agility: 40.0 | Status: 1 | 

Sehanine_Moonbow received 6.0600000000000005 damage from the monster.
**** Round ended ****


**** Round has started. ****

        **** Current HERO team ****
[0] Name: Sehanine_Moonbow
Level: 2 | Health: 193.94 | Mana: 330.0 | Strength: 826.875 | Defense: 0.0 | Agility: 771.75 | Dexterity: 735.0 | Money: 1652.0 | Exp: 1.0 | Status: 1 | 


        **** Current MONSTER team ****
[0] Name: Andrealphus
Level: 2 | Health: 143.65625 | Strength: 606.0 | Defense: 500.0 | Agility: 40.0 | Status: 1 | 

a/A: Attack
s/S: Cast a spell
p/P: Use Potion
i/I: Show Battle Status
Enter your move for hero: Sehanine_Moonbow p
* Potions: [0)Mermaid_Tears- lvl: 5.0, price: 850.0 effect: [Health, Mana, Strength, Agility] heal: 100.0 | ]
Enter the potion(ID) you want to use: 0
Your health gained 100.0
Your mana gained 100.0
Your strength gained 100.0
Your agility gained 100.0
Sehanine_Moonbow received 6.0600000000000005 damage from the monster.
**** Round ended ****


**** Round has started. ****

        **** Current HERO team ****
[0] Name: Sehanine_Moonbow
Level: 2 | Health: 193.94 | Mana: 330.0 | Strength: 926.875 | Defense: 0.0 | Agility: 871.75 | Dexterity: 735.0 | Money: 1652.0 | Exp: 1.0 | Status: 1 | 


        **** Current MONSTER team ****
[0] Name: Andrealphus
Level: 2 | Health: 143.65625 | Strength: 606.0 | Defense: 500.0 | Agility: 40.0 | Status: 1 | 

a/A: Attack
s/S: Cast a spell
p/P: Use Potion
i/I: Show Battle Status
Enter your move for hero: Sehanine_Moonbow a

        **** Current MONSTER team ****
[0] Name: Andrealphus
Level: 2 | Health: 143.65625 | Strength: 606.0 | Defense: 500.0 | Agility: 40.0 | Status: 1 | 

Enter which monster(ID) you want to attack: 0
Sehanine_Moonbow have attacked monsterAndrealphus with Sword
Weapon dealt damage of 61.34375 to Andrealphus

        **** Current MONSTER team ****
[0] Name: Andrealphus
Level: 2 | Health: 82.3125 | Strength: 606.0 | Defense: 500.0 | Agility: 40.0 | Status: 1 | 

Sehanine_Moonbow received 6.0600000000000005 damage from the monster.
**** Round ended ****


**** Round has started. ****

        **** Current HERO team ****
[0] Name: Sehanine_Moonbow
Level: 2 | Health: 187.88 | Mana: 330.0 | Strength: 926.875 | Defense: 0.0 | Agility: 871.75 | Dexterity: 735.0 | Money: 1652.0 | Exp: 1.0 | Status: 1 | 


        **** Current MONSTER team ****
[0] Name: Andrealphus
Level: 2 | Health: 82.3125 | Strength: 606.0 | Defense: 500.0 | Agility: 40.0 | Status: 1 | 

a/A: Attack
s/S: Cast a spell
p/P: Use Potion
i/I: Show Battle Status
Enter your move for hero: Sehanine_Moonbow a

        **** Current MONSTER team ****
[0] Name: Andrealphus
Level: 2 | Health: 82.3125 | Strength: 606.0 | Defense: 500.0 | Agility: 40.0 | Status: 1 | 

Enter which monster(ID) you want to attack: 0
Sehanine_Moonbow have attacked monsterAndrealphus with Sword
Weapon dealt damage of 61.34375 to Andrealphus

        **** Current MONSTER team ****
[0] Name: Andrealphus
Level: 2 | Health: 20.96875 | Strength: 606.0 | Defense: 500.0 | Agility: 40.0 | Status: 1 | 

Sehanine_Moonbow received 6.0600000000000005 damage from the monster.
**** Round ended ****


**** Round has started. ****

        **** Current HERO team ****
[0] Name: Sehanine_Moonbow
Level: 2 | Health: 181.82 | Mana: 330.0 | Strength: 926.875 | Defense: 0.0 | Agility: 871.75 | Dexterity: 735.0 | Money: 1652.0 | Exp: 1.0 | Status: 1 | 


        **** Current MONSTER team ****
[0] Name: Andrealphus
Level: 2 | Health: 20.96875 | Strength: 606.0 | Defense: 500.0 | Agility: 40.0 | Status: 1 | 

a/A: Attack
s/S: Cast a spell
p/P: Use Potion
i/I: Show Battle Status
Enter your move for hero: Sehanine_Moonbow a

        **** Current MONSTER team ****
[0] Name: Andrealphus
Level: 2 | Health: 20.96875 | Strength: 606.0 | Defense: 500.0 | Agility: 40.0 | Status: 1 | 

Enter which monster(ID) you want to attack: 0
Sehanine_Moonbow have attacked monsterAndrealphus with Sword
Weapon dealt damage of 61.34375 to Andrealphus
Andrealphus has fainted.

        **** Current MONSTER team ****

All the monsters have been defeated.
**** Round ended ****

        **** BATTLE IS OVER ****
 +--+--+--+--+--+--+--+--
0|  |  |  |X |  |  |  |  |
 +--+--+--+--+--+--+--+--
1|  |  |M |r |  |  |M |  |
 +--+--+--+--+--+--+--+--
2|  |  |  |  |  |M |M |X |
 +--+--+--+--+--+--+--+--
3|  |M |  |M |X |X |  |  |
 +--+--+--+--+--+--+--+--
4|M |M |M |  |  |  |  |M |
 +--+--+--+--+--+--+--+--
5|X |  |M |  |X |X |M |  |
 +--+--+--+--+--+--+--+--
6|X |X |M |  |  |  |X |  |
 +--+--+--+--+--+--+--+--
7|  |M |X |X |  |  |X |  |
 +--+--+--+--+--+--+--+--
  0  1  2  3  4  5  6  7  



W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon

Enter your move: i
**** Current HERO team status ****
[0] Name: Sehanine_Moonbow
Level: 2 | Health: 200.0 | Mana: 330.0 | Strength: 926.875 | Defense: 0.0 | Agility: 871.75 | Dexterity: 735.0 | Money: 1654.0 | Exp: 3.0 | Status: 1 | 
***************** Inventory *******************
* Weapons: [0)Sword- lvl: 1.0, price: 500.0 damage: 800.0 | ]
* Armors: []
* Potions: []
* Spells: []
***********************************************
 +--+--+--+--+--+--+--+--
0|  |  |  |X |  |  |  |  |
 +--+--+--+--+--+--+--+--
1|  |  |M |r |  |  |M |  |
 +--+--+--+--+--+--+--+--
2|  |  |  |  |  |M |M |X |
 +--+--+--+--+--+--+--+--
3|  |M |  |M |X |X |  |  |
 +--+--+--+--+--+--+--+--
4|M |M |M |  |  |  |  |M |
 +--+--+--+--+--+--+--+--
5|X |  |M |  |X |X |M |  |
 +--+--+--+--+--+--+--+--
6|X |X |M |  |  |  |X |  |
 +--+--+--+--+--+--+--+--
7|  |M |X |X |  |  |X |  |
 +--+--+--+--+--+--+--+--
  0  1  2  3  4  5  6  7  



W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon

Enter your move: q
Game ended






