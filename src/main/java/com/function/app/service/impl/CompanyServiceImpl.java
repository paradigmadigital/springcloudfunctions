package com.function.app.service.impl;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.function.app.model.CompanyRq;
import com.function.app.model.CompanyRs;
import com.function.app.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Override
	public CompanyRs createCompany(CompanyRq companyRq) {
		final String companyId = generateId();
		final String companyName = getCompanyName(companyRq.getName());

		return CompanyRs.builder().id(companyId).name(companyName).date(LocalDate.now()).build();
	}

	private String generateId() {
		return UUID.randomUUID().toString();
	}

	private String getCompanyName(final String companyName) {
		return companyName.toUpperCase();
	}

}
