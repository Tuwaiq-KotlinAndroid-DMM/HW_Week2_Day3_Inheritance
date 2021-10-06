open class Circle {
    var radius: Double = 1.0
    val pie = 3.14

    fun getArea(): Double{
        var area = pie * radius * radius
        return area
    }
}