package com.campusdual.appmazing.Controller;

import com.campusdual.appmazing.api.IAgendaService;
import com.campusdual.appmazing.model.dto.AgendaDTO;
import com.campusdual.appmazing.model.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agenda")
public class AgendaController {

    @Autowired
    IAgendaService agendaService;
    private AgendaController productAgenda;

    @GetMapping
    public String testController() {
        return "Agenda controller works!";
    }

    @PostMapping
    public String testController(@RequestBody String name) {
        return "Agenda controller works, " + name + "!";
    }

    @GetMapping(value = "/testMethod")
    public String testControllerMethod(){
        return "Agenda controller method works!";
    }

    @PostMapping(value = "/get")
    public AgendaDTO queryAgenda(@RequestBody AgendaDTO agenda){
        return this.agendaService.queryAgenda(agenda);
    }
    @GetMapping (value = "/getAll")
    public List<AgendaDTO> queryAllagenda () {
        return this.agendaService.queryAllAgenda();
    }

    @PostMapping (value = "/add")
    public int insertAgenda (@RequestBody AgendaDTO agenda){
        return this.agendaService.insertAgenda(agenda);

    }

    @PutMapping(value = "/update")
    public int updateProduct (@RequestBody AgendaDTO agenda){
        return this.agendaService.updateAgenda(agenda);

    }

    @DeleteMapping(value = "/delete")
    public int deleteAgenda (@RequestBody AgendaDTO agenda){
        return this.agendaService.deleteAgenda(agenda);

    }
    //"date_added": "2022-01-01T23:00:00.000+00:00"
}