
object q1 extends App{
def reverseString(str: String): String = {
  if (str.isEmpty) ""
  else reverseString(str.tail) + str.head
}

val input = "hello"
val reversed = reverseString(input)
println(s"Original: $input, Reversed: $reversed") 
}
