fun main(){
        println(evens(listOf("sandra","sarah","resty","vicky","Easther","janet","mark","linda","kayle","jake") as MutableList<String>))
        println(avgSum(listOf(1.3,1.5,1.9,1.2,2.3) as MutableList<Double>))
        println(personObjects(listOf(Person("Anold",26,1.5,60.5),
        Person("mike",25,1.2,50.3),
        Person("Paul",23,2.1,45.0))))
         others()

    var cars= mutableListOf(
        Car("KED450",300),
        Car("KES678",200)
    )
    println(avgMileage(cars))
}

fun evens(names:MutableList<String>):List<String>{
    return names.filter{name->names.indexOf(name)%2==0}
}
data class AvgSum(var average:Double,var sum: Double)
fun avgSum(heights:MutableList<Double>):AvgSum {
    return AvgSum(heights.average(),heights.sum())
}
data class Person(var name: String,var age:Int,var height:Double,var weight:Double)
fun personObjects(human: List<Person>){
println(human.sortedByDescending{human-> human.age})
}
fun others() {
      var otherPeople= mutableListOf(
        Person("Anold",26,1.5,60.5),
        Person("mike",25,1.2,50.3),
        Person("Paul",23,2.1,45.0)
      )
    otherPeople.addAll(listOf(
        Person("Kyle",34,2.0,1.45),
        Person("Becky",12,1.3,34.2)
    ))

}
data class Car(var registration:String,var mileage:Int)
fun avgMileage(cars:List<Car>):Double{
    var totalMileage=0.0
    for (car in cars){
        totalMileage+=car.mileage
    }
    var avg=totalMileage/cars.size
    return avg
}