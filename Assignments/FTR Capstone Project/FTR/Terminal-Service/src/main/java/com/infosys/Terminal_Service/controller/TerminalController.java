package com.infosys.Terminal_Service.controller;

import com.infosys.Terminal_Service.model.Terminal;
import com.infosys.Terminal_Service.service.TerminalServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/terminals")
public class TerminalController {

    @Autowired
    private TerminalServiceInterface terminalService;

    @PostMapping
    public Terminal saveTerminal(@RequestBody Terminal terminal) {
        return terminalService.saveTerminal(terminal);
    }

    @GetMapping
    public List<Terminal> getAllTerminals() {
        return terminalService.getAllTerminals();
    }

    @GetMapping("/{id}")
    public Terminal getTerminalById(@PathVariable String id) {
        return terminalService.getTerminalById(id);
    }

    @PutMapping("/{id}")
    public Terminal updateTerminal(@PathVariable String id, @RequestBody Terminal terminal) {
        return terminalService.updateTerminal(id, terminal);
    }

    @DeleteMapping("/{id}")
    public void deleteTerminal(@PathVariable String id) {
        terminalService.deleteTerminal(id);
    }
}