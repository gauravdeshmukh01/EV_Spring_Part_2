package com.infosys.Terminal_Service.service;

import com.infosys.Terminal_Service.model.Terminal;

import java.util.List;

public interface TerminalServiceInterface {

    Terminal saveTerminal(Terminal terminal);

    List<Terminal> getAllTerminals();

    Terminal getTerminalById(String terminalId);

    Terminal updateTerminal(String terminalId, Terminal terminal);

    void deleteTerminal(String terminalId);
}