package com.springprojects.msscbrewery.services;

import com.springprojects.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(customerId)
                .name("Rohan")
                .build();
    }

    @Override
    public CustomerDto addCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        // todo - would implement a proper customer update method.
    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        log.debug("Deleted a customer with id {}", customerId);
    }
}
