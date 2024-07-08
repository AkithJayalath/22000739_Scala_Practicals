object q1 {
  // Sample arrays for item names and quantities
  var itemNames = Array("apple", "banana", "orange")
  var itemQuantities = Array(50, 20, 30)

  // Function to display the inventory
  def displayInventory(names: Array[String], quantities: Array[Int]): Unit = {
    println("Inventory:")
    for ((name, quantity) <- names.zip(quantities)) {
      println(s"$name: $quantity")
    }
    println()  // for an extra line break
  }

  // Function to restock an item
  def restockItem(names: Array[String], quantities: Array[Int], itemName: String, quantity: Int): Unit = {
    val index = names.indexOf(itemName)
    if (index != -1) {
      quantities(index) += quantity
      println(s"$quantity $itemName(s) added. New quantity: ${quantities(index)}")
    } else {
      println(s"Item '$itemName' does not exist in the inventory.")
    }
  }

  // Function to sell an item
  def sellItem(names: Array[String], quantities: Array[Int], itemName: String, quantity: Int): Unit = {
    val index = names.indexOf(itemName)
    if (index != -1) {
      if (quantities(index) >= quantity) {
        quantities(index) -= quantity
        println(s"$quantity $itemName(s) sold. New quantity: ${quantities(index)}")
      } else {
        println(s"Not enough $itemName in the inventory to sell.")
      }
    } else {
      println(s"Item '$itemName' does not exist in the inventory.")
    }
  }

  // Main method to test the functions
  def main(args: Array[String]): Unit = {
    displayInventory(itemNames, itemQuantities)
    restockItem(itemNames, itemQuantities, "banana", 10)
    sellItem(itemNames, itemQuantities, "apple", 20)
    displayInventory(itemNames, itemQuantities)
    sellItem(itemNames, itemQuantities, "grape", 5)
  }
}
