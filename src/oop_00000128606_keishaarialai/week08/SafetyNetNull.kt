package oop_00000128606_keishaarialai.week08

fun main() {
    var nama:String? = "Keisha"
    try{
        println("nama aku ${nama!!.uppercase()}") //!! not-null
    } catch(ex:Exception){ //bisa juga pake NullPointerException
        println("errornya adalah ${ex.message}")
    }

    //cara manual
    var dataMhs: List<Any> = listOf(123, "Keii", 89, "Tangerang")
    for(item in dataMhs) {
        var itemFilter = item as? String
        if (itemFilter != null){
            println(itemFilter)
        }
    }
}