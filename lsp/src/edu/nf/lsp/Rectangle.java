package edu.nf.lsp;

/**
 * @author wangl
 * @date 2020/11/16
 * 长方形
 */
public class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * 计算面积
     * @return
     */
    public int area(){
        return width * height;
    }
}
