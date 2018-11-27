package devInsideYou.YFPL.v14_seven_segment_display_clock

import java.util.{Timer, TimerTask}

import scala.concurrent.duration.FiniteDuration

object Scala {
  def tickUntilEnterIsPressed(interval: FiniteDuration)(someCode: => Unit) = {
    val timer: Timer = new Timer

    val delayInMilliseconds: Long = 0
    val periodInMilliseconds: Long = interval.toMillis
    val timerTask: TimerTask = new TimerTask {
      override def run(): Unit = {
        someCode
      }
    }

    timer.scheduleAtFixedRate(
      timerTask,
      delayInMilliseconds,
      periodInMilliseconds
    )

    io.StdIn.readLine //block current Thread until ENTER is pressed
    timer.cancel()
  }

  def loop(times: Int)(someCode: => Unit) = {
    1 to times foreach { _ =>
      someCode
    }
  }

  def wait(delay: FiniteDuration): Unit = {
    Thread.sleep(delay.toMillis)
  }

}
