package com.example.pi22.offer;

import com.example.pi22.offer.entities.Offer;
import com.example.pi22.offer.services.IOfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OfferRestController {

    @Autowired
    IOfferService offerService;
    @PostMapping("/offer/add")
    @ResponseBody
    public void ajouterProduit(@RequestBody Offer f) {
        offerService.addOffer(f);
    }
    @GetMapping("/offer/list")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public List<Offer> listeOffers() {
        return offerService.getAllOffers();
    }
    @DeleteMapping(value = "/offer/{id}")
    public void deletePost(@PathVariable Long id) {
        offerService.deleteOfferById(id);
    }

    @PutMapping("/offer/update")
    @ResponseBody
    public void updateOffer(@RequestBody Offer f) {
        offerService.updateOffer(f);
    }




}
