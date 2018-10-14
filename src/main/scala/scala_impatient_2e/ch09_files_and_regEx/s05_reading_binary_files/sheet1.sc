import java.io.{File, FileInputStream}

val file = new File(getClass.getClassLoader.getResource("testfile.txt").getPath)
val in = new FileInputStream(file)
val bytes = new Array[Byte](file.length.toInt)
in.read(bytes)
in.close()