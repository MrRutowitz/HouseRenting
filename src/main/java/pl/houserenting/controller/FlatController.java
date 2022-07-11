package pl.houserenting.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.houserenting.Dao.FlatDao;
import pl.houserenting.model.Flat;
import pl.houserenting.repositories.FlatRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.Valid;
import java.awt.print.Book;

@Controller
@RequestMapping("/")
public class FlatController {


   private final FlatDao flatDao;
   private final FlatRepository flatRepository;

    public FlatController(FlatDao flatDao, FlatRepository flatRepository) {
        this.flatDao = flatDao;
        this.flatRepository = flatRepository;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addFlat(Model model) {
        model.addAttribute("flat", new Flat());
        return "add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String save(@Valid Flat flat, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add";
        }
        flatRepository.save(flat);

        return "redirect:/list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("flats", flatRepository.findAll());
        return "list";
    }
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String update(Flat flat, Model model) {
        flatDao.update(flat);
        return "redirect:/list";
    }

    @RequestMapping(value = "/confirm", method = RequestMethod.GET)
    public String confirm(@RequestParam Long id, Model model) {
        model.addAttribute("id", id);
        return "confirm";
    }


}
