package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String dept;
	private double salary;
	// @Temporal(TemporalType.TIMESTAMP)
	// payload
	/*
	 * { "id":"9", "name":"alisha", "dept":"aloha", "salary":5000,
	 * "joinedDate":"2018-03-05T13:34:00.000", "status":"CREATED" }
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date joinedDate;
	private String status;
}
