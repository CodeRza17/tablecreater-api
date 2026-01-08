package com.rcompany.tablecreater.service.impl;

import com.rcompany.tablecreater.dtos.costumer.CustomerCreateDto;
import com.rcompany.tablecreater.models.Columns;
import com.rcompany.tablecreater.models.Customer;
import com.rcompany.tablecreater.repository.ColumnsRepository;
import com.rcompany.tablecreater.repository.CustomerRepository;
import com.rcompany.tablecreater.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final ColumnsRepository columnsRepository;
    private final ModelMapper modelMapper;
    @Override
    public void createCustomer(CustomerCreateDto customerCreateDto) {
        Customer customer = new Customer();
        customer.setName(customerCreateDto.getName());
        customer.setPhoneNumber(customerCreateDto.getPhoneNumber());

        List<Columns> columns = new ArrayList<>();
        for (Long id : customerCreateDto.getColumnsIdList()){
            Columns column = columnsRepository.findById(id)
                    .orElseThrow(() -> new IllegalArgumentException("Column not found"));
            columns.add(column);
        }
        customer.setColumns(columns);
        customerRepository.save(customer);
    }
}
