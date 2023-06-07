package network.hylnetwork.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class QuestionServiceTest {

    @Autowired
   private IQuestionService question;

    @Test
    void testGetById(){
        question.getById(3);
    }
}
