package com.infosys.Terminal_Service.service;

import com.infosys.Terminal_Service.model.Terminal;
import com.infosys.Terminal_Service.repo.TerminalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TerminalService implements TerminalServiceInterface {

    @Autowired
    private TerminalRepo terminalRepo;

    @Override
    public Terminal saveTerminal(Terminal terminal) {
        return terminalRepo.save(terminal);
    }

    @Override
    public List<Terminal> getAllTerminals() {
        return terminalRepo.findAll();
    }

    @Override
    public Terminal getTerminalById(String terminalId) {
        return terminalRepo.findById(terminalId).orElse(null);
    }

    @Override
    public Terminal updateTerminal(String terminalId, Terminal terminal) {
        Terminal existing = terminalRepo.findById(terminalId).orElse(null);
        if (existing != null) {
            existing.setTerminalName(terminal.getTerminalName());
            existing.setCountry(terminal.getCountry());
            existing.setItemType(terminal.getItemType());
            existing.setTerminalDescription(terminal.getTerminalDescription());
            existing.setCapacity(terminal.getCapacity());
            existing.setAvailableCapacity(terminal.getAvailableCapacity());
            existing.setStatus(terminal.getStatus());
            existing.setHarborLocation(terminal.getHarborLocation());
            return terminalRepo.save(existing);
        }
        return null;
    }

    @Override
    public void deleteTerminal(String terminalId) {
        terminalRepo.deleteById(terminalId);
    }
}