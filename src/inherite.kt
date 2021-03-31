fun main () {
    var gari=Car("subaru","jeep","blue",8)
    gari.carry(9)
    gari.identity()
    println(gari.calculatePackingFees(5))

    var basi=Bus("subaru","jeep","blue",5)
    basi.identity()
    println(basi.maxTripFare(599.7))
    println(basi.calculatePackingFees(2))





}

open class Toyota(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int) {
        var y = people - capacity
        if (people <= capacity) {
            println("carrying $people passengers")
        } else {
            println("over capacity by $y people")

        }
    }
    fun identity(){
        println("I am $color $make $model $capacity")
    }
    fun calculatePackingFees(hour:Int):Int{
       var packingfees=hour*20
        return(packingfees)
    }


    }
class Car(make: String,model: String,color: String,capacity: Int):Toyota(make, model, color, capacity){}



class Bus( make:String, model:String, color:String, capacity:Int):Toyota(make, model, color, capacity) {
    fun maxTripFare(fare: Double): Double {
        var p = 0
        return p + fare
    }
}