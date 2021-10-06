class Cylinder : Circle() {
    var h: Double = 1.0
     var v =1.0

    fun getVolume():Double{
        v = pie * radius * radius * h
     return v
    }

   fun display(){
       println("the volume is : $v")
   }
}