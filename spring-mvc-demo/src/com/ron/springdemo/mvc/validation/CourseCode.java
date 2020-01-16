package com.ron.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	//Default course code
	public String value() default "CS";
	
	//Default error message
	public String message() default "Must start with 'CS'";
	
	//Default groups
	public Class<?>[] groups() default {};
	
	//Default pay loads
	public Class<? extends Payload> [] payload() default{};
}
