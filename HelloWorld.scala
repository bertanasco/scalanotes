import java.util.{Date, Locale};
object HelloWorld
{
	def main (args : Array[String]){
		val now = new Date();
		println(now.toString());
		println("Hello World");
	}
}