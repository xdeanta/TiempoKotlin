import org.jsoup.Jsoup
import org.jsoup.nodes.Document
object Tiempo {
    val doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").userAgent("Mozilla").get()
    var clima = doc.getElementsByClass("today_nowcard-temp")
    var temperatura: String = clima.text()
    var titulo: String = doc.title()
    var condicion = doc.getElementsByClass("today_nowcard-phrase")
    var scondicion = condicion.text()
}