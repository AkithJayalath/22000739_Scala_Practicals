object q2 {

    case class Book(title:String, author:String,isbn:String)

    var library: Set[Book] = Set(
        Book("Harry Potter","J.K.Rowling","cs101"),
        Book("Percy Jackson","Rick Riodon","cs102"),
        Book("Famous Five","Enid Blyton","cs103"),

    )

    def addBook(book:Book):Unit={
        library+=book
        println(s"Book '${book.title}' added to the library.")
    }

    def removeBook(isbn:String):Unit={
        val bookDel = library.find(_.isbn == isbn)
        bookDel match{
            case Some(book) =>
                library -= book
                println(s"Book '${book.title}' removed from the library.")
            case None => println(s"No book found with ISBM $isbn.")
        }
    }
    def isBookInLibrary(isbn:String): Unit={
        if(library.exists(_.isbn == isbn)) println(s"Book $isbn exits.")
        else println(s"Book $isbn doesnt exist.")
    }

    def displayLibrary(): Unit = {
    println("Current Library Collection:")
    library.foreach { book =>
      println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
    }
  }

  def searchByTitle(title: String): Unit = {
    val bookOption = library.find(_.title.equalsIgnoreCase(title))
    bookOption match {
      case Some(book) =>
        println(s"Book Found: Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      case None =>
        println(s"No book found with title '$title'.")
    }
  }

  def displayBooksByAuthor(author: String): Unit = {
    val booksByAuthor = library.filter(_.author.equalsIgnoreCase(author))
    if (booksByAuthor.nonEmpty) {
      println(s"Books by $author:")
      booksByAuthor.foreach { book =>
        println(s"Title: ${book.title}, ISBN: ${book.isbn}")
      }
    } else {
      println(s"No books found by author '$author'.")
    }
  }


  def main(args: Array[String]): Unit = {
    // Display initial library collection
    displayLibrary()

    // Add a new book
    val newBook = Book("Brave New World", "Aldous Huxley", "cs104")
    addBook(newBook)

    // Display library after adding a book
    displayLibrary()

    // Remove a book by ISBN
    removeBook("cs103")

    // Display library after removing a book
    displayLibrary()

    // Check if a book is in the library by ISBN
    println(s"Is book with ISBN cs101 in library? ${isBookInLibrary("cs101")}")

    // Search for a book by title
    searchByTitle("Percy Jackson")

    // Display all books by a specific author
    displayBooksByAuthor("J.K.Rowling")
  }

}