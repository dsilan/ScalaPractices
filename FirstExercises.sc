def stringToUpper(st : String) : String = {
  println(st.toUpperCase)
  st.toUpperCase
}
stringToUpper("attack on titan")

def funcInFunc (x: String , f: String => String) : String = {f(x)}
funcInFunc("eren yaeger", stringToUpper)

val question = "What does Epiphany mean?"
var answer = "Epiphany means the moment you become aware of something important"
answer = question + answer

println(answer)

//Immutable List
val captainLine = ("Levi", "Erwin", "Hange","Armin")
println(captainLine)

//Call indexes
println(captainLine._1)
println(captainLine._2)
println(captainLine._3)
println(captainLine._4)

//Tuples - can contain different data types

val erensTitan = "Eren" -> "Attack Titan"
println (erensTitan)

val lastSeason = ("season 4", 20201207, true)
println(lastSeason)

//Lists - can not contain different data types

val nineTitans = List("Attack","Beast","Cart","Armor","Female","Founder","War Hammer","Colossus","Jaw")
println(nineTitans)
println("First titan is "+nineTitans(0) + " Titan")
println(nineTitans.head)
println("And the others are"+nineTitans.tail)

//for loop
println("All of them:")
for (titan <- nineTitans) {println(titan+ " Titan ")}

//reduce function combines all items in a collection
val episodeDurationAndEpisodeCount = List(20,25)
val oneSeasonDuration = episodeDurationAndEpisodeCount.reduce((x:Int,y:Int) => x*y)
println("one Season Duration= "+oneSeasonDuration + " min")

//filter
val IhateZeke = nineTitans.filter((titan:String) => titan != "Beast")
val IHateZekeButFunctionShortened = nineTitans.filter(_ != "Beast")
println(IhateZeke)
println(IHateZekeButFunctionShortened)
println(nineTitans) //remains same

//concanate Lists
val Zeke = List("Beast")
println(IhateZeke.contains(Zeke))

val okayZekeYouHaveDaddyIssues= Zeke++IhateZeke
println(okayZekeYouHaveDaddyIssues)

val sorted = nineTitans.sorted
println(sorted)

val reversed = sorted.reverse
println(reversed)

//Map
val titanHosts = Map("Armin" -> "Colossus", "Annie" -> "Female", "Falco"->"Jaw", "Eren"->"Attack","Eren"->"Founder", "Reiner"->"Armor","Pieck"->"Cart", "Eren"->"War Hammer" )
for ((k,v) <- titanHosts) printf("key: %s, value: %s\n", k, v)

println(titanHosts.contains("Mikasa"))

//Exception Handling
println(util.Try(titanHosts("Mikasa")) getOrElse "Not Yet")