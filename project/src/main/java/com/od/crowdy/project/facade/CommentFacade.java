package com.od.crowdy.project.facade;

import com.od.crowdy.project.dto.CommentDto;
import com.od.crowdy.project.dto.CommentSaveRequest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CommentFacade {
    Flux<CommentDto> getCommentsByProjectId(String projectId);

    Mono<CommentDto> saveComment(Mono<CommentSaveRequest> commentSaveRequest);
}
