package com.gwangju.bus.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class LoadTerminalData {

	public String connectionTerAPI() throws IOException {

		// ODsay Api Key 정보
		String apiKey = "{YOUR_API_KEY}";

		String urlInfo = "https://api.odsay.com/v1/api/intercityBusTerminals?lang=0&CID=5000&apiKey="
				+ URLEncoder.encode(apiKey, "UTF-8");

		// http 연결
		URL url = new URL(urlInfo);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			sb.append(line);
		}
		bufferedReader.close();
		conn.disconnect();

		// 결과 출력
		System.out.println(sb.toString());

		String result = sb.toString();
		return result;
	}

	public String conectionBusAPI() throws IOException {
		// ODsay Api Key 정보
		String apiKey = "{YOUR_API_KEY}";

		String urlInfo = "https://api.odsay.com/v1/api/searchPubTransPathT?SX=126.9027279&SY=37.5349277&EX=126.9145430&EY=37.5499421&apiKey="
				+ URLEncoder.encode(apiKey, "UTF-8");

		// http 연결
		URL url = new URL(urlInfo);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			sb.append(line);
		}
		bufferedReader.close();
		conn.disconnect();

		// 결과 출력
		System.out.println(sb.toString());
		
		String result = sb.toString();
		return result;
	}
}
