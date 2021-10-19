package abstract



class circle(var :Double,override var name:String):shape(){


    override fun area():Double{
        return Math.PI* r*r
    }
}
