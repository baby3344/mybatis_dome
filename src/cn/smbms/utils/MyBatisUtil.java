package cn.smbms.utils;
import java.io.InputStream;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.io.Resources;

public class MyBatisUtil {
      private static SqlSessionFactory factory;
      static{
    	  try {
			InputStream is=Resources.getResourceAsStream("mybatis-config.xml");
			  factory=new SqlSessionFactoryBuilder().build(is);
		} catch (Exception e) {
			e.printStackTrace();
		}
      }
      
      public static SqlSession createSqlSession(){
    	  return factory.openSession(false);  //true为自动提交事务
      }
      
      public static void closeSession(SqlSession sqlSession){
    	  if(null!=sqlSession){
    		  sqlSession.close();
    	  }
      }
}
