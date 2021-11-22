package com.example.contatosapi.enums;

public enum EmpresaTipo {
	CLIENTE("Cliente", 0), FORNECEDOR("Fornecedor", 1);
	
	private String value;
	private final int code;
	
	private EmpresaTipo(String value, int code) {
		this.value = value;
		this.code = code;
	}

	public String getValue() {
		return value;
	}


	public int getCode() {
		return code;
	}
	
	public static EmpresaTipo getEnumByString(String value) {
		for(EmpresaTipo empresaTipo : EmpresaTipo.values()) {
			if(empresaTipo.value.equals(value))
				return empresaTipo;
		}
		return null;
	}
	
	public static EmpresaTipo getEnumByCode(int code) {
		for(EmpresaTipo empresaTipo : EmpresaTipo.values()) {
			if(empresaTipo.code == code)
				return empresaTipo;
		}
		return null;
	}


}