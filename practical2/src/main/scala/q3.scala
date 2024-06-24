object q3 extends App{
    val takeHome = takeHomeSalary(40,30)
    println(takeHome)
}


def salary(normal:Double,ot:Double): Double={
     250*normal+85*ot
}

def tax(normal:Double,ot:Double):Double ={
    salary(normal,ot)*0.12
}

def takeHomeSalary(normal:Double,ot:Double):Double={
    salary(normal,ot)-tax(normal,ot)
    
}