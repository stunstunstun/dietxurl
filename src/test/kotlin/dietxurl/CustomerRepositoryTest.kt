package dietxurl

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.data.r2dbc.DataR2dbcTest
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate
import reactor.test.StepVerifier
import java.util.*

@DataR2dbcTest
internal class CustomerRepositoryTest @Autowired constructor(
    private val customerRepository: CustomerRepository,
    private val r2dbcEntityTemplate: R2dbcEntityTemplate
) {
    @BeforeEach
    fun before() {
        // TODO
    }

    private fun generateCustomer(id: Long? = null): Customer {
        return Customer(
            id = id,
            firstName = UUID.randomUUID().toString(),
            lastName = UUID.randomUUID().toString()
        )
    }

    @Test
    fun `Testing CRUD`() {
        val customer = generateCustomer()
        customerRepository.save(customer)
            .`as` { StepVerifier.create(it) }
            .expectNextCount(1)
    }
}