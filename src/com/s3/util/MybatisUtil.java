package com.s3.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 工具类
 */
public class MybatisUtil {
   private static SqlSessionFactory factory=null;
   //静态块，创建工厂对象
   static{
      try {
         InputStream is= Resources.getResourceAsStream("mybatis_config.xml");
         factory=new SqlSessionFactoryBuilder().build(is);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
    //返回会话对象
   public static SqlSession createSession(){
      SqlSession session=factory.openSession();
      return session;
   }
   //关闭会话对象
   public static void closeSession(SqlSession session){
       if(null!=session){
           session.close();
       }

   }
}
