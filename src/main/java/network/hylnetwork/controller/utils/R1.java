package network.hylnetwork.controller.utils;

import lombok.Data;

@Data
//模型类
public class R1 {
    private Boolean flag;
    private String[] answers;


    public R1() {
    }

    public R1(Boolean flag) {
        this.flag = flag;
    }

    public R1(Boolean flag, String[] answers) {
        this.flag = flag;
        this.answers = answers;
    }
}