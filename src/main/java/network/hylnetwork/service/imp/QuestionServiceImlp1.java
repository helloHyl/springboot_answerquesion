package network.hylnetwork.service.imp;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import network.hylnetwork.controller.utils.R;
import network.hylnetwork.dao.QuestionDao;
import network.hylnetwork.domain.Question;
import network.hylnetwork.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//                                                    dao          实体
@Service
public class QuestionServiceImlp1 extends ServiceImpl<QuestionDao, Question> implements IQuestionService {
    @Autowired
    private QuestionDao questionDao;



    @Override
    public IPage<Question> getPage(int currentPage, int pageSize) {
        IPage page = new Page(currentPage,pageSize);
        questionDao.selectPage(page,null);
        return page;
    }

    @Override
    public String[] getAnswers() {
        return new String[0];
    }
}
