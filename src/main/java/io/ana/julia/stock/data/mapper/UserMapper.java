package io.ana.julia.stock.data.mapper;

import io.ana.julia.stock.data.dto.UserDto;
import io.ana.julia.stock.data.dto.UserDtoType;
import io.ana.julia.stock.data.entity.UserEntity;
import io.ana.julia.stock.data.entity.UserEntityType;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDto toDto(UserEntity userEntity) {
        return new UserDto(
                userEntity.getCode(),
                userEntity.getName(),
                userEntity.getCpf(),
                userEntity.getEmail(),
                userEntity.getPassword(),
                toDtoType(userEntity.getUserEntityType())
        );
    }

    public UserEntity toEntity(UserDto userDto) {
        return new UserEntity(
                userDto.getCode(),
                userDto.getName(),
                userDto.getCpf(),
                userDto.getEmail(),
                userDto.getPassword(),
               toEntityType(userDto.getUserDtoType())
        );
    }

    public UserDtoType toDtoType(UserEntityType userEntityType) {
        return switch (userEntityType) {
            case CLIENTE -> UserDtoType.CLIENTE;
            case FORNECEDOR -> UserDtoType.FORNECEDOR;
            case ADMIN -> UserDtoType.ADMIN;
        };
    }

    public UserEntityType toEntityType(UserDtoType userDtoType) {
        return switch (userDtoType) {
            case CLIENTE -> UserEntityType.CLIENTE;
            case FORNECEDOR -> UserEntityType.FORNECEDOR;
            case ADMIN -> UserEntityType.ADMIN;
        };
    }
}

