class ArrayListBootleg<T>(private var array: Array<Any?> = arrayOfNulls(0)) {


    var size = array.size
    val isEmpty : Boolean
        get() = size == 0

    fun add(element: T) {
        if (size == array.size) expandArr()
        array[size] = element
        size++
    }

    fun set(index: Int, element: T) {
        if (index < 0 || index >= size) throw IndexOutOfBoundsException("Index $index out of bounds for length $size")
        else {
            if (size == array.size) expandArr()
            array[index] = element
        }
    }

    fun contains(element: T): Boolean =
        element in array

    fun get(index: Int): T {
        return if(index < 0 || index>=size) throw IndexOutOfBoundsException("LMAO Index $index out of bounds for length $size")
        else array[index]!! as T
    }

    fun indexOf(element: T): Int =
        array.indexOf(element)

    fun lastIndexOf(element: T): Int =
        array.lastIndexOf(element)

    fun toArray(): Array<Any?>{
        val arr = arrayOfNulls<Any>(size)
        for(i in 0 until size){
            arr[i] = array[i]!!
        }
        return arr
    }

    private fun expandArr(){
        val buffer = array.copyOf()
        array = Array(size * 3 / 2) { null }
        buffer.forEachIndexed { newIndex, i ->  array[newIndex] = i}
    }
}