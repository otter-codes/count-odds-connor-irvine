import org.scalatest._

class CountOdds extends WordSpec with MustMatchers {

  "CountOdds" must {

    "return 1 when given an input of 2" in {
      CountOdds.input mustEqual 1
    }

  }

}
