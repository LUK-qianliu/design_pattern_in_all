package com.qianliu.behavioral.memento;

public class Test {
    public static void main(String[] args) {
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();

        Article article = new Article("title1", "这是一个张图片", "图片1");
        ArticleMemento articleMemento = article.saveToMemento();

        articleMementoManager.addArticleMemento(articleMemento);

        // 修改article
        article.setTitle("title2");
        article.setContent("这是一条船");
        article.setImgs("巨轮1");

        System.out.println(article);

        // 从备忘录中恢复数据
        article.undoFromMemento(articleMementoManager.getArticleMemento());

        System.out.println(article);
    }
}
