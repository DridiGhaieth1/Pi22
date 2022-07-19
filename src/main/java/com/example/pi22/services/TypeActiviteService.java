package com.example.pi22.services;

import com.example.pi22.entities.TypeActivite;
import com.example.pi22.entities.User;
import com.example.pi22.repositories.TypeActiviteRepository;
import com.example.pi22.repositories.UserRepository;
import com.example.pi22.response.MatchingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.Oneway;
import java.util.ArrayList;
import java.util.List;

@Service
public class TypeActiviteService implements ITypeActiviteService {
    @Autowired
    private TypeActiviteRepository typeActiviteRepository;
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public TypeActivite ajouterFavoris(TypeActivite favoris) {
        return null;
    }

    @Override
    public List<MatchingResponse> findMatchedUser(Long id) {
        List<MatchingResponse> matchingResponses= new ArrayList<>();
        List<String> myFavorites = typeActiviteRepository.getTypeActiviteName(id);


        List<User> users = userRepository.findAllByIdNot(id);

        for(User user: users) {
            List<String> commonFavorites = new ArrayList<>();
            List<String> otherFovorites = typeActiviteRepository.getTypeActiviteName(user.getId());
            //for loop or
            for(String myFav: myFavorites) {
                for(String otherFav: otherFovorites) {
                    if(myFav.equals(otherFav)) {
                        commonFavorites.add(myFav);
                    }

                }
            }
            if(!commonFavorites.isEmpty()) {
                MatchingResponse matchingResponse = new MatchingResponse();
                matchingResponse.setName(user.getName());
                matchingResponse.setFavoris(commonFavorites);
                matchingResponses.add(matchingResponse);
            }
        }
        
        return matchingResponses;
    }

}
