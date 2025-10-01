package animal

import social.User

fun main()  {
    val dog1 = Dog("Rex", 25)
    val dog2 = Dog("Biscuit", 4)
    val dog3 = Dog("Sweet Pea", 11)

    dog1.bark()
    dog1.dogInfo()
    dog2.dogInfo()
    dog3.dogInfo()
}