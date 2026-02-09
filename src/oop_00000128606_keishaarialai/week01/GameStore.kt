package oop_00000128606_keishaarialai.week01

fun main() {
    val gameTitle = "Grand Theft Auto V"
    val price = 500000

    printReceipt(title = gameTitle, calculateDiscount(price))
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) return price - price * 20/100
    else return price - price * 10/100

fun printReceipt(title: String, finalPrice: Int) =
    println("Game TItle: $title \nFinal Price: $finalPrice")
