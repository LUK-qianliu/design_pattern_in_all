package com.qianliu.structural.composite;

/**
 * 测试
 */
public class Test {
    public static void main(String[] args) {
        // 2级子目录
        CatalogComponent javaBasisCourseCatalog = new CourseCatalog("Java实战课程目录",2);
        CatalogComponent springCourse = new Course("Spring课程",11);
        CatalogComponent mybatisCourse = new Course("mybatis课程",11);
        javaBasisCourseCatalog.add(springCourse);
        javaBasisCourseCatalog.add(mybatisCourse);

        //2级子目录
        CatalogComponent javaActualCombatCourseCatalog = new CourseCatalog("Java实战课程目录",2);
        CatalogComponent mmallCourse1 = new Course("Java电商一期",55);
        CatalogComponent mmallCourse2 = new Course("Java电商二期",66);
        CatalogComponent designPattern = new Course("Java设计模式",77);
        javaActualCombatCourseCatalog.add(mmallCourse1);
        javaActualCombatCourseCatalog.add(mmallCourse2);
        javaActualCombatCourseCatalog.add(designPattern);

        //1级目录
        CatalogComponent imoocMainCourseCatalog = new CourseCatalog("java后端课程主目录",1);
        imoocMainCourseCatalog.add(javaBasisCourseCatalog);
        imoocMainCourseCatalog.add(javaActualCombatCourseCatalog);

        imoocMainCourseCatalog.print();



    }
}
