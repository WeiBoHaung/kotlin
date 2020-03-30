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
    val drunk_status = castFireball()
    println("drunk_status:$drunk_status")

}

//---Fireball_Drunk_Report--
private fun castFireball(drunk: Int = (1..50).random()) = when (drunk) {
    in 1..10 -> "tipsy(微醺)"
    in 11..20 -> "sloshed(微醉)"
    in 21..30 -> "soused(醉了)"
    in 31..40 -> "stewed(大醉)"
    in 41..50 -> "...o0%$#@(爛醉如泥)"
    else -> "none(不清楚)"
}

//---Fireball_Drunk_Report--


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

private fun aureColor(Karma: Int) = when (Karma) {
    in 0..5 -> "red"
    in 6..10 -> "orange"
    in 11..15 -> "purple"
    in 16..20 -> "green"
    else -> "green"
}


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



