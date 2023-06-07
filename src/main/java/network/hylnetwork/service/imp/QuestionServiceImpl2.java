package network.hylnetwork.service.imp;


import network.hylnetwork.dao.QuestionDao;
import network.hylnetwork.domain.Question;
import network.hylnetwork.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl2 implements QuestionService {

    @Autowired
    private QuestionDao questionDao;


    @Override
    public Boolean save(Question question) {
        return questionDao.insert(question) > 0;
    }

    @Override
    public Boolean update(Question question) {
        return questionDao.updateById(question) > 0;
    }

    @Override
    public Boolean delete(Integer id) {
        return questionDao.deleteById(id) > 0;
    }

    @Override
    public Question getById(Integer id) {
        return questionDao.selectById(id);
    }

    @Override
    public List<Question> getAll() {
        return questionDao.selectList(null);
    }
}
