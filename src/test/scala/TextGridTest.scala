import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class TextGridTest extends AnyFlatSpec with should.Matchers {

  "TextGrid" should "work" in {
    val a = "abcd"

    val tb = new TextBlock(Seq(a, a, a))

    val textGrid = new TextGrid(Seq(
      Seq(tb, tb, tb, tb, tb),
      Seq(tb, tb, tb, tb, tb)))

    println(textGrid)
  }

}