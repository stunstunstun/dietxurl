package dietxurl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController @Autowired constructor(
    private val customerService: CustomerService
) {
    @PostMapping("/api/v1/customers")
    suspend fun createCustomer(@RequestBody customer: Customer): ResponseEntity<Customer> {
        val it = customerService.registerCustomer(customer)
        return ResponseEntity(it, HttpStatus.CREATED)
    }
}