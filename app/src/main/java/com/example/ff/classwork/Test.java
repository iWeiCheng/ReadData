package com.example.ff.classwork;

import java.util.List;

/**
 * Created by danjj on 2017/4/24.
 */
public class Test {

    /**
     * look_time : 10w+
     * userthunm : 0
     * article : ["http://app.bimuwang.com/upload/articlePictures/58c11e03e6bf3.gif","http://app.bimuwang.com/upload/articlePictures/58c11e30065b8.jpg","http://app.bimuwang.com/upload/articlePictures/58c11ea427e64.jpg","http://app.bimuwang.com/upload/articlePictures/58c11e70d99dc.jpg","http://app.bimuwang.com/upload/articlePictures/58c11e78aac9c.jpg","http://app.bimuwang.com/upload/articlePictures/58c11e4044355.jpg","http://app.bimuwang.com/upload/articlePictures/58c11e4eb801c.jpg","http://app.bimuwang.com/upload/articlePictures/58c11e86f06e9.jpg"]
     */

    private String look_time;
    private String userthunm;
    private List<String> article;

    public String getLook_time() {
        return look_time;
    }

    public void setLook_time(String look_time) {
        this.look_time = look_time;
    }

    public String getUserthunm() {
        return userthunm;
    }

    public void setUserthunm(String userthunm) {
        this.userthunm = userthunm;
    }

    public List<String> getArticle() {
        return article;
    }

    public void setArticle(List<String> article) {
        this.article = article;
    }
}
