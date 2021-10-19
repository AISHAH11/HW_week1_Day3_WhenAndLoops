interface iVehicle{
    var type:String
    fun isMoving():Boolean{
        open class Vehicle:iVehicle{
            var startEngine:Boolean=false
            var speed:Int=0
            var gear:Int=0
            override var type:String=""
            set(value) {
                this.type = value
                //your code{
            }
                override fun
                        isMoving():Boolean{
                    return speed>0{
           open fun speedUp(){
               speed++;
    open fun changeGear(value:Int){
        gear=value
        fun applyBrakes(){
            speed=0;
            fun printStates(){
                if (isMoving()) {
                }else{
                    println("it is not Moving")

                }
                class SportCar():Vehicle(){
                    override fun speedUp(){
                        speed=+20;
                                             {
      override fun
      changeGear(value:Int) {
//          if (value>=1//value<=5){
          gear = value
      }else{
          gear=0
      class Truck():Vehicle(){
          override fun speedUp(){
              speed=+5
              {
              override fun
    changeGear(value:Int){
        if (value>=1//value<=10){
            gear=value
              }else{
                  gear=0{
   fun main(){
       var truck:Vehicle=Truck();
       println("SportCar present state:");
       truck.printStates()
       truck.chengeGear(5)
       truck.speedUp()
      truck.speedUp()
      println("SportCar presentstate:");
      truck.printStates()
      println("speed:")
      println(truck.speed)
      truck.applyBrakes()
       println("speed:")
       println(truck.speed){

       }

   }
              }
          }
      }
      }

                        }
                    }
                }
            }
        }
    }
           }
                }
            }
                    }
    }

}