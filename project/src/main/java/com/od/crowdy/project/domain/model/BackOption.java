package com.od.crowdy.project.domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("back_option")

public class BackOption extends com.od.crowdy.shared.domain.model.BackOption {
    @Id
    @Override
    public String getId() {
        return super.getId();
    }
}