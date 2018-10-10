val symbols = Array("<", "-", ">")
val counts = Array(2, 10, 2)
val pairs = symbols.zip(counts)

for ((s, n) <- pairs) print(s * n) // <<---------->>

val names = Array("Alice", "Bob", "Cindy")
val nums = Array(1, 3, 7)

names.zip(nums).toMap