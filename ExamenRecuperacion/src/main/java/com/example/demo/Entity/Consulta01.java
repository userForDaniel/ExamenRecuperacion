package com.example.demo.Entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
@AllArgsConstructor
public class Consulta01 implements Serializable{
	private static final long serialVersionUID = 1L;
	 private String variable1;
		private String variable2;
		public String getVariable1() {
			return variable1;
		}
		public void setVariable1(String variable1) {
			this.variable1 = variable1;
		}
		public String getVariable2() {
			return variable2;
		}
		public void setVariable2(String variable2) {
			this.variable2 = variable2;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		

}
