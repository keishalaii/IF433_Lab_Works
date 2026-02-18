package oop_00000128606_keishaarialai.week03

class Weapon(val name: String, initialDamage: Int) {
    var damage: Int = initialDamage
        set(value) {
            when {
                value < 0 -> {
                    println("Damage tidak boleh negatif!")
                }
                value > 1000 -> {
                    println("Damage terlalu besar! Set ke 1000.")
                    field = 1000
                }
                else -> {
                    field = value
                }
            }
        }
    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}