package com.wordanalyzer.testTask.services.impl;


import org.springframework.stereotype.Service;

import com.wordanalyzer.testTask.services.FileService;

@Service
public class FileServiceImpl implements FileService {

	@Override
	public int getCount(String word) {
		word = new StringBuilder(word).reverse().toString();
		var count = 0;
		var countLetters = 0;

		for (var i = 0; i < word.length(); i++) {
			for (var j = i; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j)) {
					countLetters++;
					if (countLetters > count) {
						count = countLetters;

					}
				}
			}
			countLetters = 0;

		}
		return count;

	}

	@Override
	public char getLetter(String word) {

		word = new StringBuilder(word).reverse().toString();
		var count = 0;
		var countLetters = 0;
		char letter = 0;

		for (var i = 0; i < word.length(); i++) {
			for (var j = i; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j)) {
					countLetters++;
					if (countLetters > count) {
						count = countLetters;
						letter = word.charAt(i);
					}
				}
			}
			countLetters = 0;

		}
		return letter;
	}

}
