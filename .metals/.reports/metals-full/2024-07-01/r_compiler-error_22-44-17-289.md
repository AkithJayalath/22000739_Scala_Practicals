file:///D:/UCSC/Year%202/Semester%201/Functional%20Programming/Scala_practicals/practical3/src/main/scala/q2.scala
### dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition input is defined in
  D:/UCSC/Year 2/Semester 1/Functional Programming/Scala_practicals/practical3/src/main/scala/q1.scala
and also in
  D:/UCSC/Year 2/Semester 1/Functional Programming/Scala_practicals/practical3/src/main/scala/q2.scala
One of these files should be removed from the classpath.

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.3\scala3-library_3-3.3.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 274
uri: file:///D:/UCSC/Year%202/Semester%201/Functional%20Programming/Scala_practicals/practical3/src/main/scala/q2.scala
text:
```scala
object q2 extends App{
def filterLongStrings(strings: List[String]): List[String] = {
  strings.filter(_.length > 5)
}

// Test the function
val input = List("Scala", "Programming", "Code", "Functional", "List")
val filtered = filterLongStrings(input)
println(filter@@ed) // Output: List(Programming, Functional)
}
```



#### Error stacktrace:

```

```
#### Short summary: 

dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition input is defined in
  D:/UCSC/Year 2/Semester 1/Functional Programming/Scala_practicals/practical3/src/main/scala/q1.scala
and also in
  D:/UCSC/Year 2/Semester 1/Functional Programming/Scala_practicals/practical3/src/main/scala/q2.scala
One of these files should be removed from the classpath.