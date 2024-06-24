object q4 extends App {
    val profitt = profit(35)
    println("Profit is " + profitt )
}




def attendees(t: Double): Double = {
   120+(15-t)/5*20
}

def revenue(t: Double): Double = {
   attendees(t)*t
}

def cost(t: Double): Double = {
   500+attendees(t)*5
}

def profit(t: Double): Double = {
   revenue(t)-cost(t)
}