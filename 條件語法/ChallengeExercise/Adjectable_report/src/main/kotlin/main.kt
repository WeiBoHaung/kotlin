fun main(args:Array<String>) {
    //Aure
    val name = "Madrigal"
    val isBlessed = true
    val isImmortal =false
    var heathPoints = 89
    val aureVisible = isBlessed && heathPoints > 50 || isImmortal
    var heathStatus =when(heathPoints){
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        }else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful conditon"
    }

    val karma =(Math.pow(Math.random(),(110-heathPoints)/100.0)*20).toInt()
    val aureColor =when(karma){
        in 0..5->"red"
        in 6..10->"orange"
        in 11..15->"purple"
        in 16..20->"green"

        else -> "green"
    }


    //todo

    println("(HP:$heathPoints)"+"(Aura:$aureColor)"+"->"+"$name $heathStatus"
    )
}