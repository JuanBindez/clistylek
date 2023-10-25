package clistylek

class Color {
    // Cores ANSI
    private val RESET = "\u001B[0m"
    private val RED = "\u001B[31m"
    private val GREEN = "\u001B[32m"
    private val YELLOW = "\u001B[33m"
    private val BLUE = "\u001B[34m"
    private val PURPLE = "\u001B[35m"
    private val CYAN = "\u001B[36m"
    private val WHITE = "\u001B[37m"

    fun red(text: String): String {
        return "$RED$text$RESET"
    }

    fun green(text: String): String {
        return "$GREEN$text$RESET"
    }

    fun yellow(text: String): String {
        return "$YELLOW$text$RESET"
    }

    fun blue(text: String): String {
        return "$BLUE$text$RESET"
    }

    fun purple(text: String): String {
        return "$PURPLE$text$RESET"
    }

    fun cyan(text: String): String {
        return "$CYAN$text$RESET"
    }

    fun white(text: String): String {
        return "$WHITE$text$RESET"
    }
}
