package com.example.pi22.partner;

import com.example.pi22.offer.entities.Offer;
import com.example.pi22.partner.entities.Partner;
import com.example.pi22.partner.services.IPartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*", maxAge=3600)
public class PartnerRestController {
    @Autowired
    IPartnerService partnerService;

    @PostMapping("/partner/add")
    @ResponseBody
    public void ajouterPartner(@RequestBody Partner p) {
        partnerService.addPartner(p);
    }

    @GetMapping("/partner/list")
    @CrossOrigin(origins = "http://localhost:4200")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public List<Partner> listePartners() {
        return partnerService.getAllPartners();
    }

    @DeleteMapping(value = "/partner/{id}")
    public void deletePartner(@PathVariable Long id) {
        partnerService.deletePartnerById(id);
    }

    @PutMapping("/partner/update")
    @ResponseBody
    public void updatePartner(@RequestBody Partner p) {
        partnerService.updatePartner(p);
    }

    @GetMapping("/partner/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Partner getOne(@PathVariable Integer id) {
        return partnerService.getPartner(id);
    }
}
