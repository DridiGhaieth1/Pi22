package com.example.pi22.publicite;

import com.example.pi22.publicite.entities.Publicite;
import com.example.pi22.publicite.services.IPubliciteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PubliciteRestController {
    @Autowired
    IPubliciteService iPubliciteService;

    @PostMapping("/publicite/add")
    @ResponseBody
    public void ajouterPublicite(@RequestBody Publicite p) {
        iPubliciteService.addPublicite(p);
    }

    @GetMapping("/publicite/list")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public List<Publicite> listePublicite() {
        return iPubliciteService.getAllPublicites();
    }
    @DeleteMapping(value = "/publicite/{id}")
    public void deletePub(@PathVariable Long id) {
        iPubliciteService.deletePubliciteById(id);
    }

    @PutMapping("/publicite/update")
    @ResponseBody
    public void updatePub(@RequestBody Publicite p) {
        iPubliciteService.updatePublicite(p);
    }
}
