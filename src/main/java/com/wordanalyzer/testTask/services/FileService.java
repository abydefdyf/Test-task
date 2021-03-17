package com.wordanalyzer.testTask.services;

public interface FileService {

	/**
	 * Получить колличество букв
	 * 
	 * @return @throws
	 */
	int getCount(String word);

	/**
	 * Получить нужную букву
	 * 
	 * @return @throws
	 */
	char getLetter(String word);

}
