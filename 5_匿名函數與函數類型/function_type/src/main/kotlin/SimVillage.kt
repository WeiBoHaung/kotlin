fun main(args: Array<String>) {

    println(
        {
            val currentYear = 2018
            "Welcome to SimVillage, Mayor! (copyright $currentYear)"
        }()
    )

    val sum1 = { a: Int, b: Int -> a + b }
    val sum2: (Int, Int) -> Int = { a, b -> a + b }
    val sum3 = xxx(2, 3)

    val result1 = sum1(2, 3)
    val result2 = sum2(2, 3)
    val result3 = sum3

    println(result1)
    println(result2)
    println(result3)
}


fun xxx(a: Int, b: Int): Int {
    return a + b
}