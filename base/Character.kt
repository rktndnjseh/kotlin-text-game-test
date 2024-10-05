package org.example.base

open class Character(val name: String, val hp: Int, val attackPower: Int) {
    open fun attack(target: Character) {
        println("${this.name} attacks ${target.name} for $attackPower damage!")
    }

    open fun defend() {}
}