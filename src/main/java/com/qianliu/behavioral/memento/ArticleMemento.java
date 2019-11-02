package com.qianliu.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ArticleMemento {
    private String title;
    private String content;
    private String imgs;
}
