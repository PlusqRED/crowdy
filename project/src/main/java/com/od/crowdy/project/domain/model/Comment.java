package com.od.crowdy.project.domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("comment")
public class Comment extends com.od.crowdy.shared.domain.model.Comment {
    @Id
    @Override
    public String getId() {
        return super.getId();
    }
}
