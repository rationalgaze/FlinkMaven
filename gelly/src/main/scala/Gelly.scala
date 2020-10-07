import org.apache.flink.api.scala.{DataSet, ExecutionEnvironment}
import org.apache.flink.graph.Vertex
import org.apache.flink.types.NullValue

object Gelly {
  def main(args: Array[String]): Unit = {
    val env = ExecutionEnvironment.getExecutionEnvironment
    val v1 = new Vertex(1L, "foo")
    val v2 = new Vertex(2L, "foo")
    val v3 = new Vertex(3L, "foo")
    val v4 = new Vertex(4L, "foo")
    val vertices:DataSet[Vertex[String, Long]] = new DataSet[Vertex[String, Long]](null)
  }
}