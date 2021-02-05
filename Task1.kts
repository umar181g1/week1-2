fun main() {

    val nilai = tampilkan(72.0, 90.0)
    println(nilai)
}


fun tampilkan(nilai1:Double, nilai2: Double):String = """
    Nilai 1 : $nilai1
    Nilai 2 : $nilai2
""".trimIndent()