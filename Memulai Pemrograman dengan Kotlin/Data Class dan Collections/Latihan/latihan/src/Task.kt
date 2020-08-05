/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah struktur kode yang sudah ada. Kecuali:
 *    - Untuk melakukan improvisasi kode
 *    - Mengikuti perintah yang ada
 *
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */

fun main() {

    // TODO 1
    val vehicle = mapOf<String, String>("type" to "Motorcycle", "maxSpeed" to "230", "maxTank" to "10")

    // TODO 2
    val type = vehicle["type"]
    val maxSpeed = vehicle["maxSpeed"]+"Km/s"
    val maxTank = vehicle["maxTank"]+"Ltr"

    // TODO 3
    println("""
    Vehicle
    Type: $type
    Maximal Speed: $maxSpeed
    Maximal Tank: $maxTank
""".trimIndent())
}