package com.example.demo.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class CustomInfoEndPoint implements InfoContributor {

	
	private ConfigurableApplicationContext ctx;
	
	
	@Override
	public void contribute(Info.Builder builder) {

		HashMap<String, Object> map = new HashMap<>();
		
		map.put("beanCount", Integer.toString(ctx.getBeanDefinitionCount()));
		
		builder.withDetails(map);
		
	}

}
