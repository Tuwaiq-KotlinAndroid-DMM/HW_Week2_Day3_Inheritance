class Cylinder(_radius:Double ,var _hight:Double):Circle(_radius) {

    fun getVolume():Double{

       return pi*_radius*_radius*_hight
    }

     fun display() {
         println("this the result of the volume of the cylinder:${getVolume()}")
        var surfaceArea = (getArea()+getVolume())*2
         println("this the result of the surface area of the cylinder:$surfaceArea")
    }

}