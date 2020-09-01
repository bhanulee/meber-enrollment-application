package com.wellcare.member.enrollment;

import com.wellcare.member.enrollment.repository.MemberRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WellCareSpringBootMemberEnrollmentApplication {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	MemberRepository repository;

	public static void main(String[] args) {

		SpringApplication.run(WellCareSpringBootMemberEnrollmentApplication.class, args);

	}

}

