import org.scalatest._

class CountOddsSpec extends WordSpec with MustMatchers {

  "CountOdds" must {

    "return 1 when given an input of 2" in {
      CountOdds.counter(2) mustEqual 1
    }

    "return 4 when given an input of 8" in {
      CountOdds.counter(8) mustEqual 4
    }

    "return 3 when given an input of 7" in {
      CountOdds.counter(7) mustEqual 3
    }
  }

}
