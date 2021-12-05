package dietxurl

import kotlinx.coroutines.reactor.awaitSingle
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerService @Autowired constructor(
    private val customerRepository: CustomerRepository
) {
    private val logger = LoggerFactory.getLogger(CustomerService::class.java)

    suspend fun registerCustomer(customer: Customer): Customer {
        logger.info("register a customer")
        return customerRepository.save(customer).awaitSingle()
    }
}