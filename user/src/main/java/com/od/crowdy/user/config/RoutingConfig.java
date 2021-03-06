package com.od.crowdy.user.config;

import com.od.crowdy.user.handler.AuthHandler;
import com.od.crowdy.user.handler.UserHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
@RequiredArgsConstructor
public class RoutingConfig {

    @Bean
    RouterFunction<ServerResponse> routes(UserHandler userHandler, AuthHandler authHandler) {
        return route(GET("/users/project/{" + UserHandler.PROJECT_ID + "}"), userHandler::getAuthorByProjectId)
            .andRoute(GET("/users/like/projects/{" + UserHandler.PROJECT_ID + "}"), userHandler::getUserLikesByProjectId)
            .andRoute(POST("/users"), userHandler::saveUser)
            .andRoute(POST("/login"), authHandler::login)
            .andRoute(POST("/register"), authHandler::register)
            .andRoute(GET("/users/{" + UserHandler.USER_ID + "}/followers"), userHandler::getFollowersByUserId)
            .andRoute(GET("/users/comment/{" + UserHandler.COMMENT_ID + "}"), userHandler::getAuthorByCommentId)
            .andRoute(GET("/users/{" + UserHandler.USER_ID + "}"), userHandler::getUserById)
            .andRoute(GET("/users/profiles/{" + UserHandler.USER_ID + "}"), userHandler::getUserProfileById);
    }
}
