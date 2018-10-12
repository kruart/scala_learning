abstract class UndoableAction (val description: String) {
  def undo(): Unit
  def redo(): Unit
}

object DoNothingAction extends UndoableAction("Do nothing") {
  override def undo(): Unit = {}
  override def redo(): Unit = {}
}

//// Open and save methods not yet implemented
val actions = Map("open" -> DoNothingAction, "save" -> DoNothingAction)