class OneCharTextBlock(c: Char, width: Int, height: Int)
  extends TextBlock(OneCharTextBlock.toStrings(c, width, height))

object OneCharTextBlock {
  def toStrings(c: Char, width: Int, height: Int): Seq[String] = {
    Seq.fill(height)(c.toString * width)
  }
}
