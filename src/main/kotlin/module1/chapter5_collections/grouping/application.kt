package module1.chapter5_collections.grouping

fun main()  {
    //groupBy()
    val employee = listOf(
        Employee("Tom", "Microsoft"),
        Employee("Bob", "Jetbrains"),
        Employee("Sam", "Google"),
        Employee("Alice", "Microsoft"),
        Employee("Kate", "Google")
    )

    //group employees by company
    val companies = employee.groupBy { it.company }
    println(companies)

    for (company in companies)  {
        println("\n${company.key}:")
        for (employee in company.value)  {
            println("- ${employee.name}")
        }
    }


}

class Employee(val name: String, val company: String)   {
    override fun toString(): String {
        return name
    }
}