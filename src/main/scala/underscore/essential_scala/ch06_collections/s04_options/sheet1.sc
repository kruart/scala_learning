def readInt(str: String): Option[Int] =
  if(str matches "-?\\d+") Some(str.toInt) else None

readInt("123")  //Option[Int] = Some(123)
readInt("abc")  //Option[Int] = None

readInt("123").getOrElse(0) //123
readInt("abc").getOrElse(0) //0


readInt("123") match {
  case Some(number) => number + 1
  case None         => 0
}


def sum(optionA: Option[Int], optionB: Option[Int]): Option[Int] =
  optionA.flatMap(a => optionB.map(b => a + b))

sum(readInt("1"), readInt("2")) // Option[Int] = Some(3)
sum(readInt("1"), readInt("b")) // Option[Int] = None
sum(readInt("a"), readInt("2")) //Option[Int] = None
sum(readInt("a"), readInt("2")).getOrElse(0) //0

//exercises
//1 Adding Things
def addOptions(opt1: Option[Int], opt2: Option[Int]) =
  for {
    a <- opt1
    b <- opt2
  } yield a + b

def addOptions2(opt1: Option[Int], opt2: Option[Int]) =
  opt1.flatMap { a =>
    opt2.map { b =>
      a + b
    }
  }

//2 Adding All of the Things
def addOptions(opt1: Option[Int], opt2: Option[Int], opt3: Option[Int]) =
  for {
    a <- opt1
    b <- opt2
    c <- opt3
  } yield a + b + c

def addOptions2(opt1: Option[Int], opt2: Option[Int], opt3: Option[Int]) =
  opt1 flatMap { a =>
    opt2 flatMap { b =>
      opt3 map { c =>
        a + b + c
      }
    }
  }