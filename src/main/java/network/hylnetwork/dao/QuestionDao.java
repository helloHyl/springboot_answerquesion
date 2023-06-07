package network.hylnetwork.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import network.hylnetwork.controller.utils.R;
import network.hylnetwork.domain.Question;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface QuestionDao extends BaseMapper<Question> {
}
