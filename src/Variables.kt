fun main (args : Array<String>) {
    //Variables declared with val have fixed value this values cannot be changed (immutable)
    val pi = 3.14
    val name = "Kotlin"

    //Variables declared with var have variable value this values can be changed (mutable)
    var test = "this a test"
    println(test)
    test = "this is second test"
    println(test)

    //the below statement if uncommented will give an error because name is immutable
    //name = "Java"
    print(pi)
    print(name)
}