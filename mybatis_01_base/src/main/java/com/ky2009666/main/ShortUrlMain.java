package com.ky2009666.main;

import com.ky2009666.domain.ShortUrl;
import com.ky2009666.mapper.ShortUrlMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author ky2009666
 * @title: ShortUrlMain
 * @projectName mybatis_demo
 * @description: TODO
 * @date 2019/8/16 17:02
 */
public class ShortUrlMain {
    /**
     * 定义核心配置文件
     */
    private static String resource = "mybatis-config.xml";
    /**
     * 定义文件流.
     */
    private static InputStream resourceAsStream = null;
    /**
     * 定义SqlSessionFactory.
     */
    private static SqlSessionFactory sessionFactory = null;

    /**
     * 静态代码块
     */
    static {
        resourceAsStream = ShortUrlMain.class.getClassLoader().getResourceAsStream(resource);
        sessionFactory =
                new SqlSessionFactoryBuilder().build(resourceAsStream);
    }

    /**
     * 核心入口方法.
     *
     * @param args 参数.
     */
    public static void main(String[] args) {
        selectShortUrl();
    }

    /**
     * 通过mapper接口进行查询的方式.
     */
    private static void selectShortUrl() {
        SqlSession sqlSession = sessionFactory.openSession();
        ShortUrlMapper shortUrlMapper = sqlSession.getMapper(ShortUrlMapper.class);
        ShortUrl shortUrl = shortUrlMapper.selectShortUrl(1);
        System.out.println("shortUrl = " + shortUrl.getOriginal_url());
    }
}
