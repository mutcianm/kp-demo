import org.scalatest.FlatSpec


class MetaSpec extends FlatSpec {
  import scala.meta._
  it should "transform inline syntax" in {
    val input = t"Either[Int, +?]"
    val expected = t"({ type Λ[+β] = Either[Int, β] })#Λ"
    val result = TreeTransformer.transform(input)
    assert(result.syntax == expected.syntax)
  }
}
