fun main() {
   list()
    county()
num()
question("Maria","Peter","Mark")

}
fun list (){
var main = arrayOf("Karabo", "Jamaica","Boston","jackets")
    println(main.contentToString())
}

fun county (){
    var cities = arrayOf("harare", "mumbai","dodoma","jakarta")
var city = "keza mwiza"
var capitalizing = cities.map {  it.capitalize() }
    println(capitalizing.sorted())

}
fun num (){
  //3
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
   var sum = numbers[1] +numbers[4]
    println(sum)
println(numbers.indexOf(158))
numbers.sort()
    for (nums in numbers) println("$nums ")

}
fun question (word1:String, word2:String, word3:String) {
var lines = arrayOf(word1,word2,word3)
println(lines.contentToString())


}