object q3 {
  def toUpper(str: String): String = str.toUpperCase
  
  def toLower(str: String): String = str.toLowerCase
  
  def formatNames(name: String)(format: String => String): String = format(name)

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")
    
    val formattedNames = names.map {
      case "Benny"     => formatNames("Benny")(toUpper)
      case "Niroshan"  => formatNames("Niroshan") { name =>
                          val (first, rest) = name.splitAt(2)
                          first.toUpperCase + rest.toLowerCase
                        }
      case "Saman"     => formatNames("Saman")(toLower)
      case "Kumara"    => formatNames("Kumara") { name =>
                          val (first, last) = (name.init, name.last)
                          first.toLowerCase + last.toString.toUpperCase
                        }
    }
    
    formattedNames.foreach(println)
  }
}
