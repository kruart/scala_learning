object TrafficLightColor1 extends Enumeration {
  val Red, Yellow, Green = Value
}

TrafficLightColor1.Red
TrafficLightColor1.Red.id

object TrafficLightColor2 extends Enumeration {
  val Red = Value(0, "Stop")
  val Yellow = Value(10) // Name "Yellow"
  val Green = Value("Go") // ID 11
}

import TrafficLightColor2._

Red
Yellow
Green
Green.id

object TrafficLightColor3 extends Enumeration {
  type TrafficLightColor3 = Value
  val Red, Yellow, Green = Value
}

import TrafficLightColor3._

def doWhat(color: TrafficLightColor3) = {
  if (color == TrafficLightColor3.Red) "stop"
  else if (color == TrafficLightColor3.Yellow) "hurry up"
  else "go"
}

doWhat(TrafficLightColor3.Yellow)

for (c <- TrafficLightColor3.values) println(s"${c.id}: $c")

TrafficLightColor3(0)
TrafficLightColor3.withName("Red")