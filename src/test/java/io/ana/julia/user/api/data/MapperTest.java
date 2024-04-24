package io.ana.julia.user.api.data;

import io.ana.julia.user.api.data.dto.UserDto;
import io.ana.julia.user.api.data.entity.UserEntity;
import io.ana.julia.user.api.data.mapper.UserMapper;
import io.ana.julia.user.api.utils.AssertsUtils;
import io.ana.julia.user.api.utils.DataFactory;
import org.junit.jupiter.api.Test;

public class MapperTest {

    private final UserMapper userMapper = new UserMapper();

    @Test
    public void shouldMapperDtoToEntity(){
        UserDto userDto = DataFactory.getDtoData();
        UserEntity userEntity = userMapper.toEntity(userDto);
        AssertsUtils.assertDto(userDto, userEntity);
    }

    @Test
    public void shouldMapperEntityToDto() {
        UserEntity userEntity = DataFactory.getEntityData();
        UserDto userDto = userMapper.toDto(userEntity);
        AssertsUtils.assertDto(userDto, userEntity);
    }
}
