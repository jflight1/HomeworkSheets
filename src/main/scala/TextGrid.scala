class TextGrid(val textBlocks: Seq[Seq[TextBlock]]) {

  def this(width: Int, height: Int, textBlockGetter: () => TextBlock) = {

    this(Seq.fill[Seq[TextBlock]](height)(
      Seq.fill[TextBlock](width)(textBlockGetter())))
  }

  override def toString: String = {

    val verticalTextBlocks: Seq[TextBlock] = textBlocks
      .map(horizontalTextBlocks => TextBlock.appendHorizontally(horizontalTextBlocks))

    val oneTextBlock = TextBlock.appendVertically(verticalTextBlocks)
    oneTextBlock.toString
  }
}
