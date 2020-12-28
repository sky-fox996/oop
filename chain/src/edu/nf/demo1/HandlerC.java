package edu.nf.demo1;

/**
 * @author wangl
 * @date 2020/11/20
 * CEO，审批限额为10000元
 */
public class HandlerC extends AbstractHandler{

    @Override
    public void execute(int money) {
        if(money <= 10000){
            System.out.println("CEO审批通过");
        }else{
            System.out.println("驳回，审批未通过");
        }
    }
}
