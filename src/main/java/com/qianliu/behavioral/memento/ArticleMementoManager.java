package com.qianliu.behavioral.memento;

import java.util.Stack;

public class ArticleMementoManager {

    private final static Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<>();

    public ArticleMemento getArticleMemento(){
        return ARTICLE_MEMENTO_STACK.pop();
    }

    public void addArticleMemento(ArticleMemento articleMemento){
        ARTICLE_MEMENTO_STACK.push(articleMemento);
    }
}
