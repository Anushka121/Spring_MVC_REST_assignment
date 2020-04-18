package com.mycompany.app;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.mycompany.app")
@PropertySource("classpath:employee.properties")
public class JavaConfig {

	
 

}
