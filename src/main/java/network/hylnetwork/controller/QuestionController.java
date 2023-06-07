package network.hylnetwork.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import network.hylnetwork.controller.utils.R;
import network.hylnetwork.controller.utils.R1;
import network.hylnetwork.domain.Question;
import network.hylnetwork.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private IQuestionService questionService;

    @GetMapping
    public R getAll(){
        return new  R(true,questionService.list());
    }
//    @GetMapping
//    public R1 getAnswers(){
//        return  new R1(true,questionService.getAnswers());
//    }

    @PostMapping
    public R save(@RequestBody Question question){
        return new  R(questionService.save(question));
    }


    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
        return new  R(questionService.removeById(id));
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id){
        return new  R(true,questionService.getById(id));
    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage,@PathVariable int pageSize){
        return new  R(true,questionService.getPage(currentPage,pageSize));
    }
}
