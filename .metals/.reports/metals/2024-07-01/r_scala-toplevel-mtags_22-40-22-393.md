error id: file:///D:/UCSC/Year%202/Semester%201/Functional%20Programming/Scala_practicals/practical3/src/main/scala/q1.scala:[11..14) in Input.VirtualFile("file:///D:/UCSC/Year%202/Semester%201/Functional%20Programming/Scala_practicals/practical3/src/main/scala/q1.scala", "
object 
def reverseString(str: String): String = {
  if (str.isEmpty) ""
  else reverseString(str.tail) + str.head
}

// Test the function

val input = "hello"
val reversed = reverseString(input)
println(s"Original: $input, Reversed: $reversed") // Output: Original: hello, Reversed: olleh
")
file:///D:/UCSC/Year%202/Semester%201/Functional%20Programming/Scala_practicals/practical3/src/main/scala/q1.scala
file:///D:/UCSC/Year%202/Semester%201/Functional%20Programming/Scala_practicals/practical3/src/main/scala/q1.scala:3: error: expected identifier; obtained def
def reverseString(str: String): String = {
^
#### Short summary: 

expected identifier; obtained def