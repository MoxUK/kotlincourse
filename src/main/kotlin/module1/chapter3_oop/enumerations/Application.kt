package enumerations

fun main()  {
    val day: Day = Day.MONDAY

    println(day)
    println(day.position)
    println(Day.FRIDAY)

    val day2: Day = Day.FRIDAY
    val duration: Int = day2.getDuration(Day.MONDAY)
    println(day2.ordinal)

    println(duration)

    for (day in Day.values())   {
        println(day)
    }

    println(Day.valueOf("FRIDAY"))
}

/**
 * prop: name
 * prop: ordinal
 *
 * fun: valueOf(value: String)
 * fun: values()
 */


enum class Day(val position: Int) {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    fun getDuration(day: Day): Int{
        return position - day.position
    }
}