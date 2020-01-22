package com.function.app.handler;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.function.app.model.CompanyRq;
import com.function.app.model.CompanyRs;

public class CompanyFunctionAWSHandler extends SpringBootRequestHandler<CompanyRq, CompanyRs> {

}
