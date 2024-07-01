object q2 extends App{
    
def filterLongStrings(strings: List[String]): List[String] = {
  strings.filter(_.length > 5)
}


val input = List("Scala", "Programming", "Code", "Functional", "List")
val filtered = filterLongStrings(input)
println(filtered)
}