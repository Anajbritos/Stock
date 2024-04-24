package io.ana.julia.user.api.utils;

import io.ana.julia.user.api.data.dto.UserDto;
import io.ana.julia.user.api.data.dto.UserDtoType;
import io.ana.julia.user.api.data.entity.UserEntity;
import io.ana.julia.user.api.data.entity.UserEntityType;

public class DataFactory {

    public static UserDto getDtoData() {
        return new UserDto(
                1L,
                "Ana Julia",
                "123.456.789",
                "anajulia@gmail.com",
                "123456789",
                UserDtoType.ADMIN
        );
    }

    public static UserEntity getEntityData() {
        return new UserEntity(
                1L,
                "Ana Julia",
                "123.456.789",
                "anajulia@gmail.com",
                "123456789",
                UserEntityType.ADMIN
        );
    }
}
