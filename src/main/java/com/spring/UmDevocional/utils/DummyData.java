package com.spring.UmDevocional.utils;

import com.spring.UmDevocional.model.Post;
import com.spring.UmDevocional.repository.UmDevoRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    UmDevoRepository umDevoRepository;

    //@PostConstruct
    public void savePost(){
        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();

        post1.setAutor("Bibo");
        post1.setData(LocalDate.now());
        post1.setTitle("O Deus que destrói sonhos.");
        post1.setTexto("Uma tentação constante que cerca a vida cristã é a inversão do chamado: a presunção de que Deus precisa abençoar o meu caminho e me seguir em meus planos e sonhos. Essa postura é enganosa e faz parecer que Deus só é fiel quando me abençoa.");

        postList.add(post1);

        for(Post post: postList){
            Post postSaved = umDevoRepository.save(post);
            System.out.println(postSaved.getId());
        }
    }
}
