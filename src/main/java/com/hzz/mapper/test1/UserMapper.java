package com.hzz.mapper.test1;

import com.hzz.po.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {

        List<User> getUserList();

        Integer updateOneUser(Integer id);

}
