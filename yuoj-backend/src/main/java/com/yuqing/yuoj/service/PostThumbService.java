package com.yuqing.yuoj.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuqing.yuoj.model.entity.PostThumb;
import com.yuqing.yuoj.model.entity.User;

/**
 * 帖子点赞服务
 *
 * @author <a href="https://github.com/LeoLuosifen">Leo</a>
 * @from <a href="https://leoluosifen.github.io">八连坐</a>
 */
public interface PostThumbService extends IService<PostThumb> {

    /**
     * 点赞
     *
     * @param postId
     * @param loginUser
     * @return
     */
    int doPostThumb(long postId, User loginUser);

    /**
     * 帖子点赞（内部服务）
     *
     * @param userId
     * @param postId
     * @return
     */
    int doPostThumbInner(long userId, long postId);
}
