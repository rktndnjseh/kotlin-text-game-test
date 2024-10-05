package org.example.Character

import org.example.base.Character

class Enemy (name: String, hp: Int, attackPower: Int) : Character(name, hp, attackPower) {

    override fun attack(target: Character) {
        println("${this.name} charges at ${target.name} and attacks for $attackPower damage!")
    }
    override fun defend(){
        if(mana >= 10){
            println()
        }
    }
}