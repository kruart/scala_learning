val numPattern = "[0-9]+".r
val wsnumwsPattern = """\s+[0-9]+\s+""".r
val wsnumwsPattern2 = "\\s+[0-9]+\\s+".r


for (matchString <- numPattern.findAllIn("99 bottles, 98 bottles")) println(matchString)

val matches = numPattern.findAllIn("99 bottles, 98 bottles").toArray
val firstMatch = wsnumwsPattern.findFirstIn("99 bottles, 98 bottles")

numPattern.replaceFirstIn("99 bottles, 98 bottles", "XX") // "XX bottles, 98 bottles"
numPattern.replaceAllIn("99 bottles, 98 bottles", "XX") // "XX bottles, XX bottles"
numPattern.replaceSomeIn("99 bottles, 98 bottles",
  m => if (m.matched.toInt % 2 == 0) Some("XX") else None) // "99 bottles, XX bottles"

val varPattern = """\$[0-9]+""".r

def format(message: String, vars: String*) =
  varPattern.replaceSomeIn(message, m => vars.lift(m.matched.tail.toInt))

format("At $1, there was $2 on $0.", "planet 7", "12:30 pm", "a disturbance of the force")
// At 12:30 pm, there was a disturbance of the force on planet 7.