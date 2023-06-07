package network.hylnetwork.service;

import network.hylnetwork.domain.Question;

import java.util.List;

public interface QuestionService {
    Boolean save(Question question);
    Boolean update(Question question);
    Boolean delete(Integer id);
    Question getById(Integer id);
     List<Question> getAll();
}
