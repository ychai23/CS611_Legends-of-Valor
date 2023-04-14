<U06937573>

## Files
---------------------------------------------------------------------------
Added Class:
VolarGrid.java extends Grid, gives stucture to different grid type in Volar world
Bush.java extends VolarGrid, A Gird type in VolarWorld
Cave.java extends VolarGrid, A Gird type in VolarWorld
Plain.java extends VolarGrid, A Gird type in VolarWorld
Inaccessible.java extends VolarGrid, A Gird type in VolarWorld
Koulou.java extends VolarGrid, A Gird type in VolarWorld

ValorWorld.java extends World, A map class with main sttucture of Grid[][] to keep the position of event happend in this game.
VolarGame.java, Central Game control of the Volar Game.

Consumable Interface, items Potion are consumed and use by hero with different effect. 
Tradeble Interface, items Armor Weapon are able to buy and sell. 
Fightable Interface, Monster and Hero are able to fight.


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
1. Files to be parsed are stored in ConfigFiles folder, for parser class to read class
2. <Bonus Done>
    a. Monster is able to respawn when it dies (increase difficulty)
    b. Monsters also gets the buff when entering a special field (dodge - bush, baseDamage - koulou, defense - cave)
    c. Applied capping for health, strength, mana, dexterity, agility etc. for each level for heros (potion use can boost dexterity agility and strength above cap)
    d. View information for each hero (additional move options)
3. For more detailed comments for some classes, refer to the more detailed header comments that I wrote on top of each class

## How to compile and run
---------------------------------------------------------------------------
1. Navigate to the directory "lv" after unzipping the files
2. Run the following instructions:
javac *.java
java Main

## Input/Output Example
---------------------------------------------------------------------------
Choose your Hero For Top Lane:
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
Choose your hero For Mid Lane:
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
Choose your hero for Bot Lane:
1) Warrior
2) Sorccerer
3) Paladin

Selection? 3

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

Selection? 3
You selected Garl_Glittergold

You have formed your hero team.
[0] Name: Sehanine_Moonbow
Level: 1 | Health: 100.0 | Mana: 300.0 | Strength: 750.0 | Defense: 0.0 | Agility: 700.0 | Dexterity: 700.0 | Money: 2500.0 | Exp: 7.0 | Status: 1 |
[1] Name: Reign_Havoc
Level: 1 | Health: 100.0 | Mana: 800.0 | Strength: 800.0 | Defense: 0.0 | Agility: 800.0 | Dexterity: 800.0 | Money: 2500.0 | Exp: 8.0 | Status: 1 |
[2] Name: Garl_Glittergold
Level: 1 | Health: 100.0 | Mana: 100.0 | Strength: 600.0 | Defense: 0.0 | Agility: 500.0 | Dexterity: 400.0 | Money: 2500.0 | Exp: 5.0 | Status: 1 |

Welcome to Game: Legends of Valor!
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  | M0    |  |       |  |       |  | M1    |  |       |  |       |  | M2    |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
P - P - P  C - C - C  I - I - I  K - K - K  B - B - B  I - I - I  C - C - C  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  C - C - C  I - I - I  K - K - K  B - B - B  I - I - I  C - C - C  P - P - P
P - P - P  K - K - K  I - I - I  P - P - P  B - B - B  I - I - I  B - B - B  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  K - K - K  I - I - I  P - P - P  B - B - B  I - I - I  B - B - B  P - P - P
K - K - K  B - B - B  I - I - I  B - B - B  P - P - P  I - I - I  C - C - C  C - C - C
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  B - B - B  I - I - I  B - B - B  P - P - P  I - I - I  C - C - C  C - C - C
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  K - K - K  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  K - K - K  P - P - P
P - P - P  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
B - B - B  B - B - B  I - I - I  P - P - P  B - B - B  I - I - I  P - P - P  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
B - B - B  B - B - B  I - I - I  P - P - P  B - B - B  I - I - I  P - P - P  P - P - P
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|     H0|  |       |  |       |  |     H1|  |       |  |       |  |     H2|  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
Would you like Sehanine_MoonbowH0 to enter the market? y/n: n

Sehanine_MoonbowH0 leaving the market...
Would you like Reign_HavocH1 to enter the market? y/n: n

Reign_HavocH1 leaving the market...
Would you like Garl_GlittergoldH2 to enter the market? y/n: n

Garl_GlittergoldH2 leaving the market...
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  | M0    |  |       |  |       |  | M1    |  |       |  |       |  | M2    |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|     H0|  |       |  |       |  |     H1|  |       |  |       |  |     H2|  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N

Sehanine_Moonbow(H0)'s turn.

W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon
P/p: pass
T/t: attack
U/u: use a potion
L/l: cast a spell
E/e: teleport
R/r: recall

Enter your move for the hero: w
H0 steped on Koulou. Buff on Strength.
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  | M0    |  |       |  |       |  | M1    |  |       |  |       |  | M2    |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
|     H0|  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |     H1|  |       |  |       |  |     H2|  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N

Reign_Havoc(H1)'s turn.

W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon
P/p: pass
T/t: attack
U/u: use a potion
L/l: cast a spell
E/e: teleport
R/r: recall

Enter your move for the hero: w
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  
|       |  | M0    |  |       |  |       |  | M1    |  |       |  |       |  | M2    |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
|     H0|  |       |  |       |  |     H1|  |       |  |       |  |       |  |       |
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |     H2|  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N

Garl_Glittergold(H2)'s turn.

W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon
P/p: pass
T/t: attack
U/u: use a potion
L/l: cast a spell
E/e: teleport
R/r: recall

Enter your move for the hero: w
M0 steped on Koulou. Buff on Base Damage.
M2 steped on Cave. Buff on Defense.
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
|       |  | M0    |  |       |  |       |  | M1    |  |       |  |       |  | M2    |
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
|     H0|  |       |  |       |  |     H1|  |       |  |       |  |     H2|  |       |
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N

Sehanine_Moonbow(H0)'s turn.

W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon
P/p: pass
T/t: attack
U/u: use a potion
L/l: cast a spell
E/e: teleport
R/r: recall

Enter your move for the hero: w
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
|       |  | M0    |  |       |  |       |  | M1    |  |       |  |       |  | M2    |
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
|     H0|  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
|       |  |       |  |       |  |     H1|  |       |  |       |  |     H2|  |       |
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N

Reign_Havoc(H1)'s turn.

W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon
P/p: pass
T/t: attack
U/u: use a potion
L/l: cast a spell
E/e: teleport
R/r: recall

Enter your move for the hero: w
H1 steped on Cave. Buff on Agility.
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
|       |  | M0    |  |       |  |       |  | M1    |  |       |  |       |  | M2    |
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
|     H0|  |       |  |       |  |     H1|  |       |  |       |  |       |  |       |
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
|       |  |       |  |       |  |       |  |       |  |       |  |     H2|  |       |
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N

Garl_Glittergold(H2)'s turn.

W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon
P/p: pass
T/t: attack
U/u: use a potion
L/l: cast a spell
E/e: teleport
R/r: recall

Enter your move for the hero: w
H2 steped on Cave. Buff on Agility.
M0 steped on Koulou. Buff on Base Damage.
M2 steped on Cave. Buff on Defense.
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
|       |  | M0    |  |       |  |       |  | M1    |  |       |  |       |  | M2    |
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
|     H0|  |       |  |       |  |     H1|  |       |  |       |  |     H2|  |       |
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N

Sehanine_Moonbow(H0)'s turn.

W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon
P/p: pass
T/t: attack
U/u: use a potion
L/l: cast a spell
E/e: teleport
R/r: recall

Enter your move for the hero: w
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
|       |  | M0    |  |       |  |       |  | M1    |  |       |  |       |  | M2    |
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
|     H0|  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
|       |  |       |  |       |  |     H1|  |       |  |       |  |     H2|  |       |
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N

Reign_Havoc(H1)'s turn.

W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon
P/p: pass
T/t: attack
U/u: use a potion
L/l: cast a spell
E/e: teleport
R/r: recall

Enter your move for the hero: w
H1 steped on Bush. Buff on Dexterity.
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
|       |  | M0    |  |       |  |       |  | M1    |  |       |  |       |  | M2    |
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
|     H0|  |       |  |       |  |     H1|  |       |  |       |  |       |  |       |
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |     H2|  |       |
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N

Garl_Glittergold(H2)'s turn.

W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon
P/p: pass
T/t: attack
U/u: use a potion
L/l: cast a spell
E/e: teleport
R/r: recall

Enter your move for the hero: w
H2 steped on Bush. Buff on Dexterity.
New monsters generated!
monster team increased to 6
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  | M3    |  |       |  |       |  | M4    |  |       |  |       |  | M5    |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
|       |  | M0    |  |       |  |       |  | M1    |  |       |  |       |  | M2    |
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
|     H0|  |       |  |       |  |     H1|  |       |  |       |  |     H2|  |       |
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N

M3 steped on Koulou. Buff on Base Damage.
M5 steped on Cave. Buff on Defense.
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
|       |  | M3    |  |       |  |       |  | M4    |  |       |  |       |  | M5    |
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
|       |  | M0    |  |       |  |       |  | M1    |  |       |  |       |  | M2    |
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
|     H0|  |       |  |       |  |     H1|  |       |  |       |  |     H2|  |       |
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N

Sehanine_Moonbow(H0)'s turn.

W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon
P/p: pass
T/t: attack
U/u: use a potion
L/l: cast a spell
E/e: teleport
R/r: recall

Enter your move for the hero: t
[M0] default is in range
Name: default
Level: 0 | Health: 0.0 | Strength: 0.0 | Defense: 0.0 | Agility: 0.0 | Status: 1 |
Enter which monster(ID) you want to attack: 0
Sehanine_Moonbow have attacked monsterdefault with Sword
Weapon dealt damage of 77.5 to default
default has fainted.
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  | M1    |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
|       |  | M3    |  |       |  |       |  | M4    |  |       |  |       |  | M5    |
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
|       |  |       |  |       |  |       |  | M1    |  |       |  |       |  | M2    |
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
|     H0|  |       |  |       |  |     H1|  |       |  |       |  |     H2|  |       |
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N

Reign_Havoc(H1)'s turn.

W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon
P/p: pass
T/t: attack
U/u: use a potion
L/l: cast a spell
E/e: teleport
R/r: recall

Enter your move for the hero: e
Enter the hero ID you want to teleport next to: 0
Enter the location in respect to the target hero, side or below? enter character (s/b): s
Teleported to the Right Successfully.
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  | M1    |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
|       |  | M3    |  |       |  |       |  | M4    |  |       |  |       |  | M5    |
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
|       |  |       |  |       |  |       |  | M1    |  |       |  |       |  | M2    |
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
|     H0|  |     H1|  |       |  |       |  |       |  |       |  |     H2|  |       |
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N

Garl_Glittergold(H2)'s turn.

W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon
P/p: pass
T/t: attack
U/u: use a potion
L/l: cast a spell
E/e: teleport
R/r: recall

Enter your move for the hero: w
H2 steped on Koulou. Buff on Strength.
M1 steped on Koulou. Buff on Base Damage.
M2 attacked H2
Garl_GlittergoldH2 received 1.5 damage from the monster.
M3 steped on Koulou. Buff on Base Damage.
M5 steped on Cave. Buff on Defense.
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
|       |  | M1    |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
|       |  | M3    |  |       |  |       |  | M4    |  |       |  |       |  | M5    |
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |     H2|  | M2    |
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
|     H0|  |     H1|  |       |  |       |  | M1    |  |       |  |       |  |       |
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N

Sehanine_Moonbow(H0)'s turn.

W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon
P/p: pass
T/t: attack
U/u: use a potion
L/l: cast a spell
E/e: teleport
R/r: recall

Enter your move for the hero: w
H0 steped on Cave. Buff on Agility.
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
|       |  | M1    |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
|       |  | M3    |  |       |  |       |  | M4    |  |       |  |       |  | M5    |
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
|     H0|  |       |  |       |  |       |  |       |  |       |  |     H2|  | M2    |
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
|       |  |     H1|  |       |  |       |  | M1    |  |       |  |       |  |       |
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N

Reign_Havoc(H1)'s turn.

W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon
P/p: pass
T/t: attack
U/u: use a potion
L/l: cast a spell
E/e: teleport
R/r: recall

Enter your move for the hero: w
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
|       |  | M1    |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
|       |  | M3    |  |       |  |       |  | M4    |  |       |  |       |  | M5    |
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
|     H0|  |     H1|  |       |  |       |  |       |  |       |  |     H2|  | M2    |
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
|       |  |       |  |       |  |       |  | M1    |  |       |  |       |  |       |
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N

Garl_Glittergold(H2)'s turn.

W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon
P/p: pass
T/t: attack
U/u: use a potion
L/l: cast a spell
E/e: teleport
R/r: recall

Enter your move for the hero: w
M1 steped on Koulou. Buff on Base Damage.
M1 steped on Bush. Buff on Dodge.
M2 attacked H2
Garl_GlittergoldH2 received 1.5 damage from the monster.
M3 attacked H0
Sehanine_MoonbowH0 received 0.0 damage from the monster.
M3 steped on Koulou. Buff on Base Damage.
M5 attacked H2
Garl_GlittergoldH2 received 1.5 damage from the monster.
M5 steped on Cave. Buff on Defense.
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
|       |  | M1    |  |       |  |       |  |       |  |       |  |     H2|  | M5    |
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
|     H0|  |     H1|  |       |  |       |  | M4    |  |       |  |       |  | M2    |
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
|       |  |       |  |       |  |       |  | M1    |  |       |  |       |  |       |
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N

Sehanine_Moonbow(H0)'s turn.

W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon
P/p: pass
T/t: attack
U/u: use a potion
L/l: cast a spell
E/e: teleport
R/r: recall

Enter your move for the hero: w
H0 steped on Koulou. Buff on Strength.
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
|     H0|  | M1    |  |       |  |       |  |       |  |       |  |     H2|  | M5    |
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
|       |  |     H1|  |       |  |       |  | M4    |  |       |  |       |  | M2    |
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
|       |  |       |  |       |  |       |  | M1    |  |       |  |       |  |       |
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N

Reign_Havoc(H1)'s turn.

W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon
P/p: pass
T/t: attack
U/u: use a potion
L/l: cast a spell
E/e: teleport
R/r: recall

Enter your move for the hero: w
H1 steped on Koulou. Buff on Strength.
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
|     H0|  | M1  H1|  |       |  |       |  |       |  |       |  |     H2|  | M5    |
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
|       |  |       |  |       |  |       |  | M4    |  |       |  |       |  | M2    |
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
|       |  |       |  |       |  |       |  | M1    |  |       |  |       |  |       |
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N

Garl_Glittergold(H2)'s turn.

W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon
P/p: pass
T/t: attack
U/u: use a potion
L/l: cast a spell
E/e: teleport
R/r: recall

Enter your move for the hero: w
New monsters generated!
monster team increased to 9
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  | M6    |  |       |  |       |  | M7    |  |       |  |       |  | M8    |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
|       |  |       |  |       |  |       |  |       |  |       |  |     H2|  |       |
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
|     H0|  | M1  H1|  |       |  |       |  |       |  |       |  |       |  | M5    |
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
|       |  |       |  |       |  |       |  | M4    |  |       |  |       |  | M2    |
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
|       |  |       |  |       |  |       |  | M1    |  |       |  |       |  |       |
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N

M1 attacked H0
Sehanine_MoonbowH0 received 4.9995 damage from the monster.
M1 steped on Koulou. Buff on Base Damage.
M3 attacked H0
Sehanine_MoonbowH0 received 0.0 damage from the monster.
M3 steped on Koulou. Buff on Base Damage.
M5 attacked H2
Garl_GlittergoldH2 received 1.5 damage from the monster.
M5 steped on Cave. Buff on Defense.
M6 steped on Koulou. Buff on Base Damage.
M8 attacked H2
Garl_GlittergoldH2 received 1.5 damage from the monster.
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  | M8    |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
|       |  | M6    |  |       |  |       |  | M7    |  |       |  |     H2|  |       |
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
|     H0|  | M1  H1|  |       |  |       |  |       |  |       |  |       |  | M5    |
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
|       |  |       |  |       |  |       |  | M4    |  |       |  |       |  | M2    |
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
|       |  |       |  |       |  |       |  | M1    |  |       |  |       |  |       |
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N

Sehanine_Moonbow(H0)'s turn.

W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon
P/p: pass
T/t: attack
U/u: use a potion
L/l: cast a spell
E/e: teleport
R/r: recall

Enter your move for the hero: w
H0 steped on Koulou. Buff on Strength.
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  | M8    |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
|     H0|  | M6    |  |       |  |       |  | M7    |  |       |  |     H2|  |       |
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
|       |  | M1  H1|  |       |  |       |  |       |  |       |  |       |  | M5    |
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
|       |  |       |  |       |  |       |  | M4    |  |       |  |       |  | M2    |
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
|       |  |       |  |       |  |       |  | M1    |  |       |  |       |  |       |
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N

Reign_Havoc(H1)'s turn.

W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon
P/p: pass
T/t: attack
U/u: use a potion
L/l: cast a spell
E/e: teleport
R/r: recall

Enter your move for the hero: w
H1 steped on Koulou. Buff on Strength.
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  | M8    |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
|     H0|  | M6  H1|  |       |  |       |  | M7    |  |       |  |     H2|  |       |
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
|       |  | M1    |  |       |  |       |  |       |  |       |  |       |  | M5    |
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
|       |  |       |  |       |  |       |  | M4    |  |       |  |       |  | M2    |
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
|       |  |       |  |       |  |       |  | M1    |  |       |  |       |  |       |
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N

Garl_Glittergold(H2)'s turn.

W/w: move up
A/a: move left
S/s: move down
D/d: move right
Q/q: quit game
I/i: show information
C/c: change armor/weapon
P/p: pass
T/t: attack
U/u: use a potion
L/l: cast a spell
E/e: teleport
R/r: recall

Enter your move for the hero: w
Would you like Garl_GlittergoldH2 to enter the market? y/n: w

Garl_GlittergoldH2 leaving the market...
H2 Garl_Glittergold has reached monster's Nexus. You won!
M1 attacked H0
Sehanine_MoonbowH0 received 4.9995 damage from the monster.
M1 steped on Koulou. Buff on Base Damage.
Monster won!
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  |       |  |       |  |     H2|  | M8    |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
|     H0|  | M6  H1|  |       |  |       |  | M7    |  |       |  |       |  |       |
K - K - K  K - K - K  I - I - I  C - C - C  P - P - P  I - I - I  P - P - P  C - C - C
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
|       |  | M1    |  |       |  |       |  |       |  |       |  |       |  | M5    |
K - K - K  K - K - K  I - I - I  B - B - B  P - P - P  I - I - I  P - P - P  C - C - C
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
C - C - C  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  K - K - K  P - P - P
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
|       |  |       |  |       |  |       |  | M4    |  |       |  |       |  | M2    |
P - P - P  P - P - P  I - I - I  B - B - B  P - P - P  I - I - I  B - B - B  P - P - P
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
P - P - P  K - K - K  I - I - I  C - C - C  B - B - B  I - I - I  C - C - C  P - P - P
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
|       |  |       |  |       |  |       |  |       |  |       |  |       |  |       |
K - K - K  P - P - P  I - I - I  P - P - P  P - P - P  I - I - I  P - P - P  K - K - K
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N
|       |  |       |  |       |  |       |  | M1    |  |       |  |       |  |       |
N - N - N  N - N - N  I - I - I  N - N - N  N - N - N  I - I - I  N - N - N  N - N - N

Game ended