package com.yuqing.yuoj.esdao;

import com.yuqing.yuoj.model.dto.post.PostEsDTO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * 帖子 ES 操作
 *
 * @author <a href="https://github.com/LeoLuosifen">Leo</a>
 * @from <a href="https://leoluosifen.github.io">八连坐</a>
 */
public interface PostEsDao extends ElasticsearchRepository<PostEsDTO, Long> {

    List<PostEsDTO> findByUserId(Long userId);
}