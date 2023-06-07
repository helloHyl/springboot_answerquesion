package network.hylnetwork.service;

import network.hylnetwork.service.imp.QuestionServiceImpl2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class QuestionServiceTestCase {

    @Autowired
    private QuestionServiceImpl2 questionService;

    @Test
    void testGetById(){
        questionService.getById(3);
    }
}
