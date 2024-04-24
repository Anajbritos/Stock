package io.ana.julia.stock.utils;

import io.ana.julia.stock.data.dto.UserDto;
import io.ana.julia.stock.data.entity.UserEntity;
import io.ana.julia.stock.data.entity.UserEntityType;
import org.junit.jupiter.api.Assertions;

public class AssertsUtils {

    public static void assertDto(UserDto userDto, UserEntity userEntity) {
        Assertions.assertEquals(userDto.getId(),userEntity.getId());
        Assertions.assertEquals(userDto.getName(),userEntity.getName());
        Assertions.assertEquals(userDto.getCpf(),userEntity.getCpf());
        Assertions.assertEquals(userDto.getEmail(),userEntity.getEmail());
        Assertions.assertEquals(userDto.getPassword(),userEntity.getPassword());
        Assertions.assertEquals(userDto.getUserDtoType().name(),userEntity.getUserEntityType().name());
    }
}
