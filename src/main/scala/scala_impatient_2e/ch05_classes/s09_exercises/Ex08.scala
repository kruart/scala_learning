package scala_impatient_2e.ch05_classes.s09_exercises

/**
  * Make a class Car with read-only properties for manufacturer, model name, and model year, and a read-write property for the license plate.
  * Supply four constructors. All require the manufacturer and model name.
  * Optionally, model year and license plate can also be specified in the constructor.
  * If not, the model year is set to -1 and the license plate to the empty string.
  * Which constructor are you choosing as the primary constructor? Why?
  */
class Car(
           private var manufacturer: String,
           private var modelName: String,
           private var modelYear: Int = -1,
           private var licensePlate: String = ""
         )

