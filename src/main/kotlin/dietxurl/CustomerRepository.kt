package dietxurl

import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface CustomerRepository: ReactiveCrudRepository<Customer, Long> {
}