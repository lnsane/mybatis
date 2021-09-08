package com.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.domain.UserModel;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserModel record);

    int insertSelective(UserModel record);

    UserModel selectByPrimaryKey(Integer id);

    List<UserModel> selectByIdAndUser(@Param("id")Integer id,@Param("user")String user);

    int updateByPrimaryKeySelective(UserModel record);

    int updateByPrimaryKey(UserModel record);
}
