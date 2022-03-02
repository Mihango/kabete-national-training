fun main() {
    // object creation
    val car = Car()
    println("What is the color of the car? ${car.color}")
    println("What is the brand of the car? ${car.brand}")
    car.accelerate()
    car.accelerate()
    car.accelerate()
    car.accelerate()

    // calling functions
    addNumbers(50, 61)
    addNumbers(1000, 61)
    addNumbers(520, 61)

    // Working on kotlin operators

    // addition
    val sum = 45 + 6;
    println("Summation of 45 + 6 = $sum")

    // substraction
    val sub = 45 - 6;
    println("Difference of 45 - 6 = $sub")

    // division
    val division = 46 / 5
    println("45 / 6 = $division")

    // modulus
    val modulus = 46 % 5
    println("Remainder of 46 / 5 = $modulus")
}

fun addNumbers(num: Int, num2: Int) {
    println("A function for adding numbers")
    val sum = num + num2
    println("Summation of $num + $num2 = $sum")
    println("===============================")
}

class Car {
    // inside - add properties and behaviour of a class
    var color: String = "Light Grey"
    val brand: String = "Toyota"
    val yearOfManufacture: Int = 2016

    fun accelerate() {
        println(">>>>> Am accelerating >>>>>>")
    }
}
