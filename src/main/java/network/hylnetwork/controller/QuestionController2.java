package network.hylnetwork.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import network.hylnetwork.domain.Question;
import network.hylnetwork.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@RequestMapping("/questions")
public class QuestionController2 {

    @Autowired
    private IQuestionService questionService;

    @GetMapping
    public List<Question> getAll(){
        return questionService.list();
    }

    @PostMapping
    public  Boolean save(@RequestBody Question question){
        return  questionService.save(question);
    }


    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id){
        return questionService.removeById(id);
    }

    @GetMapping("{id}")
    public Question getById(@PathVariable Integer id){
        return  questionService.getById(id);
    }

    @GetMapping("{currentPage}/{pageSize}")
    public IPage<Question> getPage(@PathVariable int currentPage,@PathVariable int pageSize){
        return questionService.getPage(currentPage,pageSize);
    }
}
