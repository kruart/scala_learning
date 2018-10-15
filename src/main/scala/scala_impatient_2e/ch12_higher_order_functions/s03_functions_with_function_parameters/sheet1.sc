import scala.math._

def valueAtOneQuarter(f: (Double) => Double) = f(0.25)
valueAtOneQuarter(ceil _) //1.0
valueAtOneQuarter(sqrt _) //0.5

//return function
def mulBy(factor: Double) = (x: Double) => factor * x
//val quintuple = mulBy(5)
//quintuple(20) //100
mulBy(5)(20)
