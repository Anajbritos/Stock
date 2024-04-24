package io.ana.julia.user.api.data.mapper;

import io.ana.julia.user.api.data.dto.UserDto;
import io.ana.julia.user.api.data.dto.UserDtoType;
import io.ana.julia.user.api.data.entity.UserEntity;
import io.ana.julia.user.api.data.entity.UserEntityType;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDto toDto(UserEntity userEntity) {
        return new UserDto(
                userEntity.getId(),
                userEntity.getName(),
                userEntity.getCpf(),
                userEntity.getEmail(),
                userEntity.getPassword(),
                toDtoType(userEntity.getUserEntityType())
        );
    }

    public UserEntity toEntity(UserDto userDto) {
        return new UserEntity(
                userDto.getId(),
                userDto.getName(),
                userDto.getCpf(),
                userDto.getEmail(),
                userDto.getPassword(),
                toEntityType(userDto.getUserDtoType())
        );
    }

    public UserDtoType toDtoType(UserEntityType userEntityType) {
        return switch (userEntityType) {
            case CLIENT -> UserDtoType.CLIENT;
            case SUPPLIER -> UserDtoType.SUPPLIER;
            case ADMIN -> UserDtoType.ADMIN;
        };
    }

    public UserEntityType toEntityType(UserDtoType userDtoType) {
        return switch (userDtoType) {
            case CLIENT -> UserEntityType.CLIENT;
            case SUPPLIER -> UserEntityType.SUPPLIER;
            case ADMIN -> UserEntityType.ADMIN;
        };
    }
}

