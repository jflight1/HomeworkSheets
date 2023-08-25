class TextBlock(val strings: Seq[String]) {

  val width: Int = strings.head.length
  val height: Int = strings.length

  // all strings must be the same length
  if (strings.size > 1)
    strings.tail.foreach(s => assert(s.length == width, "widths don't match"))


  def appendHorizontally(that: TextBlock): TextBlock = {
    assert(this.height == that.height, "heights don't match")
    val stringTuples: Seq[(String, String)] = this.strings zip that.strings
    val newStrings: Seq[String] = stringTuples.map(stringTuple => stringTuple._1 + stringTuple._2)
    new TextBlock(newStrings)
  }

  def appendVertically(that: TextBlock): TextBlock = {
    new TextBlock(this.strings ++ that.strings)
  }

  override def toString: String = {
    if (strings.size == 1)
      strings.head
    else
      strings.head + '\n' + new TextBlock(strings.tail).toString
  }
}

object TextBlock {
  def appendHorizontally(textBlocks: Seq[TextBlock]): TextBlock = {
    if (textBlocks.size == 1)
      textBlocks.head
    else
      textBlocks.head.appendHorizontally(
        TextBlock.appendHorizontally(textBlocks.tail))
  }

  def appendVertically(textBlocks: Seq[TextBlock]): TextBlock = {
    if (textBlocks.size == 1)
      textBlocks.head
    else
      textBlocks.head.appendVertically(
        TextBlock.appendVertically(textBlocks.tail))
  }
}
