package com.nhom6.webbanhang.mapper;

import com.nhom6.webbanhang.dto.request.UserCreationRequest;
import com.nhom6.webbanhang.dto.request.UserUpdateRequest;
import com.nhom6.webbanhang.dto.response.UserResponse;
import com.nhom6.webbanhang.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    void updateUser(@MappingTarget User user, UserUpdateRequest request);
    UserResponse toUserResponse(User user);
}
