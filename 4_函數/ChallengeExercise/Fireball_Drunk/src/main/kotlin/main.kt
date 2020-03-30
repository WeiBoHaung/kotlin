fun main() {
    //Aure
    val name = "Madrigal"
    val isBlessed = true
    val isImmortal = false
    var heathPoints = 89
    val aureVisible = isBlessed && heathPoints > 50 || isImmortal
    var heathStatus = formatHeathStatus(heathPoints, isBlessed)

    val karma = (Math.pow(Math.random(), (110 - heathPoints) / 100.0) * 20).toInt()
    val aureColor = aureColor(karma)
    //Aura
    printPlayerStatus(karma, aureColor, isBlessed, name, heathStatus)
    castFireball()

}

//---Fireball_Drunk--
private fun castFireball() {
    val drunk = (1..50).random()
    println("A glass of Fireball springs into existence." + "(drunk:$drunk)")
}
//---Fireball_Drunk--


private fun printPlayerStatus(
    karma: Int,
    aureColor: String,
    isBlessed: Boolean,
    name: String,
    heathStatus: String
) {
    println(
        "karma:$karma" + "(Aura:$aureColor)" +
                "Blessed:${if (isBlessed) "YES" else "NO"}"
    )
    println("$name $heathStatus")
}
//---Single_Expression_function---

//private fun aureColor(karma: Int): String {
//    val aureColor = when (karma) {
//        in 0..5 -> "red"
//        in 6..10 -> "orange"
//        in 11..15 -> "purple"
//        in 16..20 -> "green"
//
//        else -> "green"
//    }
//    return aureColor
//}
private fun aureColor(Karma: Int) = when (Karma) {
    in 0..5 -> "red"
    in 6..10 -> "orange"
    in 11..15 -> "purple"
    in 16..20 -> "green"
    else -> "green"
}
//---Single_Expression_function---


private fun formatHeathStatus(heathPoints: Int, isBlessed: Boolean): String {
    var heathStatus = when (heathPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful conditon"
    }
    return heathStatus
}



