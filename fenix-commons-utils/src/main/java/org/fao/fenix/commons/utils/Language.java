package org.fao.fenix.commons.utils;

public enum Language {
	
	english("EN"), spanish("ES"), france("FR"), detush("DE");
	
	private String code;
	private Language(String code) { this.code = code; }
	
	public String getCode() { return code; }


    public static Language getInstance(String code) {
        if (code!=null)
            for (Language language : Language.values())
                if (language.getCode().equalsIgnoreCase(code))
                    return language;
        return null;
    }

}
