package com.od.crowdy.shared.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BackOption {
    private String id;
    private String pledge;
    private String reward;
    private Integer backers;
}
