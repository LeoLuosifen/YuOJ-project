package com.yuqing.yuoj.model.dto.postthumb;

import lombok.Data;

import java.io.Serializable;

/**
 * 帖子点赞请求
 *
 * @author <a href="https://github.com/LeoLuosifen">Leo</a>
 * @from <a href="https://leoluosifen.github.io">八连坐</a>
 */
@Data
public class PostThumbAddRequest implements Serializable {

    /**
     * 帖子 id
     */
    private Long postId;

    private static final long serialVersionUID = 1L;
}