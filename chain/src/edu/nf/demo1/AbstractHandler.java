package edu.nf.demo1;

/**
 * @author wangl
 * @date 2020/11/20
 * 抽象的任务处理器
 */
public abstract class AbstractHandler {

    /**
     * 一按一个任务处理者（handler）
     * 有客户端进行装配
     */
    private AbstractHandler handler;

    public AbstractHandler getHandler() {
        return handler;
    }

    public void setHandler(AbstractHandler handler) {
        this.handler = handler;
    }

    /**
     * 抽象的任务处理方法，由不同子类进行实现
     */
    public abstract void execute(int money);
}
