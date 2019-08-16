package com.ky2009666.mapper;

import com.ky2009666.domain.ShortUrl;

/**
 * @author ky2009666
 * @title: ShortUrlMapper
 * @projectName mybatis_demo
 * @description: TODO
 * @date 2019/8/16 16:59
 */
public interface ShortUrlMapper {
    /**
     * 根据主键查询短链信息
     *
     * @param id 主键ID.
     * @return ShortUrl 对象.
     */
    public ShortUrl selectShortUrl(int id);
}
