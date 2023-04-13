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
