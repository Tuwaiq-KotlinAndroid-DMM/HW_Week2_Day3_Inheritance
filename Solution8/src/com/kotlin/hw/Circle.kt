package com.kotlin.hw

 open class Circle(radius:Double) {
    var radius:Double=0.0

    init {
        this.radius=radius
    }
    fun getArea():Double
    {
       return (radius * radius *3.14)
    }
}