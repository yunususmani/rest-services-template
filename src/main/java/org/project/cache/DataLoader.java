package org.project.cache;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.project.constants.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataLoader {

	private static final Logger logger = LoggerFactory.getLogger(DataLoader.class);

	static {
		BufferedReader bufferedReader = null;

		try {
			
			logger.info("loading data..........");
			ClassLoader classLoader = new DataLoader().getClass().getClassLoader();
			
			URI uri = classLoader.getResource("testdata").toURI();

			bufferedReader = Files.newBufferedReader(Paths.get(uri), Charset.forName(Constants.CHAR_ENCODING));
			
			logger.info("data loaded successfully.");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("error in loading data from file: " + e.toString());
			throw new RuntimeException("Error in loading data from input file");
		} finally {
			try {
				if(bufferedReader != null)
					bufferedReader.close();
			} catch (IOException e) {
				logger.error("error in closing bufferedReader: " + e.toString());
			}
		}
	}
}
