package com.rcompany.tablecreater.dtos.column;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ColumnReadDto {
    private Long id;
    private String columnName;
    private String columnType;
}
