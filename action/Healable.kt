package org.example.action

import org.example.base.Character

interface Healable{
    fun heal(amount:Int)
}
class Healer (name:String, hp:Int, attackPower:Int)
    : Character(name, hp, attackPower), Healable {
    override fun heal(amount: Int) {
        hp +=amount
        println("$name heals for $amount HP. Total HP: $hp")
    }
}