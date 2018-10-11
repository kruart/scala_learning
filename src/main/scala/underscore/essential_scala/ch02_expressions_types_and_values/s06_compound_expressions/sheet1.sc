if (1 < 2) "Yes" else "No"
if (1 < 2) println("Yes") else println("No")

//block expressions
{1;2;3} //return 3  and show warning

{
  println("This is a side-effect")
  println("This is a side-effect as well")
  3
}

def name: String = {
  val title = "Professor"
  val name = "Funkenstein"
  title + " " + name
}

//exercises
//1. A Classic Rivalry
if(1 > 2) "alien" else "predator" //type String & String == String

//2. A Less Well Known Rivalry
if(1 > 2) "alien" else 2001   //type String & Int == Any

//3. An if Without an else
if(1 > 2) "alien" else 2001   //type String & () == Any