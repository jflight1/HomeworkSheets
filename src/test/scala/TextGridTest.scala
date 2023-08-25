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

  "toString" should "work" in {
    def tb(c: Char) = new OneCharTextBlock(c, 5,4)

    val textGrid = new TextGrid(Seq(
      Seq(tb('a'), tb('b'), tb('c')),
      Seq(tb('d'), tb('e'), tb('f')),
      Seq(tb('g'), tb('h'), tb('i')),
      Seq(tb('j'), tb('k'), tb('l'))))

    println(textGrid)
  }

}