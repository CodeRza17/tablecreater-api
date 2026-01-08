package com.rcompany.tablecreater.dtos.costumer;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerCreateDto {
    private String name;
    private String phoneNumber;
    private List<Long> columnsIdList;
}
