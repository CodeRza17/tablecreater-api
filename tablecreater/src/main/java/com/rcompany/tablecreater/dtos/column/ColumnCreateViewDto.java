package com.rcompany.tablecreater.dtos.column;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ColumnCreateViewDto {
    private List<String> types;

}
