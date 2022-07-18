package com.example.pi22.services;

import com.example.pi22.entities.Commentaire;
import com.example.pi22.repositories.CommentaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.Email;
import java.util.List;

@Service
public class CommentaireServiceImpl implements ICommentaireService {

    @Autowired
    private CommentaireRepository commentaireRepository;
    @Autowired
    private EmailService emailService;
@Transactional
    @Override
    public Commentaire save(Commentaire commentaire) {
      commentaire =   commentaireRepository.save(commentaire);
        if(!commentaire.getUser().getId().equals(commentaire.getArticle().getUser().getId())){

            String subject = "Commentaire article";
            String text = commentaire.getUser().getName() + " " + commentaire.getUser().getPrenom() +" a commenté votre article  avec le titre"+ commentaire.getArticle().getTitreArticle();

       emailService.sendEmail(commentaire.getArticle().getUser().getEmail(), subject, text);
        }

        return  commentaire;
    }

    @Override
    public Commentaire update(Commentaire commentaire) {
        return commentaireRepository.save(commentaire);
    }

    @Override
    public void delete(Long id) {
        commentaireRepository.deleteById(id);
    }

    @Override
    public List<Commentaire> findByArticle(Long id) {
        return commentaireRepository.findByArticle_idArticle(id);
    }




}
