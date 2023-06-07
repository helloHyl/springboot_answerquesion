package network.hylnetwork.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import network.hylnetwork.controller.utils.R1;
import network.hylnetwork.domain.Question;

public interface IQuestionService extends IService<Question> {

    IPage<Question> getPage(int currentPage,int pageSize);

    String[]  getAnswers();
}
