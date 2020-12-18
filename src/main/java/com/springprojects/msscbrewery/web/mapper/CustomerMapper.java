package com.springprojects.msscbrewery.web.mapper;

import com.springprojects.msscbrewery.domain.Customer;
import com.springprojects.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);
}
