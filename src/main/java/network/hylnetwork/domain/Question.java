package network.hylnetwork.domain;

import lombok.Data;
@Data
public class Question {
//    ctrl + f3
    private  Integer id;
    private String question;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String answer;
}
