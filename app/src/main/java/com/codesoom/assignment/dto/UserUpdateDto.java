package com.codesoom.assignment.dto;

import com.codesoom.assignment.domain.UserUpdateRequest;
import com.github.dozermapper.core.Mapping;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

/**
 * 사용자 수정정보를 표현합니다.
 */
@Getter
@Builder
public class UserUpdateDto implements UserUpdateRequest {
    @NotBlank
    @Mapping("name")
    private String name;

    @NotBlank
    @Mapping("password")
    private String password;

    public UserUpdateDto() {}

    @Builder
    public UserUpdateDto(String name, String password) {
        this.name = name;
        this.password = password;
    }
}