package devInsideYou.YFPL.v16_inheritance

trait Device {
  def wattsPerSecond: Int

  private[this] var _isOn: Boolean = false
  def isOn: Boolean = _isOn
  protected[this] def isOn_=(newValue: Boolean): Unit = {
    this._isOn = newValue
  }

  def isOff: Boolean = !isOn
  protected[this] def isOff_=(newValue: Boolean): Unit = {
    isOn = !newValue
  }

  final def turnOn(): Unit = {
    if (isOff) {
      isOn = true
      actuallyTrunOn()
    }
    else sys.error("already on")
  }
  
  protected[this] def actuallyTrunOn(): Unit

  final def turnOff(): Unit = {
    if (isOn){
      isOff = true
      actuallyTrunOff()
    }
    else sys.error("already off")
  }

  protected[this] def actuallyTrunOff(): Unit
}
