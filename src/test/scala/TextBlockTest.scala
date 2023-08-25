import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class TextBlockTest extends AnyFlatSpec with should.Matchers {

  "toString" should "work" in {
    val a = "abcd"

    val tb = new TextBlock(Seq(a, a, a))

    tb.toString should be("abcd\nabcd\nabcd")
    println(tb.toString)
  }

  "appendHorizontally" should "work" in {
    val tb1 = new TextBlock(Seq("aaaa", "aaaa", "aaaa"))
    val tb2 = new TextBlock(Seq("bbbb", "bbbb", "bbbb"))

    val tb3 = tb1.appendHorizontally(tb2)
    tb3.toString should be("aaaabbbb\naaaabbbb\naaaabbbb")
    println(tb3.toString)
  }

  "TextBlock.appendHorizontally" should "work" in {
    val tb1 = new TextBlock(Seq("aaaa", "aaaa", "aaaa"))
    val tb2 = new TextBlock(Seq("bbbb", "bbbb", "bbbb"))
    val tb3 = new TextBlock(Seq("cccc", "cccc", "cccc"))

    val tb4 = TextBlock.appendHorizontally(Seq(tb1, tb2, tb3))
    tb4.toString should be("aaaabbbbcccc\naaaabbbbcccc\naaaabbbbcccc")
    println(tb4.toString)
  }

}
