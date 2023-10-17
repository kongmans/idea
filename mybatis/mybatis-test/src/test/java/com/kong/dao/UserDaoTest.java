package com.kong.dao;

import com.kong.pojo.User;
import com.kong.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;



import java.util.List;

public class UserDaoTest {

   @Test
    public  void getUserList(){
       SqlSession sqlSession = MybatisUtils.getSqlSession();
       UserDao mapper = sqlSession.getMapper(UserDao.class);
       List<User> userList = mapper.getUserList();

//       List<User> userList = sqlSession.selectList("com.kong.dao.UseDao.getUserList");
       for ( User user: userList){
           System.out.println(user);
       }

    sqlSession.close();
   }


   @Test
   public void  getUserById(){

       try {
           SqlSession sqlSession = MybatisUtils.getSqlSession();
           UserDao mapper = sqlSession.getMapper(UserDao.class);
           User user = mapper.getUserById(1);
           System.out.println(user);
           sqlSession.close();
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
   }
   @Test
    public void addUser() {

       SqlSession sqlSession = null;
       try {
           sqlSession = MybatisUtils.getSqlSession();
           UserDao mapper = sqlSession.getMapper(UserDao.class);
           mapper.addUser(new User(1, "kong", "123456"));
           mapper.addUser(new User(2, "kong1", "123456"));
           mapper.addUser(new User(3, "kong2", "123456"));
           System.out.println("新增成功");
           sqlSession.commit();
       } catch (Exception e) {
           throw new RuntimeException(e);
       }

       sqlSession.close();
   }
    @Test
    public void updateUser() {

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int re = mapper.updateUser(new User(3, "wangwu", "123456"));
        if(re>0)
            System.out.println("更新成功");
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void deleteUser() {

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        mapper.deleteUser(3);
        sqlSession.commit();
        sqlSession.close();
    }




}
