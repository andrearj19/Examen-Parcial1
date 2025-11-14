//Pregunta 1
def Lista(datos: List[Double]): Double = {
  val promedio = datos.sum / datos.size

  val sumaCuadrados = datos
    .map(d => math.pow(d - promedio, 2))
    .sum

  math.sqrt(sumaCuadrados / datos.size)
}

val datos = List(10.0, 5.10, 8.70, 7.90, 9.20)
val resultado = Lista(datos)

//Pregunta 2
def transformarCalif(calificaciones: List[Double], n: Double => Double): List[Double] = {
  calificaciones.map(n)
}
val redondear = transformarCalif(List(66.4, 69.8, 79.8), nota => math.round(nota).toDouble)
val bonificadas = transformarCalif(List(70.0, 85.5, 98.0), nota => math.min(nota + 5, 100))
val disminuir = transformarCalif(List(88.0, 92.0, 97.0), nota => if (nota > 90) nota * 0.97 else nota)

//Pregunta 3
val generadorSaludoAnonimo: String => String => String =
  fraseBase => nombre => s"$fraseBase, $nombre!"
  