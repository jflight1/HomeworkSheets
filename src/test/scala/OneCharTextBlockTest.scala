import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class OneCharTextBlockTest extends AnyFlatSpec with should.Matchers {

  "toString" should "work" in {
    val tb = new OneCharTextBlock('a', 2, 3)
    tb.toString should be("aa\naa\naa")
    println(tb.toString)
  }

}
