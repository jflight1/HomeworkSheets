class TextGrid(val textBlocks: Seq[Seq[TextBlock]]) {

  def this(columns: Int, rows: Int, textBlockGetter: () => TextBlock) = {

    this(Seq.fill[Seq[TextBlock]](rows)(
      Seq.fill[TextBlock](columns)(textBlockGetter())))
  }

  override def toString: String = {

    val verticalTextBlocks: Seq[TextBlock] = textBlocks
      .map(horizontalTextBlocks => TextBlock.appendHorizontally(horizontalTextBlocks))

    val oneTextBlock = TextBlock.appendVertically(verticalTextBlocks)
    oneTextBlock.toString
  }
}
