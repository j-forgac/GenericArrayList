import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ArrayListBootlegTest {
    private val arrayInt =  ArrayListBootleg<Int>(arrayOf(1,4,1,-3))
    private val arrayString =  ArrayListBootleg<String>(arrayOf("c","aba","i","ca","bu"))
    private val arrayFloat =  ArrayListBootleg<Float>(arrayOf(2f,-100f, 34944043084f))
    private val arrayEmpty = ArrayListBootleg<Int>(emptyArray())

    @Test
    fun testSize() {
        assertEquals(arrayString.size,5)
        assertEquals(arrayFloat.size,3)
    }

    @Test
    fun testIsEmpty() {
        assertFalse(arrayInt.isEmpty)
        assertTrue(arrayEmpty.isEmpty)
    }

    @Test
    fun testContains() {
        assertFalse(arrayInt.contains(-33))
        assertTrue(arrayString.contains("c"))
    }

    @Test
    fun testGet() {
        assertEquals(arrayString.get(0),"c")
        assertEquals(arrayFloat.get(2),34944043084f)
    }

    @Test
    fun testIndexOf() {
        assertEquals(arrayInt.indexOf(1),0)
        assertEquals(arrayFloat.indexOf(-100f),1)
    }

    @Test
    fun testLastIndexOf() {
        assertEquals(arrayInt.lastIndexOf(1),2)
        assertEquals(arrayFloat.lastIndexOf(-100f),1)
    }
}