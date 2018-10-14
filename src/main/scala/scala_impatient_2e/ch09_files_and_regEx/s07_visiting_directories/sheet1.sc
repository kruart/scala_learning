import java.nio.file._

var dirname: String = "/home/<HOME_DIR>/Downloads"
val entries = Files.walk(Paths.get(dirname)) // or Files.list
try {
  entries.forEach(p => println(p))
} finally {
  entries.close()
}