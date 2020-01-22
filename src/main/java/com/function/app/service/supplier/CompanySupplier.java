package com.function.app.service.supplier;

import java.util.function.Supplier;

import org.springframework.stereotype.Component;

import com.function.app.model.CompanyRq;
import com.function.app.model.CompanyRs;
import com.function.app.service.CompanyService;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class CompanySupplier implements Supplier<CompanyRs> {

	private CompanyService companyService;

	@Override
	public CompanyRs get() {
		CompanyRq companyRq = new CompanyRq();
		companyRq.setName("Coca Cola");
		return companyService.createCompany(companyRq);
	}

}
