object InventoryManagement {

  def main(args: Array[String]): Unit = {
    
    val inventory1: Map[String, (String, Int, Double)] = Map(
      "101" -> ("ProductA", 10, 15.0),
      "102" -> ("ProductB", 5, 25.0),
      "103" -> ("ProductC", 8, 20.0)
    )

    val inventory2: Map[String, (String, Int, Double)] = Map(
      "102" -> ("ProductB", 10, 22.0),
      "104" -> ("ProductD", 15, 30.0)
    )

    // I. Retrieve all product names from inventory1
    def getAllProductNames(inventory: Map[String, (String, Int, Double)]): Seq[String] = {
      inventory.values.map(_._1).toSeq
    }

    // II. Calculate the total value of all products in inventory1
    def getTotalValue(inventory: Map[String, (String, Int, Double)]): Double = {
      inventory.values.map { case (_, qty, price) => qty * price }.sum
    }

    // III. Check if inventory1 is empty
    def isInventoryEmpty(inventory: Map[String, (String, Int, Double)]): Boolean = {
      inventory.isEmpty
    }

    // IV. Merge inventory1 and inventory2, updating quantities and retaining the highest price
    def mergeInventories(
        inv1: Map[String, (String, Int, Double)], 
        inv2: Map[String, (String, Int, Double)]
    ): Map[String, (String, Int, Double)] = {
      (inv1.toSeq ++ inv2.toSeq)
        .groupBy(_._1)
        .map { case (id, values) =>
          val combined = values.map(_._2).reduce { case ((name, qty1, price1), (_, qty2, price2)) =>
            (name, qty1 + qty2, math.max(price1, price2))
          }
          id -> combined
        }
    }

    // V. Check if a product with a specific ID exists and print its details
    def checkProductExists(inventory: Map[String, (String, Int, Double)], productId: String): Unit = {
      inventory.get(productId) match {
        case Some((name, qty, price)) =>
          println(s"Product ID: $productId, Name: $name, Quantity: $qty, Price: $$price")
        case None =>
          println(s"Product ID: $productId does not exist in the inventory.")
      }
    }

    
    println("I. Product Names: " + getAllProductNames(inventory1))
    println("II. Total Value: $" + getTotalValue(inventory1))
    println("III. Is Inventory Empty: " + isInventoryEmpty(inventory1))

    val mergedInventory = mergeInventories(inventory1, inventory2)
    println("IV. Merged Inventory: " + mergedInventory)

    println("V. Check Product ID 102:")
    checkProductExists(inventory1, "102")
  }
}
