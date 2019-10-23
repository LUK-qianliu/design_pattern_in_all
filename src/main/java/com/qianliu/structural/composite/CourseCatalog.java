package com.qianliu.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 课程目录
 */
public class CourseCatalog extends CatalogComponent {
    private List<CatalogComponent> items = new ArrayList<CatalogComponent>(); // 子目录，子目录形成的一棵树的叶子节点就是一个课程
    private String name; // 目录名称
    private Integer level;// 目录级别


    public CourseCatalog(String name,Integer level) {
        this.name = name;
        this.level = level;
    }

    // 删除一门课程
    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    //
    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for(CatalogComponent catalogComponent : items){
            if(this.level != null){
                for(int  i = 0; i < this.level; i++){
                    System.out.print("  ");
                }
            }
            catalogComponent.print();//递归打印自己的子目录
        }
    }

}
