/**
 * Created by user on 8/8/16.
 */

class KotlinInputStream(val buffer: ByteArray) {
    var pos = 0

    fun read(): Byte {
        pos += 1
        return buffer[pos - 1]
    }

    fun isAtEnd(): Boolean {
        return pos >= buffer.size
    }
}