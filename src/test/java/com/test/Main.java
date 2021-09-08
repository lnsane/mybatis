package com.test;

import com.domain.UserModel;
import com.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author 王存露
 * @version 1.0.0
 * @date 2021/1/28 15:36
 */
public class Main {
  public static void main(String[] args) throws IOException {
    String resource = "config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession = null;
    sqlSession = sqlSessionFactory.openSession();
    UserModel user = new UserModel();
    user.setUser("1");
    user.setId(1);
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//    UserModel user1 = mapper.selectByPrimaryKey(2);
    List<UserModel> userModels = mapper.selectByIdAndUser(1, "2");
    System.out.println(userModels);
    sqlSession.commit();
    sqlSession.close();
  }
}
