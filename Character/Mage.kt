package org.example.Character

import org.example.base.Character

class Mage(name: String, hp: Int, attackPower: Int) : Character(name, hp, attackPower) {
    fun castSpell(spellName: String) {
        println("$name casts $spellName! HP: $hp, Attack Power: $attackPower")
    }
}

