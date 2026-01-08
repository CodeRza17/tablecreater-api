package com.rcompany.tablecreater.service;

import com.rcompany.tablecreater.dtos.costumer.CustomerCreateDto;

public interface CustomerService {
    void createCustomer(CustomerCreateDto customerCreateDto);
}
