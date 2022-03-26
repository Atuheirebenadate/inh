fun main(){
    var x=car("subaru","legacy","blue",12)
    x.carry(15)
    x.identity("blue","subaru","legancy")
 println( x.calculateParkingFees(5))

   var y= Bus("pokopoko","sanana","yellow",13)
  println(y.maxTripFare(3000.04))

  println(y.calculateParkingFees(2))


}
 open class car(var make:String,var model:String,var color:String,var capacity:Int){

fun carry(people:Int){
    var difference = people - capacity
    if(people<=12)
        println("Carrying $people passengers")
            else
        (println("Over capacity by $difference people"))

        }
    fun identity(color: String,make:String,model: String){
        println("I am a $color $make,$model, ")
    }
 open   fun calculateParkingFees(hours: Int):Int{
     return hours*20

    }
}
class Bus( make:String, model:String, color:String, capacity:Int):car(make,model,color,capacity){
    fun maxTripFare(fare:Double):Double{
        var w=fare*capacity
        return w

    }

    override fun calculateParkingFees(hours: Int): Int {
  var a=hours*capacity
        return a
    }
}
