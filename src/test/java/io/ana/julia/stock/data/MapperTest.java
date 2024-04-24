package io.ana.julia.stock.data;

import io.ana.julia.stock.data.dto.UserDto;
import io.ana.julia.stock.data.entity.UserEntity;
import io.ana.julia.stock.data.mapper.UserMapper;
import io.ana.julia.stock.utils.AssertsUtils;
import io.ana.julia.stock.utils.DataFactory;
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
