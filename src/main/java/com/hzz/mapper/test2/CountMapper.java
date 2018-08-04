package com.hzz.mapper.test2;

import com.hzz.po.Count;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CountMapper {

    List<Count> getCountList();

    Integer updateOneCount(Integer id);
}