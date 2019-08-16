package com.ky2009666.domain;

import lombok.Data;

/**
 * @author ky2009666
 * @title: com.ky2009666.domain.ShortUrl
 * @projectName mybatis_demo
 * @description: TODO
 * @date 2019/8/16 16:46
 */
@Data
public class ShortUrl {
    /**
     * 表主键.
     */
    private int id;
    /**
     * 原始URL.
     */
    private String original_url;
    /**
     * 加密URL.
     */
    private String encrypted_url;
    /**
     * 创建时间.
     */
    private String create_time;
    /**
     * 访问次数.
     */
    private int visit_count;
}
