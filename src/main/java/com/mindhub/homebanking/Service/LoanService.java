package com.mindhub.homebanking.Service;

import com.mindhub.homebanking.dtos.LoanDTO;
import com.mindhub.homebanking.models.Loan;

import java.util.List;
public interface LoanService {
    public List<LoanDTO> getLoansDTO();
    public Loan findById(long name);
}
