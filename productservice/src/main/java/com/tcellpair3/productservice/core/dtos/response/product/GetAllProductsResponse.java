package com.tcellpair3.productservice.core.dtos.response.product;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetAllProductsResponse {

    private int id;

    private int productNo;

    private double price;

    private String name;

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

    private boolean isDeleted;

    private int catalogId;
}
