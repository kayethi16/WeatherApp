package com.weather.adarsh.ws;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;


public class WeatherClient  extends WebServiceGatewaySupport {

	

	/*public GetQuoteResponse getQuote(String ticker) {

		GetQuote request = new GetQuote();
		request.setSymbol(ticker);

	

		GetQuoteResponse response = (GetQuoteResponse) getWebServiceTemplate()
				.marshalSendAndReceive("http://www.webservicex.com/globalweather.asmx",
						request,
						new SoapActionCallback("http://www.webserviceX.NET/GetQuote"));

		return response;
	}
*/
}