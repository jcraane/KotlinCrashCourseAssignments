package course.assignments.solutions

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.seconds
import kotlin.time.ExperimentalTime

private val delay = 1.seconds

@OptIn(ExperimentalTime::class)
fun main() = runBlocking<Unit> {
    /* Write code between these comments */
    /* Write code between these comments */
}

@OptIn(ExperimentalTime::class)
suspend fun getCustomer(id: Int): Customer {
    delay(delay) // simulate some long running operation
    // in real-world scenario, you might fetch customer info from a remote API or database
    return Customer(id, "John Doe")
}

@OptIn(ExperimentalTime::class)
suspend fun getCustomerOrders(customerId: Int): List<Order> {
    if (customerId == 3) throw RuntimeException("Customer not found")

    delay(delay) // simulate some long running operation
    // in real-world scenario, you might fetch customer orders from a remote API or database
    return listOf(Order("Order 1"), Order("Order 2"), Order("Order 3"))
}

data class Customer(val id: Int, val name: String)

data class Order(val name: String)
