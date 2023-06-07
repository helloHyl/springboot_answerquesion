package network.hylnetwork.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import network.hylnetwork.domain.Question;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class QuestionDaoTestCase {

    @Autowired
    private  QuestionDao questionDao;


    @Test
    void  testGetById(){
        System.out.println(questionDao.selectById(1));
    }

//    @Test
//    void testSave(){
//        Question question = new Question();
////        question.setId(3);
//        question.setQuestion("型主要强调款式下摆的宽大程度、 (    )多用这一造型。");
//        question.setOptionA("礼服类 ");
//        question.setOptionB("外套类 ");
//        question.setOptionC("职业服类");
//        question.setOptionD("休闲类");
//        question.setAnswer("礼服类");
//        questionDao.insert(question);
//    }
//
//    @Test
//    void testUpdate(){
//        Question question = new Question();
//        question.setId(3);
//        question.setQuestion("(   )是端肩体的着装特征之一。");
//        question.setOptionA("肩头空松");
//        question.setOptionB("两侧摆缝垂长");
//        question.setOptionC("无压缩感");
//        question.setOptionD("肩头绷紧");
//        question.setAnswer("肩头绷紧");
//        questionDao.updateById(question);
//    }

    @Test
    void testDelete(){
        questionDao.deleteById(4);
    }

    @Test
    void testGetAll(){
        System.out.println(questionDao.selectList(null));
    }

    @Test
//    分页查询需要手动配置添加limit
    void testGetPage(){
        IPage page = new Page(1,2);
        questionDao.selectPage(page,null);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());
    }

    @Test
    void  testGetBy(){

        QueryWrapper qw = new QueryWrapper();
        qw.like("answer","麻织物");
        questionDao.selectList(qw);
    }

//    @Test
//    void  testGetBy2(){
//        String answer = null;
//        LambdaQueryWrapper lqw = new LambdaQueryWrapper<Question>();
//        lqw.like(answer!=null,Question::getAnswer ,answer);
//        questionDao.selectList(lqw);
//    }
}
