fun main() {
    print("Bitte gib eine ganze Zahl ein: ")
    var zahl = readLine()?.toInt()

    var summe = 0
    var aktuelleZahl = 1

    while (aktuelleZahl <= zahl) {
        summe += aktuelleZahl
        aktuelleZahl++
    }
    println("Die Summe aller natürlichen Zahlen von 1 bis $zahl ist: $summe")
}

