package com.function.app.service.function;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.function.app.model.CompanyRq;
import com.function.app.model.CompanyRs;
import com.function.app.service.CompanyService;

import lombok.AllArgsConstructor;

@Component(value = "company")
@AllArgsConstructor
public class CompanyFunction implements Function<CompanyRq, CompanyRs> {

	private CompanyService companyService;

	@Override
	public CompanyRs apply(CompanyRq request) {
		return companyService.createCompany(request);
	}

}
