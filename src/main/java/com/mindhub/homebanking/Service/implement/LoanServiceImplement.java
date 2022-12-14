package com.mindhub.homebanking.Service.implement;

import com.mindhub.homebanking.Service.LoanService;
import com.mindhub.homebanking.dtos.LoanDTO;
import com.mindhub.homebanking.models.Loan;
import com.mindhub.homebanking.repositories.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LoanServiceImplement implements LoanService {
    @Autowired
    LoanRepository loanRepository;
    @Override
    public List<LoanDTO> getLoansDTO() {
     return  loanRepository.findAll().stream().map(loan -> new LoanDTO(loan)).collect(Collectors.toList());
    }
    @Override
    public Loan findById(long name) {
        return loanRepository.findById(name);
    }
}
