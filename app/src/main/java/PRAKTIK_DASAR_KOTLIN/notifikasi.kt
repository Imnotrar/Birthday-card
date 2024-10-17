package PRAKTIK_DASAR_KOTLIN

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages < 100) {
        println("Anda mempunyai ${numberOfMessages} notifikasi.")
    } else {
        println("Ponsel Anda berdering! Anda memiliki 99+ notifikasi.")
    }
}