package org.example

import org.example.Character.Mage
import org.example.Character.Warrior
import org.example.base.Character

fun main() {
 val warrior = Warrior("Thor", 100, 20)
 val goblin = Character("Goblin", 30, 10)  // Using Character for Goblin

 warrior.attack(goblin)  // Attack the goblin

 val mage = Mage("Merlin", 80, 30, 100)
 mage.castSpell("Fireball")  // Casting a spell
}