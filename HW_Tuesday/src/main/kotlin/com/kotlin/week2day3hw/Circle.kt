package com.kotlin.week2day3hw

open class Circle(r: Double) {
    var radius: Double = r
    protected var pi =3.14


    fun getArea ():Double{
        return(pi*radius*radius)
    }
}
