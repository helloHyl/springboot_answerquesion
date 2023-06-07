package network.hylnetwork.controller.utils;


import lombok.Data;

@Data
//模型类
public class R {
    private Boolean flag;
    private Object data;


    public R() {
    }

    public R(Boolean flag) {
        this.flag = flag;
    }

    public R(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }
}
