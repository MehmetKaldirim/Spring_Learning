package com.cydeo;

import com.cydeo.config.ProjectConfig;
import com.cydeo.model.Comment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        // it creat object and write "hello" coz it is eager if we not use @lazy
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);


//        CommentService cs1 = context.getBean(CommentService.class);
//        CommentService cs2 = context.getBean(CommentService.class);
//
//        System.out.println(cs1);
//        System.out.println(cs2);
//
//        System.out.println(cs1 == cs2); //they are same object  it is default

    }
}
