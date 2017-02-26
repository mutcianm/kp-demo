import org.scalatest.FlatSpec


class MetaSpec extends FlatSpec {
  import scala.meta._
  it should "transform inline syntax" in {
    val input = t"Either[Int, +?]"
    val expected = "({ type Λ[+β] = Either[Int, β] })#Λ"
    val result = TreeTransformer.transform(input)
    assert(result.toString() == expected)
  }
}
