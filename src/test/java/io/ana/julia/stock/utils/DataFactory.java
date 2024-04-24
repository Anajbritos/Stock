package io.ana.julia.stock.utils;

import io.ana.julia.stock.data.dto.UserDto;
import io.ana.julia.stock.data.dto.UserDtoType;
import io.ana.julia.stock.data.entity.UserEntity;
import io.ana.julia.stock.data.entity.UserEntityType;

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
