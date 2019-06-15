package Homework4_6

import javax.naming.Name

open class Human(val name:String):flag {

    override val test: String="Wang"
    override fun human(): String {
        return "$test"
    }
    open fun attack():String {
        return "$name use first attack"
    }
}

class Mage(name:String):Human(name){

    override fun attack(): String {
        return "$name use fireball"
    }
}

interface flag{

    val test:String
    fun human(): String {
        return "$test"
    }
}

fun main(args: Array<String>) {

    val human=Human("Sophie")
    val mage=Mage("Sophie")
    println(human.attack())
    println(mage.attack())
    println(human.human())
}


