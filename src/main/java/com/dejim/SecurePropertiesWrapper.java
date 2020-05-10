package com.dejim;

import java.io.*;

public class SecurePropertiesWrapper {

	public SecurePropertiesWrapper() {

	}

	public String secureString(String appHome, String operation, String algorithm, String mode, String key, String value) {
		StringBuffer response = new StringBuffer();
		String line;
		Process process;

		String toolString = "java -jar " + appHome + "/secure-properties-tool.jar string " + operation + " " + algorithm + " " + mode + " " + key + " ";
		try {

			process = Runtime.getRuntime().exec(String.format(toolString + value));
			process.waitFor();

			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			BufferedReader error = new BufferedReader(new InputStreamReader(process.getErrorStream()));
			while ((line = reader.readLine()) != null) {
				response.append(line);
			}
			while ((line = error.readLine()) != null) {
				response.append(line);
			}
		} catch (IOException e1) {
		} catch (InterruptedException e2) {
		}
		return response.toString();
	}
	
	public String secureFile(String appHome, String operation, String algorithm, String mode, String key, String inputFileLocation, String outputFile) {
		StringBuffer response = new StringBuffer();
		String line;
		Process process;

		String toolString = "java -jar " + appHome + "/secure-properties-tool.jar file " + operation + " " + algorithm + " " + mode + " " + key + " " + inputFileLocation + " " + appHome + "/" + outputFile;
		try {

			process = Runtime.getRuntime().exec(String.format(toolString));
			process.waitFor();

			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			BufferedReader error = new BufferedReader(new InputStreamReader(process.getErrorStream()));
			while ((line = reader.readLine()) != null) {
				response.append(line);
			}
			while ((line = error.readLine()) != null) {
				response.append(line);
			}
		} catch (IOException e1) {
		} catch (InterruptedException e2) {
		}
		return response.toString();
	}
	
	public String secureFileLevel(String appHome, String operation, String algorithm, String mode, String key, String inputFileLocation, String outputFile) {
		StringBuffer response = new StringBuffer();
		String line;
		Process process;

		String toolString = "java -jar " + appHome + "/secure-properties-tool.jar file-level " + operation + " " + algorithm + " " + mode + " " + key + " " + inputFileLocation + " " + appHome + "/" + outputFile;
		try {

			process = Runtime.getRuntime().exec(String.format(toolString));
			process.waitFor();

			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			BufferedReader error = new BufferedReader(new InputStreamReader(process.getErrorStream()));
			while ((line = reader.readLine()) != null) {
				response.append(line);
			}
			while ((line = error.readLine()) != null) {
				response.append(line);
			}
		} catch (IOException e1) {
		} catch (InterruptedException e2) {
		}
		return response.toString();
	}
}
