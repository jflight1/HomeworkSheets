import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

import scala.collection.immutable.Seq

class PaddedTextBlockTest extends AnyFlatSpec with should.Matchers {

  "toString" should "work" in {
    val tb = new PaddedTextBlock(6, 5, 2, 1, Seq("a", "bb", "ccc"))
    tb.toString should be("      \n   a  \n  bb  \n ccc  \n      ")
    println(tb.toString)
  }


  "toString2" should "work2" in {
    val tb = new PaddedTextBlock(6, 5, 2, 1, Seq("3", "+ 5", "---"))
    println(tb.toString)
  }

}
