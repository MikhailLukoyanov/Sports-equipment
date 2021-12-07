package com.example.BD.controller;

import com.example.BD.domain.Positions;
import com.example.BD.domain.Subsidiary;
import com.example.BD.domain.Workers;
import com.example.BD.repos.PositionsRepo;
import com.example.BD.repos.SubsidiaryRepo;
import com.example.BD.repos.WorkersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


/**
 * @author Mikhail Lukoyanov
 */
@Controller
@RequestMapping("/worker")
public class WorkerController {
    @Autowired
    private WorkersRepo workersRepo;
    @Autowired
    private PositionsRepo positionsRepo;
    @Autowired
    private SubsidiaryRepo subsidiaryRepo;

    @GetMapping
    public String allWorkers(Model model,
                             @RequestParam(required = false, defaultValue = "0") Long positionFilter,
                             @RequestParam(required = false, defaultValue = "0") Long subsidiaryFilter) {
        Iterable<Workers> workers = workersRepo.findAll();
        Iterable<Positions> allPositions = positionsRepo.findAll();
        Iterable<Subsidiary> allSubsidiary = subsidiaryRepo.findAll();

        if (positionFilter == null || positionFilter == 0) {
            if (subsidiaryFilter == null || subsidiaryFilter == 0) {
                workers = workersRepo.findAll();
            } else {
                workers = workersRepo.findBySubsidiary_Id(subsidiaryFilter);
            }
        } else {
            if (subsidiaryFilter == null || subsidiaryFilter == 0) {
                workers = workersRepo.findByPositions_Id(positionFilter);
            } else {
                workers = workersRepo.findByPositions_IdAndSubsidiary_Id(positionFilter, subsidiaryFilter);
            }
        }
        model.addAttribute("positions", allPositions);
        model.addAttribute("subsidiary", allSubsidiary);
        model.addAttribute("positionFilter", positionFilter);
        model.addAttribute("subsidiaryFilter", subsidiaryFilter);
        model.addAttribute("workers", workers);
        return "workers/worker";
    }

//    public String allWorkers(Model model) {
//        workersRepo.findAllByNameMatchesRegex("[А-Я]*");
//    }

    @GetMapping("/new")
    public String newWorker(Model model) {
        Iterable<Positions> allPositions = positionsRepo.findAll();
        Iterable<Subsidiary> allSubsidiary = subsidiaryRepo.findAll();

        model.addAttribute("positions", allPositions);
        model.addAttribute("subsidiary", allSubsidiary);
        return "workers/worker_new";
    }
    @PostMapping("/new")
    public String addWorker(@RequestParam String name,
                            @RequestParam String surname,
                            @RequestParam String passport,
                            @RequestParam Subsidiary subsidiary,
                            @RequestParam Positions positions,
                            @RequestParam String w_phone_number,
                            Model model) {

        Workers worker = new Workers(name, surname, passport, subsidiary, positions, w_phone_number);
        workersRepo.save(worker);

        return "redirect:/worker";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") Workers worker) {
        Iterable<Positions> allPositions = positionsRepo.findAll();
        Iterable<Subsidiary> allSubsidiary = subsidiaryRepo.findAll();

        model.addAttribute("worker", worker);
        model.addAttribute("positions", allPositions);
        model.addAttribute("subsidiary", allSubsidiary);
        return "workers/worker_edit";
    }

    @PostMapping("/{id}/edit")
    public String updateWorker(@RequestParam String name,
                               @RequestParam String surname,
                               @RequestParam String passport,
                               @RequestParam Subsidiary subsidiary,
                               @RequestParam Positions positions,
                               @RequestParam String w_phone_number,
                               @PathVariable("id") Workers worker) {
        worker.setName(name);
        worker.setSurname(surname);
        worker.setW_passport_data(passport);
        worker.setSubsidiary(subsidiary);
        worker.setPositions(positions);
        worker.setW_phone_number(w_phone_number);
        workersRepo.save(worker);
        return "redirect:/worker";
    }

    @PostMapping("/{id}/delete")
    public String deleteWorker(@PathVariable("id") Long id) {
        workersRepo.deleteById(id);
        return "redirect:/worker";
    }

}
